package java05_array.sort;

public class BubbleSort {
	public static void main(String[] args) {
		
		
		int[] ary= {3,2,5,4,1};
		
		int temp;
		
		//원본출력----------------------
		
		System.out.println("------정렬 전-----------");
		for(int i=0;i<ary.length;i++) {
			System.out.print(ary[i]+" ");
		}
		System.out.println();
		//*****----------버블정렬 수행--------------*****	
			//3 2 5 4 1 
			//2 3 4 1 5
			//2 3 1 4 5
			//2 1 3 4 5
			//1 2 3 4 5
		for(int i=0;i<ary.length-1;i++) {// ary 길이만큼
	
			for(int j=0;j<ary.length-1;j++) { //다음과 비교 //길이에서 하나씩 
				
				if(ary[j]>ary[j+1]) { //오름차순   	내림차순 -> ary[j]<ary[j+1]
				//swap
					temp=ary[j];
					ary[j]=ary[j+1];
					ary[j+1]=temp;
				}
			}
		}
		System.out.println("------정렬 후-----------");
		for (int i=0;i<ary.length;i++) {
			System.out.print(ary[i]+" ");
		}
		System.out.println();	
	}
}













