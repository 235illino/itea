package homework_db_26_07.dao;

import homework_db_26_07.dao.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private static final String URL = "jdbc:mysql://localhost:3306/my_internet_store_db";
    private static final String LOGIN = "admin";
    private static final String PASSWORD = "password";

    private static final String GET_ALL_PRODUCTS = "select * from product";
    private static final String INSERT_PRODUCT = "insert into product values (?, ?, ?, ?);";
    private static final String UPDATE_PRODUCT = "update product set product_name = ?, category = ?, price = ? where product_id = ?;";

    public void createProduct(Product product) {
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement(INSERT_PRODUCT);
            statement.setInt(1, product.getId());
            statement.setString(2, product.getName());
            statement.setString(3, product.getCategory());
            statement.setDouble(4, product.getPrice());
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateProduct(Product product) {
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement(UPDATE_PRODUCT);
            statement.setString(1, product.getName());
            statement.setString(2, product.getCategory());
            statement.setDouble(3, product.getPrice());
            statement.setInt(4, product.getId());
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD)) {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(GET_ALL_PRODUCTS);


            while (result.next()) {
                products.add(convertToProduct(result));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return products;


    }

    private Product convertToProduct(ResultSet result) throws SQLException {
        Product product = new Product();
        product.setId(result.getInt("product_id"));
        product.setName(result.getString("product_name"));
        product.setCategory(result.getString("category"));
        product.setPrice(result.getDouble("price"));

        return product;
    }


}
