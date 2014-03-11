package sort;

import java.util.Random;

public class QuickSort extends AbstractSort {

	public static void sort(Comparable[] a){
	   
		quick_sort(a,0,a.length-1);
		
	}

	private static void quick_sort(Comparable[] a, int left, int right) {
		if(left >= right ) return ;
		
		int N = right - left + 1 ; 
		Random  random = new Random();
		int p = random.nextInt(N) + left ;
		
		Comparable temp = a[p] ;
		
		exch(a,right,p);
		int i = left ,
			j = right ;
		    
		while(i < j ){
			while(less(temp,a[j]) && i < j) j-- ;
			if(i < j ) a[i++] = a[j]; 
			
			while(less(a[i],temp) && i < j) i++;
			
			if(i < j )a[j--] = a[i];
		}
		
		a[i] = temp ; 
		
		quick_sort(a,left,i-1);
		quick_sort(a,i+1,right);
	}
	
	
    public static void main(String[] args){
		int N = 10 ; 
		Integer[] a = new Integer[N];
		Random random = new Random();
		for(int i = 0; i < N; i++)
			a[i] = random.nextInt(30);
		sort(a);
		show(a);
		
	}
}
