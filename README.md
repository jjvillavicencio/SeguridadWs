# SeguridadWs
En este ejercicio se crea un Web Service en el cual se solicita a través del header que se envíe un usuario y contraseña para poder consumir el servicio.

1. La estructura del proyecto es la siguiente:
![Imgur](http://i.imgur.com/a4pU1Mn.png)

2. WsAuth.java
Se crea una interfaz con la anotación `@WebService` y un metodo **authTest** en el que se especificaran las acciones del servicio con la anotación `@WebMethod`.

![Imgur](http://i.imgur.com/t59K531.png)

3. WsAuthImpl.java
	
	3.1. Se define donde se encuentra la interfaz de tipo Web Service con la etiqueta `@webService(endpointInterface="")` y se la implementa en la clase.

![Imgur](http://i.imgur.com/5BCejLO.png)
	
	3.2. Con la anotación `@Resource` se crea una variable de tipo WebServiceContext

![Imgur](http://i.imgur.com/o2JZy0O.png)
	
	3.3. Se realiza una petición solicitando del Header del servicio los campos `Username` y `Password`

![Imgur](http://i.imgur.com/iGZYMKA.png)
	
	3.4. Se almacena los datos solicitados al header en variables para su posterior uso

![Imgur](http://i.imgur.com/08XLVs6.png)

	3.5. Se comprueba si el usuario y contraseña enviados por el cliente son los correctos.

![Imgur](http://i.imgur.com/MtKg8HL.png)
