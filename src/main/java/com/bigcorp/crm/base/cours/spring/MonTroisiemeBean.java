package com.bigcorp.crm.base.cours.spring;

import org.springframework.stereotype.Component;

public class MonTroisiemeBean {

    public MonTroisiemeBean(){
        System.out.println("Le premier bean spring a été instancié");
    }

    public void afficheSalut(){
        System.out.println("Salut du premier bean Spring");
    }
}
