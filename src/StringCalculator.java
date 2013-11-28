
public class StringCalculator {
	
	public int Add(String numbers)
	{
		if(numbers.equals(""))
			return 0;
		String negatives = "";
		int result = 0, nextNumber = 0, indexInText = 0;			
		result = locateNumber(numbers);
		indexInText = String.valueOf(result).length();
		if(result < 0)
			negatives += String.valueOf(result);
		while(indexInText < numbers.length())
		{										
			nextNumber = locateNumber(numbers.substring(indexInText));
			if(nextNumber < 0)
				negatives += " , " + String.valueOf(nextNumber);
			result += nextNumber;					
			indexInText += String.valueOf(nextNumber).length();
		}
		if(!negatives.equals(""))
			System.out.println("negatives not allowed: " + negatives);
		return result;
	}
	private int locateNumber(String expression)
	{
		if(expression.equals(""))
			return 0;
		int i = 0;
		int result = 0;
		boolean positive = true;
		if(expression.charAt(0) == '-')
		{
			positive = false;
			i++;
		}	
		while(i < expression.length())
		{
			if(expression.charAt(i) < '0' || expression.charAt(i) > '9')
				break;
			result = result*10 + (expression.charAt(i) - '0');
			i++;
		}
		if(positive)
			return result;
		else
			return -result;
	}

}
