# Requirements.
## User requirements:
User: Person who requests the data from the system or database.
- The user will be able to search for his anime. 
## Admin user requirements:
Admin user: Person who has acces to modify the database.
- Admin user will be able to add update or delete any existing anime record.

## System requirments:

**Functional requirements**

|FR001|Anime search|
|---|---|
|Priority:|High|
|Description|The system allows users to make anime searches, either by the name, gender or main character of the anime|
|Input| Search by name // siring of characters |  
|Output| Search result|

|FR002|User recognition|
|---|---|
|Priority|High|
|Description| The system allows creating an account and logs in through that from any device on the network through the chosen username and password, that account will serve to the interaction between the user and the system|
|Input| "User", "Password"|
|Output| "ID de Usuario"|

|FR003|Add content|
|---|---|
|Priority|High|
|Description| Through an administrator type account, the user is allowed to add new animes to the database with all the characteristics that the anime has|
|Input|"ID","Title","Chapters"|
|Output| "Updated content."|

|FR004|Update content|
|---|---|
|Priority|High|
|Description| Through an administrator-type account, the user is allowed to update the database, being able to change or add information to certain animes so that, when a classic user searches for an anime, it is presented the most appropriate and specific information for the user|
|Input|"ID","Title","Chapters"|
|Output| "Updated content."|

|FR005|Remove content|
|---|---|
|Priority|High|
|Description| Through an administrator-type account, the user is allowed to delete part of the information stored in the database|
|Input|"ID","Title","Chapters"| 
|Output| "Updated content."|


**Non-functional requirements**

|NFR001|Response time|
|---|---|
|Description|The system must perform the search requested by the user in n seconds or less|

|NFR002|Search history|
|---|---|
|Description|The system will save the searches made by the user while the user remains logged in|

|NFR003|Security|
|---|---|
|Description|The system must be able to resist denial of service attacks that try to saturate the servers used by the software for its operation|

|NFR004|Access to the system|
|---|---|
|Description|The system must allow the users to successfully access the platform in 99% of the times that they try to enter to the service|
