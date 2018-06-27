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
import dados.Usuario;
import java.sql.SQLException;

public class ControladoraLogin {
        ControladoraBancoDeDados banco = new ControladoraBancoDeDados();
	public Usuario autentica(String login, String senha) throws SQLException {
		return banco.getUsuarioQuerry(login, senha);
	}

}

