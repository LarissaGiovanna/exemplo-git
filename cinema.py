print("Selecione seu tipo de ingresso:")
ingresso = int(input("\n Digite 1 para o ingresso VIP ou 2 para o ingresso Standart:"))
print("Selecione sua pipoca:")
pipoca = int(input('Digite 1 se você deseja o Combo Pipoca ou 2 caso não deseje:'))

if ingresso == 1 and pipoca == 1:
    print('O preço fica R$ 110,00')
if ingresso == 1 and pipoca == 2:
    print('O preço fica R$ 80,00')
if ingresso == 2 and pipoca == 1:
    print('O preço fica R$ 110,00')
else:
    print('O preço fica R$ 40,00')