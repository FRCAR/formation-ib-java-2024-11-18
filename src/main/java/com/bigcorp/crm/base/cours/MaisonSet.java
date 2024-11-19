package com.bigcorp.crm.base.cours;

import java.util.*;

/**
 * Classe utilitaire pour tester des sets de Maison
 * et la bonne implémentation de Maison.equals et Maison.hashCode
 */
public class MaisonSet {

    public static void main(String[] args) {
        Set<Maison> maisons = new HashSet<>();
        Maison maisonnette = new Maison();
        maisonnette.setNombreDePieces(1);
        maisons.add(maisonnette);
        System.out.println(maisons.size());

        //maisonnette.setNombreDePieces(3);
        System.out.println("La maisonnette est dans le set ? "
                + maisons.contains(maisonnette));





    }
}
