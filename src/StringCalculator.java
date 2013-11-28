
public class StringCalculator {
	
	public int Add(String numbers)
	{
		if(numbers.equals(""))
			return 0;
		int first = locateNumber(numbers);
		int firstLength = String.valueOf(first).length();
		int second = locateNumber(numbers.substring(firstLength+1));
		return first + second;
		
	}
	private int locateNumber(String expression)
	{
		if(expression.equals(""))
			return 0;
		int i = 0;
		int result = 0;
		while(i < expression.length())
		{
			if(expression.charAt(i) < '0' || expression.charAt(i) > '9')
				break;
			result = result*10 + (expression.charAt(i) - '0');
			i++;
		}
		return result;
	}

}
