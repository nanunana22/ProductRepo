package org.example;

//Erstellen Sie eine Klasse ProductRepo, die eine Liste von Product-Objekten enthält.
//Schritt 1: Erstellen Sie einen Datensatz Product mit den erforderlichen Attributen.
//Schritt 2: Implementieren Sie die Klasse ProductRepo mit einer Liste zum Speichern von Produkten.
//Schritt 3: Implementieren Sie Methoden zum Hinzufügen, Entfernen und Abrufen von Produkten (einzelnes Produkt und alle Produkte).

import java.util.ArrayList;
import java.util.List;
// Erstellen einer ArrayList
public class Main {
    public static void main(String[] args) {
        // Erstellen einer ArrayList
        List<String> meineListe = new ArrayList<>();

        // Hinzufügen von Elementen zur Liste
        meineListe.add("Apfel");
        meineListe.add("Banane");
        meineListe.add("Orange");

        // Zugriff auf Elemente in der Liste
        System.out.println("Das erste Element ist: " + meineListe.get(0));

        // Durchlaufen der Liste
        System.out.println("Alle Elemente in der Liste:");
        for (String frucht : meineListe) {
            System.out.println(frucht);
        }
    }
}
