package Common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTest {
	public static void main(String[] args) {
        /* try {
            Class.forName("org.postgresql.Driver");
        }
        catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } */
        // replace below details
        String url = "jdbc:postgresql://192.168.137.5:7918/blma_qa";
        String username = "blma_qa";
        String password = "vYFBRxk2MUw3";

        try {
            Connection db = DriverManager.getConnection(url,username,password );
            // create object for the Statement class
            Statement st = db.createStatement();
            // execute the query on database
            ResultSet rs = st.executeQuery("select * from item where itemname='Itemauto19'");
            System.out.println("Data retrieved from the PostgreSQL database ");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " | "+rs.getString(2) );
            }
            rs.close();
            // close the result set
            int rs1=st.executeUpdate("delete from item where itemname='Itemauto19'");
            System.out.println(" Item deleted ");
            st.close();
            //close the database connection
            db.close();
            }
        catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}