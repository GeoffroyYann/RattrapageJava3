package model;

import java.util.ArrayList;
import java.sql.SQLException;
import dao.TronDAO;

public class Model {
	private int width;
	private int height;
	private IMotionLess[][] matrix;
	private ArrayList<ILightCycle> lightCycles;
	
	public Model(int width, int height) {
		this.width = width;
		this.height = height;
		this.lightCycles = new ArrayList<ILightCycle>();
		this.matrix = new IMotionLess[width][height];
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public IMotionLess getMatrixXY(final int x, final int y) {
		return this.matrix[x][y];
	}
	
	public void setMatrixXY(final IMotionLess motionLess, final int x, final int y) {
		this.matrix[x][y] = motionLess;
	}
	
	public void setWidth(final int width) {
		this.width = width;
	}
	
	public void setHeight(final int height) {
		this.height = height;
	}
	
	public ArrayList<ILightCycle> getLightCycles() {
		return this.lightCycles;
	}
	
	public ILightCycle getLightCyclePlayer(int player) {
		return null;
	}
	
	public void addWall(int player) {
		
	}
	
	public void setLightCyclesMoved() {
		
	}
	
	public void addLightCycle(ILightCycle lightCycle) {
		
	}
	
	public void setResult(int player, long time) throws SQLException {
		TronDAO.setResult(player, time);
	}

}
