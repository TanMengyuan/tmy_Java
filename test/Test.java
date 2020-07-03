import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

    public static void main(String[] args) {

        String s = "一二三123";
        System.out.println(s.length());
        System.out.println(new java.sql.Timestamp(System.currentTimeMillis()));
    }
}