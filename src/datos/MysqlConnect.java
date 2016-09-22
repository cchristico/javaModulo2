/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.*;

/**
 *
 * @author CEC
 */
public class MysqlConnect {

    private Connection conexion;

    public MysqlConnect() {
        this.conexion = null;
    }

    public void efectuarConexion() throws ClassNotFoundException, SQLException, InternalError, InstantiationException, IllegalAccessException {
        //"jdbc:mysql://localhost:3306/database?characterEncoding=latin2"
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "concesionario";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        Class.forName(driver).newInstance();
        conexion = DriverManager.getConnection(url + dbName, userName, password);

    }
    
     public ResultSet ejecutarSpConsulta(String[] args, String store_name) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        int tamanio = args.length;
        String call = "{call " + store_name + "(";
        for (int i = 0; i < tamanio; i++) {
            if (i == tamanio - 1) {
                call = call.concat("?)}");
            } else {
                call = call.concat("?,");
            }
        }
        CallableStatement cs = conexion.prepareCall(call);
        for (int i = 0; i < tamanio; i++) {
            cs.setString(i + 1, args[i]);
        }
        ResultSet resultado = cs.executeQuery();
        return resultado;
    }
/*
     
     */
     
      public void ejecutarSpConsulta2(String[] args, String store_name) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

          int i=0;
          String call = "{call " + store_name + "(?,?,?,?,?,?,?,?,?)}";
          CallableStatement stmt = conexion.prepareCall(call);
          for (String dato: args) {
            
            stmt.setString(i+1, dato);
            i++;
       }
        stmt.execute();
        //return resultado;
    }
     

    public void ejecutarSpModificacion(String[] args, String storeName) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        int tamanio = args.length;
        String call = "{ call " + storeName + "(";
        for (int i = 0; i < tamanio; i++) {
            if (i == tamanio - 1) {
                call = call.concat("?)}");
            } else {
                call = call.concat("?,");
            }
        }
        CallableStatement stmt = conexion.prepareCall(call);
        for (int i = 0; i < tamanio; i++) {
            stmt.setString(i + 1, args[i]);
        }
        stmt.execute();
    }

   
    
        public ResultSet ejecutarSpConsultasp(String store_name) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {                      
        String call="{call "+store_name+"( )}";    
        CallableStatement cs = conexion.prepareCall(call);
        ResultSet resultado=cs.executeQuery();
        return resultado;
    }   

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    
        
        

}
