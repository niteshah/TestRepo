package Program;

public class Second {
	public boolean ConfirmCycle(String year, String month, String PaymentC) {
		boolean b1 = false;
		int January = 0;
		int February = 0;
		int March = 0;
		int April = 0;
		int May = 0;
		int June = 0;
		int July = 0;
		int August = 0;
		int September = 0;
		int October = 0;
		int November = 0;
		int December = 0;
		int monthc = 0;
		try {
			if(year.equalsIgnoreCase("2017") || year.equalsIgnoreCase("2016")) {
				b1 = true;
			}else {
				if(PaymentC.equalsIgnoreCase("60") || PaymentC.equalsIgnoreCase("45")) {
					monthc = 2;
				}else if(PaymentC.equalsIgnoreCase("30") || PaymentC.equalsIgnoreCase("15")) {
					monthc =1;				
				}
				if(month.equalsIgnoreCase("January") ){
					January = 1;
				}
				if(month.equalsIgnoreCase("February") ){
					February = 2;
				}if(month.equalsIgnoreCase("March") ){
					March = 2;
				}if(month.equalsIgnoreCase("April") ){
					April = 2;
				}if(month.equalsIgnoreCase("May") ){
					February = 2;
				}if(month.equalsIgnoreCase("June") ){
					May = 2;
				}if(month.equalsIgnoreCase("July") ){
					July = 2;
				}if(month.equalsIgnoreCase("August") ){
					August = 2;
				}if(month.equalsIgnoreCase("September") ){
					September = 2;
				}if(month.equalsIgnoreCase("October") ){
					October = 2;
				}if(month.equalsIgnoreCase("November") ){
					November = 2;
				}if(month.equalsIgnoreCase("December") ){
					December = 2;
				}
			}	
		} catch (Exception e) {

		}
		return b1;
	}

	public static void main(String[] args) {
		Second a1 = new Second ();
		boolean b1 = a1.ConfirmCycle("2018", "March", "30");
		System.out.println(b1);
	}
}
