package controller;

import view.IUserOrder;
import view.IView;
import model.IModel;

import java.sql.SQLException;

import model.ILightCycle;
/**
 * <h1>The class Controller</h1>
 * @author Lisa
 *
 */
public class Controller implements IOrderPerformer, IController {

	/**The view*/
	public IView view;
	/**The model*/
	public IModel model;
	/**The speed of the lightCycle*/
	public static int TIME_SLEEP = 30;
	/**Ends the game*/
	public boolean isGameOver = false;
	/**
	 * Instantiates a new controller object
	 * @param model
	 * 				the new model
	 */				
	public Controller(final IModel model) {
		this.model = model;
	}
	
	/**
	 * Run the game, and close it when done
	 */
	public void run() throws SQLException {
		final long begin = System.currentTimeMillis();
		this.gameLoop();
		if(!this.model.getLightCyclesPlayer(0).isAlive() && !this.model.getLightCyclesPlayer(1).isAlive()) {
			this.view.displayMessage("Boom !");
			this.model.setResult(0, (System.currentTimeMillis() - begin) / 1000);
		} else if (!this.model.getLightCyclesPlayer(0).isAlive()) {
			this.view.displayMessage("Player 1 wins");
			this.model.setResult(1, (System.currentTimeMillis() - begin) / 1000);
		} else if (!this.model.getLightCyclesPlayer(1).isAlive()) {
			this.view.displayMessage("Player 2 wins");
			this.model.setResult(1, (System.currentTimeMillis() - begin) / 1000);
	}
		this.view.end();
	}
	/**
	 * The gameLoop
	 */
	public void gameLoop() {
		while (!this.isGameOver) {
			try {
				Thread.sleep(Controller.TIME_SLEEP);
			}
			catch(final InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			this.checkCollision();
			this.model.addWall(0);
			this.model.addWall(1);
			for (final ILightCycle lightCycle : this.model.getLightCycles()) {
				lightCycle.move();
			}
			this.model.setLightCyclesMoved();
		}
	};
	/**
	 * Sets the view
	 * @param view
	 * 				the new view
	 */
	public void setView(IView view) {
		this.view = view;
	};
	
	/**Change the direction of the lightCycle when a keyEvent occurs*/
	public void orderPerform(final IUserOrder userOrder) {
		if (userOrder != null) {
			final ILightCycle lightCycle = this.model.getLightCyclesPlayer(userOrder.getPlayer());
			if (lightCycle != null) {
				int direction;
				switch (userOrder.getOrder()) {
				case RIGHT:
					direction = (lightCycle.setDirection(
							((this.model.getLightCyclesPlayer(userOrder.getPlayer()).getDirection() + 1) + 4) %4));
					break;
				case LEFT:
					direction = (lightCycle.setDirection(
							((this.model.getLightCyclesPlayer(userOrder.getPlayer()).getDirection() - 1) + 4) %4));
					break;
				case NOTHING:
					default:
						direction = lightCycle.setDirection(this.model.getLightCyclesPlayer(userOrder.getPlayer()).getDirection());
						break;
				}
				lightCycle.setDirection(direction);
			}
		}
	}
	/**
	 * Check if any collision happen
	 */
	public void checkCollision() {
		for (int player = 0; player < 2; player ++) {
			if (this.model.getMatrixXY(this.model.getLightCyclesPlayer(player).getPosition().getX(), this.model.getLightCyclesPlayer(player).getPosition().getY()).isWall()) {
				this.model.getLightCyclesPlayer(player).die();
				this.isGameOver = true;
			}
		}
	}
	
	
}
