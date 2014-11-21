package Moteur;

import Moteur.As.couleurCarte;

public class Huit extends Moteur.CarteSpeciale {

public enum couleurCarte{coeur,carreau,pique,trefle};
	
    private String couleur;
	private int valeur;
	public Huit(int valeurcarte, String couleurcarte){
		couleur=couleurcarte;
		valeur=valeurcarte;
		
	};
	
	public void poserCarteSpeciale() {

	}
	public void donnerTalon() {

	}
	public void passerTour() {

	}
	public String getCouleur() {
		return couleur;
	}
	public int getValeur() {
		return valeur;
	}

}

