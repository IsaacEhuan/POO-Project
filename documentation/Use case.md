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

|UC02 |1.0 |
|---|---|
|Dependencies |-Make an consultation -Get data about an anime |
|Precondition |User has created an account or login |
|Description|The system should behave as described in the following use case when the API user requests data about a specific anime from the system |
|Steps |Action |
|1 |The user accesses the main interface/screen to start the search process for an anime |
|2 | The user enters a string of characters/sentences with the specific characteristics of the anime they want to search |
|3 |The API returns all the information found |
|Postcondition |The user receives all the information about the anime he has searched for |
|Exceptions - Step |Action |
 |2 |If the user instead of adding a character string enters numeric data |
 ||E.1 The system reports the problem that prevents the search | 
 ||E.2 Search restarts |
|Comments |The maximum number of anime searches is unlimited, as long as the user wants to know everything about an anime, he can perform a search in the API |

|UC03 | 1.0 |
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


## Use case diagram
[![Casos-de-uso-2.png](https://i.postimg.cc/GtrkKQds/Casos-de-uso-2.png)](https://postimg.cc/R6s6Vw3M)
