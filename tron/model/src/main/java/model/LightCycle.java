package model;

import java.awt.Color;
import model.ILightCycle;
import java.util.ArrayList;

public class LightCycle {

	private boolean alive;
	private Color color;
	private IPosition position;
	private IModel model;
	private int direction;
	private int player;
	
	public LightCycle(int direction, IPosition position, Color color, int player) {
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
		
	}
	
	public void die() {
		
	}
	
	public void moveDown() {
		
	}
	
	public void moveUp() {
		
	}
	
	public void moveRight() {
		
	}
	
	public void moveLeft() {
		
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
}
