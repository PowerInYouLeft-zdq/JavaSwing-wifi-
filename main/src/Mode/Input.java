package Mode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import Mode.Begin;
public class Input {
	static String uses=Begin.getput();
	
//�����˺��ж�
	static boolean getin(String ZhangHao,String PassWord) {
		DateBasic test=new DateBasic();
		String[] DBPS=test.getAllPS();
		String[] DBZH=test.getAllZH();
		String[] Admin= test.getAdmin();
		for(int i=0;i<DBZH.length;i++) {
			if(ZhangHao.equals(DBZH[i])||ZhangHao.equals(Admin[0])) {
				if(PassWord.equals(DBPS[i]) || PassWord.equals(Admin[1])) {
					return true;
				}
			}
		}
		return false;
	}
//��������˺���������������ʾ
	public static void error() {
		JFrame errorFrame=new JFrame("������ʾ");
		errorFrame.setSize(200, 100);
		errorFrame.setDefaultCloseOperation(errorFrame.EXIT_ON_CLOSE);
		JLabel eJLabel=new JLabel("���������������˺��д�");
		eJLabel.setBounds(0, 0, 100, 100);
		errorFrame.add(eJLabel);
		errorFrame.setLocation(350, 150);
		errorFrame.setVisible(true);
	}
//�������ؼ���˧ѡ����
	public static void sure() {
		JFrame ture=new JFrame();
		ture.setSize(800, 600);
		ture.setDefaultCloseOperation(ture.EXIT_ON_CLOSE);
		JTextArea one=new JTextArea();
		JTextArea two=new JTextArea();
		JTextArea three=new JTextArea();
		one.setBounds(30, 50, 200, 500);
		two.setBounds(270, 50,100, 20);
		three.setBounds(420, 50, 200, 500);
		ture.add(one);
		ture.add(two);
		ture.add(three);
//		ture.getContentPane().setBackground(Color.GRAY);
		
		JButton j1=new JButton("��ȷ����ˢѡ");
		JButton j2=new JButton("����ȷ����ˢѡ");
		JButton j3=new JButton("����ˢѡ");
		JButton j4=new JButton("������ˢѡ");
		JButton j5=new JButton("ʹ��˵��");
		j1.setBounds(260, 100, 120, 20);
		j2.setBounds(255, 130, 130, 20);
		j3.setBounds(270, 160, 100,20);
		j4.setBounds(270, 190, 100,20);
		j5.setBounds(640, 280, 100, 20);
		ture.add(j1);
		ture.add(j2);
		ture.add(j3);
		ture.add(j4);
		ture.add(j5);
		
		JLabel jl1=new JLabel("�ڴ�����ؼ���:");
		JLabel jl2=new JLabel("����ؼ�������:");
		JLabel jl3=new JLabel("ˢѡ���:");
		jl1.setBounds(40, 30, 100, 20);
		jl2.setBounds(270, 30, 100, 20);
		jl3.setBounds(430, 30, 100, 20);
		ture.add(jl1);
		ture.add(jl2);
		ture.add(jl3);
		ture.setLocation(350, 150);
		
        //������	1	
		j1.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] major=one.getText().split("\n");
				String scend=two.getText();
				for(int i=0;i<Body.One(major, scend).length;i++) {
					three.append(Body.One(major, scend)[i]);
					three.append("\n");
					if(Body.One(major, scend)[i]==null) {
						//�������Ϊnullʱ���ж�
						break;
					}
				}		
			}
		});
		//������ 2
		j2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] major=one.getText().split("\n");
				String scend=two.getText();
				for(int i=0;i<Body.two(major, scend).length;i++) {
					three.append(Body.two(major, scend)[i]);
					three.append("\n");
					if(Body.two(major, scend)[i]==null) {
						//�������Ϊnullʱ���ж�
						break;
					}
				}					
			}
		});
		//������3
		j3.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] major=one.getText().split("\n");
				String scend=two.getText();
				for(int i=0;i<Body.there(major, scend).length;i++) {
					three.append(Body.there(major, scend)[i]);
					three.append("\n");
					if(Body.there(major, scend)[i]==null) {
						//�������Ϊnullʱ���ж�
						break;
					}
				}	
			}
		});
		//������4
		j4.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] major=one.getText().split("\n");
				String scend=two.getText();
				for(int i=0;i<Body.four(major, scend).length;i++) {
//					�ڵ������ı���������
					three.append(Body.four(major, scend)[i]);
					three.append("\n");
					if(Body.four(major, scend)[i]==null) {
						//�������Ϊnullʱ���ж�
						break;
					}
				}	
			}
		});
		//������5��ʹ��˵������
		j5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Input.SureExplien();
			}
		});
		
		
		ture.setLayout(null);
		ture.setLocation(150, 50);
		ture.setVisible(true);	
	}
