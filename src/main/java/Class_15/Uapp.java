package Class_15;

import java.sql.SQLException;

public class Uapp {
    public static void main(String[] args) throws SQLException {
        DbConnector dbCONNECTOR = new DbConnector();
        //TableCreator tableCreator = new TableCreator(dbCONNECTOR);
        //tableCreator.createStudentTable();
        //tableCreator.createModuleTable();
       // tableCreator.createRegistrationTable();
        //DataInsperation dataInsperation = new DataInsperation(dbCONNECTOR);
        //dataInsperation.insertStudentTable();
        DBReader dbReader = new DBReader(dbCONNECTOR);
        System.out.println(dbReader.getStudentInfo());
    }
}
