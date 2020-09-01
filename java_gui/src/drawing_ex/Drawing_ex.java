package drawing_ex;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
 
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class Drawing_ex extends JFrame {
    
    JPanel gui_panel, paint_panel; 
    // �� �׸��� �������� GUI���� �г�, �׷����� �гη� ����
    
    JButton pencil_bt, eraser_bt; // ����,���찳 ������ �����ϴ� ��ư
    JButton colorSelect_bt; // ������ ��ư
    
    JLabel thicknessInfo_label; // �������� ��
    
    JTextField thicknessControl_tf; // �������Ⱑ ������ �ؽ�Ʈ�ʵ�
     
    Color selectedColor; 
    // �� ������ �÷��� ����Ǿ� ���Ŀ� ������� �����ִ� ������ �Ű������� ���ȴ�.
    
    Graphics graphics; // Graphics2D Ŭ������ ����� ���� ����
    Graphics2D g;
    // Graphics2D�� ���� ���� ���� graphics�� ���������̶�� �����ϽÐ� �˴ϴ�.
    
    int thickness = 5; // �� ������ �׷����� ���� ���⸦ �����Ҷ� ���氪�� ����Ǵ� ����
    int startX; // ���콺Ŭ�������� X��ǥ���� ����� ����
    int startY; // ���콺Ŭ�������� Y��ǥ���� ����� ����
    int endX; // ���콺Ŭ�������� X��ǥ���� ����� ����
    int endY; // ���콺Ŭ�������� Y��ǥ���� ����� ����
    
    boolean tf = false; 
    /* �� boolean ������ ó���� ���ʷ� �׸��� ���찳�� ������� �ٽ� ���ʷ� �׸���
     * �⺻���� ���������� ���н�Ű�� ���� ���α׷� ���۽� �������� �� ���õ� ����
     * ���찳�� ����� �ٽ� ���ʷ� �׸��� �̸� ������ �������� �����ϴ� �����ε�..
     * �� �׸� �߿��� ������ �ƴϴ�..
     */
    
    public Drawing_ex() { // PaintŬ������ ����Ʈ(Default)�����ڷ� �⺻���� GUI������ ���ִ� ������ �Ѵ�.
        setLayout(null); // �⺻ �������� ���̾ƿ��� �ʱ�ȭ ���� �г��� �����ڰ� ���� �ٷ�� �ְ� ��
        setTitle("�׸���"); // ������ Ÿ��Ʋ ����
        setSize(900,750); // ������ ������ ����
        setLocationRelativeTo(null); // ���α׷� ����� ȭ�� �߾ӿ� ���
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        // ������ ������ܿ� X��ư�� ���������� ��� ����
        
        gui_panel = new JPanel(); // ������ ��ܿ� ��ư, �ؽ�Ʈ�ʵ�, �󺧵��� UI�� �� �г�
        gui_panel.setBackground(Color.GRAY); // �г��� ������ ȸ������ ����
        gui_panel.setLayout(null); 
        // gui_panel�� ���̾ƿ��� null�����Ͽ� ������Ʈ���� ��ġ�� ���� �������ټ� �ִ�.
        
        pencil_bt = new JButton("����"); // ���� ��ư ����
        pencil_bt.setFont(new Font("���ʷյ���", Font.BOLD, 25)); // ��ư ��Ʈ�� �۾� ũ�� ����
        pencil_bt.setBackground(Color.LIGHT_GRAY); // ���ʹ�ư ���� ����ȸ������ ����
        eraser_bt = new JButton("���찳"); // ���찳 ��ư ����
        eraser_bt.setFont(new Font("���ʷյ���", Font.BOLD, 25)); // ��ư ��Ʈ�� �۾� ũ��  ����
        eraser_bt.setBackground(Color.WHITE);  // ���찳 ��ư ���� ������� ����
        colorSelect_bt = new JButton("������"); // ������ ��ư ����
        colorSelect_bt.setBackground(Color.PINK); // ������ ��ư ���� ��ȫ������ ����
        
        thicknessInfo_label = new JLabel("��������"); 
        // �������� �� ���� / �ؿ��� ���� �ؽ�Ʈ�ʵ��� ������ ����
        thicknessInfo_label.setFont(new Font("���ʷҵ���", Font.BOLD, 20));
        // �������� �� ��Ʈ�� �۾� ũ�� ����
        
        thicknessControl_tf = new JTextField("10", 5); // �������� �Է� �ؽ�Ʈ�ʵ� ����
        thicknessControl_tf.setHorizontalAlignment(JTextField.CENTER); 
          // �ؽ�Ʈ�ʵ� ���ο� ������� �ؽ�Ʈ �߾� ����
        thicknessControl_tf.setFont(new Font("�ü�ü", Font.PLAIN, 25)); 
          // �ؽ�Ʈ�ʵ� X���� �� ��Ʈ ����
        
        pencil_bt.setBounds(10,10,90,55); // ���� ��ư ��ġ ����
        eraser_bt.setBounds(105,10,109,55); // ���찳 ��ư ��ġ ����
        colorSelect_bt.setBounds(785,10,90,55); // ������ ��ư ��ġ ����
        thicknessInfo_label.setBounds(640,10,100,55); // �������� �� ��ġ ����
        thicknessControl_tf.setBounds(720,22,50,35); // �������� �ؽ�Ʈ�ʵ� ��ġ ����
        
        gui_panel.add(pencil_bt); // gui_panel�� ���� ��ư �߰�
        gui_panel.add(eraser_bt); // gui_panel�� ���찳 ��ư �߰�
        gui_panel.add(colorSelect_bt); // gui_panel�� ������ ��ư �߰�
        gui_panel.add(thicknessInfo_label); // gui_panel�� �������� �� �߰�
        gui_panel.add(thicknessControl_tf); // gui_panel�� �������� �ؽ�Ʈ�ʵ� �߰�
        
        gui_panel.setBounds(0,0,900,75); // gui_panel�� �����ӿ� ��ġ�� ��ġ ����
        
        ////////////////////////////////////////////////// �� �г� ���� ��
        
        paint_panel = new JPanel(); // �׸��� �׷��� �г� ����
        paint_panel.setBackground(Color.WHITE); // �г��� ���� �Ͼ��
        paint_panel.setLayout(null); 
        // paint_panel�� ���̾ƿ��� null���� �г� ��ü�� setBounds�� ��ġ�� �����Ҽ� �ִ�.
        
        paint_panel.setBounds(0,90,885,620); // paint_panel�� ��ġ ����
        
        add(gui_panel); // ���������ӿ� gui�г� �߰� - ��ġ�� ������ �� ������
        add(paint_panel); // ���������ӿ� paint�г� �߰� - ��ġ�� ������ �� ������
        
        setVisible(true); // ������������ ���̰� �Ѵ�.
        
        graphics = getGraphics(); // �׷����ʱ�ȭ
        g = (Graphics2D)graphics; 
        // ������ graphics������ Graphics2D�� ��ȯ�� Graphics2D�� �ʱ�ȭ
        // �Ϲ����� Graphics�� �ƴ� Graphics2D�� ����� ������ ���� ����� ���õ� �����
        //�����ϱ� ���Ͽ� Graphics2D Ŭ������ ��üȭ��
        g.setColor(selectedColor); 
        // �׷��� ��(=���� �׷���)�� ������ selectedColor�� ������ ����
        
        /////////////////////////////////////////////////// �� �׼� ó���κ�
        
        paint_panel.addMouseListener(new MouseListener() { 
            // paint_panel������ MouseListener �̺�Ʈ ó��
            public void mousePressed(MouseEvent e) { 
            // paint_panel�� ���콺 ������ �׼��� ������ �� �޼ҵ� ����
                startX = e.getX(); // ���콺�� �������� �׶��� X��ǥ������ �ʱ�ȭ
                startY = e.getY(); // ���콺�� �������� �׶��� Y��ǥ������ �ʱ�ȭ
            }
            public void mouseClicked(MouseEvent e) {} // Ŭ���̺�Ʈ ó��
            public void mouseEntered(MouseEvent e) {} // paint_panel���� ���� ���Խ� �̺�Ʈ ó��
            public void mouseExited(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
        });
        paint_panel.addMouseMotionListener(new PaintDraw());
          // paint_panel�� ���콺 ��Ǹ����� �߰�
        pencil_bt.addActionListener(new ToolActionListener()); // ���ʹ�ư �׼�ó��
        eraser_bt.addActionListener(new ToolActionListener()); // ���찳��ư �׼�ó��
        colorSelect_bt.addActionListener(new ActionListener() {
          // �������ư �׼�ó���� �͸�Ŭ������ �ۼ�
            public void actionPerformed(ActionEvent e) { // �������̵�
                tf = true; // ������ ���� ������ �����Ƿ� ��ŵ..
                JColorChooser chooser = new JColorChooser(); // JColorChooser Ŭ������üȭ
                selectedColor = chooser.showDialog(null, "Color", Color.ORANGE); 
                // selectedColor�� ���õȻ����� �ʱ�ȭ
                g.setColor(selectedColor);
                        // �׷����� ���� ������ selectedColor�� �Ű������� �Ͽ� ����
            }
        });
    }
    
    public class PaintDraw implements MouseMotionListener {
        // ������ paint_panel�� MouseMotionListener�׼� ó���� �ɶ� �� Ŭ������ �Ѿ�ͼ� �� ������ ����

        @Override
        public void mouseDragged(MouseEvent e) { 
            // paint_panel���� ���콺 �巡�� �׼���ó���ɋ� �� �޼ҵ� ����
            thickness = Integer.parseInt(thicknessControl_tf.getText());
            // �ؽ�Ʈ�ʵ�κп��� ���� ����� thickness������ ����
            
                endX = e.getX(); 
                // �巡�� �Ǵ� �������� X��ǥ�� ���� - �ؿ��� ������ǥ�� ����ǥ�� ���� ���־� ���� �׾����Եȴ�.

                endY = e.getY(); 
               // �巡�� �Ǵ� �������� Y��ǥ�� ���� - �ؿ��� ������ǥ�� ����ǥ�� ���� ���־� ���� �׾����Եȴ�.
 
  
                g.setStroke(new BasicStroke(thickness, BasicStroke.CAP_ROUND,0)); //������
                g.drawLine(startX+10, startY+121, endX+10, endY+121); // ������ �׷����� �Ǵºκ�        
                
                startX = endX; 
                        // ���ۺκ��� �������� �巡�׵� X��ǥ�� ������ ������ �̾� �׷����� �ִ�.
                startY = endY;
                        // ���ۺκ��� �������� �巡�׵� Y��ǥ�� ������ ������ �̾� �׷����� �ִ�.
        }
        @Override
        public void mouseMoved(MouseEvent e) {}
        /* �������̽�ȭ �߱� ������ �� �������̽� �� ���ǵ�  �޼ҵ带 ���δ� �������̵� ����� ������ ���� ��������   
             �ʴ� �޼ҵ嵵 ���� Ŭ�������� ���δ� �������̵� ������Ѵ�. */



    }
    
    public class ToolActionListener implements ActionListener {
        // ����,���찳 ��ư�� �׼�ó���� ����Ǵ� Ŭ����
        public void actionPerformed(ActionEvent e ) {
            // �������̵��� actionPerformed�޼ҵ� ����
            if(e.getSource() == pencil_bt) { // ���ʹ�ư�� �������� �� if���� ��Ϲ����� ���� ����
                if(tf == false) g.setColor(Color.BLACK); // �׷����� ������ ������ ����
                else g.setColor(selectedColor);  // �׷����� ������ selectedColor������ ������ ����
            } else if(e.getSource() == eraser_bt) {
                 // ���찳��ư�� �������� �� if���� ��Ϲ����� ���� ����
                g.setColor(Color.WHITE);
            // �׷����� ������ ������� ����� ������ ������� ���� �׷��� �������� ��ó�� ���̰� �Ѵ�.

            }
        }
    }
    
    public static void main(String[] args) { // ���θ޼ҵ�
        new Drawing_ex(); // PaintŬ������ ����Ʈ(=Default)������ ����
    }
}
 