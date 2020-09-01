
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class Menu extends JPanel implements ActionListener {

	private HashSet<JButton> btnList;
	private HashMap<String, Integer> menu;
	private JPanel btnView;
	private JButton jb;
	private DefaultTableModel tModel;
	private JTable table;

	public void MainView(DefaultTableModel tModel, JTable table) {
		this.tModel = tModel;
		this.table = table;
	}

	public Menu() {

		btnView = new JPanel(new GridLayout(4, 3, 20, 20));
		add(btnView);

		menu = new HashMap<String, Integer>();
		menu.put("����������", 2000);
		menu.put("�Ƹ޸�ī��", 2500);
		menu.put("ī���", 3000);
		menu.put("īǪġ��", 3000);
		menu.put("�ٴҶ��", 3500);
		menu.put("ī��Ḷ���ƶ�", 4000);
		menu.put("����Ƽ", 3300);
		menu.put("�׸�Ƽ", 4000);
		menu.put("�����̵�", 4000);
		menu.put("�ڸ����̵�", 4000);
		menu.put("��Ϻ극��", 5500);
		menu.put("��ī��", 2000);

		Set<String> m = menu.keySet();

		for (String btn : m) {

			buttonFunc(btnView, btn);
		}

	}

	private void buttonFunc(JPanel btnView, String btn) {

		btnList = new HashSet<JButton>();
		jb = new JButton(btn);
		jb.setFont(new Font("����", Font.BOLD, 20));
		jb.setPreferredSize(new Dimension(200, 80));
		jb.addActionListener(this);
		btnList.add(jb);
		btnView.add(jb);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton jb = (JButton) e.getSource();

		Set<Entry<String, Integer>> set = menu.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		System.out.println(it);

		while (it.hasNext()) {
			Map.Entry<String, Integer> e1 = (Map.Entry<String, Integer>) it.next();
			System.out.println(e1);
			int count = 1;
			Object[] data = { e1.getKey(), e1.getValue(),count };
			System.out.println(e1.getKey());
			System.out.println(count);
			System.out.println(e1.getValue());
			tModel = (DefaultTableModel) table.getModel();
			tModel.addRow(data);
		}
	}

}
