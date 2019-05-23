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

### Pass #2:
Det är lite svårt att skapa klassdiagram och färdiga systembeskrivningar innan man är bekväm med det man håller på med.
Jag tänker dock idag att jag kommer skapa CRUD i Databaseklassen. De funktionerna kan jag senare använda i Client-klassen.

Idag har jag också skapat en klass som heter Secret, där jag har alla känsliga data.

Det har gått sådär idag, förstår mig inte riktigt på allt och har errors i min kod. Nästa lektion ska jag försöka på CRUD att fungera helt.

### Pass #3:
Idag försöker jag få classen Db att fungera, går sådär. Anslutningen till databasen fungerar inte just nu.
Nästa pass ska jag försöka få igång Db-klassen så att den kan göra CRUD.

### Pass #4:

### Pass #5:
Idag ska jag åtrigen försöka få igång Db. Det fungerar att sätta in värden.

### Pass #6:
Det går sådär, nu förstår jag mig på allt som används för databashanteringen. Idag har jag försökt att fixa server och göra så att db.read() fungerar.
Det gick sådär, så nästa pass så är målet att parsa Message-objekt till text och sedan skicka dem till servern från klienten vice versa. Jag tänker också att
det hade varit bra om crud är helt färdigt nästa pass.

