package model;

/**
 * <h1>The class Position</h1>
 * @author Lisa
 *
 */
public class Position implements IPosition {

	/**the x*/
	private int x;
	/**the y*/
	private int y;
	/**
	 * Instantiates a position
	 * @param x
	 * 				the x
	 * @param y
	 * 				the y
	 */
	public Position (final int x, final int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * Instantiates the final position
	 * @param position
	 * 				the position
	 */
	public Position(final Position position) {
		this(position.getX(), position.getY());
	}
	/**
	 * Gets the x
	 */
	public int getX() {
		return this.x;
	}
	/**
	 * Sets the x
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**Gets the y*/
	public int getY() {
		return this.y;
	}
	/**Sets the y*/
	public void setY(int y) {
		this.y = y;
	}
}
