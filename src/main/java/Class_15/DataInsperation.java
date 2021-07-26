package Class_15;

public class DataInsperation {
    private final DbConnector dbCONNECTOR;

    public DataInsperation(DbConnector dbCONNECTOR) {
        this.dbCONNECTOR = dbCONNECTOR;
    }

    public void insertStudentTable() {

        String query = "INSERT INTO student VALUES (" +
                "1, " +
                "'Daniel', " +
                "'Radcliffe', " +
                "'1995-04-23'" +

                "), " +
                "(" +
                "2, " +
                "'Emma', " +
                "'Watson', " +
                "'1994-07-15'" +

                "), " +
                "(" +
                "3, " +
                "'Rupert', " +
                "'Grint', " +
                "'1995-10-24'" +

                ");";
        dbCONNECTOR.executeUpdate(query);

    }

}
