def requiere_autorizacion(roles_permitidos):
    def decorador(func):
        def wrapper(usuario, *args, **kwargs):
            if not usuario.get('autenticado'):
                print(f"Usuario {usuario['nombre']} no está autenticado.")
                return
            
            if usuario.get('rol') not in roles_permitidos:
                print(f"Usuario {usuario['nombre']} no tiene permiso para acceder a esta función.")
                return
            
            return func(usuario, *args, **kwargs)
        
        return wrapper
    return decorador

@requiere_autorizacion(roles_permitidos=['admin', 'supervisor'])
def ver_datos_confidenciales(usuario):
    print(f"Acceso concedido a {usuario['nombre']} para ver datos confidenciales.")

usuario_admin = {'nombre': 'Carlos', 'autenticado': True, 'rol': 'admin'}
usuario_empleado = {'nombre': 'Luis', 'autenticado': True, 'rol': 'empleado'}
usuario_no_autenticado = {'nombre': 'Ana', 'autenticado': False, 'rol': 'supervisor'}

# Ejecuciones
ver_datos_confidenciales(usuario_admin)            
ver_datos_confidenciales(usuario_empleado)         
ver_datos_confidenciales(usuario_no_autenticado)   