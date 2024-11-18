/**
 * Exemple sur les tableaux
 */

package com.bigcorp.crm.base.cours;

// Classe principale
public class Tableaux {
	public static void main(String[] args) {
		// Declaration d'un tableau sans l'alimenter
		int[] monTableauDInt = new int[3];

		// Affectation des valeurs a un tableau
		// Remarque : le premier indice du tableau est 0
		monTableauDInt[0] = 4;
		monTableauDInt[2] = 1;

		// Affichage d'une valeur d'un tableau
		System.out.println("monTableauDInt[1] vaut : " + monTableauDInt[1]);

		// Affichage d'une valeur non attribue d'un tableau (cela est egale a null)
		// Vouloir acceder a un index non inclus dans un tableau genere une exception
		String[] monTableauDeString = new String[4];
		System.out.println("monTableauDeString[1] vaut : " + monTableauDeString[1]);

		// Declaration d'un tableau sans declarer son nombre d'elements et alimente
		// directement
		Float[] monTableauDeFloat = { 1f, 2f, null, 4f };

		// Parcours du tableau pour afficher les elements
		for (int i = 0; i < monTableauDeFloat.length; i++) {
			System.out.println("monTableauDeFloat[" + i + "] vaut " + monTableauDeFloat[i]);
		}

		// Tableau a deux dimensions
		int[][] batailleNavale = new int[10][10];

		// Affichage des dimensions du tableau
		System.out.println(batailleNavale.length);
		System.out.println(batailleNavale[0].length);

		// Parcours du tableau pour afficher le contenu.
		for (int i = 0; i < batailleNavale.length; i++) {
			int[] colonne = batailleNavale[i];
			for (int j = 0; j < colonne.length; j++) {
				System.out.println("case[" + i + "][" + j + "] vaut : " + colonne[j]);
			}
		}

	}

}