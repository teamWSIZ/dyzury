package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * h2 database connection:
 * downloaded zip from http://www.h2database.com/html/download.html
 * created directory h2_bases
 * started h2 engine java -cp h2*.jar org.h2.tools.Server -baseDir ~/h2_bases
 * log per firefox, create table:
 * create table tabela (id int primary key auto_increment, name varchar(200))
 */

public class DbConnect {
    public static void main(String[] args) {
//        String DB_URL = "jdbc:h2:~/test";
        //jdbc:h2:tcp://localhost:9092/h2_bases/dyzury
        String DB_URL = "jdbc:h2:tcp://localhost/~/h2_bases/dyzury";
        try
        {
            Class.forName("org.h2.Driver");
            Connection c = DriverManager.getConnection(DB_URL,"sa","");
            PreparedStatement st = c.prepareStatement("insert into tabela (name) values (?)");
            st.setString(1,"abra kadabra 2");
            st.executeUpdate();

            PreparedStatement sel = c.prepareStatement("select * from tabela");
            ResultSet rs = sel.executeQuery();
            while(rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("id=" + id + " name=" + name);
            }


            c.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}
