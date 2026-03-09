// NAME: Jonathan Smith
// PARTNER NAME: 
// CS111 SECTION #: 1258
// DATE: 03/08/2026
public class Main
{
    public static void main (String[] args){

    
/***** DECLARATION SECTION *****/
		int jdnBirth, jdnToday, jdnKatherine, jdnSputnik;
		//int monthBirth, dayBirth, yearBirth;

		/***** INPUT SECTION *****/
		//dayBirth = UtilityBelt.readInt("Enter Date of Birth 1-31: ",1 ,31);
		//monthBirth = UtilityBelt.readInt("Enter Birth month 1-12: ",1 ,12);
		//yearBirth = UtilityBelt.readInt("Enter Year of Birth: ",1 ,3000);
		
		
		/***** INITIALIZATION SECTION *****/
		// 1. Calculation for your Birthdate.
		jdnBirth = calcJulianDate(7, 14, 1995);
	
		// 2. Calculate JDN for today
		jdnToday = calcJulianDate( 2, 2, 2020);

		// 3. Calculate JDN for Katherine
		jdnKatherine = calcJulianDate(8, 26, 1918);

		// 4. Calculate JDN for Sputnik 1 lauch: 10/4/1957
		jdnSputnik = calcJulianDate(10,4,1957);
		
		
		/***** OUTPUT SECTION *****/
		String line1 = String.format( "Julian Day Number for today's date, 2/2/2020, is %,d.", jdnToday);
		String line2 = String.format( "Julian Day Number for Katherine Johnson's birthday, 8/26/1918, is %,d.", jdnKatherine);
		String line3 = String.format( "The Julian Day Number for my birthday, 07/14/1995, is %,d.", jdnBirth);
		String line4 = String.format("Julian Day Number for the Sputnik 1 launch 10/4/1957, is %,d.\n", jdnSputnik);

		printCentered(138,"Julian Day Calculator");
		printCentered(138, "---------------------");
		printCentered(138, line1);
		printCentered(138, line2);
		printCentered(138, line3);
		printCentered(138, line4);
	}
		/**
		 * Calculates the amount of padding needed to center a string 
		 * and prints it to the consel.
		 * @param width Total character width of the line.
		 * @param text The string of text to be centered.
		 */
			public static void printCentered(int width, String text){
			int textLength = text.length();
			int padding = (width - textLength) / 2;
			
			System.out.printf("%" + (padding + textLength) + "s%n", text);
		}

		/**
		 * Calculates the Julian Day Number for a given Gregorian date.
		 * Uses integer arithmetic to determine the number of day
		 * since January 1, 4713 BCE.
		 * @param monthToday The month (1-12).
		 * @param dayToday The day of month (1-31).
		 * @param yearToday The year.
		 * @return The calculated Julian Day Number as an integer.
		 */
		public static int calcJulianDate(int monthToday, int dayToday, int yearToday) {
		int a = (14 - monthToday) / 12;
		int y = yearToday + 4800 - a;
		int m = monthToday + (12 * a) - 3;
		//Calculations
		int resultJdn = dayToday + ((153 * m + 2) / 5) + (365 * y) + (y / 4) - (y / 100) + (y / 400) - 32045;

		return resultJdn;
		}
		

}