def logger_decorator(func):
    def wrapper(*args, **kwargs):
        print(f"Llamando a la función {func.__name__} con los argumentos: {args} {kwargs}")
        result = func(*args, **kwargs) 
        print(f"Resultado de {func.__name__}: {result}")
        return result
    return wrapper

class UserManager:
    @logger_decorator  
    def create_user(self, username):
        return f'Usuario {username} creado con éxito.'

    @logger_decorator  
    def delete_user(self, username):
        return f'Usuario {username} eliminado con éxito.'

user_manager = UserManager()
user_manager.create_user('SuCucha')
user_manager.delete_user('ImFelipeCaml')