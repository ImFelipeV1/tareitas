class Perro():
    def __init__ (self, nombre, raza):
        self.nombre = nombre
        self.raza = raza

    def comer(self):
        print(f'{self.nombre} está comiendo.')
    
    def ladrar(self):
        print(f'{self.nombre} está ladrando.')

    def mostrar_raza(self):
        print(f'{self.nombre} es de raza {self.raza}')

Mi_Perro = Perro("Frika", "Pincher")

Mi_Perro.comer()
Mi_Perro.ladrar()
Mi_Perro.mostrar_raza()