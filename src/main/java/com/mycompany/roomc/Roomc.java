/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.roomc;

import com.mycompany.roomc.utils.DBConnection;
import com.mycompany.roomc.views.LoginJFrame;
import java.sql.Connection;
import java.sql.SQLException;

public class Roomc {

    public static void main(String[] args) {
        // Obtener conexión a la base de datos
        try (Connection connection = DBConnection.getConnection()) {
            if (connection != null) {
                new LoginJFrame();
            }
        } catch (SQLException e) {
            System.err.println("Error en la conexión: " + e.getMessage());
        }
    }
}
