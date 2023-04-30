//Euler 10
//Summation of primes
import java.util.Arrays;
public class Euler10{
	public static void main(String [] args){
		
		long sum = 0;
		boolean isPrime = false;
		for(int i = 1; i <= 2000000; i++){
			//test if is prime	
			for(int j = 2; j <i; j++){
				if(i%j == 0){
					isPrime = false;
					break;
				}else{
					isPrime = true;
				}
			}
			if(isPrime){
				sum += i;
			}	
		}
		System.out.println(sum);	
	}
}

/*

		//find primes using a sieve
		//
		
		int n = 2000000;
		boolean[] primes = new boolean[n];
		Arrays.fill(primes, true);

		for(int i = 2; i <= Math.sqrt(n); i++){
			if(primes[i]){
				int j = i*i;
				while(j<=n){
					primes[j] = false;
					j = j+i;
				}
			}	
		}

		int sum = 0;
		for(int i = 0; i < primes.length - 1; i++){
			if(primes[i])
				sum+=i;
		}
		System.out.printf("The sum of primes below %d is %d",n,sum); 
	}

}

/* Euler 7 - 10001st prime
   Print out the 10001st prime number.
 
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
*/
