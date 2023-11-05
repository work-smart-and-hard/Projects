from fastapi import FastAPI
from pydantic import BaseModel
import wikipedia

app = FastAPI()


class Head(BaseModel):
    headings: list[str]


class Requests(BaseModel):
    heading: str
    content: str


class RequestsInput(BaseModel):
    heading: str
    number: int


@app.get('/{heading}', response_model=Head)
def headings(heading: str):
    return Head(headings=wikipedia.search(heading))


@app.get('/multi/', response_model=Requests)
def headings_counter(name: str, sentences: int):
    return Requests(heading=name, content=wikipedia.summary(name, sentences=sentences))


@app.post("/", response_model=Requests)
def list_of_headings(request_input: RequestsInput):
    return RequestsInput(name=request_input.heading, content=wikipedia.summary(request_input.heading,
                                                                               sentences=request_input.number))
