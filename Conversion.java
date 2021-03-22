package com.example;

public class Conversion {
	
	 public static String convert(int n) {
	        int a=n;
	        String x = "";
	        while(n > 0)
	        {
	            a = n % 2;
	            x = a + "" + x;
	            n = n / 2;
	        }   
	        return x;
	    }
	
	    public static void main(String[] args) 
	    {
	    	String dec1 = convert(47);
	    	while((dec1.length())%8!=0) {
	    		dec1 = 0 + "" + dec1;
	    	}
	        StringBuilder sb=new StringBuilder(dec1);  
	        StringBuilder dec2 = sb.reverse(); 
	        System.out.println(Integer.parseUnsignedInt(dec2.toString(),2));  
	        
	    	
	    }
	   

}
