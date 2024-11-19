package com.bigcorp.crm.base.cours.hierarchie;


/**
 * Interface fonctionnelle, que nous avons définie.
 * L'annotation @FunctionalInterface rassure ou incite le développeur
 * à utiliser des lambdas pour l'implémenter
 */
@FunctionalInterface
public interface Volant {

    public abstract int vole();
}
