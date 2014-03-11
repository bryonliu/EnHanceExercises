package sort;

import java.util.Random;

import enuminfo.SortEunm;

public class SortCompare {
	

	public static long time(SortEunm sort,Double[] a){
		long startMill = System.currentTimeMillis();
		
		if(sort == SortEunm.INSERTION) InsertionSort.sort(a);
		else if(sort == SortEunm.SELECTION) SelectionSort.sort(a);
		else if(sort == SortEunm.SHELL) ShellSort.sort(a);
		else if(sort == SortEunm.QUICK) QuickSort.sort(a);
		else if(sort == SortEunm.HEAP) HeapSort.sort(a);
		long endMill = System.currentTimeMillis();
		return endMill - startMill ;
	}
	
	public static long timeRandomInput(SortEunm sort,int N,int T){
		long total = 0;
		
		Double[] a = new Double[N];
		
		for(int t = 0 ; t < T ; t++){
			Random r = new Random();
			for(int i = 0 ; i < N ;i++)
				a[i] = r.nextDouble(); 
			total += time(sort,a);
		}
		
		return total;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int N = 1000;
		int T = 1000;
		
		long selectionTimes = timeRandomInput(SortEunm.SELECTION,N,T);
		long insertionTimes = timeRandomInput(SortEunm.INSERTION,N,T);
		long shellTimes = timeRandomInput(SortEunm.SHELL,N,T);
		long quickTimes = timeRandomInput(SortEunm.QUICK,N,T);
		long heapTimes = timeRandomInput(SortEunm.HEAP,N,T);
		
		System.out.println("For "+ N +" random double and "+ T +" times :");
		System.out.println("InsertionSort's time :" + insertionTimes);
		System.out.println("SelectionSor's time :" + selectionTimes);
		System.out.println("Shell's time : " + shellTimes);
		System.out.println("quick's time :" + quickTimes);
		System.out.println("heap's time   :" + heapTimes);
		System.out.println("insertionsTimes/SelectionsTimes = " + 1.0 * insertionTimes/selectionTimes);
		System.out.println("shellTimes/insertionTimes = " + 1.0*shellTimes/insertionTimes);
		
	}

}
