package JAVA_200107;

public class Java_sub {
	/////매개변수가 없고 리턴타입이 void인 메소드
	public void disp(int n) {
		///////메소드의 내용
		for(int i=0;i<n;i=i+1) {
			System.out.println("Hello Java");
		}
	}
		
	
	//정수1개를 매개변수로 받아서 1증가시키고 출력하는 메소드:Call By Value
	public void inc(int n){
		n=n+1;
		System.out.println("n:" + n);
	}
	//배열 1개를 매개변수로 받아서 첫번째 데이터를 1 감소시키고 출력하는 메소드: Call By Reference
	public void dec(int [] ar) {
		ar[0] = ar[0] -1;
		System.out.println("ar[0]:"+ ar[0]);
	}
	
	//정수 데이터가 몇개가 오던지 합계를 구해서 출력해주는 메소드
	public void sum(int ...ar) {
		int sum = 0;
		for(int data : ar) {
			sum = sum+data;
		}
		System.out.println("합계:"+sum);
	}
	


}

