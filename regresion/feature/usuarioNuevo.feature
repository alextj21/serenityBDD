# language: es
@registroUsuario
Característica: crear cuenta en la tienda claro
  yo como usuario quiero ir a la pagina de inicio de la tienda claro y crear mi cuenta

  @usuarioExitoso @regresion
  Esquema del escenario: Creacion usuario exitoso
    Dado ingreso a la url de la tienda claro y selecciono crear cuenta
    Y ingreso los datos solicitados en los formularios
      | <correo> | <nombre> | <apellido> | <telefono> | <tipoDoc> | <numCedula> |<telefonoAd>| <direccion> | <barrio> | <departamento> | <ciudad> | <informacion> |
#    Y acepto los terminos y condiciones
    Y hago click en el boton guardar
    Entonces yo valido que aparezca mi nombre en la sesion iniciada
      | <validacion> |
  

    Ejemplos: 
      | correo                   | nombre    | apellido     | telefono    | tipoDoc           | numCedula    |telefonoAd| direccion    | barrio    | departamento | ciudad       | informacion          | validacion|
      | alex_xx29fd@gmail.com    | alejandro | roldan       | 8364346789  | Cedula ciudadania | 1033629583   |5634896574| cra 23 d sur | hola      | ATLANTICO    | BARRANQUILLA | dejar en parqueadero | pruebas!  |

  @usuarioFallido
  Esquema del escenario: Creacion usuario fallido
    Dado ingreso a la url de la tienda claro y selecciono crear cuenta
    Y ingreso los datos solicitados en los formularios
      | <correo> | <nombre> | <apellido> | <telefono> |<telefonoAd>| <tipoDoc> | <numCedula> | <direccion> | <barrio> | <departamento> | <ciudad> | <informacion> |
    Y acepto los terminos y condiciones
    Y hago click en el boton guardar
    Entonces yo valido los errores en en formulario
      | <valnombre> |

    Ejemplos: 
      | correo                 | nombre   | apellido  | telefono  |telefonoAd| tipoDoc           | numCedula    | direccion       | barrio  | departamento | ciudad | informacion   | valnombre |
      | arpl@gmail.com.com.com |          | robledo$4 | 3457894m$ |039748372 | Cedula ciudadania | 1234569678e$ |                 | boita4$ | CUNDINAMARCA | BOGOTA | porteria 12$- | campo     |
