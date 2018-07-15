package controller;

import view.IUserOrder;
import view.IView;
import model.IModel;
import model.ILightCycle;

public class Controller {

	public IView view;
	public IModel model;
	public static int TIME_SLEEP = 30;
	public boolean isGameOver = false;
	
	public Controller(final IModel model) {
		this.model = model;
	}
	
	public void run() {
		
	};
	
	public void gameLoop() {
		
	};
	
	public void setView(IView view) {
		
	};
	
	public void orderPerform(final IUserOrder userOrder) {
		
	}
	
	
	
}
