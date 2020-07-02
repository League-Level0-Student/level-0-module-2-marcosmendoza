import java.util.Random;

class apples{
	
	public static void main (String[] args)  {
		
		
		Random randy = new Random();
		int number;
		
		for(int counter=1; counter<=10;counter++) {
		
		number = randy.nextInt(6);
		System.out.println(number + " ");
	}
}
	
}