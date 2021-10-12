# Casos de uso

|Funcionalidad |Actor que realiza la acción |Descripción |
|---|---|---|
|Administración de autenticación |Usuario | Administra el registro de nuevos usuarios, los inicios de sesiones, así como el cierre de sesión del usuario |
|Realizar consulta |Usuario |Mediante la entrada por teclado, el usuario ingresa caracteres que hacen referencia a las características particulares que a éste le interesan o que, en su defecto, conozca del anime que desea buscar |
|Administración de la base de datos |Administrador | Permite a las personas admitidas con cuenta de administrador, realizar modificaciones a la base de datos, dichas modificaciones se pueden clasificar en: actualizar, agregar y eliminar contenido |


|CU01 |1.0 |
|---|---|
|Dependencias |-Realizar consulta -Recibir datos sobre algún anime |
|Precondición |El usuario ha creado una cuenta o a iniciado sesión |
|Descripción|El sistema deberá comportarse como se describe en el siguiente caso de uso cuando el usuario de la API solicité al sistema datos sobre algún anime en especifico |

|Secuencia normal |Paso |Acción |
|---|---|---|
| |1 |El usuario accede a la interfaz/pantalla principal para comenzar el proceso de búsqueda de un anime |
| |2 | El usuario ingresa una cadena de caracteres/enunciados con las características específicas del anime que desea buscar|
| |3 | El usuario ingresa una cadena de caracteres/enunciados con las características específicas del anime que desea buscar |
| |4 |La API devuelve toda la información encontrada |
||**Postcondición** |El usuario recibe toda la información acerca del anime buscado |


