package team.nwsh.nwshospital.RegisterSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import team.nwsh.nwshospital.MySQLConnect;

public class Fee extends JFrame {
	
	static String F_ID;           //����֤��
	static String F_NAME;			//����
	static String F_MED;			//����RESULTS����ѯ����RES_MED ҩƷ�շ�
	static String F_ITEMS;			//����RESULTS����ѯ����RES_ITEMS ��Ŀ�շ�
	
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fee frame = new Fee();
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
	public Fee() {
		F_ID=RegisterSystem.PAT_ID;					//����������֤��ҳ�������֤�Ŵ�����F_ID
		
		//��ѯ����
				String sql_name= "SELECT PAT_NAME FROM PATIENTS WHERE PAT_ID='"+F_ID+"'";
				MySQLConnect con_name= new MySQLConnect(sql_name);
				try {
					ResultSet ResultSet_NAME = con_name.pst.executeQuery();
					while(ResultSet_NAME.next()){
						F_NAME=ResultSet_NAME.getString("PAT_NAME");//�����ֲ�ѯ�����ֵ����F_NAME
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//��ѯҩƷ�շ�
				String sql_med= "SELECT RES_MED FROM RESULTS WHERE PAT_ID='"+F_ID+"'";
				MySQLConnect con_med= new MySQLConnect(sql_med);
				try {
					ResultSet ResultSet_MED = con_med.pst.executeQuery();
					while(ResultSet_MED.next()){
						F_MED=ResultSet_MED.getString("RES_MED");//�����ֲ�ѯ�����ֵ����F_MED
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//��ѯ��Ŀ�շ�
				String sql_items= "SELECT RES_ITEMS FROM RESULTS WHERE PAT_ID='"+F_ID+"'";
				MySQLConnect con_items= new MySQLConnect(sql_items);
				try {
					ResultSet ResultSet_ITEMS = con_items.pst.executeQuery();
					while(ResultSet_ITEMS.next()){
						F_ITEMS=ResultSet_ITEMS.getString("RES_ITEMS");//�����ֲ�ѯ�����ֵ����F_ITEMS
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 673);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(50, 10, 433, 56);
		contentPane.add(panel);
		
		JLabel label = new JLabel("\u6536\u8D39");
		label.setFont(new Font("΢���ź�", Font.BOLD, 16));
		label.setBounds(202, 20, 41, 36);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(50, 76, 433, 40);
		contentPane.add(panel_1);
		
		JLabel label_1 = new JLabel("\u59D3\u540D\uFF1A");
		label_1.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		label_1.setBounds(57, 10, 42, 30);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7\uFF1A");
		label_2.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		label_2.setBounds(189, 10, 70, 30);
		panel_1.add(label_2);
		
		JLabel Label_NAME = new JLabel("");
		Label_NAME.setForeground(Color.BLACK);
		Label_NAME.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		Label_NAME.setBounds(109, 10, 70, 30);
		panel_1.add(Label_NAME);
		Label_NAME.setText(F_NAME);
		
		JLabel Label_ID = new JLabel("");
		Label_ID.setForeground(Color.BLACK);
		Label_ID.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		Label_ID.setBounds(269, 10, 154, 30);
		panel_1.add(Label_ID);
		Label_ID.setText(F_ID);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(50, 126, 433, 211);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_5 = new JLabel("\u836F\u7269\u6536\u8D39\uFF1A");
		label_5.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		label_5.setBounds(10, 10, 70, 30);
		panel_2.add(label_5);
		
		
		
		JLabel lblNewLabel = new JLabel("\u836F\u54C1\u7F16\u53F7");
		lblNewLabel.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		lblNewLabel.setBounds(41, 39, 70, 30);
		panel_2.add(lblNewLabel);
		
		JLabel label_3 = new JLabel("\u836F\u54C1\u540D\u79F0");
		label_3.setFont(new Font("����", Font.PLAIN, 12));
		label_3.setBounds(148, 39, 60, 30);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("\u6570\u91CF");
		label_4.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		label_4.setBounds(262, 39, 52, 30);
		panel_2.add(label_4);
		
		JLabel label_6 = new JLabel("\u5355\u4EF7");
		label_6.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		label_6.setBounds(358, 39, 35, 30);
		panel_2.add(label_6);
		
		//�շ�ҩƷ��
		table_2 = new JTable();
		table_2.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		table_2.setBounds(30, 68, 363, 133);
		panel_2.add(table_2);
		
		JButton button = new JButton("\u5DF2\u6536\u8D39");
		button.setBounds(160, 583, 93, 23);
		contentPane.add(button);
		button.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(50, 347, 433, 211);
		contentPane.add(panel_3);
		
		JLabel label_8 = new JLabel("\u9879\u76EE\u6536\u8D39\uFF1A");
		label_8.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		label_8.setBounds(10, 10, 70, 30);
		panel_3.add(label_8);
		

		
//		DefaultTableCellRenderer r2 = new DefaultTableCellRenderer();   
//		r2.setHorizontalAlignment(JLabel.CENTER);   
//		table_1.setDefaultRenderer(Object.class,r2);
		
		
		JLabel label_7 = new JLabel("\u9879\u76EE\u7F16\u53F7");
		label_7.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		label_7.setBounds(61, 39, 70, 30);
		panel_3.add(label_7);
		
		JLabel label_9 = new JLabel("\u9879\u76EE\u540D\u79F0");
		label_9.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		label_9.setBounds(197, 39, 70, 30);
		panel_3.add(label_9);
		
		JLabel label_10 = new JLabel("\u4EF7\u683C");
		label_10.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		label_10.setBounds(342, 39, 70, 30);
		panel_3.add(label_10);
		
		//�շ���Ŀ��
		table_3 = new JTable();
		table_3.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		table_3.setBounds(10, 68, 413, 133);
		panel_3.add(table_3);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.setBounds(294, 583, 93, 23);
		contentPane.add(button_1);
		button_1.setFont(new Font("΢���ź�", Font.PLAIN, 12));
	}
}
