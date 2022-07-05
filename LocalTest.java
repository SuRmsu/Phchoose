import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LocalTest {
    public static final String URL = "jdbc:mysql://localhost:3306/phone_test";
    public static final String USER = "root";
    public static final String PASSWORD = "surm";

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * from testphone_1");
        while (rs.next()) {
            System.out.println(rs.getString("brand"));
        }

    }
}
