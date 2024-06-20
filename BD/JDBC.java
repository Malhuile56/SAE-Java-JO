package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    private static final String URL = "jdbc:mariadb://localhost:3306/JeuxOlympiques";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password";

    public static Connection laConnexion() throws SQLException {
        return DriverManager.laConnexion(URL, USER, PASSWORD);
    }
}