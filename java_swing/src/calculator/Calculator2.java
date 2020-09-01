package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class Calculator2 extends JFrame implements ActionListener {
	JTextField T1, T2;
	int j = 0;
	int oldnum, temp, result;
	String tempFun, tempInput = "";
	boolean finish = false;
	JButton Button[] = new JButton[16];

	@Override
	public void actionPerformed(ActionEvent e) {
		String input = e.getActionCommand();

		// �Է� �Ǵ�, ��� ����
		if (input.equals("+")) {
			oldnum = temp;
			tempFun = "+";
			tempInput = "";
			T2.setText("���ϱ�");
		} else if (input.equals("-")) {
			oldnum = temp;
			tempFun = "-";
			tempInput = "";
			T2.setText("����");
		} else if (input.equals("X")) {
			oldnum = temp;
			tempFun = "X";
			tempInput = "";
			T2.setText("���ϱ�");
		} else if (input.equals("/")) {
			oldnum = temp;
			tempFun = "/";
			tempInput = "";
			T2.setText("������");
		} else if (input.equals("C")) {
			oldnum = temp;
			tempInput = "";
			temp = 0;
			oldnum = 0;
			T1.setText("");
			T2.setText("�ʱ�ȭ");
		} else if (input.equals("=")) {
			if (tempFun.equals("+")) {
				result = oldnum + temp;
				T1.setText(String.valueOf(result));
				finish = true;
			} else if(tempFun.equals("-")) {
				result = oldnum - temp;
				T1.setText(String.valueOf(result));
				finish = true;
			} else if(tempFun.equals("X")) {
				result = oldnum * temp;
				T1.setText(String.valueOf(result));
				finish = true;
			} else if(tempFun.equals("/")) {
				result = oldnum / temp;
				T1.setText(String.valueOf(result));
				finish = true;
			} 
		} else {
			if(finish) {
				T1.setText("0");
				finish = false;
				temp = 0;
				oldnum = 0;
				tempInput = "";
			}
			tempInput += e.getActionCommand();
			System.out.println(tempInput);
			T1.setText(tempInput);
			temp = Integer.parseInt(tempInput);
		}
	}
	
	public Calculator2() {
		//������, UI ��� ����
		super("����");
		super.setResizable(true);
		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(272, 426);
		T1 = new JTextField("", 15);
		T2 = new JTextField("", 5);
		T2.setEnabled(false);
		JPanel P1 = new JPanel();
		JPanel P2 = new JPanel();
		P1.add(T1);
		P1.add(T2);
		P2.setLayout(new GridLayout(4,4,10,10));
		String btnValue[] = {"1","2","3","X","5","6","/","7","8","9","+","C","0","=","-"};
		
		//��ư�� �� ����
		for(int i = 0; i <= 15; i++) {
			Button[i] = new JButton(btnValue[i]);
			P2.add(Button[i]);
			Button[i].addActionListener(this);
			Button[i].setBackground(new Color(175,175,175));
			Button[i].setFont(new Font("����", Font.BOLD, 18));
			Button[i].setForeground(Color.WHITE);
			if(i == 3 || i == 7 || i == 11 || i == 15) {
				Button[i].setBackground(new Color(153,0,255));
				Button[i].setFont(new Font("����", Font.BOLD, 18));
				Button[i].setForeground(Color.WHITE);
			} else if(i == 12 || i == 14) {
				Button[i].setBackground(new Color(255,166,0));
				Button[i].setFont(new Font("����", Font.BOLD, 18));
				Button[i].setForeground(Color.DARK_GRAY);
			}
		}
		
		getContentPane().add(P1, BorderLayout.NORTH);
		getContentPane().add(P2, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//������ ȣ��
		new Calculator2();
	}
}