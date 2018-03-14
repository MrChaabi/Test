package xebia.fr.MowltNow.bean;

import java.util.List;

/**
 * Tondeuse est la classe représentant la tondeuse
 * @author chaabi
 *
 */
public class Tondeuse {

	private List<Commande> listDesCommandes;
	private Position position;
	private Surface surface;

	public Tondeuse(Surface surface, Position position, List<Commande> listDesCommand) {
		this.listDesCommandes = listDesCommand;
		this.position = position;
		this.surface = surface;
	}


	/**
     * Retourne lopsition de la tondeuse.
     * @return position.
     */
	public Position getPositionTondeuse() {
		for(Commande commande : listDesCommandes) {
			switch(commande) {
			case Avance :
				position.ContinuerToutDroit(surface);
				break;
			case Droite :
				position.tournerDroite();
				break;
			case Gauche :
				position.tournerGauche();
				break;	
			}
		}
		return position;
	}

}
