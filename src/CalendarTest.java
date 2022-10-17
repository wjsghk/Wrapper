import java.util.Calendar;
import java.util.Scanner;
//p.373
public class CalendarTest {

	public static void main(String[] args) {
//		Calendar c = Calendar.getInstance();
//		System.out.println(c.get(Calendar.YEAR)+ "년");
//		System.out.println((c.get(Calendar.MONTH) + 1) +"월");//0~11이기 때문에
//		System.out.println(c.get(Calendar.DATE) + "일");
//		System.out.println(c.get(Calendar.HOUR) + "시");
//		System.out.println(c.get(Calendar.MINUTE) + "분");
//		System.out.println(c.get(Calendar.SECOND) + "초");
//		System.out.println(c.get(Calendar.DAY_OF_WEEK) + "요일");//1.일요일 1~7
		

		Scanner sc = new Scanner(System.in);
		System.out.println("년 입력하세요");
		int year = sc.nextInt();
		System.out.println("월을 입렵하세요");
		int month = sc.nextInt();
		int START_DAY_OF_WEEK= 0;
		int END_DAY =0;
		
		Calendar sDay = Calendar.getInstance();//Calendar은 추상클래스여서 new 생성을 안쓰고 getInstance()으로 생성한다.
		Calendar eDay = Calendar.getInstance();
		sDay.set(year,month-1,1);//시작하는(start) 달의 1일 날짜로 초기화     ,set()은 날짜와 시간을 설정하는 메소드이다.
		eDay.set(year,month,1);//다음(end)달의 1일 날짜로 초기화
		
		eDay.add(Calendar.DATE, -1);//전달의 마지막날짜
		
		START_DAY_OF_WEEK= sDay.get(Calendar.DAY_OF_WEEK);//7: 토요일(10월기준)
		END_DAY = eDay.get(Calendar.DATE);// 31 (10월기준)
		
		System.out.println("      "+ year + "년 "+ month +"월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		for(int i=1; i<START_DAY_OF_WEEK;i++) {
			System.out.print("   ");
		}
		
		for(int i=1,n = START_DAY_OF_WEEK;i<=END_DAY;i++,n++) {
			System.out.print((i < 10 ? "  " + i : " " + i));//빈칸 2칸 ,1칸  ?=>삼환?연산문 조건문이 맞으면 참 아니면 거짓
			if(n % 7 ==0){
				System.out.println();//주 7일이니까 7의 배수형태의 줄 바꿈이다
			}
		}
		
		
		
	}

}
