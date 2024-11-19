package com.bigcorp.crm.base.cours.lambda;

import com.bigcorp.crm.base.cours.Maison;
import com.bigcorp.crm.base.cours.MaisonPrixComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Utilisation de lambdas, plutôt que des implémentations
 * d'interfaces fonctionnelles
 */
public class LambdaMain {

    public static void main(String[] args) {
        Maison m1 = new Maison();
        m1.setPrixAchat(20);

        Maison m2 = new Maison();
        m2.setPrixAchat(40);

        Maison m3 = new Maison();
        m3.setPrixAchat(10);

        List<Maison> maListeDeMaisons = new ArrayList<>();
        maListeDeMaisons.add(m1);
        maListeDeMaisons.add(m2);
        maListeDeMaisons.add(m3);

        //Utilisation d'une classe qui implémente l'interface fonctionnelle
        //Comparator
        Collections.sort(maListeDeMaisons, new MaisonPrixComparator());

        int i = 12;
        //Utilisation d'une lambda (une autre manière d'implémenter
        // l'interface
        //fonctionnelle)
        // On se sert de variables définies dans le corps de la lambda
        // et ailleurs (i est effectivement final)
        Collections.sort(maListeDeMaisons,
                (Maison maison1, Maison maison2)
                        ->
                {
                    int j = 13;
                    System.out.println(i);
                    System.out.println(j);
                    return j - maison1.getPrixAchat() - maison1.getPrixAchat(); });

        //Utilisation d'une lambda raccourcie
        Collections.sort(maListeDeMaisons,
                (o1, o2) -> o1.getPrixAchat() - o2.getPrixAchat());


        for (Maison maison : maListeDeMaisons){
            System.out.println("Maison avec le prix :  " + maison.getPrixAchat());
        }

    }
}
