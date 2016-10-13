package exercises2;

import java.util.Scanner;

public class exc2 {
	long total_product = 1;
	double total_sum = 0;
	double average_tot;
	public boolean check_n1(int numb){
		if (numb>0 && numb <= 1000000){
			return true;
		}else{
			System.out.println("Input correct number");
		}
		return false;
	}
	public boolean check_n2(int n1, int n2){
		if(n1 < n2){
			return true;
		}else{
			System.out.println("n2 must be less than n3");
		}
		return false;
	}
	public double sum(double numb[]){
		
		for (int i=0;i<numb.length;i++){
			total_sum = total_sum + numb[i];
		}
		return total_sum;
	}
	public long product(double numb[]){
		for (int i=0;i<numb.length;i++){
			total_product = (long) (total_product * numb[i]);
		}
		return total_product;
	}
	public double average(double numb[]){
		average_tot = total_sum / numb.length;
		return average_tot;
	}

	public double variance_count(double numb[]) {
		float temp = 0;
		double[] data = null;
		for (int i = 0; i < numb.length; i++) {
			data[i] = numb[i] - average_tot;
			data[i] = data[i] * data[i];
			temp = (float) (temp + data[i]);
		}
		if (numb.length == 1) {
			double variance = (int) temp / numb.length;
			return variance;
		} else {
			double variance = (int) temp / (numb.length - 1);
			return variance;
		}
	}
	
	public double smallest(double numb[]) {
		double smallest_num = numb[0];
		for (int i = 0; i < numb.length; i++) {
			if (numb[i] <= smallest_num) {
				smallest_num = numb[i];
			} else if (numb[i] > smallest_num){
				smallest_num = smallest_num;
			}
		}
		return smallest_num;
	}
	
	public double largest(double numb[]) {
		double largest_num = numb[0];
		for (int i = 0; i < numb.length; i++) {
			if (numb[i] <= largest_num) {
				largest_num = largest_num;
			} else {
				largest_num = numb[i];
			}

		}
		return largest_num;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		exc2 obj = new exc2();
		int n1, n2, n3;
		int i = 0;
		int step = 0;
		do {
			System.out.print("Enter n1 number (1-1M) : ");
			n1 = in.nextInt();
		} while (obj.check_n1(n1) == false);
		do {
			System.out.print("Enter n2 (random): ");
			n2 = in.nextInt();
			System.out.print("Enter n3 (random): ");
			n3 = in.nextInt();
		} while (obj.check_n2(n2, n3) == false);

		double number[] = { n1, n2, n3 };
		System.out.println("Sum of number : " + obj.sum(number));
		System.out.println("Product of number :" + obj.product(number));
		System.out.println("Average : " + obj.average(number));
		System.out.println("Smallest number : " + obj.smallest(number));
		System.out.println("Largest number : " + obj.largest(number));

	}

}
