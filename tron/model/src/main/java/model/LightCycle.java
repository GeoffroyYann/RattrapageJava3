package model;

import java.awt.Color;
import model.ILightCycle;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class LightCycle implements ILightCycle {

	private boolean alive;
	private Color color;
	private IPosition position;
	private IModel model;
	private int direction;
	private int player;
	
	public LightCycle(final int direction, final IPosition position, final Color color, final int player) {
		this.direction = direction;
		this.position = position;
		this.color = color;
		this.player = player;
		this.alive = true;
	}
	
	public boolean isAlive() {
		return this.alive;
	}
	
	public Color getColor() {
		return this.color;
	}
	
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
	
	public void die() {
		this.alive = false;
	}
	
	public void moveDown() {
		this.position.setY(this.position.getY() + 1);
		
	}
	
	public void moveUp() {
		this.position.setY(this.position.getY() - 1);
	}
	
	public void moveRight() {
		this.position.setX(this.position.getX() + 1);
	}
	
	public void moveLeft() {
		this.position.setX(this.position.getX() - 1);
	}
	
	public int getDirection() {
		return this.direction;
		
	}
	
	public int setDirection(final int direction) {
		return this.direction = direction;
	}
	
	public IPosition getPosition() {
		return this.position;
		
	}
	
	public void setPosition(IPosition position) {
		this.position = position;
	}
	
	public IModel getModel() {
		return this.model;
	}
	
	public void setModel(final IModel model) {
		this.model = model;
	}
	
	public boolean isPlayer(int player) {
		return this.player == player;
	}

	@Override
	public Color color() {
		return this.color;
	}
}
