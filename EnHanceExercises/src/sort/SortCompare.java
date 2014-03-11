package sort;

import java.util.Random;

public class SortCompare {
	

	public static long time(String alg,Double[] a){
		long startMill = System.currentTimeMillis();
		
		if(alg.equals("Insertion")) InsertionSort.sort(a);
		else if(alg.equals("Selection")) SelectionSort.sort(a);
		else if(alg.equals("Shell")) ShellSort.sort(a);
		
		long endMill = System.currentTimeMillis();
		return endMill - startMill ;
	}
	
	public static long timeRandomInput(String alg,int N,int T){
		long total = 0;
		
		Double[] a = new Double[N];
		
		for(int t = 0 ; t < T ; t++){
			Random r = new Random();
			for(int i = 0 ; i < N ;i++)
				a[i] = r.nextDouble(); 
			total += time(alg,a);
		}
		
		return total;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int N = 1000;
		int T = 10000;
		
		long selectionTimes = timeRandomInput("Selection",N,T);
		long insertionTimes = timeRandomInput("Insertion",N,T);
		long shellTimes = timeRandomInput("Shell",N,T);
		
		System.out.println("For "+ N +" random double and "+ T +" times :");
		System.out.println("InsertionSort's time :" + insertionTimes);
		System.out.println("SelectionSor's time :" + selectionTimes);
		System.out.println("Shell's time : " + shellTimes);
		System.out.println("insertionsTimes/SelectionsTimes = " + 1.0 * insertionTimes/selectionTimes);
		System.out.println("shellTimes/insertionTimes = " + 1.0*shellTimes/insertionTimes);
		
	}

}
