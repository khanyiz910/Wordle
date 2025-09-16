package nytgames;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class wordleUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wordleUI frame = new wordleUI();
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
	public wordleUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		wordleManager wm = new wordleManager();
		wordle otd = wm.assigner();
		
		
		JFormattedTextField [][] grid = new JFormattedTextField[6][5];
		
		
		JFormattedTextField txt04 = new JFormattedTextField();
		txt04.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt04.setBounds(407, 93, 66, 56);
		contentPane.add(txt04);
		grid[0][4]=txt04;
		txt04.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt04.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		      
		    }  
		});
		
		JFormattedTextField txt03 = new JFormattedTextField();
		txt03.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt03.setBounds(331, 93, 66, 56);
		contentPane.add(txt03);
		grid[0][3]=txt03;
		txt03.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt03.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		            txt04.requestFocus(); //move to next cell/txtf for word
		            
		    }  
		});
		
		JFormattedTextField txt02 = new JFormattedTextField();
		txt02.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt02.setBounds(255, 93, 66, 56);
		contentPane.add(txt02);
		grid[0][2]=txt02;
		txt02.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt02.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt03.requestFocus(); 
		    }  
		});
		
		JFormattedTextField txt01 = new JFormattedTextField();
		txt01.setForeground(new Color(0, 0, 0));
		txt01.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt01.setBounds(179, 93, 66, 56);
		contentPane.add(txt01);
		grid[0][1]=txt01;
		txt01.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt01.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt02.requestFocus();
		        //JOptionPane.showMessageDialog(null, "Curr length " + txt01.getText().length());
		        
		    }  
		});
		
		JFormattedTextField txt00 = new JFormattedTextField();
		txt00.setForeground(Color.BLACK);
		txt00.setBackground(Color.WHITE);
		txt00.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt00.setBounds(103, 93, 66, 56);
		contentPane.add(txt00);
		grid[0][0]=txt00;
		txt00.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt00.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt01.requestFocus(); //shift to next block
		    }  
		});
		
		JFormattedTextField txt14 = new JFormattedTextField();
		txt14.setEditable(false);
		txt14.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt14.setBounds(407, 159, 66, 56);
		contentPane.add(txt14);
		grid[1][4]=txt14;
		txt14.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt14.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		    }  
		});
		
		JFormattedTextField txt13 = new JFormattedTextField();
		txt13.setEditable(false);
		txt13.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt13.setBounds(331, 159, 66, 56);
		contentPane.add(txt13);
		grid[1][3]=txt13;
		txt13.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt13.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt14.requestFocus(); //move to next cell/txtf for word

		    }  
		});
		

		JFormattedTextField txt12 = new JFormattedTextField();
		txt12.setEditable(false);
		txt12.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt12.setBounds(255, 159, 66, 56);
		contentPane.add(txt12);
		grid[1][2]=txt12;
		txt12.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt12.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt13.requestFocus();
		    }  
		});
		
		JFormattedTextField txt11 = new JFormattedTextField();
		txt11.setEditable(false);
		txt11.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt11.setBounds(179, 159, 66, 56);
		contentPane.add(txt11);
		grid[1][1]=txt11;
		txt11.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt11.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt12.requestFocus();
		    }  
		});
	
		
		
		JFormattedTextField txt10 = new JFormattedTextField();
		txt10.setEditable(false);
		txt10.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt10.setBounds(103, 159, 66, 56);
		contentPane.add(txt10);
		grid[1][0]=txt10;
		txt10.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt10.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt11.requestFocus();
		    }  
		});
		
		JFormattedTextField txt24 = new JFormattedTextField();
		txt24.setEditable(false);
		txt24.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt24.setBounds(407, 225, 66, 56);
		contentPane.add(txt24);
		grid[2][4]=txt24;
		txt24.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt24.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		    }  
		});
		

		JFormattedTextField txt23 = new JFormattedTextField();
		txt23.setEditable(false);
		txt23.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt23.setBounds(331, 225, 66, 56);
		contentPane.add(txt23);
		grid[2][3]=txt23;
		txt23.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt23.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt24.requestFocus(); //move to next cell/txtf for word

		    }  
		});
		
		JFormattedTextField txt22 = new JFormattedTextField();
		txt22.setEditable(false);
		txt22.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt22.setBounds(255, 225, 66, 56);
		contentPane.add(txt22);
		grid[2][2]=txt22;
		txt22.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt22.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt23.requestFocus();
		    }  
		});
		
		JFormattedTextField txt21 = new JFormattedTextField();
		txt21.setEditable(false);
		txt21.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt21.setBounds(179, 225, 66, 56);
		contentPane.add(txt21);
		grid[2][1]=txt21;
		txt21.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt21.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt22.requestFocus();
		    }  
		});
		
		
		JFormattedTextField txt20 = new JFormattedTextField();
		txt20.setEditable(false);
		txt20.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt20.setBounds(103, 225, 66, 56);
		contentPane.add(txt20);
		grid[2][0]=txt20;
		txt20.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt20.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt21.requestFocus();
		    }  
		});
		
		
		JFormattedTextField txt34 = new JFormattedTextField();
		txt34.setEditable(false);
		txt34.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt34.setBounds(407, 291, 66, 56);
		contentPane.add(txt34);
		grid[3][4]=txt34;
		txt34.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt34.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		    }  
		});
		
		JFormattedTextField txt33 = new JFormattedTextField();
		txt33.setEditable(false);
		txt33.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt33.setBounds(331, 291, 66, 56);
		contentPane.add(txt33);
		grid[3][3]=txt33;
		txt33.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt33.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt34.requestFocus(); //move to next cell/txtf for word

		    }  
		});
		
		JFormattedTextField txt32 = new JFormattedTextField();
		txt32.setEditable(false);
		txt32.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt32.setBounds(255, 291, 66, 56);
		contentPane.add(txt32);
		grid[3][2]=txt32;
		txt32.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt32.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt33.requestFocus();
		    }  
		});
		
		JFormattedTextField txt31 = new JFormattedTextField();
		txt31.setEditable(false);
		txt31.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt31.setBounds(179, 291, 66, 56);
		contentPane.add(txt31);
		grid[3][1]=txt31;
		txt31.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt31.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt32.requestFocus();
		    }  
		});
		
		JFormattedTextField txt30 = new JFormattedTextField();
		txt30.setEditable(false);
		txt30.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt30.setBounds(103, 291, 66, 56);
		contentPane.add(txt30);
		grid[3][0]=txt30;
		txt30.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt30.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt31.requestFocus();
		    }  
		});
		
		JFormattedTextField txt44 = new JFormattedTextField();
		txt44.setEditable(false);
		txt44.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt44.setBounds(407, 357, 66, 56);
		contentPane.add(txt44);
		grid[4][4]=txt44;
		txt44.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt44.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		    }  
		});
		
		
		JFormattedTextField txt43 = new JFormattedTextField();
		txt43.setEditable(false);
		txt43.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt43.setBounds(331, 357, 66, 56);
		contentPane.add(txt43);
		grid[4][3]=txt43;
		txt43.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt43.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt44.requestFocus(); //move to next cell/txtf for word

		    }  
		});
		
		
		JFormattedTextField txt42 = new JFormattedTextField();
		txt42.setEditable(false);
		txt42.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt42.setBounds(255, 357, 66, 56);
		contentPane.add(txt42);
		grid[4][2]=txt42;
		txt42.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt42.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt43.requestFocus();
		    }  
		});
		
		JFormattedTextField txt41 = new JFormattedTextField();
		txt41.setEditable(false);
		txt41.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt41.setBounds(179, 357, 66, 56);
		contentPane.add(txt41);
		grid[4][1]=txt41;
		txt41.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt41.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt42.requestFocus();
		    }  
		});
		
		JFormattedTextField txt40 = new JFormattedTextField();
		txt40.setEditable(false);
		txt40.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt40.setBounds(103, 357, 66, 56);
		contentPane.add(txt40);
		grid[4][0]=txt40;
		txt40.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt40.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt41.requestFocus();
		    }  
		});
		
		JFormattedTextField txt54 = new JFormattedTextField();
		txt54.setEditable(false);
		txt54.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt54.setBounds(407, 423, 66, 56);
		contentPane.add(txt54);
		grid[5][4]=txt54;
		txt54.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt54.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		    }  
		});
		
		JFormattedTextField txt53 = new JFormattedTextField();
		txt53.setEditable(false);
		txt53.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt53.setBounds(331, 423, 66, 56);
		contentPane.add(txt53);
		grid[5][3]=txt53;
		txt53.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt53.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt54.requestFocus(); //move to next cell/txtf for word

		    }  
		});
		
		JFormattedTextField txt52 = new JFormattedTextField();
		txt52.setEditable(false);
		txt52.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt52.setBounds(255, 423, 66, 56);
		contentPane.add(txt52);
		grid[5][2]=txt52;
		txt52.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt52.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt53.requestFocus();
		    }  
		});
		
		JFormattedTextField txt51 = new JFormattedTextField();
		txt51.setEditable(false);
		txt51.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt51.setBounds(179, 423, 66, 56);
		contentPane.add(txt51);
		grid[5][1]=txt51;
		txt51.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt51.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt52.requestFocus();
		    }  
		});
		
		JFormattedTextField txt50 = new JFormattedTextField();
		txt50.setEditable(false);
		txt50.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txt50.setBounds(103, 423, 66, 56);
		contentPane.add(txt50);
		grid[5][0]=txt50;
		txt50.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txt50.getText().length() >=1) // limit textfield to 1 character
		            e.consume(); 
		        txt51.requestFocus();
		    }  
		});
		
		
		JButton btnENTER = new JButton("ENTER");
		
		btnENTER.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					
			int row = otd.getAttempt();
			
			String wrd = "";
			
			DataValidation dv = new DataValidation();
			
			for(int i=0;i<5;i++) {
				String chr = grid[row][i].getText(); 
				dv.checker(chr);
				if(!dv.isValid()){
					
					
				}
					wrd+=chr;
					
			}
			
			wm.colours(grid, otd, wrd);
					
					boolean won = wm.wordMatch(otd.getWord(), wrd);
					
					if(won) {
						
						JOptionPane.showMessageDialog(null, "CONGRATULATIONS !", "GAME WON !", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}
					
					if(row==5 && !won){
						//was having to re-press button on final try to see correct wordle. now is fine
						
						JOptionPane.showMessageDialog(null, "SORRY ! \nTHE WORDLE IS: " + otd.getWord().toUpperCase(), "GAME LOST !", JOptionPane.ERROR_MESSAGE);
						//error message for game lost
						System.exit(0);
					}
	
					wm.updateAttempt(otd);
					wm.setEd(grid, row);
			}	
			
		});
		btnENTER.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnENTER.setBounds(464, 508, 112, 45);
		contentPane.add(btnENTER);
		
		JLabel lblNewLabel = new JLabel("WORDLE");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setBounds(154, 13, 278, 70);
		contentPane.add(lblNewLabel);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				welcome.main(null);		
				dispose();
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBounds(10, 508, 112, 45);
		contentPane.add(btnBack);
	}
}
