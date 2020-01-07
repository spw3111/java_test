
public class Main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SampleClass의 인스턴스 만들기
		//위의 구문은 수행을 하고 인스턴스에 참조를 리턴합니다
		//이 인스턴스를 재사용 하려면 인스턴스의 참조를 동일한 자료형의 변수에 대입을 해야합니다. 
		/*Test_200107 obj = new Test_200107();
		
		
		//final 변수는 생성과 동시에 값을 할당
		//값을 변경할 수 없기 때문입니다.
		//final변수의 이름은 모두 대문자로 만드는것이 관례
		
		final int TEN = 10;
		//TEN = 20; //이 문장은 에러*/
		
		//SampleClass의 인스턴스를 두개 생성
		SampleClass ob1 = new SampleClass();
		SampleClass ob2 = new SampleClass();
		
		//인스턴스 변수에 값 대입
		ob1.name = "첫번째 인스턴스";
		ob2.name = "두번째 인스턴스";
		//static이 붙지 않은 멤버는 클래스는 호출할 수 없습니다.
		//SampleClass.name은 안됨.
		//인스턴스 변수 값의 출력
		System.out.println(ob1.name);
		System.out.println(ob2.name);
		
		//static 변수에 값 대입
		//클래스와 인스턴스 모두 접근 가능
		ob1.share = 100;
		SampleClass.share=200;
				//static변수는 하나만 만들어서 공유
				//출력을 해보면동일한 값을 출력.
				System.out.println(ob1.share);
				System.out.println(ob2.share);
				System.out.println(SampleClass.share);
				
				
	}

}

