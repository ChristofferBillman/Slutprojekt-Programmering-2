# Slutprojekt Programmering 2
## __Planering__
Planen är att skapa en chattapp där användare kan skapa konton, och sedan logga in. Användarna kan då börja chatta. Chattarna sparas och användardatan sparas i en MySQL-databas.

I det här projektet tas följande områden med:

* Databashantering
* Nätverk
* Objektorienterad programmering

Första steget är att göra det möjligt för användare att mata in registreringsinfo, skicka den till servern och sedan spara datan i databasen. Efter det så skapar man en inloggningssida.

Andra steget är att börja arbeta med själva chattfunktionen.

Eventuellt så skulle man kunna lägga till en funktion sparar alla chattar i databasen, och laddar in de där man öppnar en chatt.

 ## __Projektlogg__
### Pass #1:
Idag är planen att börja projektet och skapa systembeskrivning och klassdiagram. Jag ska verkligen tänka efter i hur jag bygga upp programmet.

Databasens struktur:

Tabell 1:
| *id* | user | password |
| ---- | ---- | -------- |

Tabell 2:
| id | *userid* | message |
| -- | -------- | ------- |


