package gui;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import dao.ManagementDAO;

public class LoginFrame extends JFrame {

	private JPanel lPanel;
	private JLabel lLogin, lId, lPassword;
	private JTextField tId;
	private JPasswordField tPassword;
	private JButton login, register, exit;
	


	public LoginFrame() {
		
		super("�α���");
		super.setResizable(true);
		setSize(350, 400);
		setLocationRelativeTo(null);

		lPanel = new JPanel();
		lPanel.setLayout(new BorderLayout());
		setContentPane(lPanel); 

		lLogin = new JLabel("�α���");
		lLogin.setFont(new Font("Serif", Font.BOLD, 50));
		lLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lLogin.setPreferredSize(new Dimension(120, 120));
		lPanel.add(lLogin, BorderLayout.NORTH);

		JPanel Main = new JPanel(new GridLayout(2, 2, 15, 15));

		lId = new JLabel("���̵�");
		lId.setFont(new Font("Serif", Font.BOLD, 15));
		lId.setHorizontalAlignment(SwingConstants.CENTER);
		Main.add(lId);

		tId = new JTextField();
		tId.setColumns(10);
		Main.add(tId);

		lPassword = new JLabel("��й�ȣ");
		lPassword.setFont(new Font("Serif", Font.BOLD, 15));
		lPassword.setHorizontalAlignment(SwingConstants.CENTER);
		Main.add(lPassword);

		tPassword = new JPasswordField();
		tPassword.setColumns(10);
		Main.add(tPassword);

		lPanel.add(Main, BorderLayout.WEST);

		JPanel btnMain = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 60));

		login = new JButton("�α���");
		btnMain.add(login);
		register = new JButton("ȸ�����");
		btnMain.add(register);
		exit = new JButton("�ݱ�");
		btnMain.add(exit);
		lPanel.add(btnMain, BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String id = tId.getText();
				String password = tPassword.getText();
 
				ManagementDAO mdao = ManagementDAO.getInstance();

				int result = mdao.idPassword(id, password);
				if (result == 1) {
					JOptionPane.showMessageDialog(null, "�α��� �Ϸ�");
					ListFrame lf = new ListFrame();
					dispose();

				} else {
					JOptionPane.showMessageDialog(null, "�α��� ����");
				}

			}
		});

		register.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RegisterFrame rf = new RegisterFrame();

			}
		});

		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				dispose();

			}
		});
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame lif = new LoginFrame();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
