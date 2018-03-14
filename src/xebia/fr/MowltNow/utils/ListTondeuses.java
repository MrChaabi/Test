package xebia.fr.MowltNow.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import xebia.fr.MowltNow.bean.Commande;
import xebia.fr.MowltNow.bean.Orientation;
import xebia.fr.MowltNow.bean.Position;
import xebia.fr.MowltNow.bean.Surface;
import xebia.fr.MowltNow.bean.Tondeuse;

/**
 * ListTondeuses est la classe représentant le controleur des tondeuses
 * @author chaabi
 *
 */
public class ListTondeuses {

	private final List<Tondeuse> listTondeuses = new ArrayList<Tondeuse>();
	
	/**
	 * @param fichier d'entrée 
	 */
	public ListTondeuses (List<String> fichier) {
				
		Iterator<String> iterator = fichier.iterator();
		String surface = iterator.next();
		String[] surfaceSplit = surface.split(" ");
		Surface positionSurface = new Surface(Integer.valueOf(surfaceSplit[0]), Integer.valueOf(surfaceSplit[1]));	
				
		while (iterator.hasNext()) {
			List<Commande> listOfCommandes = new ArrayList<Commande>();
			String positionTondeuses = iterator.next();
			String[] tondeusessplit = positionTondeuses.split(" ");
			Orientation direction = Orientation.getOrientation(tondeusessplit[2]);
			Position position = new Position(Integer.valueOf(tondeusessplit[0]),Integer.valueOf(tondeusessplit[1]), direction);						
			
			String commandeTondeuse = iterator.next();			
			char [] listeCodeCommandes= commandeTondeuse.toCharArray();			
			for (char codeCommande : listeCodeCommandes) {
				listOfCommandes.add(Commande.getCommande(String.valueOf(codeCommande)));
			}
			Tondeuse tondeuse = new Tondeuse(positionSurface,position, listOfCommandes);
			listTondeuses.add(tondeuse);	
		}			
	}

	/**
     * Met à jour le niveau du membre.
     * @param level Le nouveau level du membre.
     * @return la list des positions de la tondeuse
     */
	public List<Position> getListPosition() {
		List<Position> position = new ArrayList<Position>(listTondeuses.size());
		for(Tondeuse tondeuse : listTondeuses) {
			position.add(tondeuse.getPositionTondeuse());
		}
		return position;
	}
}
