package surm.test.db;

import java.sql.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LocalTest {
    public static String driverName;
    public static String url;
    public static String username;
    public static String password;

    //https://blog.csdn.net/weixin_43982359/article/details/119854500 PerCheung
    //注册驱动
    static {
        Properties props = new Properties();
        try {
            props.load(new FileReader("src/db.properties"));
            driverName = props.getProperty("driverName");
            url = props.getProperty("url");
            username = props.getProperty("username");
            password = props.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //jdbc对象
    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;

    public void getConnection() {
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int update(String sql, Object[] objs) {
        int i = 0;
        try {
            getConnection();
            pstmt = conn.prepareStatement(sql);
            for (int j = 0; j < objs.length; j++) {
                pstmt.setObject(j + 1, objs[j]);
            }
            i = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public ResultSet select(String sql, Object[] objs) {
        try {
            getConnection();
            pstmt = conn.prepareStatement(sql);
            for (int j = 0; j < objs.length; j++) {
                pstmt.setObject(j + 1, objs[j]);
            }
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void closeConnection() {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
/*
    public static void main(String[] args) throws Exception {
        //加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获得数据库链接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * from testphone_1");

        while (rs.next()) {
            System.out.println(rs.getString("brand"));
        }

    }
    */
}
