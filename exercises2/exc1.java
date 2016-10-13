package exercises2;

import java.util.Scanner;

public class exc1 {
	long time_result [] = new long[3];
	int total=0;
	public long time(){
		long time = System.currentTimeMillis();
		return time;
	}
	public long total_time(long start_time, long end_time){
		long total = end_time - start_time;
		
		return total;
	}
	public long count_int(int numb){
		for(int i=0;i<numb;i++){
			total = total + i;
		}
		System.out.println(total);
		return total;
	}
	public static void main(String[] args) {
		exc1 obj = new exc1();
		prime pr = new prime();
		Scanner in = new Scanner(System.in);
		int step = 0;
		while (step >= 0) {
			System.out.println("1. Find int prime number");
			System.out.println("2. Counting time calculation");
			System.out.println("3. Exit");
			System.out.print("Choose an option: ");
			int input = in.nextInt();
			if (input == 1) {
				step = 1;
			} else if (input == 2) {
				step = 2;
			} else if (input == 3) {
				step = 3;
			}
			if (step == 1) {
				int input_number = in.nextInt();
				System.out.print("Enter range number: ");
				long start_time = obj.time();
				pr.find_prime_int(input_number);
				long end_time = obj.time();
				System.out.println(obj.total_time(start_time, end_time)+" milisecond");
			}else if (step == 2) {
				System.out.print("Enter range number: ");
				int input_number = in.nextInt();
				long start_time = obj.time();
				obj.count_int(input_number);
				long end_time = obj.time();
				System.out.println("total time n: "+obj.total_time(start_time, end_time)+" milisecond");
				long start_time2 = System.currentTimeMillis();
				obj.count_int(2*input_number);
				long end_time2 = System.currentTimeMillis();
				System.out.println("total time 2n: "+obj.total_time(start_time2, end_time2)+" milisecond");
				long start_time3 = System.currentTimeMillis();
				obj.count_int(10*input_number);
				long end_time3 = System.currentTimeMillis();
				System.out.println("total time 10n: "+obj.total_time(start_time3, end_time3)+" milisecond");
				
			}else if (step == 3) {
				step = -1;
			}
		}
	}

}

class prime{
	public boolean is_prime(int numb){
		int temp = 2;
		if (numb <= 1){
			return false;
		}else if(numb == 2){
			return true;
		}
		for(int i=3;i<=numb;i++) {
			if (numb % temp == 0) {
				return false;
			} else {
				temp++;
			}
		}
		return true;
	}
	public void find_prime_int(int max_numb){
		for (int i=0;i<max_numb;i++){
			if(is_prime(i) == true){
				System.out.println(i);
			}
		}
	}

}