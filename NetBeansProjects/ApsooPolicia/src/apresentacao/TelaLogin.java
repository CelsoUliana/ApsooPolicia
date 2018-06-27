package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ADefinir.Constants;
import logica.ControladoraLogin;
import logica.ControladoraPrincipal;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaLogin extends JFrame {
	private int x, y;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setBounds(100, 100, 809, 482);
		setUndecorated(true);
		setOpacity(Constants.OPACITY);	
		setBackground(Constants.COLOR_BG);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Constants.COLOR_BG);
		contentPane.setLayout(null);
		
		JButton btnGerFuncionario = new JButton("Entrar");
		btnGerFuncionario.setForeground(Color.WHITE);
		btnGerFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGerFuncionario.setBorderPainted(false);
		btnGerFuncionario.setBorder(null);
		btnGerFuncionario.setBackground(new Color(128, 188, 220));
		btnGerFuncionario.setBounds(416, 301, 176, 38);
		contentPane.add(btnGerFuncionario);
		
		JPanel panel = new JPanel();
		panel.setBounds(781, 11, 18, 21);
		contentPane.add(panel);
		panel.setBackground(Constants.COLOR_BG);
		panel.setLayout(null);
		
		JLabel lblX = new JLabel(" X");
		lblX.setBounds(0, 4, 18, 14);
		lblX.setForeground(Color.RED);		
		lblX.setFont(Constants.FONT_SUB_TITLE);
		panel.add(lblX);
		
		textField = new JTextField();
		textField.setBounds(190, 138, 402, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(190, 113, 46, 14);
		lblLogin.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogin.setForeground(Constants.COLOR_FONT_BG);
		lblLogin.setFont(Constants.FONT);	
		contentPane.add(lblLogin);
		
		JLabel label = new JLabel("senha");
		label.setBounds(190, 193, 46, 14);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(Constants.COLOR_FONT_BG);
		label.setFont(Constants.FONT);	
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(190, 218, 402, 28);
		contentPane.add(textField_1);
		
		btnGerFuncionario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/***
				 * tem que verificar banco e altenticar
				 */
				TelaPrincipal tela = new TelaPrincipal();
				tela.setVisible(true);
				dispose();
			}
		});
		
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});		
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				x = e.getX();
				y = e.getY();
			}
		});
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				e.translatePoint(e.getComponent().getLocation().x - x, e.getComponent().getLocation().y - y);
				setLocation(e.getX(), e.getY());
			}
		});			
	}

}