//������Ա��ʾ����	
	public static void NUmberThree() {
		JFrame thereFrame=new JFrame("������Ա");
		thereFrame.setSize(200, 100);
		thereFrame.setDefaultCloseOperation(thereFrame.EXIT_ON_CLOSE);
		
		JLabel one=new JLabel("������Ա:��Ȩ   ���:��Ȩ");
		one.setBounds(0, 0, 100, 50);
		thereFrame.add(one);
		thereFrame.setLocation(300, 300);
		
		thereFrame.setVisible(true);
	}
//������
	public static void majorMax() {
		JFrame jf=new JFrame();
		jf.setSize(533, 340);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setTitle("������");
		JLabel jimg=new JLabel();
		JButton j1=new JButton("����ˢѡ");
		JButton j2=new JButton("WIFI��ѯ");
		JButton j3=new JButton("����");
		JButton j4=new JButton("����ָ�����");
		JLabel jl1=new JLabel("��ǰȨ���û�:"+uses);
		j1.setBounds(100, 100, 100, 20);
		j2.setBounds(260, 100, 100, 20);
		j3.setBounds(100, 130, 100, 20);
		j4.setBounds(240, 130, 140, 20);
		jl1.setBounds(150, 50, 200, 30);
		j1.setOpaque(true);
		j2.setOpaque(true);
		URL url=Input.class.getResource("background.jpg");
		Icon icon=new ImageIcon(url);
		jimg.setIcon(icon);
		jimg.setBounds(0, 0,518,300);
		jimg.setOpaque(false);	
		jf.add(jl1);		
		jf.add(j1);
		jf.add(j2);
		jf.add(j3);
		jf.add(j4);
		jf.add(jimg);
		jf.setLocation(350, 150);
		jf.setVisible(true);
        //�����
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sure();
			}
		});
		
		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Wifi();
			}
		});
		
		j3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Input().YiMa();;
			}
		});
		
		j4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				virs();
			}
		});
		
		
		JButton c=new JButton(" ");
		c.setContentAreaFilled(false);		//����͸��
		c.setBorderPainted(false);		//�߿�͸��
		c.setEnabled(false);			//���ܵ��
		jf.add(c);
		
	}
