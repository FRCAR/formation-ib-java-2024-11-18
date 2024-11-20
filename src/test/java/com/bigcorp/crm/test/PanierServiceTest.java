package com.bigcorp.crm.test;

import com.bigcorp.crm.base.cours.test.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PanierServiceTest {

    @Mock
    PaiementService paiementService;

    @BeforeEach
    public void setMocks() {
        Mockito.lenient().when(paiementService.paie(Mockito.anyString(), Mockito.anyInt())).thenReturn(true);
        Mockito.lenient().when(paiementService.paie(Mockito.eq(null), Mockito.anyInt())).thenReturn(false);
    }

    @Test
    public void testPanierPleinAvecClient() {

        PanierService panierService = new PanierService();
        panierService.setPaiementService(paiementService);

        Panier panier1 = new Panier();
        panier1.getArticles().add(new Article("cartable", 30));
        panier1.getArticles().add(new Article("boîte de petits pois", 50));

        boolean resultatAchat = panierService.achetePanier(panier1);
        Assertions.assertFalse(resultatAchat);
        Assertions.assertEquals(PanierEtat.PANIER, panier1.getEtat());


        panier1.setEmailClient("jeanjean");
        resultatAchat = panierService.achetePanier(panier1);
        Assertions.assertTrue(resultatAchat);
        Assertions.assertEquals(PanierEtat.VENDU, panier1.getEtat());

    }


    @Test
    public void testPanierVide() {

        PanierService panierService = new PanierService();
        panierService.setPaiementService(paiementService);

        Panier panier1 = new Panier();
        panier1.setEmailClient("jeanjean");

        boolean resultatAchat = panierService.achetePanier(panier1);
        Assertions.assertFalse(resultatAchat);
        Assertions.assertEquals(PanierEtat.PANIER, panier1.getEtat());

    }

}