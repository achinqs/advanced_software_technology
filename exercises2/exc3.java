package exercises2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;


public class exc3 {
	DecimalFormat newFormat = new DecimalFormat("#.##");
	
	
	public double function(int k, int n){
		double product = 1;
		double oi = 0.0;
		for (int i = 1;i<n;i++){
			if (i==1){
				oi = 0.5;
			}
			else if(i>1 && i<k){
				oi = 0.9;
			}else if (k <= i){
				oi = 0.1;
			}
			product = product * (oi/(1-oi));
		}
		double result_product = 1 - 1/(1 + product);
		double result =  Double.valueOf(newFormat.format(result_product));
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		exc3 obj = new exc3();
		int step = 0;
		while (step >= 0) {
			System.out.println("1. Find f for three kinds of k and n");
			System.out.println("2. Change k and n");
			System.out.println("3. Increment n value");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			int input = in.nextInt();
			if (input == 1) {
				step = 1;
			} else if (input == 2) {
				step = 2;
			} else if (input == 3) {
				step = 3;
			} else if (input == 4) {
				step = -1;
			} 
			if (step == 1){
				System.out.println("result f for k,n(10,20): "+obj.function(10, 20));
				System.out.println("result f for k,n(100,120): "+obj.function(100, 120));
				System.out.println("result f for k,n(1000,1200): "+obj.function(1000, 1200));
				System.out.println("result f for k,n(10000,10200): "+obj.function(10000, 10200));
			}else if(step == 2){
				System.out.println("Change k and n");
				System.out.println("Default k,n (10,20)(100,120)(1000,1200)(10000,10200)");
				System.out.print("Input k : ");
				int k_value = in.nextInt();
				System.out.print("Input n : ");
				int n_value = in.nextInt();
				System.out.println("result f for k,n("+k_value+","+n_value+"): "+obj.function(k_value, 20));
			}else if(step == 3){
				System.out.println("Increasing n by increment, start from n=20");
				System.out.print("Input length of increase : ");
				int n_value = in.nextInt();
				int default_n = 20;
				int n = default_n;
				for (int i=20;i<=n;i++){
					System.out.println("result f for k,n(10,"+i+"): "+obj.function(10, i));
					if (i < default_n+n_value){
						n++;
					}
					
				}
			}
		}
		
	}

}
