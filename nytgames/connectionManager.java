package nytgames;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFormattedTextField;

public class connectionManager {
	
	
	private connection[] conarr = new connection[500];
	private int size =0;
	private Random rand = new Random();
	
	
	public connectionManager() {
		
		
		
		try {
			
			Scanner scFile = new Scanner(new File("connection.txt"));
			
			while( scFile.hasNext()) {
				
				String line = scFile.nextLine();
				Scanner scLine = new Scanner(line).useDelimiter("#");
				
				String cat1="";
				String cat2="";
				String cat3="";
				String cat4="";
				String bl1="";
				String bl2="";
				String bl3="";
				String bl4="";
				String bl5="";
				String bl6="";
				String bl7="";
				String bl8="";
				String bl9="";
				String bl10="";
				String bl11="";
				String bl12="";
				String bl13="";
				String bl14="";				
				String bl15="";
				String bl16="";

				
				for(int i = 0; i<=4;i++) {
					
					 cat1= scLine.next();
					 cat2= scLine.next();
					 cat3= scLine.next();
					 cat4= scLine.next();
					 
					 
					
					//loop and adding how
					
				}
				
				for(int i = 0;i<=16;i++) {
					
					 bl1= scLine.next();
					 bl2= scLine.next();
					 bl3= scLine.next();
					 bl4= scLine.next();
					 bl5= scLine.next();
					 bl6= scLine.next();
					 bl7= scLine.next();
					 bl8= scLine.next();
					 bl9= scLine.next();
					 bl10= scLine.next();
					 bl11= scLine.next();
					 bl12= scLine.next();
					 bl13= scLine.next();
					 bl14= scLine.next();
					 bl15= scLine.next();
					 bl16= scLine.next();
				}
				
				
				int attempt = scLine.nextInt();
				conarr[size]= new connection(cat1,cat2,cat3,cat4,bl1,bl2,bl3,bl4,bl5,bl6,bl7,bl8,bl9,bl10,bl11,bl12,bl13,bl4,bl15,bl16,attempt);
				size++;
			
				
			}
			
			scFile.close();
			
			
			
		} catch(FileNotFoundException e) {
			
			Logger.getLogger(connectionManager.class.getName()).log(Level.SEVERE, null, e);
		}
	}
	
	
	public connection assigner() {
		
		int rando = rand.nextInt(size);		
		 return conarr[rando];
		
	}
	
	/*public JFormattedTextField[][] formatter (connection con) {
		
		JFormattedTextField[][] grid = new JFormattedTextField[4][4];
		
		for(int row=4;row<8;row++) {
			
			for(int col=0;col<4;col++) {
				
				grid[row][col] = 
				
			}
		}
		
		
	} */

}
