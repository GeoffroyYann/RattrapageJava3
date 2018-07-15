package controller;

import java.sql.SQLException;

import view.IUserOrder;
import view.IView;

public interface IController {
	public void orderPerform(final IUserOrder userOrder);
	public void run() throws SQLException;
	public void gameLoop();
	public void setView(final IView view);
	public void checkCollision();
}
