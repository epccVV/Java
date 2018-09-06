public class PrintRecursively 
{
	public static void main(String[] args)
	{
		String our_message = "Millions of years ago...in a galaxy far far away...";
		printRecursively(our_message);
		
	}

	public static void printRecursively(String our_string)
	{
		printRecursively(our_string, 0);
	}

	private static void  printRecursively(String our_string, int index)
	{
		System.out.println(our_string.substring(index, index + 1));
		printRecursively(our_string, index + 1);
	}
}
