import React from 'react'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faTrash } from '@fortawesome/free-solid-svg-icons'


export const Todo = ({task, toggleComplete, deleteTodo}) => {
  return (
    <div className='Todo'>
        <p onClick={() => toggleComplete(task.id)} 
        className={`${task.completed ? 'completed': ""}`}>{task.task}</p>
        <div className='delete-icon'>
            <FontAwesomeIcon icon={faTrash} onClick={() => deleteTodo(task.id)} />
        </div>
    </div>
  )
}
