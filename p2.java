


import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
	       
	         
	         float n,r,d;

	           
	        Scanner data = new Scanner(System.in);
	        System.out.println("Enter Total Training Hour :");
	        n = data.nextFloat();
	        System.out.println("Enter Class Hour :");
	        r = data.nextFloat();
	        
	        if(n>0 && r>0 && n>=r){
	        d = n/r;
	        System.out.println("Total number of classes : "+d);
	        
	        
	        
	            for (int i = 1; i <= d; i++) {
	                System.out.println("Days "+i);
	            }
	        }
	        
	               
	    }
	}