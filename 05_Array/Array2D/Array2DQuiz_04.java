package java05_array.array2D;

public class Array2DQuiz_04 {
	public static void main(String[] args) {
		
		int[][] ary=new int[5][5];
		
		
		int k=0;
		
		for(int i=0;i<ary.length;i++) {
			for(int j=ary[i].length-1;j>=0;j--) {
				ary[j][i]=k++;
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

//5	10	15	20	25
//4	9	14	19	24
//3	8	13	18	23
//2	7	12	17	22
//1	6	11	16	21
