
import dados.ControladoraBancoDeDados;
import dados.Ocorrencia;
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
        ArrayList<Ocorrencia> a = banco.getAllOcorrenciasQuerry();
        
        for(Ocorrencia oc : a){
            System.out.println(oc.getDescricao());
            System.out.println(oc.getCidadaoDenuncia().getCpf());
            System.out.println(oc.getDelegacia().getNome());
            System.out.println(oc.getDelegadoResponsavel().getLogin());
        }
        
    }
}
