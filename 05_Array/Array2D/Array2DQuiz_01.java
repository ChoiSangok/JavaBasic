package java05_array.array2D;

public class Array2DQuiz_01 {
	public static void main(String[] args) {
		
		int[][] ary=new int[5][5];
		
		
		int k=0;
		
		for(int i=0;i<ary.length;i++) { //i i-4 i++
			for(int j=0;j<ary[i].length;j++) { //j =0 j -4 j++
				ary[i][j]=k++;
				
				
			}
		}
		
		
		for(int i=0;i<ary.length;i++) {
			for(int j=0;j<ary[i].length;j++) {
				System.out.print(ary[i][j]+1+"\t");
			}
			System.out.println();
		}
	}
	
	

}
//Q1.
//1	2	3	4	5	
//6	7	8	9	10	
//11	12	13	14	15	
//16	17	18	19	20	
//21	22	23	24	25
