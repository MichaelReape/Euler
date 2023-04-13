/* Euler 7 - 10001st prime
   Print out the 10001st prime number.*/
 
public class euler7{
	public static void main(String[] args){
		int[] arr = new int[10001];
		arr[0] = 2;
		int num = 3;
		int count = 1;
		boolean isPrime = false;
		while(count < 10001){
			for(int i = 2; i < num; i++){
				if(num%i == 0){
					isPrime = false;	
					break;	
				}else{
					isPrime = true;
				}
			}
			if(isPrime){
				arr[count] = num;
				count++;
			}
			num++;	
		}
		System.out.println("The 10001st prime number is :" + arr[10000]);		
	}
}
