public abstract class PatientDAOlmpl implements PatientDAO {
    //connect database
    public static String driverName = "Hospital.sqlite.JDBC";
    public static String url = "jdbc:sqlite:D:/361211760041/Hospital.sqlite";
    public static Connection conn = null;
}//
