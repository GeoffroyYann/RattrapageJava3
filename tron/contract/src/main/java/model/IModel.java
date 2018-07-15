package model;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IModel {
	public int getWidth();
	public int getHeight();
	public void setWidth(int x);
	public void setHeight(int y);
	public IMotionLess getMatrixXY(int x, int y);
	public void setLightCyclesMoved();
	public void addWall(int player);
	public void addLightCycle(ILightCycle lightCycle);
	public void setResult(final int player, final long time) throws SQLException;public void setMatrixXY(IMotionLess motionLess, int x, int y);
	public ArrayList<ILightCycle> getLightCycles();
	public ILightCycle getLightCyclesPlayer(int player);
}
