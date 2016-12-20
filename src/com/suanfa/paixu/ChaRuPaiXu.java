package com.suanfa.paixu;

public class ChaRuPaiXu {
	public static void main(String[] args){
		int[] a= {1,2,5,6,8};
		sort(a);
	}
	public static void sort(int[] a){
		int j,p=1;
		for(;p<a.length;p++){
			int tmp = a[p];
			for(j=p;j>0&&(tmp-a[j-1])<0;j--)//"<0"顺序;">0"倒叙
				a[j]=a[j-1];
			a[j] = tmp;
		}
		System.out.println(a[0]+":"+a[1]+":"+a[2]+":"+a[3]+":"+a[4]);
	}
	
}
