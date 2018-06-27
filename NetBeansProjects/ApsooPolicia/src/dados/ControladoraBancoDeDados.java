/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author PCDOMILHAO
 */
public class ControladoraBancoDeDados{
    ConnectDB banco = new ConnectDB();
     
    
    public Delegacia getDelegaciaQuerry(int codDelegacia) throws SQLException{
        
        Delegacia d = new Delegacia();
        ResultSet answ = null;
        
        try{
            banco.init();
            answ = banco.getStatement().executeQuery("select * from delegacia where cod_delegacia="+codDelegacia+";");
        
            //System.out.println("[*] - Aparece "+codOcorrencia+" na tabela ! \ncomando sql: select * from ocorrencia where cod_ocorrencia="+codOcorrencia);
        }
        catch(SQLException erro){
            erro.printStackTrace();
        }
        
        if(answ != null){
            while(answ.next()){
                d.setNome(answ.getString(3));
                d.setRegiao(answ.getInt(2));
            
            }
            
            
        }
        banco.destroy();
        return d;
        
    }
    
    
    public Cidadao getCidadaoQuerry(int codCidadao) throws SQLException{
        
        Cidadao cid = new Cidadao();
        ResultSet answ = null;
        
        try{
            banco.init();
            answ = banco.getStatement().executeQuery("select * from cidadao where cod_cidadao="+codCidadao+";");
        
            //System.out.println("[*] - Aparece "+codOcorrencia+" na tabela ! \ncomando sql: select * from ocorrencia where cod_ocorrencia="+codOcorrencia);
        }
        catch(SQLException erro){
            erro.printStackTrace();
        }
        
        if(answ != null){
            while(answ.next()){
                cid.setCpf(answ.getString(2));
                cid.setIdade(answ.getInt(3));
                cid.setNome(answ.getString(4));
                cid.setNomeMae(answ.getString(5));
                cid.setNomePai(answ.getString(6));    
            }
            
            
        }
        banco.destroy();
        return cid;
        
    }
    
    public Usuario getUsuarioQuerry(int codUsuario) throws SQLException{
        
        Usuario usu = new Usuario();
        ResultSet answ = null;
        
        try{
            banco.init();
            answ = banco.getStatement().executeQuery("select * from usuario where cod_usuario="+codUsuario+";");
        
            //System.out.println("[*] - Aparece "+codOcorrencia+" na tabela ! \ncomando sql: select * from ocorrencia where cod_ocorrencia="+codOcorrencia);
        }
        catch(SQLException erro){
            erro.printStackTrace();
        }
        
        if(answ != null){
            while(answ.next()){
                usu.setEhAdmin(answ.getBoolean(5));
                usu.setLogin(answ.getString(3));
                usu.setSenha(answ.getString(4));
            }
            
            
        }
        banco.destroy();
        return usu;
        
    }
    
    public Usuario getUsuarioQuerry(String login, String senha) throws SQLException{
        
        Usuario usu = new Usuario();
        ResultSet answ = null;
        
        try{
            banco.init();
            answ = banco.getStatement().executeQuery("select * from usuario where login='"+login+"' and senha ='"+senha+"';");
        
            //System.out.println("[*] - Aparece "+codOcorrencia+" na tabela ! \ncomando sql: select * from ocorrencia where cod_ocorrencia="+codOcorrencia);
        }
        catch(SQLException erro){
            erro.printStackTrace();
        }
        
        if(answ != null){
            while(answ.next()){
                usu.setCidadao(getCidadaoQuerry(answ.getInt(2)));
                usu.setEhAdmin(answ.getBoolean(5));
                usu.setLogin(answ.getString(3));
                usu.setSenha(answ.getString(4));
            }
            
            
        }
        banco.destroy();
        return usu;
    }
    
    public Ocorrencia getOcorrenciaQuerry(int codOcorrencia) throws SQLException{
        Ocorrencia oc = new Ocorrencia();
        
        ResultSet answ = null;
        try{
            banco.init();
            answ = banco.getStatement().executeQuery("select * from ocorrencia where cod_ocorrencia="+codOcorrencia+";");
            //answ = banco.getStatement().executeQuery("SELECT * FROM usuario WHERE 1;");
        
            //System.out.println("[*] - Aparece "+codOcorrencia+" na tabela ! \ncomando sql: select * from ocorrencia where cod_ocorrencia="+codOcorrencia);
        }
        catch(SQLException erro){
            erro.printStackTrace();
        }
        
        if(answ != null){
            while(answ.next()){
                oc.setCodOcorrencia(answ.getInt(1));
                
                Delegacia de;             
                de = getDelegaciaQuerry(answ.getInt(2));
                oc.setDelegacia(de);
                
                Usuario usu;
                usu = getUsuarioQuerry(answ.getInt(3));
                oc.setDelegadoResponsavel(usu);
                
                Cidadao cid;
                cid = getCidadaoQuerry(answ.getInt(4));
                oc.setCidadaoDenuncia(cid);
                
                oc.setDescricao(answ.getString(5));
                oc.setDescricaoCrime(answ.getString(6));
            }
            
            
        }
        banco.destroy();
        return oc;
    }
    
    public ArrayList<Ocorrencia> getAllOcorrenciasQuerry() throws SQLException{
        ArrayList<Ocorrencia> listOc = new ArrayList<Ocorrencia>();
        
        ResultSet answ = null;
        try{
            banco.init();
            answ = banco.getStatement().executeQuery("select * from ocorrencia;");
            //answ = banco.getStatement().executeQuery("SELECT * FROM usuario WHERE 1;");
        
            //System.out.println("[*] - Aparece "+codOcorrencia+" na tabela ! \ncomando sql: select * from ocorrencia where cod_ocorrencia="+codOcorrencia);
        }
        catch(SQLException erro){
            erro.printStackTrace();
        }
        
        
        if(answ != null){
            while(answ.next()){
                Ocorrencia oc = new Ocorrencia();
                oc.setCodOcorrencia(answ.getInt(1));
                
                Delegacia de;             
                de = getDelegaciaQuerry(answ.getInt(2));
                oc.setDelegacia(de);
                
                Usuario usu;
                usu = getUsuarioQuerry(answ.getInt(3));
                oc.setDelegadoResponsavel(usu);
                
                Cidadao cid;
                cid = getCidadaoQuerry(answ.getInt(4));
                oc.setCidadaoDenuncia(cid);
                
                oc.setDescricao(answ.getString(5));
                oc.setDescricaoCrime(answ.getString(6));
                listOc.add(oc);
            }
            
            
        }
        banco.destroy();
        return listOc;
    }
}
     
 
