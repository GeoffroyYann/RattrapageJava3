package view;

import java.awt.event.KeyEvent;

import controller.EnumOrder;
import controller.IOrderPerformer;

public class EventPerformer implements IEventPerformer {

	private final IOrderPerformer orderPerformer;
	
	public EventPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
	
	public void eventPerform(final KeyEvent keyCode) {
		// TODO Auto-generated method stub
	
	}
	
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
