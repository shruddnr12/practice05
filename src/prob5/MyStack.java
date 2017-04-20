package prob5;

public class MyStack<T> {
	private int top;
	private T[] buffer;
	
	public MyStack( int capacity ) {
		top = -1;
		buffer = (T[])new Object[ capacity ];
	}

	public void push( T s ) {
		if( top == buffer.length - 1 ) {  // stack is full
			resize();
		}
		buffer[ ++top ] = s;
	}

	public T pop() throws MyStackException {
		if( isEmpty() ) { 
			throw new MyStackException();
		}
		
		T result = buffer[ top ];
		buffer[ top-- ] = null; // GC
		
		return result;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	@SuppressWarnings("unchecked")  // 워닝 제거.
	private void resize() {
		T[] temp =(T[]) new Object[ buffer.length * 2 ];

		for( int i = 0; i <= top; i++ ) {
			temp[ i ] = buffer[ i ];
		}
		
		buffer= temp;
	}
}

//package prob5;
//
//public class MyStack {
//	private int top;
//	private String[] buffer;
//	
//	public MyStack( int capacity ) {
//		top = -1;
//		buffer = new String[ capacity ];
//	}
//
//	public void push( String s ) {
//		if( top == buffer.length - 1 ) {  // stack is full
//			resize();
//		}
//		buffer[ ++top ] = s;
//	}
//
//	public String pop() throws MyStackException {
//		if( isEmpty() ) { 
//			throw new MyStackException();
//		}
//		
//		String result = buffer[ top ];
//		buffer[ top-- ] = null; // GC
//		
//		return result;
//	}
//	
//	public boolean isEmpty() {
//		return top == -1;
//	}
//	
//	private void resize() {
//		String[] temp = new String[ buffer.length * 2 ];
//
//		for( int i = 0; i <= top; i++ ) {
//			temp[ i ] = buffer[ i ];
//		}
//		
//		buffer= temp;
//	}
//}

//package prob5;
//
//public class MyStack {
//	private int top;
//	private Object[] buffer;
//	
//	public MyStack( int capacity ) {
//		top = -1;
//		buffer = new Object[ capacity ];
//	}
//
//	public void push( String s ) {
//		if( top == buffer.length - 1 ) {  // stack is full
//			resize();
//		}
//		buffer[ ++top ] = s;
//	}
//
//	public Object pop() throws MyStackException {
//		if( isEmpty() ) { 
//			throw new MyStackException();
//		}
//		
//		Object result = buffer[ top ];
//		buffer[ top-- ] = null; // GC
//		
//		return result;
//	}
//	
//	public boolean isEmpty() {
//		return top == -1;
//	}
//	
//	private void resize() {
//		Object[] temp = new String[ buffer.length * 2 ];
//
//		for( int i = 0; i <= top; i++ ) {
//			temp[ i ] = buffer[ i ];
//		}
//		
//		buffer= temp;
//	}
//}
//
////package prob5;
////
////public class MyStack {
////	private int top;
////	private String[] buffer;
////	
////	public MyStack( int capacity ) {
////		top = -1;
////		buffer = new String[ capacity ];
////	}
////
////	public void push( String s ) {
////		if( top == buffer.length - 1 ) {  // stack is full
////			resize();
////		}
////		buffer[ ++top ] = s;
////	}
////
////	public String pop() throws MyStackException {
////		if( isEmpty() ) { 
////			throw new MyStackException();
////		}
////		
////		String result = buffer[ top ];
////		buffer[ top-- ] = null; // GC
////		
////		return result;
////	}
////	
////	public boolean isEmpty() {
////		return top == -1;
////	}
////	
////	private void resize() {
////		String[] temp = new String[ buffer.length * 2 ];
////
////		for( int i = 0; i <= top; i++ ) {
////			temp[ i ] = buffer[ i ];
////		}
////		
////		buffer= temp;
////	}
////}