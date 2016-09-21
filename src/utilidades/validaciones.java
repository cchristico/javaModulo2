/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Christian Castillo
 * @version 1.0
 */
public class validaciones {
    /**
     *  @return int determina 1 si es falso y o si es verdaero
     * @param email cadena a ser consultada 
     */
    public String validarEmail(String email){
        String resultadoEvaluacion="";
        Pattern p = Pattern.compile("^\\.|^@");
        Matcher m = p.matcher(email);
        
        if(m.find())
            resultadoEvaluacion+="Compruebe el inicio del correo\n";
        p = Pattern.compile("^www\\.");
        m = p.matcher(email);
        if(m.find())
            resultadoEvaluacion+="Compruebe el inicio del correo\n";
        
        p = Pattern.compile("@");
        m = p.matcher(email);
        if(!m.find())
            resultadoEvaluacion+="El correo debe contener @\n";
        
        p = Pattern.compile("\\.");
        m = p.matcher(email);
        if(!m.find())
            resultadoEvaluacion+="El correo debe contener .\n";
        return resultadoEvaluacion;
    }
     public String reemplazarCaracteres(String cadena){
         String cadena2="";
       //  cadena2 = cadena.replace("@", "a").replaceAll("3", "e").replaceAll("#", "h");
         Pattern p = Pattern.compile("[^a-zA-Z]");
         Matcher m =p.matcher(cadena);
         StringBuffer sb = new StringBuffer();
         boolean caracteresEspeciales=false;
         boolean verificador= m.find();
         while(verificador)
         {
             caracteresEspeciales=true;
             m.appendReplacement(sb, "");
             verificador=m.find();
         }
         m.appendTail(sb);
         cadena2=sb.toString();

         System.out.println(cadena2);
         return cadena2;
     }
}
