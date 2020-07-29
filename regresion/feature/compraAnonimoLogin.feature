# language: es
@compraproductoAnonimoLogin
Característica: realizar compra de producto
  yo como usuario quiero realizar la compra de un producto y luego loguearme
Antecedentes: login existoso  
@compraExitosaproductoAnonimoLogin @regresion
  Esquema del escenario: compra producto anonimo login exitoso
    Dado ingreso a la url de la tienda claro
    Y realizo la compra del producto
    | <servicio> | <opcion>| <nombreProducto> |
    Y agrego al carrito de compras
    |<servicio>|<tipoCompra>|
    Y realizo el login con los datos requeridos
    | <correo> | <contrasena> |
    Y doy click en iniciar sesion
    Cuando selecciono el tipo de pago
    | <tipoPago> |
    

    Ejemplos: 
      | servicio     | opcion                         | nombreProducto                                |tipoCompra   | correo                           | contrasena  |tipoPago |
      | celulares    | Renueva tu equipo              |ZTE Blade A320 4G                              |renovacion   |  ipro.testmiguel1@gmail.com      | Control1    | factura |
      | celulares    | Celulares                      |Huawei P30 Pro 4G                              |carrito      | ipro.testmiguel1@gmail.com       | Control1    |targeta  |
      | moviles      |Compra con tu SIM card + Paquete|Sim card + Paquete 6 días x $6.000             |directo      | ipro.testmiguel1@gmail.com       | Control1    | condensa|
      | celulares    |Celulares                       |Huawei Tablet T1 3G                            | directo     |  ipro.testmiguel1@gmail.com      | Control1    | pse     |
      | tecnologia   | Accesorios                     | Control Remoto Claro Kids                     | carrito     |   ipro.testmiguel1@gmail.com     | Control1    | pse     |                
      
       
 
  @compraFallidaproductoAnonimoLogin
  Esquema del escenario: compra producto fallido
    Dado ingreso a la url de la tienda claro
    Y realizo la compra del producto
    | <tipo> | <opcion>| <nombreProducto> |
    Y agrego al carrito de compras
    |<tipoCompra>|
    Y realizo el login con los datos requeridos
    | <correo> | <contrasena> |
    Cuando selecciono el tipo de pago
    | <tipoPago> |
    

    Ejemplos: 
      | tipo         | opcion                         | nombreProducto                                |tipoCompra   | correo                           | contrasena  |tipoPago |  
      | celulares    | Renueva tu equipo              | Samsung Galaxy Note 9 y J6 Plus 4G            |renovacion   |  ipro.testmiguel1@gmail.com      | Control1    | pse     |
          
      