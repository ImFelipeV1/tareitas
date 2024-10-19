relaciones = {
    'Orlando' : 'Rafael',
    'Rafael' : 'Felipe'
}

def es_padre(padre, hijo):
    return relaciones.get(padre) == hijo

def es_abuelo(abuelo, nieto):
    for padre in relaciones:
        if es_padre(abuelo, padre) and es_padre(padre, nieto):
            return True
    return False

resultado = es_abuelo('Orlando', 'Felipe')
abuelo = 'Orlando'
nieto = 'Felipe'


if resultado:
    print(abuelo, 'es abuelo de ', nieto)

else:
    print(abuelo, ' no es abuelo de ', nieto)