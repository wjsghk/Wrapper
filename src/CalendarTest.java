import java.util.Calendar;
import java.util.Scanner;
//p.373
public class CalendarTest {

	public static void main(String[] args) {
//		Calendar c = Calendar.getInstance();
//		System.out.println(c.get(Calendar.YEAR)+ "��");
//		System.out.println((c.get(Calendar.MONTH) + 1) +"��");//0~11�̱� ������
//		System.out.println(c.get(Calendar.DATE) + "��");
//		System.out.println(c.get(Calendar.HOUR) + "��");
//		System.out.println(c.get(Calendar.MINUTE) + "��");
//		System.out.println(c.get(Calendar.SECOND) + "��");
//		System.out.println(c.get(Calendar.DAY_OF_WEEK) + "����");//1.�Ͽ��� 1~7
		

		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Է��ϼ���");
		int year = sc.nextInt();
		System.out.println("���� �Է��ϼ���");
		int month = sc.nextInt();
		int START_DAY_OF_WEEK= 0;
		int END_DAY =0;
		
		Calendar sDay = Calendar.getInstance();//Calendar�� �߻�Ŭ�������� new ������ �Ⱦ��� getInstance()���� �����Ѵ�.
		Calendar eDay = Calendar.getInstance();
		sDay.set(year,month-1,1);//�����ϴ�(start) ���� 1�� ��¥�� �ʱ�ȭ     ,set()�� ��¥�� �ð��� �����ϴ� �޼ҵ��̴�.
		eDay.set(year,month,1);//����(end)���� 1�� ��¥�� �ʱ�ȭ
		
		eDay.add(Calendar.DATE, -1);//������ ��������¥
		
		START_DAY_OF_WEEK= sDay.get(Calendar.DAY_OF_WEEK);//7: �����(10������)
		END_DAY = eDay.get(Calendar.DATE);// 31 (10������)
		
		System.out.println("      "+ year + "�� "+ month +"��");
		System.out.println(" SU MO TU WE TH FR SA");
		
		for(int i=1; i<START_DAY_OF_WEEK;i++) {
			System.out.print("   ");
		}
		
		for(int i=1,n = START_DAY_OF_WEEK;i<=END_DAY;i++,n++) {
			System.out.print((i < 10 ? "  " + i : " " + i));//��ĭ 2ĭ ,1ĭ  ?=>��ȯ?���깮 ���ǹ��� ������ �� �ƴϸ� ����
			if(n % 7 ==0){
				System.out.println();//�� 7���̴ϱ� 7�� ��������� �� �ٲ��̴�
			}
		}
		
		
		
	}

}
