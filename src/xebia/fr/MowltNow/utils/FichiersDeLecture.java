package xebia.fr.MowltNow.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Fichier de lecture est une classe permettant de lire le fichier d'entrée
 * @author chaabi
 *
 */
public class FichiersDeLecture {
	
	private static FichiersDeLecture fichiersDeLecture;
	
	public FichiersDeLecture() {
		super();
	}
	
	public static FichiersDeLecture getFichiersDeLecture() {
		if(fichiersDeLecture == null) {
			fichiersDeLecture = new FichiersDeLecture();
		}
		return fichiersDeLecture;
	}
	
	/**
	 * methode lecture du fichier d'entrée
	 * @param nom du fichier 
	 * @return la list des information fichiers.
	 * @throws FileNotFoundException Si jamais le fichier et introuvable 
	 */
	public List<String> lireLeFichier(String nomeDuFichier) throws FileNotFoundException {
		File fichier = new File(nomeDuFichier);
		List<String> listDesInfoFichier = new ArrayList<String>();		
		
        try {
        	Scanner scanner = new Scanner(fichier);
        	while (scanner.hasNextLine()) {
        		String premierLigne = scanner.nextLine();
        		listDesInfoFichier.add(premierLigne);
        	}
        	scanner.close();
        } catch (FileNotFoundException exception) {
        	throw exception;
        }				
		return listDesInfoFichier;
	}
}


