package view;

import java.awt.image.ImageObserver;
import java.awt.Graphics;

/** 
 * <h1> The interface ITronGraphicsBuilder</h1>
 * @author Yann
 *
 */

public interface ITronGraphicsBuilder {
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer);
}
