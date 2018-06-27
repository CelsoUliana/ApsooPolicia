package apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ADefinir.Constants;

import logica.ControladoraPrincipal;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

/**
 * 
 * @author wesle
 * Design inspirado em k33ptoo
 * acesso: https://www.fiverr.com/k33ptoo/java-swing-desktop-application?context_referrer=gig_page&source=other_gigs_by&pos=1&ref_ctx_id=d6d6efae-5899-4a89-9244-3142bbe77a26
 */

public class TelaPrincipal extends JFrame {
	//ponto x e y da Frame -> para poder move-la
	private int x, y;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setBounds(100, 100, 809, 482);
		setUndecorated(true);
		setOpacity(Constants.OPACITY);	
		setBackground(Constants.COLOR_BG);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Constants.COLOR_BG);
		contentPane.setLayout(null);
		
		JButton btnGerenciarOcorrencias = new JButton("Gerenciar Ocorrências");
		btnGerenciarOcorrencias.setBounds(225, 137, 302, 48);
		//btnGerenciarOcorrencias.setBounds(0, 131, 286, 63);
		btnGerenciarOcorrencias.setBorder(null);
		btnGerenciarOcorrencias.setBackground(Constants.CLICK_COLOR);
		btnGerenciarOcorrencias.setBorderPainted(false);
		btnGerenciarOcorrencias.setForeground(Constants.COLOR_BG);
		btnGerenciarOcorrencias.setFont(Constants.FONT_SUB_TITLE);
		contentPane.add(btnGerenciarOcorrencias);
		
		JButton btnGerCidadao = new JButton("Gerenciar Cidadão");
		btnGerCidadao.setForeground(Color.WHITE);
		btnGerCidadao.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGerCidadao.setBorderPainted(false);
		btnGerCidadao.setBorder(null);
		btnGerCidadao.setBackground(new Color(128, 188, 220));
		btnGerCidadao.setBounds(225, 211, 302, 48);
		contentPane.add(btnGerCidadao);
		
		JButton btnGerFuncionario = new JButton("Gerenciar Funcionario");
		btnGerFuncionario.setForeground(Color.WHITE);
		btnGerFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGerFuncionario.setBorderPainted(false);
		btnGerFuncionario.setBorder(null);
		btnGerFuncionario.setBackground(new Color(128, 188, 220));
		btnGerFuncionario.setBounds(225, 292, 302, 48);
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
		
		JButton button = new JButton("Sair");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBackground(new Color(128, 188, 220));
		button.setBounds(657, 430, 142, 41);
		contentPane.add(button);
		
		btnGerenciarOcorrencias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaGerenciarOcorrencia tela = new TelaGerenciarOcorrencia();
				tela.setVisible(true);
				dispose();
			}
		});
		
		btnGerCidadao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaGerenciarCidadao tela = new TelaGerenciarCidadao();
				tela.setVisible(true);
				dispose();
			}
		});
		
		btnGerFuncionario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaGerenciarFuncionario tela = new TelaGerenciarFuncionario();
				tela.setVisible(true);
				dispose();
			}
		});
		
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaLogin tela = new TelaLogin();
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
