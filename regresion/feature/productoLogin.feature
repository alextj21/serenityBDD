# language: es
@compraProductoLogin
Característica: realizar compra de producto 
  yo como usuario quiero inicar sesion, ingresar al menu de servicios y realizar la compra de un producto

  Antecedentes: login exitoso
    Dado ingreso a la url de la tienda claro y selecciono iniciar sesion

  @compraExitosaLogin @regresion
  Esquema del escenario: compra login producto exitoso
    Y realizo el login con los datos requeridos
      | <correo> | <contrasena> |
    Cuando doy click en iniciar sesion
    Y realizo la compra del producto
      | <servicio> | <opcion> | <nombreProducto> |
    Y agrego al carrito de compras
      | <servicio> | <tipoCompra> |
    Cuando selecciono el tipo de pago
      | <tipoPago> |

    Ejemplos: 
      | correo                     | contrasena   | servicio   | opcion                     | nombreProducto                         | tipoCompra   | tipoPago   |
      | ipro.testmiguel1@gmail.com | Control1     | celulares  | Celulares                  |Huawei Mate 9 Lite 4G                   | carrito      | pse        |
      | ipro.testmiguel1@gmail.com | Control1     | tecnologia | Audio y Video              |Parlante LG XBOOM Go PK7                | carrito      | targeta    |                            
      | ipro.testmiguel1@gmail.com | Control1     | tecnologia | Internet de las cosas      |Mi Banda 4 inteligente Xiaomi           | carrito      | targeta    |            
      
  @compraFallidaLogin
  Esquema del escenario: compra producto fallido
    Y realizo el login con los datos requeridos
      | <correo> | <contrasena> |
    Cuando doy click en iniciar sesion
    Y realizo la compra del producto
      | <servicio> | <opcion> | <nombreProducto> |
    Y agrego al carrito de compras
      | <servicio> | <tipoCompra> |
    Cuando selecciono el tipo de pago
      | <tipoPago> |

    Ejemplos: 
      | correo                     | contrasena   | servicio   | opcion             | nombreProducto                         | tipoCompra   | tipoPago |
      | ipro.testingrid@gmail.com  | MariaSofia1  | celulares  | Celulares          | Samsung Galaxy J6 4G                   | renovacion   | pse      |
      | ipro.testingrid@gmail.com  | MariaSofia1  | celulares  | Celulares          | Samsung Galaxy A6 Plus 4G              | carrito      | targeta  | 
      | ipro.test.6000@gmail.com   | Pruebas2020* | tecnologia | Televisores        | TV 49" LG 49UK6200 TAWC + Barra Sonido | financiacion | factura  |
      | ipro.testingrid@gmail.com  | MariaSofia1  | tecnologia | Televisores        | TV 49" LG 49UK6200 TAWC + Barra Sonido | carrito      | targeta  |
      | ipro.testmiguel1@gmail.com | Control1     | moviles    | Celular + SIM card | Samsung Galaxy A6 Plus 4G              | carrito      | targeta  |     
      | ipro.testmiguel1@gmail.com | Control1     | celulares  | Renueva tu equipo  | Huawei P9 Lite 4G                      | renovacion   | factura  | 
      
      
            
                              
      
      