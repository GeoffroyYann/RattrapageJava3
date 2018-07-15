package model;

import java.util.ArrayList;
import java.util.Observable;
import java.sql.SQLException;
import dao.TronDAO;

/**<h1>The class Model</h1>
 * 
 * @author Yann
 *
 */
public class Model extends Observable implements IModel {
	/**The width*/
	private int width;
	/**The height*/
	private int height;
	/**The position on the map*/
	private IMotionLess[][] matrix;
	/**The lightCycles*/
	private ArrayList<ILightCycle> lightCycles;
	
	/**
	 * Instantiates a new Model object
	 * @param width
	 * 				the width
	 * @param height
	 * 				the height
	 */
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
	/**Gets the width*/
	public int getWidth() {
		return this.width;
	}
	/**Gets the height*/
	public int getHeight() {
		return this.height;
	}
	/**Gets the matrix (position)*/
	public IMotionLess getMatrixXY(final int x, final int y) {
		return this.matrix[x][y];
	}
	/**Sets the matrix (position)*/
	public void setMatrixXY(final IMotionLess motionLess, final int x, final int y) {
		this.matrix[x][y] = motionLess;
	}
	/**Sets the width*/
	public void setWidth(final int width) {
		this.width = width;
	}
	/**Sets the height*/
	public void setHeight(final int height) {
		this.height = height;
	}
	/**Gets the lightCycles*/
	public ArrayList<ILightCycle> getLightCycles() {
		return this.lightCycles;
	}
	/**Gets the lightCycle of 1 player*/
	public ILightCycle getLightCyclesPlayer(int player) {
		for(final ILightCycle lightCycle : this.lightCycles) {
			if(lightCycle.isPlayer(player)) {
				return lightCycle;
			}
		}
		
	return null;
	}
	/**
	 * Add a wall behind a LightCycle
	 */
	public void addWall(int player) {
		this.setMatrixXY(EnumElement.getEnumElementPlayer(player), this.getLightCyclesPlayer(player).getPosition().getX(), this.getLightCyclesPlayer(player).getPosition().getY());
		
	}
	/**Notify that a lightCycle is mooving*/
	public void setLightCyclesMoved() {
		this.setChanged();
		this.notifyObservers();
	}
	
	/**
	 * Add a new lightCycle
	 */
	public void addLightCycle(ILightCycle lightCycle) {
		this.lightCycles.add(lightCycle);
		lightCycle.setModel(this);
	}
	/**Sets and send the result on the BDD*/
	public void setResult(int player, long time) throws SQLException {
		TronDAO.setResult(player, time);
	}

}
