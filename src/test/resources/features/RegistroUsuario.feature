# language: es
  Característica: Registro de usuario
    Como certificador del equipo
    Quiero automatizar el flujo de registro
    Para validar que el sistema permite regitrar un usuario correctamente

  Escenario: 001 - Registro exitoso
    Dado que el usuario esta en la pagina principal
    Cuando hace clic en el boton "Register" y completa el formulario
    |firstName|lastName|email      |password |
    |Alejandro|Salinas|a@correo.com|12345Abc!|
    Entonces deberia ver un mensaje de registro exitoso
