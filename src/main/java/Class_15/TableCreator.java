package Class_15;

public class TableCreator {
    private final DbConnector dbCONNECTOR;

    public TableCreator(DbConnector dbCONNECTOR) {
        this.dbCONNECTOR = dbCONNECTOR;
    }

    public void createStudentTable() {
        String query = "CREATE TABLE student (" +
                "student_id int not null, " +
                "first_name text, " +
                "last_name text, " +
                "date_of_birth date," +
                "primary key (student_id)" +
                ");";
        dbCONNECTOR.executeUpdate(query);

    }
    public void createModuleTable() {
        String query = "CREATE TABLE module (" +
                "module_id int not null, " +
                "title text, " +
                "level integer, " +
                "credits integer," +
                "primary key (module_id)"+
                ");";
        dbCONNECTOR.executeUpdate(query);

    }
    public void createRegistrationTable() {
        String query = "CREATE TABLE Registration(" +
                "student_id int not null, " +
                "module_id int not null, " +
                "result int, " +
                "primary key (student_id, module_id), " +
                "foreign key (student_id) references student(student_id), " +
                "foreign key (module_id) references module(module_id)" +
                ");";
        dbCONNECTOR.executeUpdate(query);

    }
}
