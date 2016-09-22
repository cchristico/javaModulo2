/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import datos.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import utilidades.constantes;

/**
 *
 * @author CEC
 */
public class clientes {
   
    public ResultSet cararTipoIdentificacion(String tipoCatalogo) throws ClassNotFoundException, SQLException, InternalError, InstantiationException, IllegalAccessException{
        MysqlConnect insM= new MysqlConnect();
        insM.efectuarConexion();
        String[] argumentos = {tipoCatalogo};
        return insM.ejecutarSpConsulta(argumentos, constantes.SP_CONSULTAR_CATALOGO);
    }
    
    public void insertarClientes(String[] datos) throws ClassNotFoundException, SQLException, InternalError, InstantiationException, IllegalAccessException
    {
         MysqlConnect instMS =new MysqlConnect();
         instMS.efectuarConexion();
         instMS.ejecutarSpModificacion(datos, constantes.SP_INSERTAR_CLIENTES);
    }
    
    public ResultSet consultarCliente(String[] datos,String nombreStoreProcedure) throws ClassNotFoundException, SQLException, InternalError, InstantiationException, IllegalAccessException
    {
         MysqlConnect instMS =new MysqlConnect();
         instMS.efectuarConexion();
        return instMS.ejecutarSpConsulta(datos, nombreStoreProcedure);
    }
}
