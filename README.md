# Aplicació de Gestió Bancària

## Descripció del projecte

Aquest projecte consisteix en el disseny i implementació d’una aplicació de gestió bancària utilitzant el paradigma de Programació Orientada a Objectes (POO).

L’objectiu principal és modelar el sistema bancari mitjançant un diagrama de classes, implementar l’esquelet en Java i documentar-lo amb JavaDoc, així com representar el comportament del sistema amb diferents diagrames UML.

---

## Estructura del projecte

El projecte està organitzat en les següents carpetes:

* **src/**
  Conté totes les classes Java del sistema (esquelet amb atributs, mètodes i relacions).

* **diagrames/**
  Inclou els diagrames UML requerits:

  * Diagrama de classes
  * Diagrama de casos d’ús
  * Diagrama de seqüència
  * Diagrama de comunicació
  * Diagrama d’activitat

* **documentacio/**
  Conté la documentació generada amb JavaDoc en format HTML.

* **README.md**
  Document explicatiu del projecte.

---

## Funcionalitats modelades

El sistema permet gestionar:

* Clients i empleats
* Sucursals bancàries
* Comptes bancaris:

  * Comptes corrents
  * Comptes a termini
* Productes associats:

  * Targetes de crèdit
  * Fons d’inversió
  * Carteres de valors

---

## Disseny orientat a objectes

S’ha aplicat el disseny orientat a objectes mitjançant:

* Identificació de classes a partir de l’anàlisi gramatical
* Definició d’atributs i mètodes
* Relacions entre classes:

  * Herència (Persona → Client / Empleat)
  * Associació (Client → Comptes)
  * Agregació i composició segons el tipus de relació
* Definició de cardinalitats

---

## Implementació

Les classes estan implementades en Java com a esquelet (sense lògica interna), incloent:

* Declaració d’atributs
* Constructors
* Mètodes amb paràmetres
* Relacions entre classes mitjançant referències i col·leccions

---

## Documentació JavaDoc

El projecte està documentat amb JavaDoc, incloent:

* Descripció de classes
* Documentació de mètodes
* Paràmetres d’entrada i sortida

### Generar JavaDoc

Per generar la documentació:

```bash
javadoc -d documentacio src/*.java
```

Després obrir:

```bash
documentacio/index.html
```

---

## Compilació del projecte

Per compilar totes les classes:

```bash
javac src/*.java
```

---

## Eines utilitzades

* Java
* Visual Studio Code
* draw.io (diagrames UML)
* GitHub (control de versions)

---

## Autor

Projecte realitzat per: Isaac Martinez Sanchez

---

## Notes finals

Aquest projecte és una simulació acadèmica centrada en el disseny i modelatge del sistema, per tant no inclou la implementació completa de la lògica de negoci.
