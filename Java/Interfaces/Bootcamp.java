
public class Bootcamp {

	public static Welcome(double afto_einai_ena_double_argument) throws DigitException, AnotherDigitException {
		
		if (afto_einai_ena_double_argument > 25) {
			
			throw new DigitException();
		} else {
			
			throw new AnotherDigitException();
			
		}
		
	}
	
	public static int bye() {
		
		try {
			welcome(299.7);
			return 0;
		} catch (DigitException theo) {
			return 605;
		}
		catch(AnotherDigitException theo) {
			return 230;
		}
		
	}
	
}
