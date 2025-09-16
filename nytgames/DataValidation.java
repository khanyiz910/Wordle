package nytgames;

import javax.swing.JOptionPane;

public class DataValidation {
	
		private boolean valid; // Tracks overall validation status

	    public DataValidation() {
	        valid = true; // Initializes validation status as true
	    }

	    public boolean isValid() {
	        return valid; // Returns current validation status
	    }

	    public void setValid(boolean v) {
	        valid = v; // Sets the validation status
	    }

	    public void resetValidation() {
	        valid = true; // Resets validation status to true
	    }
		
		
	 // Validates the name input
	 	public void checker(String wrd) {
	 	
	 		// Presence check
	 		if(wrd.isEmpty()) {
	 			valid = false;
	 			JOptionPane.showMessageDialog(null, "ERROR", "Letter is required" , JOptionPane.ERROR_MESSAGE);
	 			//return "Letter is required.";
	 		}
	 		
	 		// Length check
	 		if(wrd.length() >1) {
	 			valid = false;
	 			JOptionPane.showMessageDialog(null, "ERROR",  "Only enter 1 letter", JOptionPane.ERROR_MESSAGE);
	 			//return "Only enter 1 letter.";
	 		}
	 		
	 		// Type check
	 			if(!(Character.isAlphabetic(wrd.charAt(0)))) {
	 				valid = false;
		 			JOptionPane.showMessageDialog(null, "ERROR",  "Letters only", JOptionPane.ERROR_MESSAGE);

	 				//return "Name must only contain letters.";
	 			}
	 			
	 		}
	 	

}
