/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author aguer
 */
public class Conexion {
      private static Connection cn = null;
    private static String url="jdbc:mysql://altar42.supremepanel42.com:3306/meinfosa_bautizo?autoReconnect=true&serverTimezone=UTC&initialTimeout=360000";

    public static Connection getConnection()  {
        if (cn == null) {
            try {
                cn = DriverManager.getConnection(url, "meinfosa_armando", "00677576Ajgm");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return cn;
    }
}
