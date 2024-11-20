package com.bigcorp.crm.base.cours.spring;

import org.springframework.stereotype.Component;

@Component
public class MonSecondBeanSpring {

    public MonSecondBeanSpring(){
        System.out.println("Le second bean spring a été instancié");
    }

    public void afficheSalut() {
        System.out.println("Salut du second bean spring");
    }
}
