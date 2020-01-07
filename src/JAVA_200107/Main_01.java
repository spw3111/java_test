package JAVA_200107;

public class Main_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		//일정한 패턴을 갖는 연속된 문장->반복문으로 변경
		//MethodClass의 인스턴스를 생성
		Java_sub obj = new Java_sub();
		
		obj.disp(3);
		///메소드호출-수행할 내용을 변경하고자 한다면 메소드의 내용만 변경
		System.out.println("Hello Python");

	
		
		int x = 100;
		int []  br = {100,200,300};
		obj.inc(x);
		//x값은 직접 호출해서 변경하지 않는 이상 절대로 변경되지 않음
		System.out.println("x:"+x);
		
		obj.dec(br);
		System.out.println("br[0]:"+br[0]);
		 
		obj.sum(10,20,30,40);
	}
	

}
