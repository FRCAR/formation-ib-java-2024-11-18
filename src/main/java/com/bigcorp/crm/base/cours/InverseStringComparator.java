package com.bigcorp.crm.base.cours;

import java.util.Comparator;

public class InverseStringComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}

}
