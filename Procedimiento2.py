def AñoNacimiento(Año):
    print('Naciste en el Año ', Año)

def Multiplicar (AñoAct, Año):
    return((AñoAct - Año) * 365)

Año = 2009
AñoAct = 2024
resultado = Multiplicar(AñoAct, Año)
print("Han pasado aproximadamente ", resultado, "desde el año de tu nacimiento")
