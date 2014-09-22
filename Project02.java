//Meet R Patel
//Nikhil Seshagiri
//Source code 

package classes;

import java.util.Scanner;

public class Project02 {
	static int length;
	static int width;
	static int depth_shallowend;
	static int depth_deepend;
	String name;
	
	public void setLength(){
		
		System.out.println("Enter length in feet");
		Scanner sc=new Scanner(System.in);
		try{	
			length=sc.nextInt();
			}
		catch(Exception e)
			{
			System.out.println("You have entered characters or special characters");
			}
		
		if(length<=0 || length>= 60){
			System.out.println(" Invalid!!You have entered illegal values.enter positive value between 1 to 60");
		}
						
		}
	
	public int getLength(){
		return length;
	}
	
	
public void setwidth(){
		
		System.out.println("Enter width in feet");
		Scanner sc=new Scanner(System.in);
		try{	
			width=sc.nextInt();
			}
		catch(Exception e)
			{
			System.out.println("You have entered characters or special characters");
			}
		
		if(width<=0 || width>= 40){
			System.out.println("Invalid!! You have entered illegal values.enter positive value between 1 to 40");
		}
						
		}
	
	public int getwidth(){
		return width;
	}
	public static void main(String[] args) {
		
		Project02 p2=new Project02();
		p2.setwidth();

	}

public void setdepth_shallowend(){
		
		System.out.println("Please enter length of shallow end");
		Scanner sc=new Scanner(System.in);
		try{	
			depth_shallowend=sc.nextInt();
			}
		catch(Exception e)
			{
			System.out.println("You have entered characters or special characters");
			}
		
		if(depth_shallowend<=0 || depth_shallowend>= 4){
			System.out.println("Invalid!! You have entered illegal values.enter positive value between 1 to 4");
		}
						
		}
	
	public int getdepth_shallowend(){
		return depth_shallowend;
	}
public void setdepth_deepend(){
		
		System.out.println("Enter depth of deep end in feet");
		Scanner sc=new Scanner(System.in);
		try{	
			depth_deepend=sc.nextInt();
			}
		catch(Exception e)
			{
			System.out.println("You have entered characters or special characters");
			}
		
		if(depth_deepend<=0 || depth_deepend>= 7){
			System.out.println("Invalid!!You have entered illegal values.enter positive value between 1 to 7");
		}
		
		}
	
	public int getdepth_deepend(){
		return length;
	}
public void setname(){
		
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		try{	
			name=sc.next();
			}
		catch(Exception e)
			{
			System.out.println("You have entered numbers or special characters");
			}
		
		/*if(depth_deepend<=0 || depth_deepend>= 30){
			System.out.println("You have entered illegal values.enter positive value between 1 to 30");
		}*/
						
		}
	
	public String getname(){
		return name;
	}
}
