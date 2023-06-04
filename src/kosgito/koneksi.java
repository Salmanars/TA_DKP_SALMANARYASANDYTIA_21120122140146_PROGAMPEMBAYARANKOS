/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kosgito;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author HP
 */
public class koneksi {
    private String url = "jdbc:mysql://localhost/phpmyadmin";
    private String username_xampp = "root";
    private String password_xampp = "";
    private Connection con;
    
    public void connect (){
        try {
            con = DriverManager.getConnection(url, username_xampp, password_xampp);
            System.out.println("koneksi berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public Connection getCon(){
        return con;
    }
    public static void main(String[] args) {
        koneksi k = new koneksi ();
            k.connect();
        
    }
}   
    
    
    
