//Euler 9
//Find the Pythagorean triplet a+b+c=1000

public class euler9{
	public static void main(String[] args){
		
		for(int a = 1; a < 1000; a++){
			for(int b = a + 1;b < 1000; b++){
			int c = (int)Math.pow(a,2) + (int)Math.pow(b,2);
			if(a+b+(int)Math.sqrt(c) ==1000 && Math.sqrt(c) % 1 == 0){
					System.out.println(a*b*(int)Math.sqrt(c));
					System.out.println("a = " + a+ " b = " + b + " c = " + Math.sqrt(c));
				}	

			}

		}

	}
}
