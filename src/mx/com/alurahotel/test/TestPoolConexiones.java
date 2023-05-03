/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.alurahotel.test;

import java.sql.Connection;
import mx.com.alurahotel.factory.ConnectionFactory;


public class TestPoolConexiones {

    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        for (int i = 0; i < 20; i++) {
            Connection c = connectionFactory.realizarConexion();
            System.out.println("Abriendo la conexión número: " + (i + 1));
        }
    }
}
