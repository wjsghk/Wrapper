
public class WrapperTest {
//p351
	public static void main(String[] args) {
		//Wrapper Class : 기본형과 참조형간의 형변환 (박싱,언박싱)
		//박싱 : 기본형 -> 참조형
		//언박싱 : 참조형 -> 기본형 
		int i =10;//기본형
		Integer intg = i;//참조형,박싱형태//(=(integer)i;)//(=new integer(1);)
		
		Integer intg2 = new Integer(10);
		int i2 = intg2; //언박싱
		
		System.out.println(intg2 + i2);//연산도 가능하다
		
		Object obj = (Object)i; // Object는 '박싱은' 가능 하고 '언박싱은' 불가능하다
		// int i3 =obj; 언박싱은 불가능
		
		String str = "50";
		int i4 = Integer.parseInt(str);
		
		System.out.println(i4);
		

	}

}
