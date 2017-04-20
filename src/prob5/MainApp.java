package prob5;

public class MainApp {

	public static void main(String[] args) {
		try {
			MyStack<String> stack = new MyStack<String>(3);
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java");
			stack.push(".");

			
			
			while (stack.isEmpty() == false) {
				//런타임 에러
				//제네릭을 사용하지 않으면 런타임때 에러를 발생함
				//Integer integer = (Integer)stack.pop();  //확장성도 중요하지만 안정성에 문제가 생기기 때문에 제네닉을 사용하게된다.
				String s= stack.pop();
				
				System.out.println(stack.pop());
			}

			System.out.println("======================================");

			
			stack = new MyStack(3);
			stack.push("Hello");

			System.out.println(stack.pop());
			
			System.out.println(stack.pop());
			
		} catch (MyStackException ex) {
			System.out.println( ex );
		}

	}

}
