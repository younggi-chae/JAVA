package drawing_ex;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

/*************************************************
 * JFrame Ŭ���� ����
 *********************************************************/

//JFrame ���
public class PainterFrame extends JFrame {

	// �޴��� ����
	JMenuBar menubar;

	// ���ϸ޴�, �Ӽ��޴�, ����޴� ����
	JMenu mFile, mElement, mHelp;

	// ������, ���⼱��, ���弱��, ��ٿ�����, �����⼱�� �޴������ۼ���
	JMenuItem mNew, mOpen, mSave, mExit, mAbout;

	JMenuItem mPen, mLine, mRect, mOval;

	// �Ӽ���ư�׷�, ��۹�ư�׷� ��ư�׷� ����
	ButtonGroup elementGroup;

	ButtonGroup topGroup;

	// �������, �������� ����
	JToolBar topToolbar, leftToolbar;

	// ����ư, �����ư, �����ư, �������ư ����
	JButton tNew, tOpen, tSave, tExit;

	// �� ��۹�ư, �� ��۹�ư, �簢�� ��۹�ư, Ÿ���� ��۹�ư ����
	JToggleButton tPen, tLine, tRect, tOval;

	// �����̴� ���� : ���� ��Ʋ��°�
	JSlider slider;

	// ������ ��ư - ����, �Ķ�, �ʷ� ��ư ����
	JButton tRed, tBlue, tGreen;

	// �ϴܿ��� ������ MyCanvas Ŭ���� ��ü���� ����
	MyCanvas canvas;

	// �� ���� �����ϴ� �迭
	Color[] colors = { Color.RED, Color.BLUE, Color.BLACK, Color.WHITE };// �迭

	// �� ��ư �迭
	JButton[] tColors;

	// ���� ���õǾ��ִ� ���� ǥ���ϴ� ��
	JButton colorSelect;

	JCheckBox fillSelect; // ������ �׸� �� ���� ä���� �׸��� ��� or �׵θ��� �׸��� ���

	// �Ӽ��� �����Ҽ� �ִ� ��� ���� -> ������� ������ �Է¹����� ����
	final static int PEN = 1, LINE = 2, RECT = 3, OVAL = 4;

	/**********************************************************
	 * ���� ���� ��
	 ********************************************************/

	/****************************************************
	 * PainterFrame ������ ����
	 ****************************************************/

	// UI

