package controller;

import java.sql.SQLException;

import view.IUserOrder;
import view.IView;

/** 
 * <h1> The interface IController</h1>
 * @author Yann
 *
 */
public interface IController {
	public void orderPerform(final IUserOrder userOrder);
	public void run() throws SQLException;
	public void gameLoop();
	public void setView(final IView view);
	public void checkCollision();
}
