package apresentacao;

import ADefinir.Constants;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import ADefinir.Constants;
import dados.Cidadao;

import javax.swing.JTextField;
import javax.swing.ListModel;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.TextField;
import javax.swing.JList;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaGerenciarCidadao extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int x, y;

	private JPanel contentPane;
	
	private boolean isRegister = true;
	JButton btnCadReg;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGerenciarCidadao frame = new TelaGerenciarCidadao();
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
	public TelaGerenciarCidadao() {
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
		
		JLabel lblGerCidadao = new JLabel("Gerenciar Cidad\u00E3o");
		lblGerCidadao.setBounds(0, 23, 484, 25);
		lblGerCidadao.setHorizontalAlignment(SwingConstants.CENTER);
		lblGerCidadao.setForeground(Constants.COLOR_FONT_BG);
		lblGerCidadao.setFont(Constants.FONT_TITLE);		
		panelRight.add(lblGerCidadao);
		
		JTextField textFields [] = new JTextField[14];
		JLabel labels[] = new JLabel[14];
		
		textFields[0] = new JTextField();
		textFields[0].setBounds(112, 84, 372, 20);
		panelRight.add(textFields[0]);
		textFields[0].setColumns(10);
		
		textFields[1] = new JTextField();
		textFields[1].setColumns(10);
		textFields[1].setBounds(112, 115, 372, 20);
		panelRight.add(textFields[1]);
		
		textFields[2] = new JTextField();
		textFields[2].setColumns(10);
		textFields[2].setBounds(112, 146, 372, 20);
		panelRight.add(textFields[2]);
		
		textFields[3] = new JTextField();
		textFields[3].setColumns(10);
		textFields[3].setBounds(112, 177, 372, 20);
		panelRight.add(textFields[3]);
		
		textFields[4] = new JTextField();
		textFields[4].setColumns(10);
		textFields[4].setBounds(112, 208, 372, 20);
		panelRight.add(textFields[4]);
		
		textFields[5] = new JTextField();
		textFields[5].setColumns(10);
		textFields[5].setBounds(112, 268, 153, 20);
		panelRight.add(textFields[5]);
		
		labels[0] = new JLabel("Nome:");
		labels[0].setHorizontalAlignment(SwingConstants.RIGHT);
		labels[0].setBounds(10, 81, 92, 20);
		labels[0].setForeground(Constants.COLOR_FONT_BG);
		labels[0].setFont(Constants.FONT);
		panelRight.add(labels[0]);
		
		labels[1] = new JLabel("Alcunha:");
		labels[1].setHorizontalAlignment(SwingConstants.RIGHT);
		labels[1].setForeground(SystemColor.windowBorder);
		labels[1].setFont(new Font("Tahoma", Font.PLAIN, 12));
		labels[1].setBounds(14, 115, 88, 20);
		panelRight.add(labels[1]);
		
		labels[2] = new JLabel("RG:");
		labels[2].setHorizontalAlignment(SwingConstants.RIGHT);
		labels[2].setForeground(SystemColor.windowBorder);
		labels[2].setFont(new Font("Tahoma", Font.PLAIN, 12));
		labels[2].setBounds(10, 146, 92, 20);
		panelRight.add(labels[2]);
		
		labels[3] = new JLabel("CPF:");
		labels[3].setHorizontalAlignment(SwingConstants.RIGHT);
		labels[3].setForeground(SystemColor.windowBorder);
		labels[3].setFont(new Font("Tahoma", Font.PLAIN, 12));
		labels[3].setBounds(10, 177, 92, 20);
		panelRight.add(labels[3]);
		
		labels[4] = new JLabel("Dat.Nascimento:");
		labels[4].setHorizontalAlignment(SwingConstants.RIGHT);
		labels[4].setForeground(SystemColor.windowBorder);
		labels[4].setFont(new Font("Tahoma", Font.PLAIN, 12));
		labels[4].setBounds(10, 208, 92, 20);
		panelRight.add(labels[4]);
		
		labels[5] = new JLabel("Estado:");
		labels[5].setHorizontalAlignment(SwingConstants.RIGHT);
		labels[5].setForeground(SystemColor.windowBorder);
		labels[5].setFont(new Font("Tahoma", Font.PLAIN, 12));
		labels[5].setBounds(10, 268, 92, 20);
		panelRight.add(labels[5]);
		
		labels[6] = new JLabel("Cidade:");
		labels[6].setHorizontalAlignment(SwingConstants.RIGHT);
		labels[6].setForeground(SystemColor.windowBorder);
		labels[6].setFont(new Font("Tahoma", Font.PLAIN, 12));
		labels[6].setBounds(275, 268, 48, 20);
		panelRight.add(labels[6]);
		
		textFields[6] = new JTextField();
		textFields[6].setColumns(10);
		textFields[6].setBounds(331, 268, 153, 20);
		panelRight.add(textFields[6]);
		
		labels[7] = new JLabel("Nacionalidade:");
		labels[7].setHorizontalAlignment(SwingConstants.RIGHT);
		labels[7].setForeground(SystemColor.windowBorder);
		labels[7].setFont(new Font("Tahoma", Font.PLAIN, 12));
		labels[7].setBounds(10, 237, 92, 20);
		panelRight.add(labels[7]);
		
		textFields[7] = new JTextField();
		textFields[7].setColumns(10);
		textFields[7].setBounds(112, 237, 372, 20);
		panelRight.add(textFields[7]);
		
		labels[8] = new JLabel("Nome do Pai:");
		labels[8].setHorizontalAlignment(SwingConstants.RIGHT);
		labels[8].setForeground(SystemColor.windowBorder);
		labels[8].setFont(new Font("Tahoma", Font.PLAIN, 12));
		labels[8].setBounds(10, 392, 92, 20);
		panelRight.add(labels[8]);
		
		textFields[8] = new JTextField();
		textFields[8].setColumns(10);
		textFields[8].setBounds(112, 393, 372, 20);
		panelRight.add(textFields[8]);
		
		labels[9] = new JLabel("Nome da M�e:");
		labels[9].setHorizontalAlignment(SwingConstants.RIGHT);
		labels[9].setForeground(SystemColor.windowBorder);
		labels[9].setFont(new Font("Tahoma", Font.PLAIN, 12));
		labels[9].setBounds(10, 361, 92, 20);
		panelRight.add(labels[9]);
		
		textFields[9] = new JTextField();
		textFields[9].setColumns(10);
		textFields[9].setBounds(112, 361, 372, 20);
		panelRight.add(textFields[9]);
		
		labels[10] = new JLabel("Bairro:");
		labels[10].setHorizontalAlignment(SwingConstants.RIGHT);
		labels[10].setForeground(SystemColor.windowBorder);
		labels[10].setFont(new Font("Tahoma", Font.PLAIN, 12));
		labels[10].setBounds(10, 299, 92, 20);
		panelRight.add(labels[10]);
		
		textFields[10] = new JTextField();
		textFields[10].setColumns(10);
		textFields[10].setBounds(112, 299, 153, 20);
		panelRight.add(textFields[10]);
		
		textFields[11] = new JTextField();
		textFields[11].setColumns(10);
		textFields[11].setBounds(331, 299, 153, 20);
		panelRight.add(textFields[11]);
		
		labels[11] = new JLabel("CEP:");
		labels[11].setHorizontalAlignment(SwingConstants.RIGHT);
		labels[11].setForeground(SystemColor.windowBorder);
		labels[11].setFont(new Font("Tahoma", Font.PLAIN, 12));
		labels[11].setBounds(275, 299, 48, 20);
		panelRight.add(labels[11]);
		
		labels[12] = new JLabel("Rua:");
		labels[12].setHorizontalAlignment(SwingConstants.RIGHT);
		labels[12].setForeground(SystemColor.windowBorder);
		labels[12].setFont(new Font("Tahoma", Font.PLAIN, 12));
		labels[12].setBounds(10, 330, 92, 20);
		panelRight.add(labels[12]);
		
		textFields[12] = new JTextField();
		textFields[12].setColumns(10);
		textFields[12].setBounds(112, 330, 153, 20);
		panelRight.add(textFields[12]);
		
		textFields[13] = new JTextField();
		textFields[13].setColumns(10);
		textFields[13].setBounds(331, 330, 153, 20);
		panelRight.add(textFields[13]);
		
		labels[13] = new JLabel("Numero:");
		labels[13].setHorizontalAlignment(SwingConstants.RIGHT);
		labels[13].setForeground(SystemColor.windowBorder);
		labels[13].setFont(new Font("Tahoma", Font.PLAIN, 12));
		labels[13].setBounds(275, 330, 48, 20);
		panelRight.add(labels[13]);
		
		btnCadReg = new JButton("Cadastrar");
		btnCadReg.setBounds(377, 437, 107, 34);
		btnCadReg.setBackground(Constants.COLOR_FONT_BG_MENU);
		btnCadReg.setForeground(Constants.MENU_COLOR);
		btnCadReg.setBorder(null);
		btnCadReg.setBorderPainted(false);
		panelRight.add(btnCadReg);
		
		JList<Cidadao> list = new JList<>();
		list.setBounds(28, 74, 456, 185);
		list.setFont(Constants.FONT);
		list.setBackground(Constants.COLOR_FONT_BG_MENU);
		list.setVisible(false);
		panelRight.add(list);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setForeground(new Color(65, 66, 147));
		btnAlterar.setBorderPainted(false);
		btnAlterar.setBorder(null);
		btnAlterar.setBackground(new Color(220, 220, 235));
		btnAlterar.setBounds(253, 437, 107, 34);
		btnAlterar.setVisible(false);
		panelRight.add(btnAlterar);
		
		//bot�o cadastra ou registra depedendo em que aba estiver a a��o. Controle pelo boolean
		btnCadReg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (isRegister) {
					//registrar Cidad�o
					// codigo de cadastro
				}else {
					// alterar cadastro
					// code
					
					
					// para capturar o Objeto que foi clicado segue abaixo
					//Cidadao cid = list.getSelectedValue(); 
					
				}
			}
		});
		
		btnAlterar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// para capturar o Objeto que foi clicado segue abaixo
				//Cidadao cid = list.getSelectedValue(); 
				
				//mostrar campos 
				labels[8].setVisible(true);
				labels[9].setVisible(true);
				labels[10].setVisible(true);
				labels[11].setVisible(true);
				labels[12].setVisible(true);
				labels[13].setVisible(true);
				textFields[8].setVisible(true);
				textFields[9].setVisible(true);
				textFields[10].setVisible(true);
				textFields[11].setVisible(true);
				textFields[12].setVisible(true);
				textFields[13].setVisible(true);
				
				/***
				 * update banco
				 */
			}
		});
		
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
				btnCadReg.setText("Salvar");
				btnAlterar.setVisible(true);
				/***
				 * fitListBox descomentar quando tiver puxando banco de dados 
				 */
				//fitListBox(list);
				list.setVisible(true);
				isRegister = false;
				for (JLabel jLabel : labels)
					jLabel.setVisible(false);
				for (JTextField texts : textFields) 
					texts.setVisible(false);	
				
				btnChangeOcorrence.setBackground(Constants.CLICK_COLOR);
				btnAddOcorrence.setBackground(Constants.MENU_COLOR);
				changeOcorrence();
			}
		});
		
		btnAddOcorrence.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnCadReg.setText("Cadastrar");
				btnAlterar.setVisible(false);
				list.setVisible(false);
				for (JLabel jLabel : labels)
					jLabel.setVisible(true);
				for (JTextField texts : textFields) {
					texts.setText("");
					texts.setVisible(true);
				}
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
	
	private void fitListBox(JList<Cidadao> list) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				
				ListModel<Cidadao> dim = new DefaultListModel<>();
				/***
				 * setar aqui as pessoas que aparecer�o. Algo da Controladora
				 */
				//logica abaixo
				/*String linhas[] = {"j�o", "maria", "z�"};
				for (String xLine : linhas) {
					System.out.println(xLine);
					dim.addElement(xLine);
				}
				list.setModel(dim);*/
			}
		}).start();
	}

	public void addOcorrence() {
		isRegister = true;
		
	}
	
	public void changeOcorrence() {
		isRegister = false;
	}	
	
	public void back() {
		
	}
}
