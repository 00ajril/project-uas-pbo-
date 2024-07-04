/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Toko;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author waski
 */
public class koneksi {
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        if (koneksi == null){
            try {
                String url = "jdbc:mysql://localhost:3306/penjualan?zeroDateTimeBehavior=CONVERT_TO_NULL";
                String user = "admin";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("berhasil");
                
            }catch (Exception e){
                System.out.println("error");
            }
        }
        return koneksi;
    }
    public static void main (String args[]){
        getKoneksi();
    }        
}
