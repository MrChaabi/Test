package xebia.fr.MowltNow.bean;

/**
 * Position est la classe représentant la position de la tondeuse
 * 
 * @author chaabi
 *
 */
public class Position {

	private int x,y;
	private Orientation direction;

	public Position(int x, int y, Orientation direction) {
		super();
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	/**
     * Retourne la coordonée x.
     * @return x.
     */
	public int getX() {
		return x;
	}

	/**
     * Retourne la coordonée y.
     * @return y.
     */
	public int getY() {
		return y;
	}

	/**
     * Retourne l'objet direction l'orientation de la tondeuse.
     * @return orientation.
     */
	public Orientation getDirection() {
		return direction;
	}


	public void tournerGauche() {
		direction = direction.getOrientationGauche();
	}


	public void tournerDroite() {
		direction = direction.getOrientationDroite();
	}

	
	/**
     * gestion des coordonées de la tondeuse
     */
	public void ContinuerToutDroit(final Surface surface) {
		switch(direction) {
		case Nord :
			if (y < surface.getY()) { y += 1; }
			break;
		case Sud :
			if (y > 0) { y -= 1; }
			break;
		case Est :
			if (x < surface.getX()) { x += 1; }
			break;
		case Ouest :
			if (x > 0) { x -= 1; }
			break;
	}

	}
}
