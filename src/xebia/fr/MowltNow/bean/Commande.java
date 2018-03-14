package xebia.fr.MowltNow.bean;

/**
 * Commande est la classe représentant la list des commandes de mouvement de notre tondeuse
 * 
 * @author chaabi
 *
 */
public enum Commande {
	Avance("A"),
	Droite("D"),
	Gauche("G");

	private String code;

	private Commande(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	/**
	 * Retourne la commande de la teneuse 
	 * @return commande.
	 */
	public static Commande getCommande(final String code) {
		for (Commande commande : Commande.values()) {
			if (commande.getCode().equals(code)) {
				return commande;
			}
		}
		return null;
	}
}
