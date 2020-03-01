package java05_array.array2D;

public class Array2DQuiz_02 {
	public static void main(String[] args) {
		
		int[][] ary=new int[5][5];
		
		
		int k=0;
		
		for(int i=0;i<ary.length;i++) { //0-4
			for(int j=ary.length-1;j>=0;j--) { //j 4-0
				
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

//5	4	3	2	1
//10	9	8	7	6
//15	14	13	12	11
//20	19	18	17	16
//25	24	23	22	21
