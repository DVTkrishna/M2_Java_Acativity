import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Q2{

    public static void main(String[] as) {
        
        Scanner sc=new Scanner(System.in);

	System.out.println("Enter the first string : ");
        String P1=sc.nextLine();
	
	System.out.println("Enter the second string : ");
        String P2=sc.nextLine();
	
	String[] arr1=P1.split(" ");
   	String[] arr2=P2.split(" ");
   	String name=arr1[1];
   	String name1=arr2[1];

   	{
    	
	System.out.println("Output: ");
	 if(name.equals(name1))
	 {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
}
}
}