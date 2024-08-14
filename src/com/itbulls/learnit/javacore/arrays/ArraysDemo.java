package com.itbulls.learnit.javacore.arrays;

import java.util.Arrays;

public class ArraysDemo {
    
    public static void main(String[] args) {
        int[] arr; // Déclaration d'un tableau d'entiers nommé arr
        int arr2[]; // Autre syntaxe pour déclarer un tableau d'entiers
        
        arr = new int[10]; // Création d'un tableau d'entiers de taille 10
//      System.out.println(arr.length); // Affiche la longueur du tableau (10)
//      System.out.println(arr[0]); // Affiche la valeur du premier élément (0 par défaut)
        
        double[] arr3 = new double[10]; // Création d'un tableau de doubles de taille 10
//      System.out.println(arr3[0]); // Affiche la valeur du premier élément (0.0 par défaut)
        
        boolean[] arr4 = new boolean[10]; // Création d'un tableau de booléens de taille 10
//      System.out.println(arr4[0]); // Affiche la valeur du premier élément (false par défaut)
        
//      System.out.println(arr4[10]); // Essayer d'accéder à un élément en dehors des limites du tableau provoque une exception
        
        int[] arr5 = {3, 2, 1}; // Création d'un tableau d'entiers avec des valeurs initiales
        
        int[][] matrix = {
                {1, 2, 3}, // Création d'un tableau bidimensionnel (matrice)
                {4, 5, 6}
        };
        
//      System.out.println(matrix[0][2]); // Affiche l'élément à la première ligne, troisième colonne (3)
        
        int[][] matrix2 = new int[10][10]; // Création d'une matrice de taille 10x10
//      System.out.println(matrix2[0]); // Affiche la première ligne de la matrice
        
        System.out.println(Arrays.toString(arr5)); // Affiche le contenu du tableau arr5 sous forme de chaîne
        Arrays.sort(arr5); // Trie le tableau arr5 par ordre croissant
        System.out.println(Arrays.toString(arr5)); // Affiche le tableau arr5 trié
    }
    
}
