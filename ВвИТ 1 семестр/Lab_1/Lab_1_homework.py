a, b, c = float(input()), float(input()), float(input())
d = b ** 2 - 4 * a * c
if d > 0:
    x_1 = ((-b + d ** 0.5) / (2 * a))
    x_2 = ((-b - d ** 0.5) / (2 * a))
    print(x_1, x_2, sep='\n')
elif d == 0:
    print(((-b + d ** 0.5) / (2 * a)))
else:
    print('Нет корней')
