package nytgames;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class welcome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcome frame = new welcome();
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
	public welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("");
		lblHeader.setBounds(119, 121, 634, 208);
		contentPane.add(lblHeader);
		
		Image imG = new ImageIcon(this.getClass().getResource("images/games (1).png")).getImage();
		lblHeader.setIcon(new ImageIcon(imG)); // Set image icon for label
		
		JLabel lblNewLabel = new JLabel("PC");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 80));
		lblNewLabel.setBounds(238, 47, 125, 71);
		contentPane.add(lblNewLabel);
		
		JButton btnwordle = new JButton("WORDLE");
		btnwordle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				wordleUI.main(null);
				dispose();
			}
		});
		btnwordle.setFont(new Font("SansSerif", Font.BOLD, 22));
		btnwordle.setBounds(40, 446, 216, 76);
		contentPane.add(btnwordle);
		
		JButton btnCONNECTIONS = new JButton("CONNECTIONS");
		btnCONNECTIONS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				connectionUI.main(null);
				dispose();
				
				
				
			}
		});
		btnCONNECTIONS.setFont(new Font("SansSerif", Font.BOLD, 22));
		btnCONNECTIONS.setBounds(336, 446, 206, 76);
		contentPane.add(btnCONNECTIONS);
	}
	
	
}
