package circle;

import java.util.Scanner;

class Circle1 {
	
int radius;	
final float pi = 3.14159f;
Circle1(int d){
	radius=d;
	}
}
 class Area extends Circle1{
	Area(int d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

public void calculatearea() {
	float area;
	area=pi*(radius*radius);
		System.out.println("Area of circle is:" + area);
		
	}
 }
 
class Diametre extends Area{
		

	 Diametre(int d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	 
	 
public void calculatdiametre() {
	 	float diametre;
	 
	 		
	 		diametre=2*radius;
	 		
	 		System.out.println(" The diameter of circle is:"+ diametre);
	 	}
	  }
class Circumference extends Diametre{
		

	 Circumference(int d) {
		super(d);
		// TODO Auto-generated constructor stub
	}


public void calculatcircumference() {
	 	float circumference;
	 
	 		
	 		circumference=2*radius*pi;
	 		
	 		System.out.println(" The circumference of circle is:"+ circumference);
	 	}
	  }

public class Circle{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the radius:" );
		
		int d=sc.nextInt();
		
		
		Area a= new Area(d);
		
		a.calculatearea();
	Diametre f= new Diametre(d);
	f.calculatdiametre();
	Circumference h= new Circumference(d);
	h.calculatcircumference();
		
	}
	
}


