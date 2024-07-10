package org.example;

//Erstellen Sie eine Klasse ProductRepo, die eine Liste von Product-Objekten enthält.
//Schritt 1: Erstellen Sie einen Datensatz Product mit den erforderlichen Attributen.
//Schritt 2: Implementieren Sie die Klasse ProductRepo mit einer Liste zum Speichern von Produkten.
//Schritt 3: Implementieren Sie Methoden zum Hinzufügen, Entfernen und Abrufen von Produkten (einzelnes Produkt und alle Produkte).

//Erstellen Sie eine Klasse OrderListRepo, die eine Liste von Order-Objekten enthält.
//Schritt 1: Erstellen Sie einen Datensatz Order mit den erforderlichen Attributen.
//Schritt 2: Implementieren Sie die Klasse OrderListRepo mit einer Liste zum Speichern von Bestellungen.
//Schritt 3: Implementieren Sie Methoden zum Hinzufügen, Entfernen und (einzelner Auftrag und alle Aufträge).

//Erstellen Sie eine Klasse ShopService, über die wir neue Bestellungen aufgeben können.
//Schritt 1: Implementieren Sie eine Methode, um eine neue Bestellung aufzugeben.
//Schritt 2: Prüfen Sie, ob die bestellten Produkte existieren. Wenn nicht, drucken Sie eine System.out.println Nachricht.
//Schritt 1: Erstellen Sie eine OrderRepo-Schnittstelle mit den Methoden aus der OrderListRepo (add, remove und getSingle, getAll).

//Erstellen Sie eine Klasse OrderMapRepo, über die wir neue Bestellungen aufgeben können.
//Diese Klasse sollte ebenfalls die Schnittstelle OrderRepo implementieren.
//Erstellen Sie in der Hauptmethode entweder das OrderMapRepo oder das OrderListRepo und übergeben Sie es an den Konstruktor von ShopService (als Konstruktorparameter, der die Schnittstelle verwendet).

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductRepo repo = new ProductRepo();
        System.out.println(repo.getProducts());

        Product milk = new Product("milk","22",3);
        repo.putProduct(milk);
        System.out.println(repo.getProducts());
        repo.removeProduct(milk);
        System.out.println(repo.getProducts());
        repo.putProduct(milk);
        repo.findById("22");
        System.out.println(repo.getProducts());
//        List<Product> list = new ArrayList<>();
//        Product product = new Product("milk", "22",3);
//        list.add(product);
//        list.add(new Product("avocado", 12,4));
//        list.add(new Product("mango", 13,5));
//        System.out.println(list);





    }
}
