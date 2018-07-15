package model;

import java.awt.Color;
import model.ILightCycle;

/**
 * <h1>The class LightCycle</h1>
 * @author Yann
 *
 */

public class LightCycle implements ILightCycle {

	/**boolean to know when the lightCycle dies*/
	private boolean alive;
	/**The color*/
	private Color color;
	/**The position*/
	private IPosition position;
	/**The Model*/
	private IModel model;
	/**The direction*/
	private int direction;
	/**The player*/
	private int player;
	
	/**
	 * Instantiates a new lightCycle
	 * @param direction
	 * 				the direction
	 * @param position
	 * 				the position
	 * @param color
	 * 				the color
	 * @param player
	 * 				the player
	 */
	public LightCycle(final int direction, final IPosition position, final Color color, final int player) {
		this.direction = direction;
		this.position = position;
		this.color = color;
		this.player = player;
		this.alive = true;
	}
	
	/**Method to know if the lightCycle is alive*/
	public boolean isAlive() {
		return this.alive;
	}
	/**Gets the color*/
	public Color getColor() {
		return this.color;
	}
	
	/**
	 * The direction of the lightCycle
	 */
	public void move() {
		switch (this.direction) {
		case 0:
			this.moveUp();
			break;
		case 1:
			this.moveRight();
			break;
		case 2:
			this.moveDown();
			break;
		case 3:
			this.moveLeft();
			break;
		default:
			break;
		}
	}
	/**method which notify when the lightCycle dies*/
	public void die() {
		this.alive = false;
	}
	/**
	 * Move to the Down
	 */
	public void moveDown() {
		this.position.setY(this.position.getY() + 1);
		
	}
	/** Move to the Up*/
	public void moveUp() {
		this.position.setY(this.position.getY() - 1);
	}
	/**Move to the Right*/
	public void moveRight() {
		this.position.setX(this.position.getX() + 1);
	}
	/**Move to the Left*/
	public void moveLeft() {
		this.position.setX(this.position.getX() - 1);
	}
	/**Gets the direction*/
	public int getDirection() {
		return this.direction;
		
	}
	/**Sets the direction*/
	public int setDirection(final int direction) {
		return this.direction = direction;
	}
	/**Gets the position*/
	public IPosition getPosition() {
		return this.position;
		
	}
	/**
	 * Sets the position
	 * @param position
	 * 				the new position
	 */
	public void setPosition(IPosition position) {
		this.position = position;
	}
	/**Gets the model*/
	public IModel getModel() {
		return this.model;
	}
	/**Sets the model*/
	public void setModel(final IModel model) {
		this.model = model;
	}
	/**Checks if it is a player*/
	public boolean isPlayer(int player) {
		return this.player == player;
	}

	/**Sets the color*/
	public Color color() {
		return this.color;
	}
}
