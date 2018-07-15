package controller;


import view.IUserOrder;
import view.IView;
import model.IModel;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Yann
 * @version 1.0
 */


public class ControllerFacade implements IController {
	
	/** The view */
	private final IView view;
	/** The model */
	private final IModel model;
	
	/**
	 * Instantiates a new ControllerFacade
	 * @param view
	 * @param model
	 */
	public ControllerFacade(IView view, IModel model) {
		super();
		this.view = view;
		this.model = model;
	}
	
	/**
	 * Gets the View
	 * @return view
	 */
	public IView getView() {
		return this.view;
	}
	
	/**
	 * Gets the Model
	 * @return model
	 */
	
	public IModel getModel() {
		return this.model;
	}
	
	/**
	 * 
	 */
	public void orderPerform(IUserOrder userOrder) {
		
	}
	
	/**
	 * Run the game
	 */
	public void run() {
		
	}
	
	/**
	 * The gameLoop
	 */
	public void gameLoop() {
		
	}
	
	/**
	 * Sets the view
	 */
	public void setView(IView view) {
		
	}
	
	/** 
	 * Checks the collisions
	 */
	public void checkCollision() {
		
	}

}
