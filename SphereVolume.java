 
import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	       //Declare double variables diameter and volume
	       double diam;
	       double volume;
	       
	       System.out.println("CALCULATION OF VOLUME OF SPHERE");
	       System.out.println("Enter diameter of the sphere : ");
	       diam=Double.parseDouble(scanner.nextLine());
	      
	       
	       double radius=diam/2;
	      
	
	       volume=(4/3.0)*Math.PI*Math.pow(radius, 3.0);
	       System.out.println("Volume of the sphere : " + volume);

	}

}
