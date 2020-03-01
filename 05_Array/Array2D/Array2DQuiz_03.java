package java05_array.array2D;

public class Array2DQuiz_03 {
	public static void main(String[] args) {
		
		int[][] ary=new int[5][5];
		
		
		int k=0;
		
		for(int i=0;i<ary.length;i++) { //i 0 i 0-4 i++
			for(int j=0;j<ary[i].length;j++) { //j 0 j 0-4 j++
				ary[j][i]=k++; //
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
//1	6	11	16	21
//2	7	12	17	22
//3	8	13	18	23
//4	9	14	19	24
//5	10	15	20	25
