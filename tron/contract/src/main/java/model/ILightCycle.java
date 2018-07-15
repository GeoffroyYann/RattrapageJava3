package model;

import java.awt.Color;

public interface ILightCycle {

	public boolean isAlive();
	public Color color();
	public void move();
	public void die();
	public IPosition getPosition();
	public int getDirection();
	public int setDirection(int direction);
	public boolean isPlayer(int player);
	public void setModel(IModel model);
	public IModel getModel();
}
