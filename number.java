import java.util.Scanner;

public class number {
	public static void main(String[] args) {
		System.out.println("ÊäÈëx");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		double x1 =Math.sqrt(x);
		if(x1>=4) {
			System.out.println(x1);
		}
	    else if(x1 < 4) {
	    	double y = (x1 + 5);
	    	double y1 = Math.pow(y,3.0);
	    	System.out.println(y1);
	    }
		
	    }	    			
	}

