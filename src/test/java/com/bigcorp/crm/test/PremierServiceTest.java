package com.bigcorp.crm.test;


import com.bigcorp.crm.base.cours.test.PremierService;
import com.bigcorp.crm.base.cours.test.SecondService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.lenient;
@ExtendWith(MockitoExtension.class)
public class PremierServiceTest {

    @Mock
    private SecondService secondServiceMock;

    private PremierService premierService = new PremierService();

    @BeforeEach
    public void prepareTests(){
        premierService.setSecondService(secondServiceMock);
        lenient().when(secondServiceMock.isValid(Mockito.anyString())).thenReturn(false);
        lenient().when(secondServiceMock.isValid("Jean")).thenReturn(false);
        lenient().when(secondServiceMock.isValid(Mockito.argThat(s -> s.endsWith("phie")))).thenReturn(true);
    }

    @Test
    public void testPremierServiceAfficheInfoJean(){
        String premierServiceMessage = premierService.afficheInfo("Jean");
        Assertions.assertEquals("Un nom invalide : Jean", premierServiceMessage);
    }

    @Test
    public void testPremierServiceAfficheInfoSophie(){
        String premierServiceMessage = premierService.afficheInfo("Sophie");
        Assertions.assertEquals("Un nom valide : Sophie", premierServiceMessage);
    }

}
