package com.bigcorp.crm.base.cours.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MonPremierBeanSpring {

    @Value("${super.cle}")
    private String superCle;

    @Autowired
    private MonSecondBeanSpring monSecondBeanSpring;

    public MonSecondBeanSpring getMonSecondBeanSpring() {
        return monSecondBeanSpring;
    }

    public void setMonSecondBeanSpring(MonSecondBeanSpring monSecondBeanSpring) {
        this.monSecondBeanSpring = monSecondBeanSpring;
    }

    public MonPremierBeanSpring(){
        System.out.println("Le premier bean spring a été instancié");
    }

    public void afficheSalut(){
        System.out.println("Salut du premier bean Spring, superCle vaut " + superCle);
    }
}
