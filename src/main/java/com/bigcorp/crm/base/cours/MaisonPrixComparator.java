package com.bigcorp.crm.base.cours;

import java.util.Comparator;

public class MaisonPrixComparator implements Comparator<Maison> {
    @Override
    public int compare(Maison o1, Maison o2) {
        return o1.getPrixAchat() - o2.getPrixAchat();
    }
}
