/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author PCDOMILHAO
 */
import dados.ControladoraBancoDeDados;
import dados.Ocorrencia;
import java.sql.SQLException;

public class ControladoraOcorrencia {
        ControladoraBancoDeDados banco = new ControladoraBancoDeDados();
	public Ocorrencia detalharOcorrencia(int codOcorrencia) throws SQLException {
		return banco.getOcorrenciaQuerry(codOcorrencia);
	}

}
