
public class WrapperTest {
//p351
	public static void main(String[] args) {
		//Wrapper Class : �⺻���� ���������� ����ȯ (�ڽ�,��ڽ�)
		//�ڽ� : �⺻�� -> ������
		//��ڽ� : ������ -> �⺻�� 
		int i =10;//�⺻��
		Integer intg = i;//������,�ڽ�����//(=(integer)i;)//(=new integer(1);)
		
		Integer intg2 = new Integer(10);
		int i2 = intg2; //��ڽ�
		
		System.out.println(intg2 + i2);//���굵 �����ϴ�
		
		Object obj = (Object)i; // Object�� '�ڽ���' ���� �ϰ� '��ڽ���' �Ұ����ϴ�
		// int i3 =obj; ��ڽ��� �Ұ���
		
		String str = "50";
		int i4 = Integer.parseInt(str);
		
		System.out.println(i4);
		

	}

}
