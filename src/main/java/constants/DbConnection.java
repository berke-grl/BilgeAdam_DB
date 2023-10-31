package constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/OBS";
    private static final String USER_NAME="postgres";
    private static final String PASSWORD="root";
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL,USER_NAME,PASSWORD);
    }
}
