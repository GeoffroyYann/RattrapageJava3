package controller;

import view.IUserOrder;
import view.IView;

public interface IController {
	public void orderPerform(final IUserOrder userOrder);
	public void checkCollision();
	public void run();
	public void gameLoop();
	public void setView(final IView view);
}
