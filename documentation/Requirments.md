# Requirments.
## User requirments:
User: Person who requests the data from the system or database.
- The user will be able to search for his anime. 
## Admin user requirments:
Admin user: Person who has acces to modify the database.
- Admin user will be able to add update or delete any existing anime record.

## System requirments:

**Functional requirments**

|FR001|Anime search|
|---|---|
|Priority:|High|
|Description|El sistema permite al usuario la búsqueda de animes, ya sea por el nombre del anime, género y por el personaje |
|Entradas| Busqueda categoría // Cadena caracteres |  
|Salidas| Resultado de la búsqueda.|

|FR002|Reconocimiento de Usuarios|
|---|---|
|Priority|High|
|Description| El sistema permite crear una cuenta e ingresar mediante ella desde cualquier dispositivo en la red mediante un nombre de usuario y una contraseña elegidos, dicha cuenta servirá para que el usuario haga uso de la API|
|Entradas| "Usuario", "Correo/Facebook", "Password"|
|Salidas| "ID de Usuario"|

|FR003|Add content|
|---|---|
|Priority|High|
|Description| Mediante una cuenta de tipo administrador se le permite al usuario agregar a la base de datos nuevos animes con todas las características que este posea|
|Entradas|"Title","Author","Gender","Chapters","Premiere date","Characters","Status","Duration","Language","Summary","Target audience"|
|Salidas| "Contenido actualizado"|

|FR004|Update content|
|---|---|
|Priority|High|
|Description| Mediante una cuenta de tipo administrador se le permite al usuario actualizar la base de datos, podiendo este cambiar u agregar información a ciertos animes para que cuando un usuario clásico realice la busqueda de algún anime, se le presente la información mas adecuada y especifica|
|Entradas|"Title","Author","Gender","Chapters","Premiere date","Characters","Status","Duration","Language","Summary","Target audience"|
|Salidas| "Contenido actualizado"|

|FR005|Remove content|
|---|---|
|Priority|High|
|Description| Mediante una cuenta de tipo administrador se le permite al usuario borrar parte de la información guardada en la base de datos|
|Entradas|"Title","Author","Gender","Chapters","Premiere date","Characters","Status","Duration","Language","Summary","Target audience"|
|Salidas| "Contenido actualizado"|


**Non-functional requirments**

|NFR001|Tiempo de respuesta|
|---|---|
|Description|El sistema deberá realizar la busqueda solicitada por el usuario en # segundo o menos|

|NFR002|Historial de busqueda|
|---|---|
|Description|El sistema guardará las busquedas realizadas por el usuario mientras este permanezca logueado|

|NFR003|Security|
|---|---|
|Description|El sistema deberá ser capaz de resistir ataques de denegación del servicio que intenten saturar los servidores que utiliza el software para su funcionamiento|

|NFR004|Acceso al sistema|
|---|---|
|Description|El sistema debe permitir al usuario acceder con éxito a la plataforma en un 99% de las veces en las que intente ingresar al servicio|
