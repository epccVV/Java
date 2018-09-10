/* This doesn't compile. Its supposed to display our message
verticlly. */

public class LoopTrouble 
{
	
	public static void main(String[] args)
	{
		String our_message = "Hello World!";

		for (int i = 0; i < our_message.length; i++)
		{
			System.out.println(our_message.substring(i, i+1));
		}
	}
}