package dao;

import java.sql.CallableStatement;
import java.sql.SQLException;

/**
 * <h1>The Class TronDAO.</h1>
 *
 * @author Yann
 * @version 1.0
 */
public abstract class TronDAO extends AbstractDAO {

    /** The sql call by name */
    private static String sqlResult = "{call badadibadou(?, ?)}";

    /**
     * Update the BDD with the score
     * @param player
     * 				the player
     * @param time
     * 				the time
     * @throws SQLException
     */
    public static void setResult(final int player, final long time) throws SQLException {
        final CallableStatement callStatement = AbstractDAO.prepareCall(TronDAO.sqlResult);
        callStatement.setInt(1, player);
        callStatement.setLong(2, time);
        callStatement.executeUpdate();
    }

}