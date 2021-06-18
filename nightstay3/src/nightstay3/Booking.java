/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nightstay3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Booking {

    private String first_name = null;
    private String last_name = null;
    private String email = null;
    private String gender = null;
    private String nomer_kamar = null;
    private String check_in = null;
    private String check_out = null;

    Connection con = null;
    String url = "jdbc:mysql://localhost:3306/nightstay_3";
    String user = "root";
    String pass = "";

    public void Booking(String NK, String FN, String LN, String Email, String Gender, String CI, String CO) {
        this.nomer_kamar = NK;
        this.first_name = FN;
        this.last_name = LN;
        this.email = Email;
        this.gender = Gender;
        this.check_in = CI;
        this.check_out = CO;

    }

    public void addDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            String query = "INSERT INTO dbbooking (no_kamar, first_name, last_name, email, gender, check-in, check-out)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, nomer_kamar);
            preparedStmt.setString(2, first_name);
            preparedStmt.setString(3, last_name);
            preparedStmt.setString(4, email);
            preparedStmt.setString(5, gender);
            preparedStmt.setString(6, check_in);
            preparedStmt.setString(7, check_out);

            // executor
            preparedStmt.execute();
            con.close();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    // set Program

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public void setCheck_out(String check_out) {
        this.check_out = check_out;
    }

    // get program

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getCheck_in() {
        return check_in;
    }

    public String getCheck_out() {
        return check_out;
    }

    public String getGender() {
        return gender;
    }

}
