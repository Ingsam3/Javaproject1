
package first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.

�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, 

�������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.*/

/*���ѻ���
������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
������ �߿��� ���������� ���� �� �ֽ��ϴ�.*/

public class CodingTest_1 {

	private static Object function;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> participant = new ArrayList<String>();

		participant.add("1");
		participant.add("2");
		participant.add("3");
		participant.add("4");
		participant.add("5");

		Collections.shuffle(participant); // num ���� �������� ���� ���ġ

		for (int i = 0; i < participant.size(); i++) {
			System.out.println(participant.get(i));
		}
		
		Scanner scan = new Scanner(System.in);
		
		int age, a;//����, �й�
		String b, c, d;// �̸�, �а�, �ּ�
		System.out.print("���̸� �Է��ϼ���:");
		age = scan.nextInt();
		System.out.print("�̸��� �Է��ϼ���:");
		b = scan.nextLine();
		System.out.print("���̴�"+age+" �Դϴ�." );
		System.out.print("�̸���"+b+"�Դϴ�." );
		
		
	   
		
		/* def solution(participant, completion):

		    a = (set(participant)-set(completion))

		    answer = list(a)

		    if len(answer) != 0:
		        return answer[0]

		    elif len(answer) == 0:
		        participant.extend(completion)
		        for i in participant:
		            if participant.count(i)%2 == 1:
		                return i */

	}

}
