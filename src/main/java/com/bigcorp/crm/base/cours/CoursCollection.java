package com.bigcorp.crm.base.cours;

import java.util.*;

/**
 * Test de HashSet et HashMap
 */
public class CoursCollection {

    public static void main(String[] args) {
        Set<String> mesChaines = new HashSet<>();
        mesChaines.add("chaine 1");
        mesChaines.add("chaine 2");
        mesChaines.add("chaine 3");
        mesChaines.add("chaine 4");

        for(String chaine : mesChaines){
            System.out.println(chaine);
        }
        mesChaines.remove("chaine 1");
        System.out.println("Après suppression");
        for(String chaine : mesChaines){
            System.out.println(chaine);
        }
        mesChaines.clear();
        mesChaines.add("nouvelle chaine");

        Map<String, Maison> mesMaisonsParAdresse = new HashMap<>();
        mesMaisonsParAdresse.put("12 rue des dahlias", new Maison());
        mesMaisonsParAdresse.put("13 rue des narcisses", new Maison());
        Maison ancienneMaison = mesMaisonsParAdresse.put("12 rue des dahlias", new Maison());

        mesMaisonsParAdresse.remove("13 rue des narcisses");

        mesMaisonsParAdresse.remove("machin");

        mesMaisonsParAdresse.get("13 rue des narcisses");

        for(Map.Entry<String, Maison> entry : mesMaisonsParAdresse.entrySet()){
            System.out.println("A l'adresse : " + entry.getKey() + " se trouve la maison : " + entry.getValue());
        }

        List<Maison> maisons = new ArrayList<>();
        Maison maison1 = new Maison();
        maison1.setNombreDePieces(2);
        maison1.setSurface(40);
        maisons.add(maison1);
        maison1.setPrixAchat(300);


        Maison manoir = new Maison();
        manoir.setNombreDePieces(20);
        manoir.setSurface(400);
        manoir.setPrixAchat(200);
        maisons.add(manoir);

        Maison tinyHouse = new Maison();
        tinyHouse.setNombreDePieces(2);
        tinyHouse.setSurface(4);
        tinyHouse.setPrixAchat(100);
        maisons.add(tinyHouse);

        Collections.sort(maisons);

        for (Maison maison : maisons){
            System.out.println(maison);
        }

        System.out.println("Après tri par prix");
        Collections.sort(maisons, new MaisonPrixComparator());
        for (Maison maison : maisons){
            System.out.println(maison);
        }
    }
}
