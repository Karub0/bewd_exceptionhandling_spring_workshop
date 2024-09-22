# Introductie
Deze workshop is bedoeld om exception handling toe te passen in een REST applicatie met Spring Boot en is onderdeel van de BEWD course aan de Hogeschool Arnhem/Nijmegen.

Spring faciliteert meerdere manieren om exceptions af te handelen. 
In deze oefening gaan we enkele van deze manieren toepassen.

# Workshop
## 1. Deze workshop clonen
Clone deze git repository zodat je er met je eigen favoriete java IDE mee kunt werken.

## 2. Run de code
Run de code en bekijk het resultaat via http://localhost:8081/movies.
Je kunt een specifieke film opvragen met http://localhost:8081/movies/?id=1

## 3. Gebruik van padvariabelen
In de controller zie je dat er gebruik wordt gemaakt van @RequestParam om een id mee te geven
Maak een nieuwe methode aan die ook een movie retourneert, maar dan via de url http://localhost:8081/movies/1

## 4. Afvangen MovieNotFoundException
Kijk nu wat er gebeurt als je http://localhost:8081/movies/?id=4 (of http://localhost:8081/movies/4) gebruikt.
Dit is niet zo netjes. Vang deze nu netjes af met gebruik van ResponseStatusException.
Geef bijvoorbeeld een NOT_FOUND terug.

## 5. Gebruik @ControllerAdvice
Als bovenstaande is gelukt, dan krijg je nu een nette response als je http://localhost:8081/movies/?id=4 gebruikt.
Als je echter http://localhost:8081/movies/4 bekijkt, dan wordt dit niet afgehandeld.
Dat kun je op dezelfde manier oplossen, maar dan krijg je dubbele code. 
Je moet dan namelijk op iedere plek dat de exception wordt gegooid, dezelfde code kopieren.
Dit voorkom je met het gebruik van @ControllerAdvice.
Vervang de gemaakte foutafhandeling op zo'n manier dat deze altijd en overal op dezelfde wijze wordt afgevangen.


