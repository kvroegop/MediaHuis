# Assignments
Onderstaande zijn de opdrachten. Er mag gewerkt worden met de volgende aannames:
- Endpoints zijn niet daadwerkelijk beveiligd
- Dat leden abonnementsgeld betalen is een gegeven - dat is niet een onderdeel van deze opdrachten

### Alle boeken ophalen
Pas `BookController.java` aan zodat de methode `getAll` een lijst terug geeft met alle boeken.

### Een enkel boek ophalen
Pas `BookController.java` aan zodat de methode `getById` een enkel boek kan ophalen op basis van het technische ID

### Boek toevoegen
Pas `BookController.java` aan zodat de methode `add` een boek kan toevoegen aan het inventaris.

### Boek aanpassen
Pas `BookController.java` aan zodat de methode `update` een boek kan updaten.

### Boek verwijderen
Pas `BookController.java` aan zodat de methode `delete` een boek kan verwijderen.

### Meer informatie bij een boek
Pas `Book.java` aan zodat een boek voorzien kan worden van een samenvatting (summary).

Pas `BookController.java` aan zodat de `update` methode ook een samenvatting kan toevoegen

### Leden functionaliteit
Boeken kunnen alleen geleend worden door iemand die lid is van onze audioboeken bibliotheek. Daarvoor moet de volgende functionaliteit worden gemaakt:
1. Toevoegen van leden
2. Aanpassen van leden
3. Leden moeten op `non-actief` gezet kunnen worden

### Leden en producten koppelen
Leden van onze bibliotheek moeten uiteraard audioboeken kunnen lenen. Zorg er voor dat we kunnen bijhouden:
1. Dat een lid een audioboek heeft `geleend`
2. Wanneer dit boek geleend is
3. Wanneer de laatste datum is dat toegang tot het boek mogelijk is (3 weken na uitleendatum)

### Leden moeten wel iets kunnen afspelen
Leden van de audiobieb die wel kunnen lenen maar niet luisteren is natuurlijk een vreemde situatie. We willen daarom graag dat:
1. Een lid het afspelen kan starten
2. Een lid het afspelen kan pauzeren
3. Wordt geregistreerd op welk punt het lid is bij het luisteren van het boek
4. Een boek gemarkeerd kan worden als `gelezen` - handmatig als automatisch als de speeltijd voorbij is
5. Een boek een recentie kan krijgen van 1 tot 5 sterren 

### Het recht om vergeten te worden
Een van onze (oud) leden wil graag volledig verwijderd worden uit onze systemen. Omdat wij moeten voldoen aan het AVG moet de volgende functionaliteit worden toegevoegd:
1. Een lid moet zichzelf kunnen verwijderen 
2. Een administrator van de bieb moet de mogelijkheid hebben een lid te verwijderen (Zorg er voor dat een endpoint komt met in de url `/admin`, login is niet nodig)


### Leeftijden
Oeps, een boze moeder aan de telefoon. Haar dochter van 9 heeft per ongeluk een boek geluisterd waar veel geweld in stond. Dat moeten we uiteraard niet willen.
We gaan vanaf nu beter bijhouden waar boeken over gaan, welke leeftijd ze voor geschikt zijn. We introduceren daarnaast ook een tweede abonnementsvorm voor kinderen die geen volwassen boeken kunnen zien.
Pas de applicatie aan met de volgende stukken:
1. Administreert de geboortedatum van leden
2. Administreert bij leden of ze een volwassen of kinder abonnement hebben
3. Boeken moeten uitgebreid worden met categoriën
4. Zorg er voor dat we boeken per categorie kunnen vinden/zoeken en filteren
5. Zorg er voor dat we op basis van een member/lid id boeken vinden die bij de leeftijd categorie passen
6. Bij het ophalen van leden willen we niet dat de geboortedatum wordt getoond, maar alleen de leeftijd. (dit kan je bereiken via een DTO)
