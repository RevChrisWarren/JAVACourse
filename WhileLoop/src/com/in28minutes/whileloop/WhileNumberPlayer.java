package com.in28minutes.whileloop;

public class WhileNumberPlayer {
	private int num;
	
	public WhileNumberPlayer(int num) {
		this.num = num;
	}
public void printSquaresUpToLimit (){
	int start = 0;
	while(start * start < num) {
		System.out.print(start * start + " ");
		start ++;
}
	System.out.println();
}
public void printCubesUpToLimit (){
	int start = 0;
	while(start * start * start < num) {
		
		System.out.print(start * start * start + " ");
		start ++;
}
}
}
