hermanos = {
    'Carlos' : 'Luis'
}

hijos = {
    'Carlos' : 'Jose',
    'Luis' : 'Ana'
}

def son_hermanos(hermano1, hermano2):
    return hermanos.get(hermano1) == hermano2

def es_hijo(padre, hijo):
    return hijos.get(padre) == hijo

resultado1 = son_hermanos('Carlos', 'Luis')
resultado2 = es_hijo('Carlos', 'Jose')

if resultado1 and resultado2:
    print('Luis es tío de José')
else:
    print('Luis NO es tío de José')