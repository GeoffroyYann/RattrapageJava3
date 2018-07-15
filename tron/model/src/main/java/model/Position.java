package model;


public class Position implements IPosition {

	private int x;
	private int y;
	
	public Position (final int x, final int y) {
		this.x = x;
		this.y = y;
	}
	
	public Position(final Position position) {
		this(position.getX(), position.getY());
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
