package com.bigcorp.crm.base.cours;

import java.util.Objects;

/**
 * Une classe de Maison. Elle est comparable, donc a un
 * ordre dit "naturel". Cet ordre permettra de trier des collections
 * de Maisons. Elle a redéfini equals et hashCode correctement.
 */
public class Maison implements Comparable<Maison> {

    private String numeroCadastre;

    private int nombreDePieces;

    private int surface;

    private int prixAchat;

    public String getNumeroCadastre() {
        return numeroCadastre;
    }

    public void setNumeroCadastre(String numeroCadastre) {
        this.numeroCadastre = numeroCadastre;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public int getNombreDePieces() {
        return nombreDePieces;
    }

    public void setNombreDePieces(int nombreDePieces) {
        this.nombreDePieces = nombreDePieces;
    }

    public int getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(int prixAchat) {
        this.prixAchat = prixAchat;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Maison maison)) return false;

        return this.numeroCadastre.equals(maison.numeroCadastre)
                && this.nombreDePieces == maison.nombreDePieces;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroCadastre, nombreDePieces);
    }

    public int compareTo(Maison autreMaison){
        if(this.nombreDePieces > autreMaison.nombreDePieces){
            return 1;
        }else if (this.nombreDePieces < autreMaison.nombreDePieces){
            return -1;
        }else{
            return this.surface - autreMaison.surface;
        }
    }

    @Override
    public String toString() {
        return "Maison{" +
                "nombreDePieces=" + nombreDePieces +
                ", surface=" + surface +
                ", prixAchat=" + prixAchat +
                '}';
    }
}
