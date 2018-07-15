package main;

import java.awt.Color;
import java.sql.SQLException;

import controller.Controller;
import model.LightCycle;
import model.Model;
import model.Position;
import view.View;

/**
 * <h1>The class Main</h1>
 * @author Yann
 *
 */
public class Main {

	/** the width of the map*/
	private final static int width = 400;
	/** the height of the map*/
	private final static int height = 600;
	
	/**
	 * The main method
	 * @param args
	 * 			the arguments
	 */
	public static void main(String[] args) {
		final Model model = new Model(Main.width, Main.height);
		model.addLightCycle(new LightCycle(2, new Position(50, 50), Color.BLACK, 0));
		model.addLightCycle(new LightCycle(0, new Position(350,550), Color.BLUE, 1));
		final Controller controller = new Controller(model);
		controller.setView(new View(controller, model, model));
		try {
			controller.run();
		} catch (final SQLException exception) {
			exception.printStackTrace();
		}

	}

}
