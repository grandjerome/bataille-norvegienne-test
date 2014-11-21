package Moteur;

import Moteur.As.couleurCarte;

public class Sept extends Moteur.CarteSpeciale {

public enum couleurCarte{coeur,carreau,pique,trefle};
	
	private couleurCarte couleur;
	private int valeur;
	public Sept(int valeurcarte, Moteur.Carte.couleurCarte couleurcarte){
		super(valeurcarte,couleurcarte);
		
	};
	
	public void poserCarteSpeciale() {

	}
	public void donnerTalon() {

	}
	public void jouerCarteInferieure() {

	}

}
