package controller;


import view.IUserOrder;
import view.IView;
import model.IModel;


public class ControllerFacade implements IController {
	
	private final IView view;
	private final IModel model;
	
	public ControllerFacade(IView view, IModel model) {
		super();
		this.view = view;
		this.model = model;
	}
	
	public IView getView() {
		return this.view;
	}
	
	public IModel getModel() {
		return this.model;
	}
	
	public void orderPerform(IUserOrder userOrder) {
		
	}
	
	public void run() {
		
	}
	
	public void gameLoop() {
		
	}
	
	public void setView(IView view) {
		
	}
	
	public void checkCollision() {
		
	}

}
