package com.syntax.class12;

public class Methods2 {
	
	void repeatWords(String word, int times) {
		for (int i=0; i<times; i++) {
			System.out.println(word);
		}
	}
	void isItRaining(boolean isRain) {
		if (isRain) {
			System.out.println("please take umbrella");
		}else {
			System.out.println("lets go for a walk");
		}
		
	}
	
	void temp (int x) {
		if (x<75 && x>=60) {
			System.out.println("I will go for a walk");
		}else if (x>=75 && x<=85) {
			System.out.println("I will go to the beach");
		}else if (x>85) {
			System.out.println("it is hot I better stay home");
		}else {
			System.out.println("I should practice Java");
		}
		
	}
}