package view;

import java.awt.*;
import java.awt.image.ImageObserver;

import model.ILightCycle;
import model.IModel;

/**
 * <h1>The TronGraphicsBuilder Classe</h1>
 * @author Yann
 *
 */
public class TronGraphicsBuilder implements ITronGraphicsBuilder {

	/**The model*/
	private IModel model;
	/**
	 * The tronGraphicsBuilder
	 * @param model
	 * 				the new model
	 */				
	public TronGraphicsBuilder(IModel model) {
		this.model = model;
	}
	
	/**
	 * Draw the LightCycles
	 * @param graphics
	 * 				The graphics
	 */				
	public void drawAllLightCycles(Graphics graphics) {
		for (final ILightCycle lightCycle : this.model.getLightCycles()) {
			this.drawLightCycle(graphics, lightCycle);
		}
	}
	
	/**
	 * Draw a LightCycle
	 * @param graphics
	 * 				The graphics
	 * @param lightCycle
	 *				the lightCycle
	 */
	public void drawLightCycle(Graphics graphics, ILightCycle lightCycle) {
		graphics.setColor(lightCycle.getColor());
		graphics.fillRect(lightCycle.getPosition().getX() * EasyFrame.ZOOM, lightCycle.getPosition().getY() * EasyFrame.ZOOM, EasyFrame.ZOOM, EasyFrame.ZOOM);
	}
	
	/**
	 * Translate the code of the Model into something graphic
	 */
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer) {
		this.drawAllLightCycles(graphics);
		this.drawBorderWall(graphics);
	}
	
	/**
	 * Draw the border walls
	 * @param graphics
	 *			the graphics
	 */
	public void drawBorderWall(Graphics graphics) {
		graphics.setColor(Color.BLACK);
		graphics.drawRect(0, 0, 399, 599);
	}
	
	

}