//   ˢѡ˵������,���Զ࿴�����ʹ�ý������ֻ��еģ��Լ�������ť
	public static void SureExplien() {
		JFrame jf=new JFrame();
//		Container container = jf.getContentPane();
		JTextArea tArea = new JTextArea(200, 50);        // �����ı��������
		tArea.setText("   ʹ��˵����\r\n       ����Ӧ�Ĺؼ�������ˢѡ���У������Ӧ����������ɵó���������Ĺؼ���"
				+ "\r\n  1����ȷ����ˢѡ:ˢѡ��Ŀ��ؼ����������������Ĺؼ���\r\n  2������ȷ����ˢѡ:ֻҪ�����������Ĺؼ��־ͻᱻˢѡ����"
				+ "\r\n  3������ˢѡ��ˢѡ��Ŀ��ؼ����к��еĹؼ���\r\n  4���ǰ���ˢѡ��������һ���ֵĹؼ��ֶ��ᱻˢѡ"); 
//		JScrollPane sp = new JScrollPane(tArea);
//		container.add(sp);
		 
		jf.add(tArea);
		jf.setVisible(true);
		jf.setSize(500, 250);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	static String ZH;
//	��ѯWifi����Ľ���
	public static void Wifi() {
		Body.run();
		
		JFrame jf=new JFrame();
		jf.setSize(600, 400);
		jf.setTitle("Wifi����鿴");
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		
		JTextField t1=new JTextField("����wifi");
		JTextArea t2=new JTextArea();
		JTextArea t3=new JTextArea();
		JButton j1=new JButton("ȷ��");
		JLabel jl1=new JLabel("����:");
		JLabel jl2=new JLabel("̽������⵽����Wifi");
		j1.setBounds(160, 95, 80, 20);
		t1.setBounds(100, 60, 200, 25);
		t2.setBounds(140, 140, 150,25);
		t3.setBounds(350, 60, 150, 200);
		jl1.setBounds(100, 140, 30, 20);
		jl2.setBounds(350, 40, 170, 20);
		
		t3.append(Body.word1);
		
	

		jf.add(t1);
		jf.add(j1);
		jf.add(t2);
		jf.add(jl1);
		jf.add(t3);
		jf.add(jl2);
		
//�����
		j1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				ZH=t1.getText();
				t2.append(Body.word2(ZH));
			}
		});
		
		JButton c=new JButton();
		c.setContentAreaFilled(false);		//����͸��
		c.setBorderPainted(false);		//�߿�͸��
		c.setEnabled(false);
		jf.add(c);
		jf.setLocation(200, 200);
		jf.setVisible(true);
	}
	
//  �������
	public void YiMa() {
		JFrame jf=new JFrame();
		jf.setSize(700, 300);
		jf.setTitle("����");
		JTextArea t1=new JTextArea(500,5);	
		JTextArea t2=new JTextArea(500,5);
		JButton j1=new JButton("ȷ��");
		JComboBox<String> stame=new JComboBox<String>();
		stame.addItem("����Ӣ");
		stame.addItem("���δ�λ����");
		stame.addItem("Ӣ����");
		stame.setBounds(50, 90, 100, 20);
		t1.setBounds(50, 30, 600, 40);
		t2.setBounds(50, 130, 600,60);
		j1.setBounds(500, 90, 100, 20);
		jf.add(t1);
		jf.add(j1);
		jf.add(stame);
		jf.add(t2);
		
//		��Ҫ�����ť��ȡ�ı��򣬱���Ҫ������������
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Y1=t1.getText();
				String Y2=(String)stame.getSelectedItem();
				t2.append(Body.YM(Y1,Y2));
			}
		});
		
		JButton c=new JButton();
		c.setContentAreaFilled(false);		//����͸��
		c.setBorderPainted(false);		//�߿�͸��
		c.setEnabled(false);
		jf.add(c);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	
//	����ָ�����
	public static void virs() {
		JFrame jf=new JFrame();
		jf.setSize(400, 200);
		jf.setTitle("����ָ�����");
		JButton j1=new JButton("�ػ�����");
		JButton j2=new JButton("������ֳ");
		JLabel jl1=new JLabel("������ֳ��ʱ�رգ����ڱ��������Ա���ò���������˵����˺�");
		JTextField t1=new JTextField("����������ػ�");
		j1.setBounds(180, 20, 90, 20);
		j2.setBounds(120, 60, 90, 20);
		t1.setBounds(70, 20, 100, 20);
		jl1.setBounds(10, 90, 400,20 );
		jf.add(j1);
		jf.add(j2);
		jf.add(t1);
		jf.add(jl1);
		
//		�����
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Body.shutdown(t1.getText());
			}
		});
		
		JButton c=new JButton();
		c.setContentAreaFilled(false);		//����͸��
		c.setBorderPainted(false);		//�߿�͸��
		c.setEnabled(false);
		jf.add(c);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		majorMax();

	}

}

