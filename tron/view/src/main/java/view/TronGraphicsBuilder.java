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
		
	}
	
	public void drawBorderWall(Graphics graphics) {
		
	}
	
	public void drawLightCycle(Graphics graphics, ILightCycle lightCycle) {
		
	}
	
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer) {
		
	}
}
