package com.itbulls.learnit.javacore.operations;

import java.util.Arrays;

public class PrimitiveAndRefferenceTypesComparison {

    public static void main(String[] args) {
        int int1 = 128; // Déclaration de deux variables de type int avec la valeur 128
        int int2 = 128;

        System.out.println("int1 == int2: " + (int1 == int2)); // Comparaison de deux entiers, résultat true
        System.out.println("1 == 2: " + (1 == 2)); // Comparaison de deux entiers, résultat false
        System.out.println("65 == 'A': " + (65 == 'A')); // Comparaison d'un entier avec un caractère, résultat true (caractère 'A' a la valeur numérique 65)

        Integer i = 128; // Déclaration de deux objets Integer avec la valeur 128
        Integer i2 = 128;

        System.out.println("i == i2: " + (i == i2)); // Comparaison de références d'objets, résultat false (objets différents)

        Integer i3 = 127; // Déclaration de deux objets Integer avec la valeur 127
        Integer i4 = 127;

        System.out.println("i3 == i4: " + (i3 == i4)); // Comparaison de références d'objets, résultat true (optimisation du pool d'objets pour les valeurs entre -128 et 127)

        Integer i5 = new Integer(127); // Création de deux nouveaux objets Integer avec la valeur 127
        Integer i6 = new Integer(127);

        System.out.println("i5 == i6: " + (i5 == i6)); // Comparaison de références d'objets, résultat false (objets différents)

        Integer i7 = Integer.valueOf(127); // Création de deux objets Integer avec la valeur 127 en utilisant valueOf
        Integer i8 = Integer.valueOf(127);

        System.out.println("i7 == i8: " + (i7 == i8)); // Comparaison de références d'objets, résultat true (optimisation du pool d'objets pour les valeurs entre -128 et 127)

        System.out.println("i.equals(i2): " + i.equals(i2)); // Comparaison de valeurs des objets, résultat true

        int[] arr1 = {1, 2, 3}; // Déclaration de deux tableaux d'entiers
        int[] arr2 = {1, 2, 3};

        System.out.println("arr1 == arr2: " + (arr1 == arr2)); // Comparaison de références de tableaux, résultat false (tableaux différents)
        System.out.println("arr1.equals(arr2): " + arr1.equals(arr2)); // Comparaison de contenu des tableaux, résultat false (tableaux différents)
        System.out.println("Arrays.equals(arr1, arr2): " + Arrays.equals(arr1, arr2)); // Comparaison de contenu des tableaux, résultat true

        arr1 = arr2; // Assignation de la référence du tableau arr2 à arr1
        System.out.println(arr1 == arr2); // Comparaison de références de tableaux, résultat true (pointent vers le même tableau)
    }
}
