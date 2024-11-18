package com.bigcorp.crm.base.cours;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	
	
	public static void main(String[] args) {
		
	//Création d'une liste de Strings
	List<String> superList = new ArrayList<>();
	superList.add("coucou");
	superList.add("les");
	superList.add("gens");
	superList.add("super");
	superList.add("youpi");
	//Création d'une classe implémentant Comparator pour trier
	Collections.sort(superList, new InverseStringComparator());
	
	
	//Création d'un Comparateur inline pour comparer
	Collections.sort(superList, new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return - o1.compareTo(o2);
		}
	});
	
	//Utilisation d'un Comparateur via une lambda
	Collections.sort(superList, (o1,o2) -> { return -o1.compareTo(o2); });
	
	//Transformation d'une liste en streams
	superList.stream();
	
	//Utilisation d'une lambda pour filtrer les éléments dont la longueur <= 2
	superList.stream().filter((s) -> { return s.length() > 3;}).collect(Collectors.toList());

	}
}
