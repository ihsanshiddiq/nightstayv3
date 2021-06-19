    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nightstay3;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author Turgut Reiss
 */
public class Nightstay3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        
        Room RM = new Room();
        
        RM.InitializeRoom();
        
        //System.out.println("====MENU====");
        //System.out.println("1. ");
        
        RM.book("A101", 4);
        RM.getStat(0);
        
        RM.displayAllRoom();
        
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/nightstay";
        String user = "root";
        String pass = "";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected to Database successfully.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        };
        
        
    }
    
}
