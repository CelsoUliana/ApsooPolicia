
import dados.ControladoraBancoDeDados;
import dados.Ocorrencia;
import java.sql.SQLException;

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
        Ocorrencia a = new Ocorrencia();
        ControladoraBancoDeDados banco = new ControladoraBancoDeDados();
        
        a = banco.getOcorrenciaQuerry(1);
        
        System.out.println(a.getDescricao());
        System.out.println(a.getCidadaoDenuncia().getCpf());
        System.out.println(a.getDelegacia().getNome());
        System.out.println(a.getDelegadoResponsavel().getLogin());
        
        
    }
}
