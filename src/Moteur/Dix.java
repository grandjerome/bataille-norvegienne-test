package Moteur;

import Moteur.As.couleurCarte;

public class Dix extends Moteur.CarteSpeciale {

public enum couleurCarte{coeur,carreau,pique,trefle};
	
    private String couleur;
	private int valeur;
	public Dix(int valeurcarte, String couleurcarte){
		couleur=couleurcarte;
		valeur=valeurcarte;
		
	};
	
	public void poserCarteSpeciale() {

	}
	public void donnerTalon() {

	}
	public void poserCarte() {

	}
	public String getCouleur() {
		return couleur;
	}
	public int getValeur() {
		return valeur;
	}

}