	public PainterFrame() {

		// public JFrame(String title)
		// Creates a new, initially invisible Frame with the specified title.
		// JFrame�� ��ӹ޾����Ƿ� �����ڿ��� super�� ������Ѵ�.
		// �̰�쿡���� JFrame�� public JFrame(String title)�����ڸ� ����Ѵ�
		// �Ѱ��� String�� Ÿ��Ʋ�� �ȴ�

		super("My Painter v1.0");// ����

		// --------------------------------MenuBar-----------------------------------

		// �����صξ��� �޴��� ������ �� �޴��� ��ü ���� �� ����
		menubar = new JMenuBar();

		// �����صξ��� �޴� ������ �� �޴���ü ���� �� ����
		mFile = new JMenu("File");
		mElement = new JMenu("Element");
		mHelp = new JMenu("Help");

		// ����Ű����
		mFile.setMnemonic('F');
		mElement.setMnemonic('E');
		mHelp.setMnemonic('H');

		// �޴��� ��ü�� �޴���ü ž��
		// ���⿡�� add�� ������� ž�簡 �ȴ�
		menubar.add(mFile);
		menubar.add(mElement);
		menubar.add(mHelp);

		// �޴������� ��ü ���� �� ����
		mNew = new JMenuItem("New", new ImageIcon("images/new.gif"));
		mOpen = new JMenuItem("Open", new ImageIcon("images/Open.gif"));
		mSave = new JMenuItem("Save", new ImageIcon("images/Save.gif"));
		mExit = new JMenuItem("Exit", new ImageIcon("images/Exit.gif"));
		mAbout = new JMenuItem("About");

		// ����Ű ����
		// �޴� �����ۿ� ����Ű ����
		// setAccelerator(keyStroke)���
		// public static KeyStroke getKeyStroke(Character keyChar,int modifiers) ����Ű ���ڿ�
		// ��Է°� �Բ��Ұ����� modifier����
		// ���⿡�� modifier�� Ctrl + ����
		mNew.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_MASK));
		mOpen.setAccelerator(KeyStroke.getKeyStroke('O', InputEvent.CTRL_MASK));
		mSave.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.CTRL_MASK));
		mExit.setAccelerator(KeyStroke.getKeyStroke('E', InputEvent.CTRL_MASK));

		// ��ư�׷� ��ü ���� �� ����
		elementGroup = new ButtonGroup();// �Ѱ��� üũ�ǵ���

		// �ϳ��� �����ϱ�
		mPen = new JCheckBoxMenuItem("Pen", true);
		mLine = new JCheckBoxMenuItem("Line");
		mRect = new JCheckBoxMenuItem("Rect");
		mOval = new JCheckBoxMenuItem("Oval");

		// ��ư�׷찴ü�� üũ�ڽ��޴������� ��ü�� ž��
		elementGroup.add(mPen);
		elementGroup.add(mLine);
		elementGroup.add(mRect);
		elementGroup.add(mOval);

		// JMenu��ü�� JMenuItem��ü ž��
		// mFile �޴��� ���ϰ��� ���� ž��
		mFile.add(mNew);
		mFile.addSeparator();
		mFile.add(mOpen);
		mFile.addSeparator();
		mFile.add(mSave);
		mFile.addSeparator(); // ���м�
		mFile.add(mExit);

		// JMenu��ü�� JMenuItem��ü ž��
		// mElement�޴��� �׸��� �Ӽ����� üũ�ڽ������� ž��
		mElement.add(mPen);
		mElement.add(mLine);
		mElement.add(mRect);
		mElement.add(mOval);

		// JMenu��ü�� JMenuItem��ü ž��
		// mHelp�޴��� About ���� ž��
		mHelp.add(mAbout);

		// �� �޴������ۿ� �ϴܿ��� ������ EventHandler Ŭ���� ��ü ���� ���� �� ActionListener�� ����
		mNew.addActionListener(new EventHandler());
		mOpen.addActionListener(new EventHandler());
		mSave.addActionListener(new EventHandler());
		mExit.addActionListener(new EventHandler());
		mAbout.addActionListener(new EventHandler());

		// �� üũ�ڽ��޴������ۿ� �ϴܿ��� ������ EventHandlerŬ���� ��ü ���� �� ActionListener�� ����
		mPen.addActionListener(new EventHandler());
		mLine.addActionListener(new EventHandler());
		mRect.addActionListener(new EventHandler());
		mOval.addActionListener(new EventHandler());

		// ----------------------------------------------ToolBar----------------------------------------------

		topToolbar = new JToolBar();
		topToolbar.setFloatable(false);

		// ���ٹ�ư ������ ��ư��ü ���� �� ����
		tNew = new JButton(new ImageIcon("images/new.gif"));
		tOpen = new JButton(new ImageIcon("images/Open.gif"));
		tSave = new JButton(new ImageIcon("images/Save.gif"));
		tExit = new JButton(new ImageIcon("images/Exit.gif"));

		// ���� ��� ��ư ��ü ���� �� ����
		tPen = new JToggleButton("Pen", true);
		tLine = new JToggleButton("Line");
		tRect = new JToggleButton("Rect");
		tOval = new JToggleButton("Oval");

		topGroup = new ButtonGroup();
		topGroup.add(tPen);
		topGroup.add(tLine);
		topGroup.add(tRect);
		topGroup.add(tOval);

		// �����̴� ��ü ���� �� ����
		// new JSlider(�ּڰ�, �ִ�, �ʱⰪ)
		slider = new JSlider(0, 100, 20);
		slider.setMajorTickSpacing(10); // �����̴��� ũ�� ������ ǥ��
		slider.setMinorTickSpacing(1);// �����̴��� �۰� ������ ǥ��
		slider.setPaintTicks(true);// �߰� ����ǥ�� ���� ǥ���Ұ��� ����
		slider.setPaintTrack(true);
		slider.setPaintLabels(true);// label : (���� � ���ǿ� ���� ������ ���� �ٿ� ����) ǥ[��/��ǥ]

		topToolbar.add(tNew);
		topToolbar.addSeparator();
		topToolbar.add(tOpen);
		topToolbar.addSeparator();
		topToolbar.add(tSave);
		topToolbar.addSeparator();
		topToolbar.add(tExit);

		topToolbar.addSeparator();

		topToolbar.add(tPen);
		topToolbar.addSeparator();
		topToolbar.add(tLine);
		topToolbar.addSeparator();
		topToolbar.add(tRect);
		topToolbar.addSeparator();
		topToolbar.add(tOval);

		topToolbar.add(slider);

		// ���� ���ϰ��� ��ư�� ActionListener ���� <- �ϴܿ� ������ EventHandler �Ѱ���
		tNew.addActionListener(new EventHandler());
		tOpen.addActionListener(new EventHandler());
		tSave.addActionListener(new EventHandler());
		tExit.addActionListener(new EventHandler());

		// �� ���� ��۹�ư�� ActionListener ����
		tPen.addActionListener(new EventHandler());
		tLine.addActionListener(new EventHandler());
		tRect.addActionListener(new EventHandler());
		tOval.addActionListener(new EventHandler());

		// ����
		// ���� ���� ��ü ���� �� ����
		// �Ӽ��� �������� �ѱ�
		leftToolbar = new JToolBar(JToolBar.VERTICAL);

		/*
		 * tRed = new JButton("  "); tRed.setBackground(Color.RED);
		 * 
		 * tGreen = new JButton("  "); tGreen.setBackground(Color.GREEN);
		 * 
		 * tBlue = new JButton("  "); tBlue.setBackground(Color.BLUE);
		 * 
		 * leftToolbar.add(tRed); leftToolbar.add(tGreen); leftToolbar.add(tBlue);
		 */

		// �迭 ��ü�� ����

		// ��ư�迭 ���� 4¥���� ��ü ���� �� ����
		tColors = new JButton[4];
		colorSelect = new JButton("       ");
		fillSelect = new JCheckBox("Fill"); // ä���� �׸��� �����ϴ� üũ�ڽ� ��ü ���� �� ����
		fillSelect.addActionListener(new EventHandler()); // ActionListener ����

		// ������ tColors�� ��ư�迭 ���� 4¥���� ��ü ���� �� �����ѵ��� ��ư��ü ���� �� ž��
		for (int i = 0; i < colors.length; i++) {

			tColors[i] = new JButton("       "); // ��ư ��ü ���� �� ����

			tColors[i].setBackground(colors[i]); // ���� ����

			tColors[i].addActionListener(new EventHandler()); // ActionListener ����

			leftToolbar.add(tColors[i]); // �̷��� ������� ��ư��ü�� �������ٿ� ž��

		}

		// � ���� Ŭ���ߴ��� �ٲ��

		leftToolbar.addSeparator(); // ���� ���ٿ� tColors��ư ���� ������ ���м� ����ֱ�

		leftToolbar.add(colorSelect); // ���� ���ٿ� ž��
		leftToolbar.add(fillSelect); // ���� ���ٿ� ž��

		// ----------------------------------------Canvas Settings!
		// -------------------------------------------

		canvas = new MyCanvas();

		// PainterFrame��ü�� ž��
		// ��ġ�� �߾�
		this.add(BorderLayout.CENTER, canvas);

		// --------------------------------Frame
		// Settings--------------------------------

		// ������ �������� ž��
		this.add(BorderLayout.WEST, leftToolbar);

		// ��ܿ� ������� ž��
		this.add(BorderLayout.NORTH, topToolbar);

		this.setJMenuBar(menubar); // �޴��� ž�� -> �ڵ����� �ֻ�ܿ� ��ġ�Ǵµ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X��ư ������ ���ﶧ �ൿ�Ұ� ���� -> ������ ����
		this.setSize(800, 800);
		this.setVisible(true);

	}

	/*************************************************
	 * MyCanvas Ŭ���� ����
	 ******************************************************/

	// ��ȭ�� Ŭ����
	// MyCanvas�� Ŭ���� �ȿ� ���ǵ� Ŭ���� : InnerŬ���� �̴�
	// Canvas�� ����ϰ� MouseListener(���콺Ŭ�� �ν��ϴ� ������), MouseMotionListener(���콺 ������ �ν��ϴ�
	// ������) �������̽�ȭ
	// �� : CanvasŬ������ ����� �˴� ����� �� �ְ�
	// MouseListener�� MouseMotionListener�� ����� ����������� �������ؼ� �����ִ�
	// ��Ӱ� �������̽� ������ ���� �ѵ� -> Ŭ������ ����ǥ�ö���� Ȱ���� "Add unimplemented methods"�� Ŭ���ϸ�
	// �������̽����� ������ �� �� �ִ� �޼ҵ���� �ڵ����� �ڵ��ȴ�
	// ���� ����ϰ� ������ɸ� ������ �ϸ�ȴ�. �ʿ������ �׳� �θ�ȴ�.

	class MyCanvas extends Canvas implements MouseListener, MouseMotionListener {

		// sX,sY = ���콺 �巡�� �����ϴ� ��ǥ�� (x,y)
		// eX,eY = ���콺 �巡�� ������ ��ǥ�� (x,y)
		int sX, sY, eX, eY; // Point start, end;

		private Color selectedColor; // ���õ� �� ������ ����
		private int selectShape = PEN; // ���õ� ��� ������ ����
		private int selectThick;
		private boolean selectFill; // ���õ� ä�� ���θ� ������ ����

		public void setSelectedColor(Color selectedColor) { // �� ����
			this.selectedColor = selectedColor;

		}

		public void setSelectedShape(int selectedShape) { // ��� ����
			this.selectShape = selectedShape;

		}

		public void setSelectedThick(int selectedThick) { // ���� ����
			this.selectThick = selectedThick;

		}

		public void setSelectedFill(boolean selectedFill) { // ä�� ���� ����
			this.selectFill = selectedFill;

		}

		// ��ȭ�� ��ü ������
		public MyCanvas() {

			this.setBackground(Color.WHITE);// ���� �Ͼ�����
			// MouseListener�� MouseMotionListener�� �����ؾ��Ѵ�.
			// MyCanvas��ü �ڽ��� �������̽�ȭ �ؼ� �ش� ����� ����� �� �ֱ⶧���� �ڱ� �ڽ��� �Ѱ��ش�
			this.addMouseListener(this);
			this.addMouseMotionListener(this);

		}

		// �׸� �׸��� ����
		// paint�� �ڵ�ȣ���̶� ����ڰ� ���ǵ帲
		public void paint(Graphics g) { // �� ���� Graphics �� ������ �׸� �� �ִ� �޼ҵ尡
			// �����θ� �׷���
			// g.drawLine(sX, sY, eX, eY);

			// �Ѱܹ��� Graphics��ü�� �� ���� <- ���� ���õ� �� ���� �̿�
			g.setColor(selectedColor);
			// g.fillRect(sX, sY, eX - sX, eY - sY);

			if (selectShape == PainterFrame.PEN) {
				g.drawLine(sX, sY, eX, eY);
			} else if (selectShape == PainterFrame.LINE) {
				g.drawLine(sX, sY, eX, eY);
			} else if (selectShape == PainterFrame.RECT) {

				if (selectFill == true) {
					g.fillRect(sX, sY, eX - sX, eY - sY);

				}

				else {
					g.drawRect(sX, sY, eX - sX, eY - sY);

				}

			}

			else if (selectShape == PainterFrame.OVAL) {
				g.drawOval(sX, sY, eX - sX, eY - sY);

				if (selectFill == true) {

					g.fillOval(sX, sY, eX - sX, eY - sY);
				}

				else {
					g.drawOval(sX, sY, eX - sX, eY - sY);
				}
			}

		}

		// repaint�޼ҵ� ȣ��� �ڵ�ȣ��
		public void update(Graphics g) {
			paint(g);

		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {// Ŭ��������
			// TODO Auto-generated method stub
			sX = e.getX();
			sY = e.getY();
		}

		@Override
		public void mouseReleased(MouseEvent e) {// ������
			// TODO Auto-generated method stub
			eX = e.getX();
			eY = e.getY();

			repaint();
		}

	}

	/*****************************************************
	 * MyCanvas Ŭ���� ��
	 ********************************************************/

	/****************************************************
	 * EventHandler Ŭ���� ����
	 ****************************************************/

	// MenuBar, ToolBar
	// �굵 InnerŬ����
	// �̺�Ʈ�����ܼ� �Է¹޾����� ó���ϴ� Ŭ����
	// ActionListener�� �������̽�ȭ
	// �굵 Add unimplemented methods
	class EventHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) { // �׼��� ���������� �Ź� ȣ��

			Object eObj = e.getSource(); // �ҽ� ����

			for (int i = 0; i < colors.length; i++) {
				if (eObj.equals(tColors[i])) {
					canvas.setSelectedColor(colors[i]); // MyCanvasŬ�������� ������ setColor�޼ҵ� ȣ���ؼ� selectedColor ����
					colorSelect.setBackground(colors[i]); // ���� ���õ� �� ǥ���ϴ� ��ư�� ���� ����
				}
			}

			if (eObj.equals(mNew) || eObj.equals(tNew)) { // ������ �� ��ư�̸�

			}

			else if (eObj.equals(mOpen) || eObj.equals(tOpen)) { // ������ ���� ��ư

				JFileChooser openDialog = new JFileChooser(",");
				int result = openDialog.showOpenDialog(PainterFrame.this);

				if (result == JFileChooser.APPROVE_OPTION) {

				}

				else if (result == JFileChooser.CANCEL_OPTION) {

				}

				else {

				}

			}

			else if (eObj.equals(mSave) || eObj.equals(tSave)) { // ������ ���� ��ư

				JFileChooser openDialog = new JFileChooser(",");
				int result = openDialog.showSaveDialog(PainterFrame.this);

				if (result == JFileChooser.APPROVE_OPTION) {

				}

				else if (result == JFileChooser.CANCEL_OPTION) {

				}

				else {

				}

			}

			else if (eObj.equals(mExit) || eObj.equals(tExit)) { // ������ ������ ��ư
				System.exit(0); // ����
			}

			else if (eObj.equals(mAbout)) {
				final JDialog about = new JDialog(PainterFrame.this, "About", true);

				JButton b = new JButton("Close", new ImageIcon("images/image.jpg"));

				about.add(b);
				b.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						about.dispose();
					}
				});

				about.setSize(200, 300);
				about.setVisible(true);

			} else if (eObj.equals(mPen) || eObj.equals(tPen)) {
				mPen.setSelected(true);
				tPen.setSelected(true);

				canvas.setSelectedShape(PainterFrame.PEN);

			}

			else if (eObj.equals(mLine) || eObj.equals(tLine)) {
				mLine.setSelected(true);
				tLine.setSelected(true);

				canvas.setSelectedShape(PainterFrame.LINE);
			}

			else if (eObj.equals(mRect) || eObj.equals(tRect)) {
				mRect.setSelected(true);
				tRect.setSelected(true);

				canvas.setSelectedShape(PainterFrame.RECT);

			}

			else if (eObj.equals(mOval) || eObj.equals(tOval)) {
				mOval.setSelected(true);
				tOval.setSelected(true);

				canvas.setSelectedShape(PainterFrame.OVAL);

			}

			else if (eObj.equals(fillSelect)) {

				canvas.setSelectedFill(fillSelect.isSelected());
			}

		}

	}

	public static void main(String[] args) {
		new PainterFrame();

	}

}
