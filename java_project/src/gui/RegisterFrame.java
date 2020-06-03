package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import dao.ManagementDAO;
import dto.ManagementDTO;

public class RegisterFrame extends JFrame {

	private JPanel rPanel;
	private JLabel rLabel;
	private JLabel rId, rPassword, rName, rTel, rEmail;
	private JTextField tId, tPassword, tName, tTel, tEmail;
	private JRadioButton rMan, rWoman;
	private JButton rButton;

	public RegisterFrame() {

		super("ȸ�����");
		super.setResizable(true);
		setSize(350, 400);
		setLocationRelativeTo(null);

		rPanel = new JPanel();
		rPanel.setLayout(new BorderLayout());
		setContentPane(rPanel);

		rLabel = new JLabel("ȸ�����");
		rLabel.setFont(new Font("Serif", Font.BOLD, 40));
		rLabel.setHorizontalAlignment(SwingConstants.CENTER);
		rPanel.add(rLabel, BorderLayout.NORTH);

		JPanel main = new JPanel(new GridLayout(7, 2, 10, 10));
		
		rId = new JLabel("���̵�");
		rId.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(rId);

		tId = new JTextField();
		main.add(tId);

		rPassword = new JLabel("��й�ȣ");
		rPassword.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(rPassword);

		tPassword = new JTextField();
		main.add(tPassword);

		rName = new JLabel("����");
		rName.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(rName);

		tName = new JTextField();
		main.add(tName);

		rTel = new JLabel("��ȭ��ȣ");
		rTel.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(rTel);

		tTel = new JTextField();
		main.add(tTel);

		rEmail = new JLabel("�̸���");
		rEmail.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(rEmail);

		tEmail = new JTextField();
		main.add(tEmail);
		
				
		ButtonGroup bg = new ButtonGroup();

		rMan = new JRadioButton("����");
		rMan.setHorizontalAlignment(SwingConstants.CENTER);
		bg.add(rMan);
		
		main.add(rMan);
		rWoman = new JRadioButton("����");
		rWoman.setHorizontalAlignment(SwingConstants.CENTER);
		bg.add(rWoman);
		main.add(rWoman); 

		rPanel.add(main, BorderLayout.CENTER);
		
		JPanel sMain = new JPanel();
		rPanel.add(sMain, BorderLayout.EAST);

		rButton = new JButton("����ϱ�");
		rButton.setFont(new Font("Serif", Font.BOLD, 20));
		rPanel.add(rButton, BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		rButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ManagementDTO mdto = new ManagementDTO();
				mdto.setId(tId.getText());
				mdto.setPassword(tPassword.getText());
				mdto.setName(tName.getText());
				mdto.setTel(tTel.getText());
				mdto.setEmail(tEmail.getText());
				if(rMan.isSelected())  
					mdto.setGender(rMan.getText());
				else  
					mdto.setGender(rWoman.getText());
				

				ManagementDAO mdao = ManagementDAO.getInstance();
				int result = mdao.insertMember(mdto);

				if (result == 1) {
					JOptionPane.showMessageDialog(null, "ȸ����� �Ϸ�");
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "ȸ������ ����");
					dispose();
				}
			}
		});

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterFrame rf = new RegisterFrame();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
