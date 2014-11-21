package Moteur;

import Moteur.CarteSpeciale.couleurCarte;

public class As extends Moteur.CarteSpeciale {


public enum couleurCarte{coeur,carreau,pique,trefle};
	
	private couleurCarte couleur;
	private int valeur;
	public As(int valeurcarte, Moteur.Carte.couleurCarte couleurcarte){
		super(valeurcarte,couleurcarte);
		
	};
	
	public void poserCarteSpeciale() {

	}
	public void donnerTalon() {

	}
}
