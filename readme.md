# SpringCar

Backend prototipo para aplicación springcar

Para editar este archivo readme.md online puedes utilizar https://dillinger.io/

La aplicación escucha el puerto 8081. Puedes cambiar el puerto en application.properties

Para acceder a la documentación de swagger: http://localhost:8081/swagger-ui.html

Endpoints:

	- GET /clients (para obtener un listado de todos los clientes)
	- GET /clients/id (para obtener un cliente a partir de la id)
	- POST /clients (para crear un cliente)

	- GET /offices (para obtener un listado de todas las oficinas)
	- GET /offices/id (para obtener una oficina a partir de la id)
	- POST /offices (para crear una oficina)
	
	- GET /reservations (para obtener un listado de todas las reservas)

	- GET /categories
	
Model class diagram:

![Alt text](documentation/model_diagram.jpg?raw=true "Model class diagram")