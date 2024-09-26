# resto da divisao por 3 = 0 e 5 = 0

num = int(input('Digite um número e veja se ele é divisivel por 3 e por 5: '))
divisao3 = num%3
divisao5 = num%5

if divisao3 == 0 and divisao5 == 0:
    print(f'O número {num} é divisivel por 3 e por 5')
else:
    print(f'O numero {num} NAO é divisivel por 3 e por 5')