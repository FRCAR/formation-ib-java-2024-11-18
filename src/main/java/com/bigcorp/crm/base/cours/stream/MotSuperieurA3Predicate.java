package com.bigcorp.crm.base.cours.stream;

import java.util.function.Predicate;

/**
 * Une implémentation de Predicate : pourrait être
 * remplacée par une lambda
 */
public class MotSuperieurA3Predicate implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return s.length() > 3;
    }
}
