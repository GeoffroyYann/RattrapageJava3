package view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

/**<h1>The class EasyPanel</h1>
 * 
 * @author Yann
 *
 */
public class EasyPanel extends JPanel implements Observer {
    private static final long          serialVersionUID = 3987064896591403626L;
    private final ITronGraphicsBuilder graphicsBuilder;
    /**
     * Sets the graphicsBuilder
     * @param graphicsBuilder
     *				the graphicsBuilder
     */			
    public EasyPanel(final ITronGraphicsBuilder graphicsBuilder) {
        this.graphicsBuilder = graphicsBuilder;
    }

    /**
     * Update the View with the new informations
     */
    public void update(final Observable arg0, final Object arg1) {
        this.repaint();
    }

    /**
     * Colors any object / component
     */
    protected void paintComponent(final Graphics graphics) {
        this.graphicsBuilder.applyModelToGraphics(graphics, this);
    }

}
