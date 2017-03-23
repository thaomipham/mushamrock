## Inhaltsverzeichnis

- [Greenfoot](#1)

- [My First Stride Game](#2)
- [Magic Mushroom](#3)
- [Konzept](#4)
- [Mushamrock](#5)

  1. [Bugs](#6)
  
  
___________________

## Greenfoot<a name="1"></a>

Greenfoot ist eine auf Java basierende Entwicklungsumgebung, die es Schülern und allgemein Programmieranfängern ermöglichen soll, erste Schritte in der Welt des Programmierens zu fassen. Innerhalb von Greenfoot benutze ich Stride, ein Blockbasiertes System, welches einem den direkten Umgang mit der Sprache Java erleichtern. 

2006 wurde Greenfoot erstmals von der 'University of Kent' mit der Unterstützung von Oracle veröffentlicht. Es ist für alle gängigen Betriebssysteme verfügbar und unter der freien GPL-Lizenz veröffentlicht.
(Wikipedia: Greenfoot)

Auf der Homepage von Greenfoot können Anfänger im Community-Forum nach Lösungen für ihre Probleme suchen, während fortgeschrittene Programmierer Anfängern aushelfen und sich über komplexere Probleme austauschen können. Man kann auch Projekte dort veröffentlichen.

In Greenfoot wird unterschieden zwischen sogenannten "World Classes" und "Actor Classes". Actors sind Objekte, die sich in der Welt befinden, unter "World Classes" befinden sich die Klassen, die den Hintergrund und die Welt allgemein definieren, also auch bestimmen, welche Actors am Anfang wo gespawnt werden. 


## My First Stride Game<a name="2"></a>

Von dem online tutorial der University of Kent, sieht man, wie man innerhalb von sieben Minuten ein Spiel erstellen kann. Gezeigt wird der Bildschirm des Programmierers, welcher ohne Anleitung ein Spiel programmiert. Ich habe das Spiel dadurch ohne Vorkenntnisse mit Mühe replizieren können.

https://blogs.kent.ac.uk/mik/2016/10/stride-creating-a-game-in-7-minutes/

![](https://github.com/thaomipham/mushamrock/blob/master/pictures/preview-1.php.jpeg)

Zuerst muss die Welt erstellt werden, es gibt nur eine Klasse ("MyWorld"), da der der Hintergrund immer gleich ist und auf der Ebene nicht viel mehr passiert. Diese Klasse enthält eine Methode "populateWorld", in der die einzelnen Actores gesetzt werden, dass heißt im Einzelnen wird immer erst eine Variable erstellt, die den individuellen Namen des Actores definiert, und danach mit der Funktion addObject() an einem definierten Ort mit X- und Y-Koordinaten positioniert. 
((Code-Ausschnitt MyWorld populateWorld))

### Actors

In dem Spiel gibt es insgesamt drei Actors, den Ladybug, welches der Spieler kontrolliert, die Schlangen, die den Ladybug essen und die Kirschen, die vom Ladybug gegessen werden und Punkte erzeugen.

#### Ladybug

Der Marienkäfer bewegt sich durchgehend im Spiel und kann vom Spieler durch die rechts/links Pfeiltasten gesteuert werden. Durch die Bedingung, dass die Taste gedrückt wird, bewegt sich der Käfer im Spiel in die zugeordnete Richtung.

#### Snakes

Schlangen bewegen sich zufällig in der Welt und fressen den Spieler, wenn dieser die Schlange berührt. Sie bewegen sich permanent, jeweils pro regelmäßigem Durchlauf der act()-Methode, um eine Einheit nach vorne und drehen sich, falls ein kleiner Zufallstest mit der Wahrscheinlichkeit 10% positiv ausfällt, um einen zufälligen Wert zwischen -30 und 30 (0 bis 60 - 30).

Wenn die Schlange den Marienkäfer bzw. Spieler gefressen hat, erscheint auf dem Bildschirm: "you loose". Da der Spieler keine Aktionen mehr betätigen kann, ist das Spiel für den Spieler vorbei und kann bei 'reset' wieder gestartet werden.

#### Cherries

Cherries sind einfache Actors, die sich weder bewegen noch eine andere Funktion haben, außer gefressen zu werden.


## Magic Mushroom<a name="3"></a>

(Ich habe kein Drogenproblem, nur ich schaffe es anscheinend jedes Mal witzige Drogen-verwandte Spiele zu kreieren.)

Das Magic Mushroom Game, war die erste Version des Mushamrock-Spiels und hatte anfangs mehrere Actors, die ich alle außer den Fliegenpilz gelöscht habe. Der Mushroom sollte sich manuell bewegen können und durch die Pfeiltasten gesteuert werden (siehe Msuhroom and Shamrock). Der "tote" Mushroom sollte danach respawnen, was in der Welt definiert ist, dass der Mushrrom im Spielmittelfeld respawned. Die Welt wurde jedoch auf Java-umkonvertiert und eine bestimmte Anzahl von Mushroom pro Sekunde (viele, ich kann die nicht so schnell zählen) wird gespawnt. Die Pilze werden gespawnt und können sich bewegen und interessante Bilder gestalten. 

![](https://github.com/thaomipham/mushamrock/blob/master/pictures/magic%20mushroom.PNG)
 
## Konzept<a name="4"></a>
 
Das Spiel sollte ein Multiplayer-Spiel für zwei Spieler sein, die jeweils einen Actoren über eine Tastatur kontrollieren können. Die Actoren der Spieler agieren zwar nicht miteinander, dennoch konkorrieren sie miteinander, da sie beide die selben Bälle "fressen", um Punkte zu erhalten. Wenn einer der beiden Spieler eine Bombe berührt und demnach "stirbt", endet das Spiel.  
 
 
## Mushamrock<a name="5"></a>
 
Für die Welt gibt es nur eine Klasse ("MyWorld"), da der der Hintergrund immer gleich ist und auf der Ebene nicht viel mehr passiert. Diese Klasse enthält eine Methode "populateWorld", in der die einzelnen Actores gesetzt werden, dass heißt im Einzelnen wird immer erst eine Variable erstellt, die den individuellen Namen des Actores definiert, und danach mit der Funktion addObject() an einem zufälligen Ort für X sowie Y kleiner gleich 500 positioniert. 
((Code-Ausschnitt MyWorld populateWorld))

### Actors

Es gibt fünf verschiedene Actor Classes. ((BilD))

#### Shamrock & Mushroom

Shamrock und Mushroom sind die Spielcharaktere, die mit den Pfeiltasten, bzw. WASD gesteuert werden. Für die Bewegungen existiert eine Methode in der die einzelnen Tasten jeweils abgegriffen werden und darauf folgend entweder eine Bewegung ("move") oder eine Drehung um 5° ("turn") ausgeführt wird. Der Mushroom wird mit den Pfeiltasten gesteuert, Shamrock mit WASD.

((Code))

In der Methode eat() wird für Mushroom bzw. Shamrock erst überprüft, ob sie gerade ein Objekt der Klasse Ball berühren (Funktion isTouching) und bei positivem Ergebnis der Ball gelöscht, dem Spieler ein Punkt hinzugefügt und die Gesamtpunktzahl als Text am Bildschirmrand eingeblendet. Ein neuer Ball wird mit der Methode respawnball() gespawnt. Der Respawn funktioniert genauso wie in der Welt-Klasse am Anfang des Spiels.

((Code))

Wenn einer der Spieler die Bombe berührt, wird von hier aus ein Text in der Mitte eingeblendet, der mit den altbekannten Worten "GAME OVER" das Spielende einleitet.

((Coder))

#### Bomb & Explosion

Die Bombe bewegt sich im Gegensaz zu den anderen Actors nicht; Sie überprüft nur, ob sie mit Mushroom oder Shamrock kollidiert. In diesem Fall wird ein Objekt Pham der Klasse explosion gespawnt, welches letztendlich nur ein Bild ist, das an der Position der Bombe erscheint. Gleichzeitig wird der jeweilige Spieler entfernt.


#### Ball

Genauso wie die Schlangen: 

Bälle bewegen sich zufällig in der Welt und warten darauf, von einem Spieler gefressen zu werden. Sie bewegen sich permanent, jeweils pro regelmäßigem Durchlauf der act()-Methode, um eine Einheit nach vorne und drehen sich, falls ein kleiner Zufallstest mit der Wahrscheinlichkeit 10% positiv ausfällt, um einen zufälligen Wert zwischen -30 und 30 (0 bis 60 - 30).
 
 
### Bugs<a name="6"></a>

Das Spiel funktioniert einwandfrei, jedoch werden alle Actors zufällig gespawnt und dementsprechend können Actors schon miteinander agieren, ohne dass die Spieler etwas getan haben. 

Zudem kann der Spieler, welcher länger seinen Actor am leben hält weitert spielen. Das Spiel geht weiter, der Text 'GAME OVER' wird nur angezeigt und der Emoji, welches die Explosion makiert verdeckt einen Teil des Spiels.


