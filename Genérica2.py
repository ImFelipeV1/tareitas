from typing import TypeVar, Generic

T = TypeVar('T')

def retornar_valor(valor: T) -> T:
    return valor

print(retornar_valor(123))
print(retornar_valor("Para entender la historia de FNAF"))
print(retornar_valor([1, 2, 3]))