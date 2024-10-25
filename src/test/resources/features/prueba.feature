# language:es


Característica: realizar compras por la aplicacion


  Yo como usuario de la aplicación demoblaze
  Quiero seleccionar productos de la página
  Para realizar una compra a través de la aplicación


  Escenario: compra de articulos por la aplicacion

    Dado que 'el user' se encuentra en la aplicacion


    Cuando agrega productos al carro de compras y llena cada uno de los campos de la orden de compra
      | Name | Country  | City     | CreditCard    | Month | Year |
      | Juan | Colombia | Medellin | 4447787273311 | enero | 2023 |


    Entonces podra completar de manera exitosa la compra de sus productos