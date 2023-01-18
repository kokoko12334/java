package data_structure;

import java.util.Stack;

public class Stk {
	public static void main(String[] args) {
		//stack클래스보다는 ArrayDeque를 쓰는 것을 지향한다고 함
		//스택 객체생성,  <>는 데이터타입    벡터로 구현됨, 벡터는 arraylist와 비슷한것
		Stack<Integer> stack = new Stack<>();
		
		
		//stack 데이터추가(벡터로 구현된서(상속) add도 쓰는 듯)
		stack.add(1);
		stack.add(2);
		stack.add(3);
		//선택한 인덱스번호 출력
		System.out.println(stack.get(1));
		
		//스택이 비었는지 확인
		System.out.println(stack.isEmpty());
		
		//stack 팝
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.isEmpty());
		
		//stack push(add보다이게 더명확한듯)
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.get(1));
		
		//마지막요소 반환(삭제는 안함)
		System.out.println(stack.peek());
	}
}
