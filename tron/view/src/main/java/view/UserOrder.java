package view;

import controller.EnumOrder;

public class UserOrder implements IUserOrder {

	private int player;
	private final EnumOrder order;
	
	public UserOrder(final int player, final EnumOrder order) {
		this.player = player;
		this.order = order;
	}
	
	public EnumOrder getOrder() {
		return this.order;
	}
	
	public int getPlayer() {
		return this.player;
	}
}
