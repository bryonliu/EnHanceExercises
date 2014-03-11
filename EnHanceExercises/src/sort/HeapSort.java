package sort;

import java.util.Random;

public class HeapSort extends AbstractSort {

	public static void sort(Comparable[] a){
		buildHeap(a);  // 建立堆
		
		for(int i= a.length - 1 ; i >=1 ; i--){
			exch(a,0,i);
			adjust(a,0,i);  //注意i 的值，开始的时候为length -1
		}
	}
	
	/**
	 *  建立大顶堆
	 * @param a
	 */
	private static void buildHeap(Comparable[] a){
		
		int length = a.length ; 
		for(int i = length/2 -1 ; i >= 0 ;i--)
			adjust(a,i,length);
	}
	/*@name adjust 
	 * @Function： 调整以节点 i 为顶点的堆
	 */
	private static void adjust(Comparable[] a ,int i,int length){ 
		
		int left = 2*i + 1,
			right= 2*i + 2 ;
		if(left >= length && right >= length) return ; 
		int max = i;
		
		if(left < length && less(a[max],a[left]))
			max = left;
		if(right <length && less(a[max],a[right]))
			max = right ;
		if(max!=i){
			exch(a,i,max);
			adjust(a,max,length);
		}
	    
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
