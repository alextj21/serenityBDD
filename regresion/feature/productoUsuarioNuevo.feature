# language: es
@compraProductoUsuarioNuevo 
Característica: realizar compra de tecnologia
  yo como usuario quiero ingresar al menu tecnologia y realizar la compra de un producto

  Antecedentes: Creacion usuario exitoso
    Dado ingreso a la url de la tienda claro y selecciono crear cuenta

  @compraExitosaUsuarioNuevo @regresion
  Esquema del escenario: compra nuevo producto exitoso
    Dado ingreso los datos solicitados en los formularios
      | <correo> | <nombre> | <apellido> | <telefono> | <tipoDoc> | <numCedula> |<telefonoAd>| <direccion> | <barrio> | <departamento> | <ciudad> | <informacion> |
#    Y acepto los terminos y condiciones
    Y hago click en el boton guardar
    Y realizo la compra del producto
      | <servicio> | <opcion> | <nombreProducto> |
    Y agrego al carrito de compras
      | <servicio> | <tipoCompra> |
    Cuando selecciono el tipo de pago
      | <tipoPago> | <validacion> |

    Ejemplos: 
      | correo             | nombre  | apellido  | telefono    | tipoDoc           | numCedula   |telefonoAd| direccion     | barrio | departamento | ciudad       | informacion          | servicio  | opcion    | nombreProducto       | tipoCompra | tipoPago | validacion                              |
      | aopl631@gmail.com  | andres  | quiñones  | 3456782356  | Cedula ciudadania |  8972328032 |8634896574| cra 24 f sur  | suba   | ATLANTICO    | BARRANQUILLA | dejar en parqueadero | celulares | Celulares | Huawei P30 Pro 4G    | carrito    | pse      | Pendiente aprobación entidad financiera |

  @compraFallidaUsuarioNuevo
  Esquema del escenario: compra producto exitoso
    Dado ingreso los datos solicitados en los formularios
      | <correo> | <nombre> | <apellido> | <telefono> |<telefonoAd>| <tipoDoc> | <numCedula> | <direccion> | <barrio> | <departamento> | <ciudad> | <informacion> |
    Y acepto los terminos y condiciones
    Y hago click en el boton guardar
    Y realizo la compra del producto
      | <servicio> | <opcion> | <nombreProducto> |
    Y agrego al carrito de compras
      | <servicio> | <tipoCompra> |
    Cuando selecciono el tipo de pago
      | <tipoPago> | <validacion> |

    Ejemplos: 
      | correo             | nombre  | apellido | telefono  |telefonoAd| tipoDoc           | numCedula  | direccion     | barrio | departamento | ciudad       | informacion          | servicio  | opcion    | nombreProducto       | tipoCompra | tipoPago | validacion                              |
      