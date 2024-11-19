package com.bigcorp.crm.base.cours.stream;

import com.bigcorp.crm.base.cours.Maison;

import java.util.ArrayList;
import java.util.List;

/**
 * Création et utilisation de streams
 */
public class MainStream {

    public static void main(String[] args) {
        List<String> mots = new ArrayList<>();
        mots.add("riz");
        mots.add("omelette");
        mots.add("poulet");
        mots.add("dessert");

        System.out.println("Avec foreach");
        for(String mot : mots){
            if(mot.length() > 3){
                System.out.println(mot);
            }
        }

        System.out.println("Avec stream");
        mots.stream()
                //peek sert à 'jeter un coup d'oeil' au stream
                .peek(s -> System.out.println("je fais un peek sur : " + s))
                .filter(s -> s.length()> 3)
                .forEach(System.out::println);

        //Utilisation de map pour passer d'un stream de String
        //à un stream de Maison
        mots.stream().map((String s) -> { Maison m = new Maison();
            m.setNumeroCadastre(s);
            m.setPrixAchat(s.length());
            return m;})
                .filter(m -> m.getPrixAchat() > 3)
                .limit(2)
                .forEach(System.out::println);

    }
}
