
import dados.ControladoraBancoDeDados;
import dados.Ocorrencia;
import dados.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PCDOMILHAO
 */
public class teste {
    public static void main(String args[]) throws SQLException {
        ControladoraBancoDeDados banco = new ControladoraBancoDeDados();
        Ocorrencia a = banco.getOcorrenciaQuerry(1);
        
        
        for(Usuario u : a.getEquipe()){
            System.out.println(u.getLogin());
            System.out.println(u.getSenha());
        }
        
        
        
        
        
    }
}
