package homework_db_26_07.dao;

import homework_db_26_07.dao.model.Product;
import homework_db_26_07.dao.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static final String URL = "jdbc:mysql://localhost:3306/my_internet_store_db";
    private static final String LOGIN = "admin";
    private static final String PASSWORD = "password";

    private static final String GET_ALL_USERS = "select * from user";
    private static final String INSERT_USER = "insert into user values (?, ?, ?);";
    private static final String UPDATE_USER = "update user set full_name = ?, email = ? where user_id = ?;";
    private static final String DELETE_USER = "delete from user where user_id = ?;";


    public void createUser(User user) {
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement(INSERT_USER);
            statement.setInt(1, user.getId());
            statement.setString(2, user.getName());
            statement.setString(3, user.getEmail());

            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateUser(User user) {
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement(UPDATE_USER);
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setInt(3, user.getId());
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteUser(User user) {
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement(DELETE_USER);
            statement.setInt(1, user.getId());
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD)) {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(GET_ALL_USERS);


            while (result.next()) {
                users.add(convertToUser(result));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return users;


    }

    private User convertToUser(ResultSet result) throws SQLException {
        User user = new User();
        user.setId(result.getInt("user_id"));
        user.setName(result.getString("full_name"));
        user.setEmail(result.getString("email"));

        return user;
    }
}
