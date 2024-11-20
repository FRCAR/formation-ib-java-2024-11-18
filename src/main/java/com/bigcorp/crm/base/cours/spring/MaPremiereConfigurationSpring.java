package com.bigcorp.crm.base.cours.spring;

import com.bigcorp.crm.base.cours.Maison;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Configuration indique à Spring que la classe
//va injecter d'autres beans dans le contexte (entre autres)
@Configuration
//ComponentScan force Spring à scanner un package (et ses sous-packages)
//pour trouver des classes annotées (avec par exemple @Component)
@ComponentScan("com.bigcorp.crm.base.cours.spring")
@ComponentScan("fr.maboite")
//PropertySource demande à Spring de charger des couples (clés,valeurs)
//à partir d'un fichier de propriétés
@PropertySource("classpath:mes-proprietes.properties")
public class MaPremiereConfigurationSpring {

    //On injecte ici la valeur correspondant à la clé maison.prix.base
    //Celle-ci devrait venir d'un fichier de propriétés
    @Value("${maison.prix.base}")
    private Integer valeurBaseMaison;

    //Une méthode annotée avec Bean est
    //appelée par Spring. Ce qu'elle renvoie est placé
    //dans le contexte de Spring.
    @Bean
    public Maison maison(){
        Maison maison = new Maison();
        maison.setPrixAchat(valeurBaseMaison);
        maison.setNumeroCadastre("O2487-22093847");
        return maison;
    }
}
