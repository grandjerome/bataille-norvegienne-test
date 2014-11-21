package Moteur;

import Moteur.Carte.couleurCarte;



public class As extends Moteur.CarteSpeciale {


public enum couleurCarte{coeur,carreau,pique,trefle};
	
    private String couleur;
	private int valeur;
	public As(int valeurcarte, String couleurcarte){
		valeur=valeurcarte;
		couleur=couleurcarte;
		
	};
	
	public void poserCarteSpeciale() {

	}
	public void donnerTalon() {

	}
	public String getCouleur() {
		return couleur;
	}
	public int getValeur() {
		return valeur;
	}
}
