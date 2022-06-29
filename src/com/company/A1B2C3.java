package com.company;

import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

public class A1B2C3 {

	public static void main(String [] args) throws IOException {		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your String ");
		String str = in.next();	
		//String str = "A11B4C11";
			int index = 0;

		while(index < str.length()){
				
				char ch = str.charAt(index);  //A
				index += 1;		//1 
				int num = 0;   //0
				
			l1:{
				while((str.charAt(index) >= '0' && str.charAt(index) <= '9')) {
					
					num = num * 10 + (int)str.charAt(index) - 48; 
					index++;
					if(index == str.length())
						break l1;
				} 
			}
			if(num == 0 && ch != '\0') {
				System.out.print(ch);
			}
				
			for(int j = 0; j < num; j++) {
					System.out.print(ch);
				}
				
				//System.out.println(ch+ "      "+num);
			}
		
	}
}
