package view;

import java.awt.event.KeyEvent;

import controller.EnumOrder;
import controller.IOrderPerformer;

/**
 * <h1>The EventPerformer Class</h1>
 * @author Yann
 *
 */
public class EventPerformer implements IEventPerformer {

	/**The order performed*/
	private final IOrderPerformer orderPerformer;
	/**The event performed*/
	public EventPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
	/**
	 * the method that triggers any event
	 */
	public void eventPerform(final KeyEvent keyCode) {
		final IUserOrder userOrder = this.keyCodeToOrder(keyCode.getKeyCode());
		if (userOrder != null) {
			this.orderPerformer.orderPerform(userOrder);
		}
	
	}
	
	/**
	 * The method which convert the key typed into an action in the game
	 * @param keyCode
	 * 				the keyCode
	 * @return
	 * 				the right action
	 */
	private IUserOrder keyCodeToOrder(final int keyCode) {
		IUserOrder userOrder;
		switch (keyCode) {
		case KeyEvent.VK_LEFT:
			userOrder = new UserOrder(0, EnumOrder.LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			userOrder = new UserOrder(0, EnumOrder.RIGHT);
			break;
		case KeyEvent.VK_Q:
			userOrder = new UserOrder(1, EnumOrder.LEFT);
			break;
		case KeyEvent.VK_D:
			userOrder = new UserOrder(1, EnumOrder.RIGHT);
			break;
			default:
				userOrder = null;
		}
		return userOrder;
	}
	

}
