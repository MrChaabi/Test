package xebia.fr.MowltNow.bean;

/**
 * Surface est la classe représentant la supperficie de la piste
 * @author chaabi
 *
 */
public class Surface {
	
	private final int x;
	private final int y;
	
	public Surface(int x, int y) {
		super();
		this.x = x;
		this.y = y;
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

}
