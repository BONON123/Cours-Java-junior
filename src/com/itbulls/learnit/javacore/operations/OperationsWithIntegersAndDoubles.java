package com.itbulls.learnit.javacore.operations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperationsWithIntegersAndDoubles {

    public static void main(String[] args) {
        int i = 20; // Déclare une variable entière i et lui assigne la valeur 20
        System.out.println(i / 3); // Effectue une division entière, résultat tronqué à 6
        System.out.println(i - (6 * 3)); // Calcule le reste de la division de i par 3, résultat 2
        System.out.println((double)i / 3); // Convertit i en double avant la division, résultat avec décimales

        // Utilisation de BigDecimal pour des calculs précis avec des nombres décimaux
        BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2); // Crée un BigDecimal avec la valeur 20.00
        BigDecimal amountOfPeople = BigDecimal.valueOf(3); // Crée un BigDecimal avec la valeur 3
        BigDecimal chargePerPerson = rideFee.divide(amountOfPeople, RoundingMode.HALF_UP); // Divise rideFee par amountOfPeople, arrondit à l'arrondi supérieur
        System.out.println(chargePerPerson); // Affiche le résultat de la division avec deux décimales : 6.67

        // Déclaration de variables double pour des calculs avec des nombres à virgule flottante
        double d = 3.1;
        double d2 = 1.21;

        // Soustraction de deux doubles, peut entraîner des erreurs d'arrondi
        System.out.println(d - d2); // Résultat avec plusieurs décimales : 1.8900000000000001

        // Utilisation de BigDecimal pour des calculs précis avec des doubles
        BigDecimal bd3 = BigDecimal.valueOf(3.1).setScale(2); // Crée un BigDecimal avec la valeur 3.10
        BigDecimal bd4 = BigDecimal.valueOf(1.21).setScale(2); // Crée un BigDecimal avec la valeur 1.21
        System.out.println(bd3.subtract(bd4)); // Soustraction de deux BigDecimal, résultat précis : 1.89
    }
}
