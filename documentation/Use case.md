# Use case.

|Functionality |Actor who executes the action |Description |
|---|---|---|
|Administration of Authentication |Customer/User |Manage new user registration, user logins and logouts |
|Make an consultation |User |Through keyboard input, the user enters characters that refer to the particular characteristics that interest him or that, failing that, he knows about the anime he wants to search for |
|Database Administration | User Administrator | It allows people admitted with an administrator account to make modifications to the database, these modifications can be classified into: update, add and delete content |

|UC01 | 1.0 |
|---|---|
|Dependencies |-Register new users -Login -Logout |
|Precondition |Have an email account (gmail) or a Facebook account|
|Description|The system allows the user to create an account, login and logout |
|Steps |Action |
|1 |The user selects what he wants to register with, either Facebook or an email account (gmail) |
|2 | Once registered, the user must login with the selected option|
|3 | Once they have finished what they had to do, the user can logout of their account |
|Postcondition |The user will have access to the system |
|Exceptions- Step |Action |
 |2 |If the user enters incorrect account details or tries to login with an unregistered account |
 ||E.1 The system reports the problem that prevents you from login | 
 ||E.2 The data entered is deleted and the user is asked to retype his data  |
|Comments |The maximum number of attempts to login is 5, after the fifth attempt the system does not allow the user to enter their data if it is not until 1 hour later|

|CU02 |1.0 |
|---|---|
|Dependencies |-Realizar consulta -Recibir datos sobre algún anime |
|Precondition |El usuario ha creado una cuenta o a iniciado sesión |
|Description|El sistema deberá comportarse como se describe en el siguiente caso de uso cuando el usuario de la API solicité al sistema datos sobre algún anime en especifico |
|Steps |Action |
|1 |El usuario accede a la interfaz/pantalla principal para comenzar el proceso de búsqueda de un anime |
|2 | El usuario ingresa una cadena de caracteres/enunciados con las características específicas del anime que desea buscar|
|3 | El usuario ingresa una cadena de caracteres/enunciados con las características específicas del anime que desea buscar |
|4 |La API devuelve toda la información encontrada |
|Postcondition |El usuario recibe toda la información acerca del anime buscado |
|Exceptions - Step |Action |
 |2 |Si el usuario en lugar de agregar una cadena de caracteres ingresa datos numéricos |
 ||E.1 El sistema informa de la problemática que impide realizar la búsqueda | 
 ||E.2  Se reinicia el buscador |
|Comments |El número máximo de búsquedas de anime es ilimitado, siempre que el usuario desee conocer todo acerca de algún anime podrá realizar una búsqueda en la API. |

|CU03 | 1.0 |
|---|---|
|Dependencies |Actualización de contenido |
|Precondition |Para tener acceso a la funcionalidad de poder modificar la información contenida en la base de datos, se deberá haber realizado un previo inicio de sesión con cuenta de administrador |
|Description |Mediante esta funcionalidad, se podrá tener autorización para la modificación de la base de datos, es decir, crear, actualizar o borrar uno o más animes |
|Steps |Action |
|1 |Ingresar a la base de datos |
|2 | Elegir la acción a realizar, ejecutarla y guardar los cambios realizados |
|3 | Salir de la base de datos |
|Postcondition |La base de datos refleja las modificaciones hechas |
|Exceptions- Step |Action |
 |2 | Si los cambios realizados no son guardados |
 ||E.1 El sistema no refleja los cambios realizados e ignora todo lo que se haya agregado, modificado o quitado de la base de datos | 
|Comments | Los usuarios administradores son los unicos con los permisos necesarios para actualizar la información contenida en la base de datos |


## Diagrama de casos de uso
[![Casos-de-uso-2.png](https://i.postimg.cc/GtrkKQds/Casos-de-uso-2.png)](https://postimg.cc/R6s6Vw3M)
