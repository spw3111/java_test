////정렬

public class Test_200107 {

	public static void main(String[] args) {

		int [] ar = {20, 30, 40, 50, 10,35,7,22};
		int len=ar.length;
		
		
		for(int i=0;i<len-1;i=i+1) {
			for(int j=i+1;j<len;j=j+1) {
				if(ar[i]>ar[j]) {
					int temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
				}
			}
		}
		//데이터 출력
		for(int temp:ar) {
			System.out.print(temp+"\t");
		}

	}

	
}


