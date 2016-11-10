# Rezeptplanung

## Fakten

* Zwei Standorte
** Essen
** Mülheim

* Planung für 5 Tage die Woche
* Eine Kantine

* Eine Datei mit Rezepten
* Preisliste von verschiedenen Anbietr

* Pro Planungszeitraum (offen)
** Kein Gericht darf doppelt vorkommen
** Mindestens ein Fischgericht PRO Woche
** Mindestens ein Fleischgericht am Tag
** Mindestens ein Veg. Gericht am Tag

* Gerichte
** Beliebtheit (dynamisch, manuell) -> Wie ist beliebtheit definiert? 
** Zutaten
*** Preis
** Abwechslung (dynamisch, inkrementell pro Koch)

## Offene Frage

* Gibt es unterschiedliche Gerichte pro Kantine? Wirtschaftlich nicht sinnvoll da möglicherweise unterschiedliche Gerichte produziert werden
* Transportkosten sind wie geregelt?
* Abwechslung ist wichtig. Gleiches Gericht darf sich maximal wann wiederholen?
* Wie ist eine Planungsperiode definiert?
* Wie groß ist der Pool der Gerichte?
* Können die Köche überhaupt jedes Gericht kochen?
* Müssen die Gerichte IMMER anders sein? Schnitzel geht doch immer.
* Wie setzen sich die Transportkosten zusammen?
* Wie ist der Bestand pro Artikel? Hat jeder Händler alle Artikel? Wie ist die Verfügbarkeit?
* Haben Händler alle ihre eigene SKU?

** Stack

http://crunchify.com/how-to-build-restful-service-with-java-using-jax-rs-and-jersey/


Sehr geehrte Damen und Herren,

vielen Dank für Ihre Anfrage. Nach erster Durchsicht der Anforderung ergeben sich einige Fragen, die Ich Ihnen gerne stellen würde.

Lieferanten

Sie erwähnen dass Sie in Zukunft zuzüglich zum bestehenden Sortiment des Großhandels regionale Anbieter in Betracht ziehen. 

Gibt es bestehende Verträge mit Bauernhöfe? Falls ja, wie viele Lieferanten sollen angebunden werden?
In welchem Format liegen die Preislisten vor?
Sind die Artikel durch eine EAN eindeutig gekennzeichnet?
Da der Bauernhof nicht die gleiche Sortimentsvielfalt wie der Großhändler hat, gehe ich davon aus dass die einzelnen Zutaten von unterschiedlichen Lieferanten geliefert werden können. Können Sie mir die Bestellfenster nennen? Konkret geht es darum zu evaluieren, ob eine Planung nach Periode gezielt durchgeführt werden kann wenn bestimmte Zutaten regionalen Schwankungen (Verfügbarkeit) unterliegen oder es sogar tagesabhängige Preise gibt.
Sind die Lagerbestände für mindestens eine Planungsperiode gesichert oder kann es sein dass diese täglich abgeglichen werden müssen?
Wie berechnen sich die Transportkosten pro Lieferung/Lieferant? Gibt es Staffelpreise?
Wie sind die Lieferzeiten? Müssen diese in der Planung berücksichtigt werden?
Lassen sich frische Lebensmittel (Kräuter, Gemüse, Obst, Fisch) zeitnah liefern oder werden ausschließlich TK-Waren eingesetzt. TK-Ware würde eine einfachere Planung ermöglichen.
Wie ist eine Planungsperiode definiert? Beträgt diese eine Woche?
Gerichte

Haben Sie die Möglichkeit, pro Standort unterschiedliche Gerichte für einen Planungszeitraum zu kochen oder sind die Speisekarten für beide Kantinen identisch? In Bezug auf mögliche Staffelpreise ergibt sich hier ein Möglichkeit zur Optimierung der Einkaufspreise.
Haben Sie genügend Rezepte um sich wiederholende Gerichte zu vermeiden?
Je nachdem wie die Planungsperiode definiert ist, halte Ich es nicht für sinnvoll, die gesamte Speisekarte zu ersetzen. Insbesondere erwähnen Sie dass es Gerichte gibt, die weniger beliebt sind als Andere. Halten Sie es nicht für sinnvoll, dass Bestseller (Pommes, Schnitzel) immer auf der Karte angeboten werden?
Wie wird die Beliebtheit eines Gerichtes gemessen? Anhand der verkauften Gerichte oder bekommen Sie das direkt mit?


Mit freundlichen Grüßen
