
public class SampleClass {
	//static변수-클래스로 접근 가능, 인스턴스로도 접근가능.
	//모든 인스턴스가 공유
	static int share = 1;
	
	//인스턴스 변수(멤버변수)-인스턴스만 접근이 가능하고 각 인스턴스가 별도로 소유 
	 String name;
	 
	 //static 초기화 블럭
	 static {
		 System.out.println("클래스가  처음 호출될 때 1번만 수행");
	 }
}
