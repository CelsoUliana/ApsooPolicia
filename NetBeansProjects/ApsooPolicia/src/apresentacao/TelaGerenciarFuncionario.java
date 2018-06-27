package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import ADefinir.Constants;

public class TelaGerenciarFuncionario extends JFrame {
	private int x, y;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGerenciarFuncionario frame = new TelaGerenciarFuncionario();
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
	public TelaGerenciarFuncionario() {
		setBounds(100, 100, 809, 482);
		setUndecorated(true);
		setOpacity(Constants.OPACITY);	
		setBackground(Constants.COLOR_BG);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Constants.COLOR_BG);
		contentPane.setLayout(null);
		
		JPanel menuLateral = new JPanel();
		menuLateral.setBounds(0, 0, 286, 482);
		menuLateral.setBackground(Constants.MENU_COLOR);
		contentPane.add(menuLateral);
		menuLateral.setLayout(null);
		
		JLabel lblPolicia = new JLabel("Policia");
		lblPolicia.setHorizontalAlignment(SwingConstants.CENTER);
		lblPolicia.setBounds(28, 57, 219, 37);
		lblPolicia.setFont(Constants.FONT_TITLE);
		lblPolicia.setForeground(Constants.COLOR_FONT_BG_MENU);
		menuLateral.add(lblPolicia);
		
		JPanel panelSeparator = new JPanel();
		panelSeparator.setBounds(20, 106, 243, 2);
		menuLateral.add(panelSeparator);
		
		JButton btnAddOcorrence = new JButton("Adicionar");
		btnAddOcorrence.setBounds(0, 131, 286, 63);
		btnAddOcorrence.setBorder(null);
		btnAddOcorrence.setBackground(Constants.CLICK_COLOR);
		btnAddOcorrence.setBorderPainted(false);
		btnAddOcorrence.setForeground(Constants.COLOR_BG);
		btnAddOcorrence.setFont(Constants.FONT_SUB_TITLE);
		menuLateral.add(btnAddOcorrence);
		//AddOcorrencia
		
		JButton btnChangeOcorrence = new JButton("Alterar");
		btnChangeOcorrence.setBounds(0, 199, 286, 63);
		btnChangeOcorrence.setBorder(null);
		btnChangeOcorrence.setBorderPainted(false);
		btnChangeOcorrence.setBackground(Constants.MENU_COLOR);
		btnChangeOcorrence.setFont(Constants.FONT_SUB_TITLE);
		btnChangeOcorrence.setForeground(Constants.COLOR_BG);		
		menuLateral.add(btnChangeOcorrence);
		
		JButton btnBack = new JButton("Voltar");
		btnBack.setForeground(Constants.COLOR_BG);
		btnBack.setFont(Constants.FONT_SUB_TITLE);
		btnBack.setBackground(Constants.MENU_COLOR);
		btnBack.setBorderPainted(false);
		btnBack.setBorder(null);
		btnBack.setBackground(new Color(65, 66, 147));
		btnBack.setBounds(0, 267, 286, 63);
		menuLateral.add(btnBack);
		
		Panel panelRight = new Panel();
		panelRight.setBounds(287, 0, 522, 482);
		contentPane.add(panelRight);
		panelRight.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(494, 11, 18, 21);
		panelRight.add(panel);
		panel.setBackground(Constants.COLOR_BG);
		panel.setLayout(null);
		
		JLabel lblX = new JLabel(" X");
		lblX.setBounds(0, 4, 18, 14);
		lblX.setForeground(Color.RED);		
		lblX.setFont(Constants.FONT_SUB_TITLE);
		panel.add(lblX);
		
		JLabel lblGerOc = new JLabel("Gerenciar Ocorrência");
		lblGerOc.setHorizontalAlignment(SwingConstants.CENTER);
		lblGerOc.setBounds(0, 23, 484, 25);
		lblGerOc.setForeground(Constants.COLOR_FONT_BG);
		lblGerOc.setFont(Constants.FONT_TITLE);
		
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaPrincipal tela = new TelaPrincipal();
				tela.setVisible(true);
				dispose();
			}
		});		
		
		btnChangeOcorrence.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnChangeOcorrence.setBackground(Constants.CLICK_COLOR);
				btnAddOcorrence.setBackground(Constants.MENU_COLOR);
				changeOcorrence();
			}
		});
		
		btnAddOcorrence.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnChangeOcorrence.setBackground(Constants.MENU_COLOR);
				btnAddOcorrence.setBackground(Constants.CLICK_COLOR);
				addOcorrence();
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

	public void addOcorrence() {
		
	}
	
	public void changeOcorrence() {
		//set true 
	}	
	
	public void back() {
		
	}
}
