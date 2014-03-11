package sort;

import java.util.Random;

public class ShellSort extends AbstractSort {

	
	public static void sort(Comparable[] a){
		int N = a.length;
		int step = N/2 ; 
		
		while(step >= 1){
			
			for(int i = step ; i < N ; i++)
				for(int j=i;j>=step && less(a[j],a[j-step]);j-=step)
					exch(a,j,j-step);
			step /= 2;
		}
	}
	
	public static void main(String[] args){
		
		Integer[] a = new Integer[10];
		Random random = new Random();
		for(int i = 0; i < 10; i++)
			a[i] = random.nextInt(100);
		sort(a);
		show(a);
		
	}
}
