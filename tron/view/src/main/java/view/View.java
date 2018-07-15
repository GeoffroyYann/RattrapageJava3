package view;

import controller.IOrderPerformer;
import model.IModel;

import java.util.Observable;

import javax.swing.*;


public class View implements IView, Runnable {

	private TronGraphicsBuilder tronGraphicsBuilder;
	private EventPerformer eventPerformer;
	private Observable observable;
	private EasyFrame easyFrame;
	private IModel model;
	
	public View(IOrderPerformer orderPerformer, IModel model, Observable observable) {
		this.observable = observable;
		this.tronGraphicsBuilder = new TronGraphicsBuilder(model);
		this.eventPerformer = new EventPerformer(orderPerformer);
		this.model = model;
		SwingUtilities.invokeLater(this);
		
	}
	
	public void run() {
		this.easyFrame = new EasyFrame("Tron", this.eventPerformer, this.tronGraphicsBuilder, this.model, this.observable);
		
	}
	
	public void end() {
		this.easyFrame.dispose();
	}
	
	public void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	public IModel getModel() {
		return this.model;
	}
	
	public void setModel(IModel model) {
		this.model = model;
	}
	
}
