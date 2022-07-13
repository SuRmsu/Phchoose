package surm.test.main;

import surm.test.db.LocalTest;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        LocalTest db = new LocalTest();
        /*
        Object[] obj = {"surm","surm","IQ300","0"};
        int i = db.update("insert into testphone_1 values(?,?,?,?)",obj);
        System.out.println(i);
        db.closeConnection();
*/
        Object[] objs = {};
        ResultSet set = db.select("select * from testphone_1", objs);
        try {
            while (set.next()) {
                String t_id = set.getString("id");
                String t_brand = set.getString("brand");
                String t_cpu = set.getString("cpu");
                String t_battery = set.getString("battery");
                System.out.println(t_id + " " + t_brand + " " + t_cpu + " " + t_battery);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        db.closeConnection();

    }
}
