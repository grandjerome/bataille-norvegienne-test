package Moteur;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class JoueurVirtuel extends Joueur{

	/*
	 * (non-javadoc)
	 */
	private int nbCartes;

	/**
*
*/

	
	
	private ArrayList<Carte> main;
	private ArrayList<Carte> faceCachee;
private ArrayList<Carte> faceVisible;
	
	public ArrayList<Carte> getfaceCachee(){
		return(main);
	}
	public ArrayList<Carte> getmain(){
		return(faceCachee);
	}
	public ArrayList<Carte> getfaceVisible(){
		return(faceVisible);
	}
	public JoueurVirtuel(){
		super();
		
	}
	public void echangerCarte() {

	}
	public void creerList(){
		super.creerList();
	}
	public void poserCarte() {

	}

	/**
	 * Getter of the property <tt>nbCartes</tt>
	 * 
	 * @return Returns the nbCartes.
	 * 
	 */

	public int getNbCartes() {
		return nbCartes;
	}

	/**
	 * Setter of the property <tt>nbCartes</tt>
	 * 
	 * @param nbCartes
	 *            The nbCartes to set.
	 * 
	 */
	public void setNbCartes(int nbCartes) {
		this.nbCartes = nbCartes;
	}

	/**
	 * Getter of the property <tt>main</tt>
	 * 
	 * @return Returns the main.
	 * 
	 */

	
	/**
	 * Setter of the property <tt>main</tt>
	 * 
	 * @param main
	 *            The main to set.
	 * 
	 */
	

	

}

