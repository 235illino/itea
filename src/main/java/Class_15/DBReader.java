package Class_15;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBReader {
    private final DbConnector dbCONNECTOR;

    public DBReader(DbConnector dbCONNECTOR) {
        this.dbCONNECTOR = dbCONNECTOR;
    }
    public String getStudentInfo() throws SQLException {
      ResultSet resultSet = dbCONNECTOR.executeQuery("Select first_name, last_name, date_of_birth from student;");
      StringBuilder sb = new StringBuilder("Results: \n");
      while (resultSet.next()) {
        sb.append("Name: " + resultSet.getString("first_name"))
                .append(" ")
                .append(resultSet.getString("last_name"))
                .append(" ")
                .append("Birth: ")
                .append(resultSet.getString("date_of_birth"))
                .append("\n");
      }
      return sb.toString();

    }
}
