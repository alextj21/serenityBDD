# language: es
@compraproductoAnonimoUsuarioNuevo
Característica: realizar compra de producto
  yo como usuario quiero realizar la compra de un producto y luego registrarme

  Antecedentes: Creacion usuario exitoso

  @compraExitosaproductoAnonimoUsuarioNuevo @regresion
  Esquema del escenario: compra producto anonimo nuevo exitoso
    Dado ingreso a la url de la tienda claro
    Y realizo la compra del producto
      | <servicio> | <opcion> | <nombreProducto> |
    Y agrego al carrito de compras
      | <servicio> | <tipoCompra> |
    Y ingreso los datos solicitados en el registro
      | <correo> | <nombre> | <apellido> | <telefono> | <tipoDoc> | <numCedula> |<telefonoAd>| <direccion> | <barrio> | <departamento> | <ciudad> | <informacion> |
    Cuando selecciono forma de pago
      | <tipoPago> | <validacion> |

    Ejemplos: 
      | servicio | opcion                           | nombreProducto                     | tipoCompra | correo             | nombre  | apellido | telefono   | tipoDoc           | numCedula  |telefonoAd  | direccion  | barrio | departamento | ciudad | informacion       | tipoPago | validacion                              |
      | moviles  | Compra con tu SIM card + Paquete | Sim card + Paquete 6 días x $6.000 | directo    | apf995@hotmail.com | jose    | perez    | 3457894590 | Cedula ciudadania | 1933229810 |2372893827  | cra 28 sur | bosa   | CUNDINAMARCA | BOGOTA | dejar en porteria | pse      | Pendiente aprobación entidad financiera |

  @compraFallidaproductoAnonimoUsuarioNuevo
  Esquema del escenario: compra producto fallido
    Dado ingreso a la url de la tienda claro
    Y realizo la compra del producto
      | <tipo> | <opcion> | <nombreProducto> |
    Y agrego al carrito de compras
      | <tipo> | <tipoCompra> |
    Y ingreso los datos solicitados en los formularios
      | <correo> | <nombre> | <apellido> | <telefono> | <telefonoAd> | <tipoDoc> | <numCedula> | <direccion> | <barrio> | <departamento> | <ciudad> | <informacion> |
    Cuando selecciono el tipo de pago
      | <tipoPago> | <validacion> |

    Ejemplos: 
      | tipo       | opcion             | nombreProducto                         | tipoCompra   | correo            | nombre  | apellido | telefono  | telefonoAd        | tipoDoc           | numCedula  | direccion  | barrio       | departamento | ciudad            | informacion       | tipoPago                                | validacion |
      | tecnologia | Televisores        | TV 49" LG 49UK6200 TAWC + Barra Sonido | carrito      | a59f@hotmail.com  | pruebas | qa       | 345789459 |        4568345567 | Cedula ciudadania |  156555688 | cra 28 sur | bosa         | CUNDINAMARCA | BOGOTA            | dejar en porteria | targeta                                 |            |
      | moviles    | Celular + SIM card | Samsung Galaxy J6 4G                   | carrito      | auto1@hotmail.com | pruebas | qa       | 345789459 | Cedula ciudadania |         156816844 | cra 28 sur | bosa       | CUNDINAMARCA | BOGOTA       | dejar en porteria | pse               | Pendiente aprobación entidad financiera |            |
      | tecnologia | Videojuegos        | Consola PS4 FIFA 19 + 2 Controles DS4  | financiacion | auto2@hotmail.com | pruebas | qa       | 345789459 | Cedula ciudadania |         156875633 | cra 28 sur | bosa       | CUNDINAMARCA | BOGOTA       | dejar en porteria | targeta           | Pendiente aprobación entidad financiera |            |
