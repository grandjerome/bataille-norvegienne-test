package Moteur;

import Moteur.As.couleurCarte;

public class Huit extends Moteur.CarteSpeciale {

public enum couleurCarte{coeur,carreau,pique,trefle};
	
	private couleurCarte couleur;
	private int valeur;
	public Huit(int valeurcarte, Moteur.Carte.couleurCarte couleurcarte){
		super(valeurcarte,couleurcarte);
		
	};
	
	public void poserCarteSpeciale() {

	}
	public void donnerTalon() {

	}
	public void passerTour() {

	}

}

