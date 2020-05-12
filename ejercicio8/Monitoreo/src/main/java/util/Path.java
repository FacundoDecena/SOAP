/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import lombok.Getter;

/**
 *
 * @author cnval
 */

public class Path {

    // Los metodos @Getter son necesarios para acceder desde las variables de Templates de Velocity
    // NO USAR ACCESOS DIRECTOS, SINO SIEMPRE A TRAVÉS DE ESTA CLASE
    public static class Web {
        
        //API
        @Getter public static final String PRINCIPAL = "sistema/camarasVigilancia";
        
        
    }
    
    public static class Template {
        public final static String LAYOUT = "templates/layout.vtl";
        public final static String CAMARAS = "templates/camaras.vtl";
        
    }

}
