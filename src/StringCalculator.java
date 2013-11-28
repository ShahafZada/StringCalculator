
public class StringCalculator {
	
	public int Add(String numbers)
	{
		if(numbers.equals(""))
			return 0;
		
		int result = 0, nextNumber = 0, indexInText = 0;			
		result = locateNumber(numbers);
		indexInText = String.valueOf(result).length();
		while(indexInText < numbers.length())
		{							
			
			nextNumber = locateNumber(numbers.substring(indexInText));
			result += nextNumber;					
			indexInText += String.valueOf(nextNumber).length();
		}
		return result;
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
