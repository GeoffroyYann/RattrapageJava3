package model;

/** 
 * <h1> The Enumeration EnumElement</h1>
 * @author Yann
 *
 */
public enum EnumElement implements IMotionLess {

	WALL,
	WALL1,
	WALL2,
	GROUND;

	/**
	 * Method that checks if the square is a Wall
	 */
	public boolean isWall() {
		// TODO Auto-generated method stub
		return (this == WALL) || (this == WALL1) || (this == WALL2);
	}
	/**
	 * 
	 * @param player
	 * @return the right wall, permits to identify where the wall come from
	 */
	public static EnumElement getEnumElementPlayer(final int player) {
		if (player == 0) {
			return EnumElement.WALL1;
		} else if (player == 1) {
			return EnumElement.WALL2;
		} else {
			return EnumElement.WALL;
		}
	}
}
