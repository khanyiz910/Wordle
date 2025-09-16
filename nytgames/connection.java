package nytgames;

public class connection {

//categories
private String cat1;	
private String cat2;
private String cat3;
private String cat4;

//blocks/phrase/wrd idk
private String block1;
private String block2;
private String block3;
private String block4;
private String block5;
private String block6;
private String block7;
private String block8;
private String block9;
private String block10;
private String block11;
private String block12;
private String block13;
private String block14;
private String block15;
private String block16;


private int attempt;


public connection(String cat1, String cat2, String cat3, String cat4, String block1, String block2, String block3,
		String block4, String block5, String block6, String block7, String block8, String block9, String block10,
		String block11, String block12, String block13, String block14, String block15, String block16, int attempt) {
	super();
	this.cat1 = cat1;
	this.cat2 = cat2;
	this.cat3 = cat3;
	this.cat4 = cat4;
	this.block1 = block1;
	this.block2 = block2;
	this.block3 = block3;
	this.block4 = block4;
	this.block5 = block5;
	this.block6 = block6;
	this.block7 = block7;
	this.block8 = block8;
	this.block9 = block9;
	this.block10 = block10;
	this.block11 = block11;
	this.block12 = block12;
	this.block13 = block13;
	this.block14 = block14;
	this.block15 = block15;
	this.block16 = block16;
	this.attempt = attempt;
}


public String getCat1() {
	return cat1;
}


public void setCat1(String cat1) {
	this.cat1 = cat1;
}


public String getCat2() {
	return cat2;
}


public void setCat2(String cat2) {
	this.cat2 = cat2;
}


public String getCat3() {
	return cat3;
}


public void setCat3(String cat3) {
	this.cat3 = cat3;
}


public String getCat4() {
	return cat4;
}


public void setCat4(String cat4) {
	this.cat4 = cat4;
}


public String getBlock1() {
	return block1;
}


public void setBlock1(String block1) {
	this.block1 = block1;
}


public String getBlock2() {
	return block2;
}


public void setBlock2(String block2) {
	this.block2 = block2;
}


public String getBlock3() {
	return block3;
}


public void setBlock3(String block3) {
	this.block3 = block3;
}


public String getBlock4() {
	return block4;
}


public void setBlock4(String block4) {
	this.block4 = block4;
}


public String getBlock5() {
	return block5;
}


public void setBlock5(String block5) {
	this.block5 = block5;
}


public String getBlock6() {
	return block6;
}


public void setBlock6(String block6) {
	this.block6 = block6;
}


public String getBlock7() {
	return block7;
}


public void setBlock7(String block7) {
	this.block7 = block7;
}


public String getBlock8() {
	return block8;
}


public void setBlock8(String block8) {
	this.block8 = block8;
}


public String getBlock9() {
	return block9;
}


public void setBlock9(String block9) {
	this.block9 = block9;
}


public String getBlock10() {
	return block10;
}


public void setBlock10(String block10) {
	this.block10 = block10;
}


public String getBlock11() {
	return block11;
}


public void setBlock11(String block11) {
	this.block11 = block11;
}


public String getBlock12() {
	return block12;
}


public void setBlock12(String block12) {
	this.block12 = block12;
}


public String getBlock13() {
	return block13;
}


public void setBlock13(String block13) {
	this.block13 = block13;
}


public String getBlock14() {
	return block14;
}


public void setBlock14(String block14) {
	this.block14 = block14;
}


public String getBlock15() {
	return block15;
}


public void setBlock15(String block15) {
	this.block15 = block15;
}


public String getBlock16() {
	return block16;
}


public void setBlock16(String block16) {
	this.block16 = block16;
}


public int getAttempt() {
	return attempt;
}


public void setAttempt(int attempt) {
	this.attempt = attempt;
}



public String[][] getBlocks() {
	
	String[][] grid= new String[4][4];
	
	grid[0][0]= block1;
	grid[0][1]=block2;
	grid[0][2]=block3;
	grid[0][3]=block4;
	grid[1][0]=block5;
	grid[1][1]=block6;
	grid[1][2]=block7;
	grid[1][3]=block8;
	grid[2][0]=block9;
	grid[2][1]=block10;
	grid[2][2]=block11;
	grid[2][3]=block12;
	grid[3][0]=block13;
	grid[3][1]=block14;
	grid[3][2]=block15;
	grid[3][3]=block16;
	
	
	
	return grid;
	
	
}

	
	
}
