package xebia.fr.MowltNow.bean;

/**
 * Orientation est la classe représentant la direction de la tondeuse
 * 
 * @author chaabi
 *
 */

public enum Orientation {	
	Nord("N", "O", "E"),
	Sud("S", "E", "O"),
	Ouest("O", "S", "N"),
	Est("E", "N", "S");

	private String code;
	private String gauche;
	private String droite;

	private Orientation(String code, String gauche, String droite) {
		this.code = code;
		this.gauche = gauche;
		this.droite = droite;
	}

	/**
	 * Retourne le code del'orientation
	 * @return code.
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Retourne l'orientation de la tondeuse.
	 * @return  appel de la methode getOrientation()
	 */
	public Orientation getOrientationGauche(){
		return getOrientation(gauche);
	}

	/**
	 * Retourne  l'orientation de la tondeuse.
	 * @return appel de la methode getOrientation()
	 */
	public Orientation getOrientationDroite() {
		return getOrientation(droite);
	}

	/**
	 * Retourne le code del'orientation
	 * @return l'orientation de la tondeuse
	 */
	public static Orientation getOrientation(final String orientation) {
		for (Orientation direction : Orientation.values()) {
			if(direction.getCode().equals(orientation)) {
				return direction;
			}
		}
		return null;
	}




}
