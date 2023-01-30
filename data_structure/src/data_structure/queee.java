package data_structure;

import java.util.ArrayDeque;

public class queee {
public static void main(String[] args) {
	//큐,덱은 LinkedList로 구현 할 수도 있음.
			ArrayDeque<Integer> queue = new ArrayDeque<>();
			//추가
			queue.add(3);
			queue.add(2);
			queue.add(1);
			// 맨 앞의 값 반환(삭제는 안함)
			System.out.println(queue.peek());
			
			//맨앞의 값  pop
			System.out.println(queue.poll());
			//요소의 갯수
			System.out.println(queue.size());
}
}
