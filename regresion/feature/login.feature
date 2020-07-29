# language: es
Característica: iniciar sesion en la tienda claro
  yo como usuario quiero ir a la pagina de inicio de la tienda y iniciar sesion
@loginExitoso @regresion
  Esquema del escenario: login exitoso
    Dado ingreso a la url de la tienda claro y selecciono iniciar sesion
    Y realizo el login con los datos requeridos
      | <correo> | <contrasena> |
    Cuando doy click en iniciar sesion
    Entonces yo valido que aparezca mi nombre en la sesion iniciada
      | <palabra> |

    Ejemplos: 
      | correo                           | contrasena  | palabra  |
      |  ipro.testingrid@gmail.com       | MariaSofia1 | INGRID!  |
      
      
@loginFallido
  Esquema del escenario: login fallido
    Dado ingreso a la url de la tienda claro y selecciono iniciar sesion
    Y realizo el login con los datos requeridos
      | <correo> | <contrasena> |
    Cuando doy click en iniciar sesion
    Entonces verifico el mensaje de Excepcion
    |<mensaje>| 

    Ejemplos: 
      | correo                           | contrasena  | mensaje                                         |
      | ingrid.figueroa@claro.com.com    | mariaSofia1 | El Usuario ingresado no se encuentra registrado |
      | ingrid.figueroa.ext@claro.com.co | ariaSofia1  |La contraseña ingresada no es válida.            |