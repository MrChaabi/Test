package xebia.fr.MowltNow.app;

import java.io.FileNotFoundException;
import java.util.List;

import xebia.fr.MowltNow.bean.Position;
import xebia.fr.MowltNow.utils.FichiersDeLecture;
import xebia.fr.MowltNow.utils.ListTondeuses;

/**
 * App la classe principal de l'appication 
 * 
 * @author chaabi
 *
 */
public class App {

	/**
	 * methode main de l'application
	 * @param args les arguments 
	 * @return la list des positions x y et l'orientation.
	 * @throws FileNotFoundException  Si jamais le fichier et introuvable 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		List<String> fichiersDeLecture = FichiersDeLecture.getFichiersDeLecture().lireLeFichier(args[0]);
		List<Position> positions = new ListTondeuses(fichiersDeLecture).getListPosition();
		for (int i = 0; i < positions.size(); i++) {
			System.out.println(" Resultat  : " + positions.get(i).getX() + "   " + positions.get(i).getY() + " "
					+ positions.get(i).getDirection().getCode());
		}
	}

}
