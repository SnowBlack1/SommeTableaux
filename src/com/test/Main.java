package com.test;

public class Main {

    public static void main(String[] args) {

        //String fruits [] = {"pomme", "orange", "framboise", "cerise", "fraise" };
        ////System.out.println(mots[3]);
        ////System.out.println(mots[0]);
        //for (int i = 0; i < fruits.length ; i++) {
        //    System.out.println("A l'emplacement " + i +" du tableau, nous avons = " + fruits[i]);
//
        //}
//
        //for (int i = 0; i <= fruits.length-1; i++) {
        //    System.out.println();
        //
        //}


        //int nombres2D [][]= { {1,2,3,4,5}, {10,9,8}, {7} };
        //for (int i = 0; i <= nombres2D.length-1 ; i++) {
        //    int sousboite1 [] = nombres2D[i];
        //    for (int j = 0; j <= sousboite1.length-1 ; j++) {
        //        System.out.println("A l'emplacement " + i+ " " + j + " du tableau, nous avons = " + sousboite1[j]);

        //    }
        //}

        //int nombres3D [][][] = {
        //        {
        //            {2,3}
        //        },
        //        {
        //            {1,2,3,4,5},{10,9,8}, {7,12}
        //        }
        //};

        int nombres[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //55  indice doit prendre +1 et l'additionner avec le suivant jusqu'à nombres.length
        int n;
        int somme = 0;
        int resultat = 0;

        for (int i = 0; i < nombres.length ; i++) { // A GARDER
            somme = somme + nombres [i];
        }
        System.out.println(somme);

        //int multiplication [] = {1,3,4,8,15}; //1440 DEMANDER
        //for (int i = 0; i <= multiplication.length-1 ; i++) {
            //resultat = resultat * multiplication[i];
        //}
        //System.out.println(resultat);


        //do {
        //    n = nombres [i] + nombres [i+1];
        //    int somme = n + i++;
        //   System.out.println(somme);
        //} while (i < nombres.length);


        //for (int i = 0; i < nombres.length; i++) {
        //    n = nombres[i] + nombres[i + 1]; // avec juste cette ligne, il additionne toujours le i actuel + i-1
        //    int somme = n + i++; //?
        //    System.out.println(n);
        //}


        // for (int i = nombres.length; i >= 0; i--) {
        //     n = nombres[i] + nombres[i - 1];
        //     System.out.println(n);
        // }


       int tableau2D [][] = { {8,6,2,3,10}, {1,4,9,5,7} };
       for (int i = 0; i <tableau2D.length ; i++) {
           int sousboite [] = tableau2D[i];
           for (int j = 0; j < sousboite.length ; j++) {
               somme = somme + tableau2D[i][j];
           }

       }System.out.println(somme);


    }

}




