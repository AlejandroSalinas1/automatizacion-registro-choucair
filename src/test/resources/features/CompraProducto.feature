# language: es
Caracteristica: Automatizar la compra de un producto
Como usuario quiero automatizar la compra de un producto
Para validar que puedo comprar un producto correctamente

Escenario: 001 - compra de producto hasta checkout
  Dado que el usuario está en la página principal
  Cuando inicia sesión con los siguientes datos
    | email              | password     |
    | usuario@correo.com | Password123  |
  Y selecciona el primer producto en la sección de desktops
  Y lo agrega al carrito
  Y va al carrito, selecciona un país, marca la casilla de aceptación y procede al checkout
  Entonces debería ver el resumen del checkout