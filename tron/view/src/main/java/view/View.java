package view;

import controller.IOrderPerformer;
import model.IModel;

import java.util.Observable;

import javax.swing.*;

/**
 * <h1>The class View</h1>
 * @author Lisa
 *
 */

public class View implements IView, Runnable {

	private TronGraphicsBuilder tronGraphicsBuilder;
	private EventPerformer eventPerformer;
	private Observable observable;
	private EasyFrame easyFrame;
	private IModel model;

	/**
	 * The View Constructor
	 * @param orderPerformer
	 * 				the order performed
	 * @param model
	 * 				the model
	 * @param observable
	 * 				the observable object
	 */
	public View(IOrderPerformer orderPerformer, IModel model, Observable observable) {
		this.observable = observable;
		this.tronGraphicsBuilder = new TronGraphicsBuilder(model);
		this.eventPerformer = new EventPerformer(orderPerformer);
		this.model = model;
		SwingUtilities.invokeLater(this);
		
	}
	/**
	 * Instantiates a new frame
	 */
	public void run() {
		this.easyFrame = new EasyFrame("Tron", this.eventPerformer, this.tronGraphicsBuilder, this.model, this.observable);
		
	}
	
	/**
	 * End and close the game
	 */
	public void end() {
		this.easyFrame.dispose();
	}
	
	/**
	 * Display a message
	 */
	public void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * Gets the model
	 * @return
	 * 			the model
	 */			
	public IModel getModel() {
		return this.model;
	}
	
	/**
	 * Sets the model
	 * @param model
	 * 			the new model
	 */				
	public void setModel(IModel model) {
		this.model = model;
	}
	
}
