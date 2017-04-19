package prob5;


public class MyStack   {

	private int top;
	private String[] buffer;
	
	public MyStack(int size) {
		 buffer  = new String[size];
		 top = 0;
	}
	
	public void push(String str)
	{
		if(top  == buffer.length)
		{ 	
			String[] rebuffer = new String[buffer.length*2];
			for(int i = 0; i < buffer.length; i++)
			{
				rebuffer[i] = buffer[i];
			}
			buffer = rebuffer;
			
//			System.arraycopy(buffer, 0, buffer.length, rebuffer, 0, buffer.length);
//			rebuffer = buffer.clone();	
//			buffer = rebuffer;
			
			buffer[top++] = str;
		}
		else
		{
			buffer[top++] = str;
		}
	}

	public String pop() throws MyStackException 
	{

		String buf = buffer[top--];
		
		if( top < -1 )
			
			throw new MyStackException();		
		
		return buf;
	}
		
	public boolean isEmpty()
	{
		return top==-1;
	}
	
}
