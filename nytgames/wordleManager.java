package nytgames;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFormattedTextField;
import java.util.Random;



public class wordleManager {
	
	private wordle [] wordlearr = new wordle [500];
	private int size = 0;
	private Random rand = new Random();
	
	public wordleManager() {
		
		try {
			
			Scanner scFile = new Scanner(new File("wordles.txt"));
			 
				
				String line = scFile.nextLine();
				Scanner scLine = new Scanner(line).useDelimiter("#");
				while(scLine.hasNext()){
				String word=scLine.next();
				wordle add = new wordle(word,0);
				wordlearr[size] = add;
				size++;
				
				
				
			}
				scLine.close();
			scFile.close();
			
		} catch (FileNotFoundException e) {
			
			Logger.getLogger(wordleManager.class.getName()).log(Level.SEVERE, null, e);
			
		}
		
	}
	
	public wordle assigner() {
		int rando = rand.nextInt(size);		return wordlearr[rando]; 
	}
	
	public void setEd(JFormattedTextField[][] grid, int row) {
		
		for(int col=0;col<5;col++) {
			
			grid[row][col].setEditable(false);
			if((row+1)!=6){
				
				grid[row+1][col].setEditable(true);
				
			}
		
			
		}
	}
	
	public void colours(JFormattedTextField[][] grid,wordle wd, String word) {
		
		for(int col=0;col<5;col++) {
				
			if(wd.getWord().contains((grid[wd.getAttempt()][col].getText()))) {
			
			    if((grid[wd.getAttempt()][col].getText()).charAt(0)==((wd.getWord()).charAt(col))) {
				
				    grid[wd.getAttempt()][col].setBackground(Color.GREEN);
					
			    } else {
			    	
			    	grid[wd.getAttempt()][col].setBackground(Color.YELLOW);
			    }
				
			}
			
			else {
				grid[wd.getAttempt()][col].setBackground(Color.GRAY);
			}
		}
		
		
	}
	
	public boolean wordMatch(String word,String shot) {
		
		if(word.equalsIgnoreCase(shot)) {
			return true;
		} 
		
		return false;
		
	}
	
	
	public void updateAttempt(wordle a) {
		
		for(int i=0;i<size;i++) {
			
			if (a.getWord().equals(wordlearr[i].getWord()) ) {
				int og = wordlearr[i].getAttempt();
				wordlearr[i].setAttempt(og+1);
					
			}
		}
	}

}
