# GameStock-Server

## Pasos para ejecutar la aplicación:
- Clonar el repositorio.
- Ejecutar en un IDE preferido para Java.
- Será necesario tener una BBDD con el nombre "gamestockapp" en un gestor de Base de datos, en este caso MySQL.
- El archivo persistence.xml (Server GameStockApp\src\main\resources\META-INF) viene con estas credenciales, las cuales habrá que añadir en MySQL. Modificar en caso de tener otras credenciales:
- URL: jdbc:mysql://localhost:3306/gamestockapp?serverTimezone=UTC
- USER: Root
- PASSWORD: 898989

- Ejecutar el archivo LoginUser.java. Desde ahi se podría registrar nuevo usuario, que se guarden los datos en BBDD, iniciar sesion dependiendo si se es USER o ADMIN.
