package com.bigcorp.crm.base.cours.spring;

import com.bigcorp.crm.base.cours.Maison;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext monContexteSpring
                = new AnnotationConfigApplicationContext(MaPremiereConfigurationSpring.class);
        MonPremierBeanSpring monPremierBeanSpring = monContexteSpring.getBean(MonPremierBeanSpring.class);
        monPremierBeanSpring.afficheSalut();
        monPremierBeanSpring.getMonSecondBeanSpring().afficheSalut();
        Maison maisonQuiVientDeSpring = monContexteSpring.getBean(Maison.class);
        System.out.println("La maison vaut : " + maisonQuiVientDeSpring.getPrixAchat());
    }
}
