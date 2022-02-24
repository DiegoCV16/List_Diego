package uaslp.objetos.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;


// Java Collections Framework

public class Main {

    // Generics

    // Templates

    public static void main(String[] args) {
        LinkedList<String> team1 = new LinkedList<>();
        LinkedList<String> team2 = new LinkedList<>();
        LinkedList<String> team3 = new LinkedList<>();

        // Fuertemente tipado
        team1.add("Jesús");
        team1.add("Salomón");
        team1.add("Yael");

        team2.add(0, "Cristian");
        team2.add(0, "Daniel");
        team2.add(0, "Diego");

        team3.add(0, "Imelda");

        Iterator<String> iterator;

        iterator = team1.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Jesús
        // Salomón
        // Yael

        iterator = team2.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Diego
        // Daniel
        // Cristian

        team1.remove(0);
        team1.add(0, "Rebeca");
        System.out.println("Team 1 tiene: " + team1.size() + " integrantes"); // debe imprimir "Team 1 tiene 3 integrantes"

        iterator = team1.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Rebeca
        // Salomón
        // Yael

        team2.remove(2);
        team2.add("Rita");
        System.out.println("Team 2 tiene: " + team2.size() + " integrantes"); // debe imprimir "Team 2 tiene 3 integrantes"

        iterator = team2.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Diego
        // Daniel
        // Rita

        team3.remove(0);

        team3.add("Tadeo");
        team3.add(0, "Isai");

        System.out.println("Team 3 tiene: " + team3.size() + " integrantes"); // debe imprimir "Team 3 tiene 2 integrantes"

        iterator = team3.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Tadeo
        // Isai

        if (team1.get(1).equals("Salomón")) {
            team1.set(1, "Luis");
        }

        System.out.println("Team 1 tiene: " + team1.size() + " integrantes"); // debe imprimir "Team 1 tiene 3 integrantes"

        iterator = team1.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
