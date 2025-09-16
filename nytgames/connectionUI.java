package nytgames;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class connectionUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtcat2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					connectionUI frame = new connectionUI();
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
	public connectionUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		connectionManager cm = new connectionManager();
		connection con = cm.assigner();
		
		
		
		JFormattedTextField txt00 = new JFormattedTextField();
		txt00.setBounds(20, 76, 119, 87);
		contentPane.add(txt00);
		
		JFormattedTextField txt01 = new JFormattedTextField();
		txt01.setBounds(160, 76, 119, 87);
		contentPane.add(txt01);
		
		JFormattedTextField txt02 = new JFormattedTextField();
		txt02.setBounds(299, 76, 119, 87);
		contentPane.add(txt02);
		
		JFormattedTextField txt03 = new JFormattedTextField();
		txt03.setBounds(435, 76, 119, 87);
		contentPane.add(txt03);
		
		JFormattedTextField txt10 = new JFormattedTextField();
		txt10.setBounds(20, 200, 119, 87);
		contentPane.add(txt10);
		
		JFormattedTextField txt11 = new JFormattedTextField();
		txt11.setBounds(160, 200, 119, 87);
		contentPane.add(txt11);
		
		JFormattedTextField txt12 = new JFormattedTextField();
		txt12.setBounds(299, 200, 119, 87);
		contentPane.add(txt12);
		
		JFormattedTextField txt13 = new JFormattedTextField();
		txt13.setBounds(435, 200, 119, 87);
		contentPane.add(txt13);
		
		JFormattedTextField txt20 = new JFormattedTextField();
		txt20.setBounds(20, 313, 119, 87);
		contentPane.add(txt20);
		
		JFormattedTextField txt21 = new JFormattedTextField();
		txt21.setBounds(160, 313, 119, 87);
		contentPane.add(txt21);
		
		JFormattedTextField txt22 = new JFormattedTextField();
		txt22.setBounds(299, 313, 119, 87);
		contentPane.add(txt22);
		
		JFormattedTextField txt23 = new JFormattedTextField();
		txt23.setBounds(435, 313, 119, 87);
		contentPane.add(txt23);
		
		JFormattedTextField txt30 = new JFormattedTextField();
		txt30.setBounds(20, 430, 119, 87);
		contentPane.add(txt30);
		
		JFormattedTextField txt31 = new JFormattedTextField();
		txt31.setBounds(160, 430, 119, 87);
		contentPane.add(txt31);
		
		JFormattedTextField txt32 = new JFormattedTextField();
		txt32.setBounds(299, 430, 119, 87);
		contentPane.add(txt32);
		
		JFormattedTextField txt33 = new JFormattedTextField();
		txt33.setBounds(435, 430, 119, 87);
		contentPane.add(txt33);
		
		JFormattedTextField txtcat1 = new JFormattedTextField();
		txtcat1.setBounds(20, 76, 534, 87);
		contentPane.add(txtcat1);
		txtcat1.hide();
		
		txtcat2 = new JTextField();
		txtcat2.setBounds(20, 200, 544, 87);
		contentPane.add(txtcat2);
		txtcat2.setColumns(10);
		txtcat2.hide();
		
		JFormattedTextField txtcat3 = new JFormattedTextField();
		txtcat3.setBounds(20, 313, 534, 87);
		contentPane.add(txtcat3);
		txtcat3.hide();
		
		JFormattedTextField txtcat4 = new JFormattedTextField();
		txtcat4.setBounds(20, 430, 534, 87);
		contentPane.add(txtcat4);
		txtcat4.hide();
		
		
		
		
		
		
		
		
		
		
		//might need to make one formatted txtfield or label that appears when categroues solved while boxes dissappear
	}
}
