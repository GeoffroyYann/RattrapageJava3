package view;

import javax.swing.JOptionPane;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView {

    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        super();
    }

    /**
     * The method used to display a message
     */
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

	/**
	 * The method which close the game
	 */
	public void end() {
		// TODO Auto-generated method stub
		
	}

}
