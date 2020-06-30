package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.ManagementDAO;
import dto.ManagementDTO;

public class ListFrame extends JFrame {

	private JPanel panel;
	private JTable table;
	private JLabel lilabel;
	private JButton logout;
	private DefaultTableModel tModel;

	public ListFrame() {
		super("List");
		super.setResizable(true);
		setSize(1300, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel(new BorderLayout());
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);

		lilabel = new JLabel("ȸ�� ����Ʈ");
		lilabel.setFont(new Font("Serif", Font.BOLD, 50));
		lilabel.setHorizontalAlignment(SwingConstants.CENTER);
		lilabel.setPreferredSize(new Dimension(400, 80));
		panel.add(lilabel, BorderLayout.NORTH);

		ManagementDAO mdao = ManagementDAO.getInstance();
		List<ManagementDTO> list = mdao.managementList();

		String[] member = { "��ȣ", "���̵�", "��й�ȣ", "����", "����", "��ȭ��ȣ", "�̸���", "������" };

		tModel = new DefaultTableModel(member, 0);
		
		for (int i = 0; i < list.size(); i++) {

			int seq = list.get(i).getSeq();
			String id1 = list.get(i).getId();
			String password = list.get(i).getPassword();
			String name = list.get(i).getName();
			String gender = list.get(i).getGender();
			String tel = list.get(i).getTel();
			String email = list.get(i).getEmail();
			Date createDate = list.get(i).getCreateDate();
 
			Object[] data = { seq, id1, password, name, gender, tel, email, createDate };

			tModel.addRow(data);

		}

		table = new JTable(tModel);
		table.setFont(new Font("����", Font.PLAIN, 20));
		table.setRowHeight(30);

		JScrollPane scrollPane = new JScrollPane(table);
		panel.add(scrollPane, BorderLayout.CENTER);

		logout = new JButton("�α׾ƿ�");
		panel.add(logout, BorderLayout.SOUTH);

		logout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�α׾ƿ� �Ǿ����ϴ�.");
				dispose();
				new LoginFrame();
			}
		});

		setVisible(true);

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListFrame lf = new ListFrame();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
