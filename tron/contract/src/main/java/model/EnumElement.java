package model;


public enum EnumElement implements IMotionLess {

	WALL,
	WALL1,
	WALL2,
	GROUND;

	@Override
	public boolean isWall() {
		// TODO Auto-generated method stub
		return (this == WALL) || (this == WALL1) || (this == WALL2);
	}
	
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
