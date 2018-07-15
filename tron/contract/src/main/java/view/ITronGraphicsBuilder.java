package view;

import java.awt.image.ImageObserver;
import java.awt.Graphics;

public interface ITronGraphicsBuilder {
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer);
}
