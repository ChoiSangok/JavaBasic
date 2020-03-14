package java08_abstract.interfaceEx.quiz2;


public class Array implements ArrayAction {
	String[] arr = new String[10];

	int count=0; //배열요소
	
	@Override
	public void add(String element) {		
		arr[count]=element;
		count++;

	}
	
	@Override //삭제
	public void remove(String element) {
		
		out:
		for(int i=0;i<count;i++) {
			if(arr[i]==element) {	
				for(int j=i;j<count;j++) {
					arr[j]=arr[j+1];
			}
				count--;
				break out;
			
			}

		}
	
	}

	@Override
	public String get(int idx) {			
		return arr[idx];
	}

	@Override
	public int find(String element) {
		int res=-1;

		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				res=i;
			}
		}
		return res;
	}

	@Override
	public void print() {
	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null) {
				System.out.println(arr[i]);
			
			}
		}
		
	}
	
	
	

	

}



