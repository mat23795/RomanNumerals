
public class RomanNumerals {
	public static int convertToInteger(String romanNumber) throws InvalidInputException {
		int value=0;
		byte x=0;
		
		if (!isValidInput(romanNumber)){
			throw new InvalidInputException();
		}
		
		for (int i=romanNumber.length()-1; i>=0; i--)
		{
			switch (romanNumber.charAt(i))
			{
				case 'I':
					if (x<=0)	value+=1;
					else		value-=1;
					x=0;
					break;
				case 'V':
					if (x<=1)	value+=5;
					else		value-=5;
					x=1;
					break;
				case 'X':
					if (x<=2)	value+=10;
					else		value-=10;
					x=2;
					break;
				case 'L':
					if (x<=3)	value+=50;
					else		value-=50;
					x=3;
					break;
				case 'C':
					if (x<=4)	value+=100;
					else		value-=100;
					x=4;
					break;
				case 'D':
					if (x<=5)	value+=500;
					else		value-=500;
					x=5;
					break;
				case 'M':
					if (x<=6)	value+=1000;
					else		value-=1000;
					x=6;
					break;
			}
		}
		return value;
	}
	
	static boolean isValidInput(String num){
		boolean result=true;
		for(int i=0; i<num.length(); i++){
			if(num.charAt(i) != 'M' && num.charAt(i) != 'D' && num.charAt(i) != 'C' && 
					num.charAt(i) != 'L' && num.charAt(i) != 'X' && num.charAt(i) != 'V' && 
									num.charAt(i) != 'I' ){
				result = false;
			}
		}
		
		return result;
	}
}
