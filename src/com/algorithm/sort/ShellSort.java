package com.algorithm.sort;
/*
 * @Class:ShellSort
 * @希尔 排序
 * @Description:
 * 
 */

public class ShellSort {
	public static void main(String[] args){
		int[] a = {2,1,4,3,6,5,7};
		shellsort(a);
	}
	public static void shellsort(int[] a){
		int  j;
		for(int gap=a.length/2;gap>0;gap/=2)
			for(int i=gap;i<a.length;i++)
			{
				int tmp = a[i];
				for(j=i;j>=gap&&tmp-a[j-gap]<0;j-=gap)//j>=gap没=会造成一个没排序。
					a[j]=a[j-gap];
				a[j]=tmp;
			}
		System.out.println(a[0]+":"+a[1]+":"+a[2]+":"+a[3]+":"+a[4]+":"+a[5]);
	}
}
