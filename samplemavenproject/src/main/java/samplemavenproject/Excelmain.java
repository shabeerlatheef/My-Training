package samplemavenproject;

import java.io.IOException;

import samplemavenproject.Excel;

public class Excelmain {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Excel ob= new Excel();
		String a=ob.readData(0,0);
        System.out.println("Value of a is "+a);
        
        String b=ob.readData(0,1);
        System.out.println("Value of b is "+b); 
		
		

	}

}
