package com.bigcorp.crm.base.cours.hierarchie;

/**
 * Implémentation d'une lambda pour créer une variable;
 * Possible, mais assez peu utilisé : une lambda est généralement
 * écrite en tant qu'argument d'une méthode.
 */
public class LambdaVolantMain {
    public static void main(String[] args) {
        Volant v = () -> {return 0;};
    }
}
