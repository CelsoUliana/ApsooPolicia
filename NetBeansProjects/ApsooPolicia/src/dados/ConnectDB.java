/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author PCDOMILHAO
 */
public class ConnectDB {
    private Connection conn;
    
    static public Statement stmt;
    
    private ResultSet res;
    
    static public ResultSet resultado=null;
    
    private int affectRows;
    
    public ConnectDB() {
    }
    
    public void init(){
       
       try{
       conn = DriverManager.getConnection(
               "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10244804", "sql10244804", "CjQRVhg7cu");
    	//conn = DriverManager.getConnection(
    		              //"jdbc:mysql://localhost:3306/policia?useTimezone=true&serverTimezone=UTC", "root", "");  
        System.out.println("Conectado !");
        }catch(Exception e){ 
            System.out.println("Falha ao tentar a conexão");
            e.printStackTrace();
        }
       
       try{
           stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
       }catch(Exception e){
           System.out.println("Falha no Cursor de Execução");
           //e.printStackTrace();
       }
       
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public Statement getStatement(){
        return stmt;
    }
    
    public void close(ResultSet rs){
        if(rs != null){
            try{
               rs.close();
            } catch(Exception e){}
        }
    }
    
    public void close(Statement s){
        if(s != null){
            try{
               s.close();
            }catch(Exception e){}
        }
    }
    
  public void destroy(){
    if(conn != null){
         try{
               conn.close();
         } catch(Exception e){}
    }
  } 
}
