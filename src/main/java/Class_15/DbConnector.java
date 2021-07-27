package Class_15;

import java.sql.*;

public class DbConnector {

    private static final String URL = "jdbc:mysql://localhost:3306/development_db";
    private static final String LOGIN = "admin";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {


    }

    public ResultSet executeQuery(String query) throws SQLException {
        ResultSet resultSet = null;
        Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);



        return resultSet;
    }


    public void executeUpdate(String query) {

        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD)) {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}
