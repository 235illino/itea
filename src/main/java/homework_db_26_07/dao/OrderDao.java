package homework_db_26_07.dao;

import homework_db_26_07.dao.model.Order;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDao {
    private static final String URL = "jdbc:mysql://localhost:3306/my_internet_store_db";
    private static final String LOGIN = "admin";
    private static final String PASSWORD = "password";

    private static final String GET_ALL_ORDERS = "select * from orders";
    private static final String INSERT_ORDER = "insert into orders values (?, ?, ?, ?, ?);";
    private static final String UPDATE_ORDER = "update orders set product_id = ?, quantity = ?, status = ?, date_of_order = ? where user_id = ?;";


    public void createOrder(Order order) {
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement(INSERT_ORDER);
            statement.setInt(1, order.getUser_id());
            statement.setInt(2, order.getProduct_id());
            statement.setInt(3, order.getQuantity());
            statement.setString(4, order.getStatus());
            statement.setDate(5, Date.valueOf(order.getDateOfOrder()));

            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateOrder(Order order) {
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement(UPDATE_ORDER);
            statement.setInt(1, order.getProduct_id());
            statement.setInt(2, order.getQuantity());
            statement.setString(3, order.getStatus());
            statement.setDate(4, Date.valueOf(order.getDateOfOrder()));
            statement.setInt(5, order.getUser_id());
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public void infoAllOrders() {
        List<Order> orders = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD)) {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(GET_ALL_ORDERS);


            while (result.next()) {
                orders.add(convertToOrders(result));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        orders.forEach(System.out::println);


    }

    private Order convertToOrders(ResultSet result) throws SQLException {
        Order order = new Order();
        order.setUser_id(result.getInt("user_id"));
        order.setProduct_id(result.getInt("product_id"));
        order.setQuantity(result.getInt("quantity"));
        order.setStatus(result.getString("status"));
        order.setDateOfOrder(result.getDate("date_of_order").toLocalDate());

        return order;
    }


}
