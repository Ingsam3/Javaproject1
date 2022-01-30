
package first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 

완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.*/

/*제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.*/

public class CodingTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> participant = new ArrayList<String>();

		participant.add("1");
		participant.add("2");
		participant.add("3");
		participant.add("4");
		participant.add("5");

		Collections.shuffle(participant); // num 값들 랜덤으로 순서 재배치

		for (int i = 0; i < participant.size(); i++) {
			System.out.println(participant.get(i));
		}
		
		
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
