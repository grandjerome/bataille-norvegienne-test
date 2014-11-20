package Moteur;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class Joueur {

	/*
	 * (non-javadoc)
	 */
	
	private int nbCartes;


	private String nomJoueur;
	
	
	private ArrayList<Carte> main;
	private ArrayList<Carte> faceCachee;
	private ArrayList<Carte> faceVisible;

	public Joueur(){
		
	}
	public Joueur(String nom){
		this.nomJoueur=nom;
			
	}
	
	public void echangerCarte() {

	}
	public void creerList(){
		main = new ArrayList<Carte>();
		faceCachee = new ArrayList<Carte>();
		faceVisible = new ArrayList<Carte>();
	}
	public void piocher(int nbCarte){
		main.add((Carte) Carte.getpioche().remove());
	}
	public ArrayList<Carte> getfaceCachee(){
		return(main);
	}
	public ArrayList<Carte> getmain(){
		return(faceCachee);
	}
	public ArrayList<Carte> getfaceVisible(){
		return(faceVisible);
	}
	public void poserCarte() {

	}

	

	public int getNbCartes() {
		return nbCartes;
	}

	
	public void setNbCartes(int nbCartes) {
		this.nbCartes = nbCartes;
	}

	

	


	

}

// /**
// * Ensures that this collection contains the specified element (optional
// * operation).
// *
// * @param element
// * whose presence in this collection is to be ensured.
// * @see java.util.Collection#add(Object)
// *
// */
// public boolean addCarte(Carte carte) {
// return this.carte.add(carte);
// }
// /**
// * Setter of the property <tt>carte</tt>
// *
// * @param carte
// * the carte to set.
// *
// */
// public void setCarte(Collection<Carte> carte) {
// this.carte = carte;
// }
// /**
// * Removes a single instance of the specified element from this
// * collection, if it is present (optional operation).
// *
// * @param element
// * to be removed from this collection, if present.
// * @see java.util.Collection#add(Object)
// *
// */
// public boolean removeCarte(Carte carte) {
// return this.carte.remove(carte);
// }
// /**
// * Getter of the property <tt>carte</tt>
// *
// * @return Returns the carte.
// *
// */
//
// public Collection<Carte> getCarte() {
// return carte;
// }
// /**
// * Returns the number of elements in this collection.
// *
// * @return the number of elements in this collection
// * @see java.util.Collection#size()
// *
// */
// public int carteSize() {
// return carte.size();
// }
// /**
// * Setter of the property <tt>partie</tt>
// *
// * @param partie
// * The partie to set.
// *
// */
// public void setPartie(Partie partie) {
// this.partie = partie;
// }
// /**
// * Getter of the property <tt>partie</tt>
// *
// * @return Returns the partie.
// *
// */
//
// public Partie getPartie() {
// return partie;
// }

