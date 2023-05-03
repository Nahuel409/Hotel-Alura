/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.alurahotel.util;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ListarNacionalidadesUtil {
   
    public static String[] filtrarNacionalidades() {
        String[] nacionalidades =  {"Antigua y Barbuda", "Argentina", "Bahamas", "Barbados", "Belice", "Bolivia", "Brasil", "Canadá", "Chile", "Colombia", "Costa Rica", "Cuba", "Dominica", "Ecuador", "El Salvador", "Estados Unidos", "Granada", "Guatemala", "Guyana", "Haití", "Honduras", "Jamaica", "México", "Nicaragua", "Panamá", "Paraguay", "Perú", "República Dominicana", "San Cristóbal y Nieves", "San Vicente y las Granadinas", "Santa Lucía", "Surinam", "Trinidad y Tobago", "Uruguay", "Venezuela"};

                ArrayList<String> listaNacionalidades = new ArrayList<>();
        for (String nacionalidad : nacionalidades) {
            if (!nacionalidad.isEmpty()) {
              /*  if (esNacionalidadEspanhol(nacionalidad)) {
                    listaNacionalidades.add(nacionalidad);
                }*/
                  listaNacionalidades.add(nacionalidad);
            }
        }
        
        nacionalidades = listaNacionalidades.toArray(new String[0]);
        return nacionalidades;
    }

  
   /* private static boolean esNacionalidadEspanhol(String nacionalidad) {
        String regEx = "(([A-Z][\\-]?[a-záéíóúâêôãõç]+)(\\s|\\-)?"
                + "([A-Z]?[\\-]?[a-záéíóúâêôãõç]+\\s)?–\\s"
                + "([a-záéíóúâêôãõç]+)[\\-]?([a-záéíóúâêôãõç]+))";
        Pattern pattern = Pattern.compile(regEx);
        Matcher mat = pattern.matcher(nacionalidad);
        return mat.find();
    }*/
}
