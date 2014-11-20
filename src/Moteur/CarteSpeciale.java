package Moteur;

public class CarteSpeciale extends Moteur.Carte {
	
public enum couleurCarte{coeur,carreau,pique,trefle};
	
	private couleurCarte couleur;
	private int valeur;
	public CarteSpeciale(int valeurcarte, Moteur.Carte.couleurCarte couleurcarte){
		super(valeurcarte,couleurcarte);
		
	};
	
	public void poserCarteSpeciale() {

	}
	
	

}
