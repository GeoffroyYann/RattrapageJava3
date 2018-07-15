package model;

import java.util.ArrayList;
import java.util.Observable;
import java.sql.SQLException;
import dao.TronDAO;

public class Model extends Observable implements IModel {
	private int width;
	private int height;
	private IMotionLess[][] matrix;
	private ArrayList<ILightCycle> lightCycles;
	
	public Model(final int width,final int height) {
		this.width = width;
		this.height = height;
		this.lightCycles = new ArrayList<ILightCycle>();
		this.matrix = new IMotionLess[width][height];
		for (int x = 0; x < this.width; x++) {
			for (int y = 0; y < this.height; y++) {
				if ((x == 0) || (x == (this.width - 1)) || (y == 0) || (y == (this.height - 1))) {
					this.setMatrixXY(EnumElement.WALL, x, y);
				}
				else {
					this.setMatrixXY(EnumElement.GROUND, x, y);
				}
			}
		}
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
	
	public ILightCycle getLightCyclesPlayer(int player) {
		for(final ILightCycle lightCycle : this.lightCycles) {
			if(lightCycle.isPlayer(player)) {
				return lightCycle;
			}
		}
		
	return null;
	}
	
	public void addWall(int player) {
		this.setMatrixXY(EnumElement.getEnumElementPlayer(player), this.getLightCyclesPlayer(player).getPosition().getX(), this.getLightCyclesPlayer(player).getPosition().getY());
		
	}
	
	public void setLightCyclesMoved() {
		this.setChanged();
		this.notifyObservers();
	}
	
	public void addLightCycle(ILightCycle lightCycle) {
		this.lightCycles.add(lightCycle);
		lightCycle.setModel(this);
	}
	
	public void setResult(int player, long time) throws SQLException {
		TronDAO.setResult(player, time);
	}

}
