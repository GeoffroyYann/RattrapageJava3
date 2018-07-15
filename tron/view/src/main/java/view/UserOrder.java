package view;

import controller.EnumOrder;

/**
 * <h1>The UserOrder Class</h1>
 * @author Lisa
 *
 */
public class UserOrder implements IUserOrder {

	/**The player*/
	private int player;
	/**An order*/
	private final EnumOrder order;
	/**
	 * The constructor of UserOrder
	 * @param player
	 * 				the player
	 * @param order
	 * 				the order
	 */
	public UserOrder(final int player, final EnumOrder order) {
		this.player = player;
		this.order = order;
	}
	
	/**
	 * Gets the order
	 */
	public EnumOrder getOrder() {
		return this.order;
	}
	
	/**
	 * Gets the player
	 */
	public int getPlayer() {
		return this.player;
	}
}
