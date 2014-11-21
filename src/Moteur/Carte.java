package Moteur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Carte {

	private static ConcurrentLinkedQueue<Carte> pioche;
	private List<Carte> talon;
	
	/*
	 * (non-javadoc)
	 */

	private int valeur;

	/*
	 * (non-javadoc)
	 */
	private String couleur;

	/*
	 * (non-javadoc)
	 */
	
	

	/*
	 * (non-javadoc)
	 */
	private boolean carteJouable;
	public static enum couleurCarte{coeur,carreau,pique,trefle};
	
	static public void distribuerCarte(int nombreJoueurVirtuel){
		int nombrePaquet=0;
		int i;
		
		nombrePaquet=nombreJoueurVirtuel/4;
		
		if ((nombreJoueurVirtuel%4) != 0) {
			nombrePaquet++;
		}
		System.out.println("nombre paquets : " + nombrePaquet);
		Carte.creerPioche(nombrePaquet);
		ListIterator<Joueur> it = Partie.partie.getlistJoueur().listIterator();
		
		while (it.hasNext()){
			Joueur element = it.next();
			element.creerList();
			System.out.println("joueur "+element+"à comme cartes :");
			//System.out.println(element + " ");
			for(i=0;i<3;i++){
				
				
				element.getmain().add(pioche.remove());
				//System.out.println(element.main.get(i).valeur + " " + element.main.get(i).couleur);
				
				element.getfaceCachee().add(pioche.remove());
				//System.out.println(element.faceCachee.get(i).valeur + " " + element.faceCachee.get(i).couleur);
				
				element.getfaceVisible().add(pioche.remove());
				//System.out.println(element.faceVisible.get(i).valeur + " " + element.faceVisible.get(i).couleur);
				
			}
		}
		
		
		
	}
	
	
	@SuppressWarnings("null")
	static public void creerPioche(int nombrePaquet){
		
		int[] valeurCarte = new int[8];
		int[] valeurCarteSpeciale = new int[5];
		int i,j,k;
		String[] couleurCarte = new String[4];
		
		couleurCarte[0]="coeur";
		couleurCarte[1]="carreau";
		couleurCarte[2]="trefle";
		couleurCarte[3]="pique";
		valeurCarte[0]=3;
		valeurCarte[1]=4;
		valeurCarte[2]=5;
		valeurCarte[3]=6;
		valeurCarte[4]=9;
		valeurCarte[5]=11;
		valeurCarte[6]=12;
		valeurCarte[7]=13;
		valeurCarteSpeciale[0]=1;
		valeurCarteSpeciale[1]=2;
		valeurCarteSpeciale[2]=7;
		valeurCarteSpeciale[3]=8;
		valeurCarteSpeciale[4]=10;
		System.out.println("pas probleme 1");
		ArrayList<Carte> piocheDeMelange = new ArrayList<Carte>();
		for (i=0;i<nombrePaquet;i++){
			for (j=0;j<13;j++){
				for (k=0;k<4;k++){
					switch (j){
					case 0:
					As m = new As((j+1),couleurCarte[k]);
					piocheDeMelange.add(m);
						break;
					case 1:
					Deux m2 = new Deux((j+1),couleurCarte[k]);
					piocheDeMelange.add(m2);
						break;
					case 6:
					Sept m3 = new Sept((j+1),couleurCarte[k]);
					piocheDeMelange.add(m3);
						break;
					case 7:
					Huit m4 = new Huit((j+1),couleurCarte[k]);
					piocheDeMelange.add(m4);
						break;
					case 9:
					Dix m5 = new Dix((j+1),couleurCarte[k]);
					piocheDeMelange.add(m5);
						break;
					
					default :
					
					 	Carte m6 = new Carte((j+1),couleurCarte[k]);
						piocheDeMelange.add(m6);
						System.out.println("pas probleme "+(j+1)+" "+i+" "+couleurCarte[k]);
					}
					}
				}
			}
		
		Collections.shuffle(piocheDeMelange);
		
		pioche = new ConcurrentLinkedQueue<Carte>();
		System.out.println("boucle list :");
		ListIterator<Carte> it = piocheDeMelange.listIterator();
		while (it.hasNext()){
			Carte element = it.next();
			System.out.println(element.couleur + " " + element.valeur);
			pioche.add(element);
		}
		//System.out.println("boucle queue :");
	//for(i=0;i<(nombrePaquet*52);i++){
	//	Carte elementtest = pioche.remove();
		//System.out.println(elementtest.couleur+" "+elementtest.valeur);
	//}
		}
		
	
	public Carte(int valeur,String couleurcarte){
		this.couleur=couleurcarte;
		this.valeur=valeur;
		System.out.println("je suis le "+this.valeur+" "+"de"+" "+this.couleur);
		
	}
	public Carte(){
		
	}
	public void determinerCarteJouable() {

	}

	/**
	 * Getter of the property <tt>valeur</tt>
	 * 
	 * @return Returns the valeur.
	 * 
	 */

	public int getValeur() {
		return valeur;
	}

	/**
	 * Setter of the property <tt>valeur</tt>
	 * 
	 * @param valeur
	 *            The valeur to set.
	 * 
	 */
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	/**
	 * Getter of the property <tt>couleur</tt>
	 * 
	 * @return Returns the couleur.
	 * 
	 */

	public String getCouleur() {
		return couleur;
	}

	/**
	 * Setter of the property <tt>couleur</tt>
	 * 
	 * @param couleur
	 *            The couleur to set.
	 * 
	 */
	

	/**
	 * Getter of the property <tt>carteJouable</tt>
	 * 
	 * @return Returns the carteJouable.
	 * 
	 */

	public boolean getCarteJouable() {
		return carteJouable;
	}

	/**
	 * Setter of the property <tt>carteJouable</tt>
	 * 
	 * @param carteJouable
	 *            The carteJouable to set.
	 * 
	 */
	public void setCarteJouable(boolean carteJouable) {
		this.carteJouable = carteJouable;
	}
	static public ConcurrentLinkedQueue<Carte> getpioche(){
		return(pioche);
	}

}

// /**
// * Getter of the property <tt>tasDeCartes</tt>
// *
// * @return Returns the tasDeCartes.
// *
// */
//
// public TasDeCartes getTasDeCartes() {
// return tasDeCartes;
// }
// /**
// * Setter of the property <tt>tasDeCartes</tt>
// *
// * @param tasDeCartes
// * The tasDeCartes to set.
// *
// */
// public void setTasDeCartes(TasDeCartes tasDeCartes) {
// this.tasDeCartes = tasDeCartes;
// }
// /**
// * Setter of the property <tt>joueur</tt>
// *
// * @param joueur
// * The joueur to set.
// *
// */
// public void setJoueur(Joueur joueur) {
// this.joueur = joueur;
// }
// /**
// * Getter of the property <tt>joueur</tt>
// *
// * @return Returns the joueur.
// *
// */
//
// public Joueur getJoueur() {
// return joueur;
// }

