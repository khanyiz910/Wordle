package nytgames;

public class wordle {

	
private String word;	
private int attempt;



public wordle(String word, int attempt) {
	
	this.word = word;
	this.attempt = attempt;
}



public String getWord() {
	return word;
}



public void setWord(String word) {
	this.word = word;
}



public int getAttempt() {
	return attempt;
}



public void setAttempt(int attempt) {
	this.attempt = attempt;
}


	
	

}
