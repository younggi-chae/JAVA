package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener, KeyListener {

	private ArrayList<JButton> btnList;
	private JLabel label;
	private JPanel panel;

	double num1, num2;
	String func = "";
	String nInput = "";
	double result;
	boolean state = false;

	Calculator() {

		view();

	}

	public JComponent getView() {  // ���۳�Ʈ base
		return panel;              // ���� �г� ��ȯ
	}

	public void view() {

		panel = new JPanel(new BorderLayout());  // ���� ���
		btnList = new ArrayList<JButton>();

		JPanel view = new JPanel(new BorderLayout());  // ���� �� ���â ����
		
		panel.add(view, BorderLayout.CENTER);
		label = new JLabel("0");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Serif", Font.BOLD, 50));
		
		view.setBackground(Color.WHITE); 
		view.add(label);

		JPanel btnView = new JPanel(new GridLayout(5, 4, 2, 2)); //��ư ����
		panel.add(btnView, BorderLayout.SOUTH);
		String[] buttons = { "��", "C", "%", "x��", "7", "8", "9", "��", "4", "5", "6", "��", "1", "2", "3", "-", ".", "0",
				"=", "+" };
		
		for (String btn : buttons) {
			buttonFunc(btnView, btn);
			
		}

	}

	private void buttonFunc(JComponent cp, String btn) {
		JButton jb = new JButton(btn);
		
		jb.setFont(new Font("Serif", Font.BOLD, 20));
		jb.addActionListener(this); //��ư �̺�Ʈ �߰�
		jb.addKeyListener(this);    //key �̺�Ʈ �߰�
		btnList.add(jb);            //����Ʈ�� ����
		cp.add(jb);                 //base�� ����
		
		if (btn == "��" || btn == "C" || btn == "=") // ��ɺ� �� ����
			jb.setForeground(Color.RED);
		if (btn == "%" || btn == "x��" || btn == "��" || btn == "��" || btn == "-" || btn == "+")
			jb.setForeground(Color.BLUE);

	}

	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyReleased(KeyEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent ke) {

		switch (ke.getKeyCode()) {
		case KeyEvent.VK_0:              //���� Ű �ڵ�
		case KeyEvent.VK_NUMPAD0:
			btnList.get(17).doClick();   // ����Ʈ index ��ȣ�� ������
			break;

		case KeyEvent.VK_NUMPAD1:
		case KeyEvent.VK_1:
			btnList.get(12).doClick();
			break;

		case KeyEvent.VK_2:
		case KeyEvent.VK_NUMPAD2:
			btnList.get(13).doClick();
			break;

		case KeyEvent.VK_3:
		case KeyEvent.VK_NUMPAD3:
			btnList.get(14).doClick();
			break;
		
		case KeyEvent.VK_4:
		case KeyEvent.VK_NUMPAD4:
			btnList.get(8).doClick();
			break;
		
		case KeyEvent.VK_5:
		case KeyEvent.VK_NUMPAD5:
			btnList.get(9).doClick();
			break;
		
		case KeyEvent.VK_6:
		case KeyEvent.VK_NUMPAD6:
			btnList.get(10).doClick();
			break;
	
		case KeyEvent.VK_7:
		case KeyEvent.VK_NUMPAD7:
			btnList.get(4).doClick();
			break;
		
		case KeyEvent.VK_8:
		case KeyEvent.VK_NUMPAD8:
			btnList.get(5).doClick();
			break;
	
		case KeyEvent.VK_9:
		case KeyEvent.VK_NUMPAD9:
			btnList.get(6).doClick();
			break;
			
		case KeyEvent.VK_PERIOD :
		case KeyEvent.VK_DECIMAL : 
			btnList.get(16).doClick();
			break;
			
		case KeyEvent.VK_ENTER : 
			btnList.get(18).doClick();
		break;
		
		case KeyEvent.VK_MINUS :
		case KeyEvent.VK_SUBTRACT : 
			btnList.get(15).doClick();
		break;
		
		case KeyEvent.VK_ESCAPE : 
			btnList.get(1).doClick();
		break;
		
		case KeyEvent.VK_ADD : 
			btnList.get(19).doClick();
		break;
		
		case KeyEvent.VK_MULTIPLY : 
			btnList.get(11).doClick();
		break;
		
		case KeyEvent.VK_DIVIDE :
		case KeyEvent.VK_SLASH : 
			btnList.get(7).doClick();
		break;
		
		case KeyEvent.VK_BACK_SPACE : 
			btnList.get(0).doClick();
		break;
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String input = e.getActionCommand(); // �̺�Ʈ�� �߻���Ų ��ü�� ���ڿ��� �����ͼ� input�� ����

		if (input.equals("+")) {
			num1 = num2;
			func = "+";
			nInput = ""; // �������� ���� ������ ����

		} else if (input.equals("-")) {
			num1 = num2;
			func = "-";
			nInput = "";

		} else if (input.equals("��")) {
			num1 = num2;
			func = "��";
			nInput = "";

		} else if (input.equals("��")) {
			num1 = num2;
			func = "��";
			nInput = "";

		} else if (input.equals("%")) {
			num1 = num2;
			func = "%";
			nInput = "";
			result = num1 / 100;
			label.setText(String.valueOf(result)); // ������� ���ڿ��� ��ȯ�Ͽ� ���â�� ���
		}

		else if (input.equals("x��")) {
			num1 = num2;
			func = "x��";
			nInput = "";
			result = num1 * num1;
			label.setText(String.valueOf(result));
			state = true;

		} else if (input.equals("C")) { // Clear
			nInput = "";
			num2 = 0;
			num1 = 0;
			label.setText("0");

			// substring(start, end) - start���� end ������ ���ڿ� �ڸ���
		} else if (input.equals("��")) { // ���ʺ��� ���������� ���������� ��
			setBackSpace(getBackSpace().substring(0, getBackSpace().length() - 1));

			if (getBackSpace().length() < 1) { // �� �̻� ���� ���ڰ� ������, 0���� clear
				nInput = "";
				num2 = 0;
				num1 = 0;
				label.setText("0");
			}

		} else if (input.equals("=")) {
			if (func.equals("+")) {
				result = num1 + num2;
				label.setText(String.valueOf(result)); // ������� ���ڿ��� ��ȯ�Ͽ� ���â�� ���
				state = true; // ��� ���� ���� �� ���� �Է��� ������ �� ȭ�鿡 ǥ�õ� ��� ���� �����.

			} else if (func.equals("-")) {
				result = num1 - num2;
				label.setText(String.valueOf(result));
				state = true;

			} else if (func.equals("��")) {
				result = num1 * num2;
				label.setText(String.valueOf(result));
				state = true;

			} else if (func.equals("��")) {
				result = num1 / num2;
				label.setText(String.valueOf(result));
				state = true;

			}

		} else {
			if (state) {
				label.setText("0");
				state = false;
				num1 = 0;
				num2 = 0;
				nInput = "";
			}

			nInput += e.getActionCommand();
			label.setText(nInput);
			num2 = (int) Double.parseDouble(nInput); // ���ڿ����� double�� ��

		}

	}

	private void setBackSpace(String bs) {
		label.setText(bs);
	}

	private String getBackSpace() {
		return label.getText();
	}

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		JFrame frame = new JFrame("����");

		frame.setResizable(true);  // ������ ũ�� ����� ����
		frame.setContentPane(calc.getView()); // �����ӿ� ������Ʈ ����
		frame.setBounds(100, 100, 300, 350); // �������� ũ�� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X��ư�� ������ ������ ����
		frame.setVisible(true);

	}

}
