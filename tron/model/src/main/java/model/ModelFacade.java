package model;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }

    /**
     * Gets the LightCycle of a player
     */
    public ILightCycle getLightCyclesPlayer(final int player) {
        return null;
    }

    /**
     * Gets the width
     */
    public int getWidth() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * Gets the height
     */
    public int getHeight() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * Sets the width
     */
    public void setWidth(final int width) {
        // TODO Auto-generated method stub

    }

    /**
     * Sets the height
     */
    public void setHeight(final int height) {
        // TODO Auto-generated method stub

    }

    /**
     * Gets the matrix, the position of a point
     */
    public IMotionLess getMatrixXY(final int x, final int y) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Sets the matrix
     */
    public void setMatrixXY(final IMotionLess motionLess, final int x, final int y) {
        // TODO Auto-generated method stub

    }

    /**
     * An ArrayList which contains the LightCycles  */
    public ArrayList<ILightCycle> getLightCycles() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * A method that add a Wall object
     */
    public void addWall(final int player) {
    }

    /**
     * A method that add a LightCycle object
     */
    public void addLightCycle(final ILightCycle lightCycle) {

    }

	/**
	 * Sets the movement of a LightCycle
	 */
	public void setLightCyclesMoved() {
		
	}

	/**
	 * Sets the result of the game
	 */
	public void setResult(final int player, final long time) throws SQLException {
	}
}

