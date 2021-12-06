import java.util.*;
public class Utils {

	public static void main (String[] args)
	   {
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("Width?");
		   int length = scanner.nextInt();
		   System.out.println("Length?");
		   int width = scanner.nextInt();

		   calcArea(width, length);

	   }

public static void calcArea(int width, int length){
	
	int area = (width*length);
	System.out.println("Area is " + (area));
}
}