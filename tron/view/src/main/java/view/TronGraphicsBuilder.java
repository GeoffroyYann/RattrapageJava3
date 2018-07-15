package view;

import java.awt.*;
import java.awt.image.ImageObserver;

import model.ILightCycle;
import model.IModel;

public class TronGraphicsBuilder implements ITronGraphicsBuilder {

	private IModel model;
	
	public TronGraphicsBuilder(IModel model) {
		this.model = model;
	}
	
	public void drawAllLightCycles(Graphics graphics) {
		for (final ILightCycle lightCycle : this.model.getLightCycles()) {
			this.drawLightCycle(graphics, lightCycle);
		}
	}
	
	public void drawLightCycle(Graphics graphics, ILightCycle lightCycle) {
		graphics.setColor(lightCycle.getColor());
		graphics.fillRect(lightCycle.getPosition().getX() * EasyFrame.ZOOM, lightCycle.getPosition().getY() * EasyFrame.ZOOM, EasyFrame.ZOOM, EasyFrame.ZOOM);
	}
	
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer) {
		this.drawAllLightCycles(graphics);
		this.drawBorderWall(graphics);
	}
	
	public void drawBorderWall(Graphics graphics) {
		graphics.setColor(Color.BLACK);
		graphics.drawRect(0, 0, 399, 599);
	}
	
	

}
