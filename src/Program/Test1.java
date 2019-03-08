package Program;

import java.time.LocalDate;

public class Test1 {

	public boolean ConfirmCycle(String year, String month, String PaymentC) {
		boolean b1 = false;
		int m = 0;
		int cm = 0;
		int pc = 0; 
		try {
			if(year.equalsIgnoreCase("2017") || year.equalsIgnoreCase("2016")) {
				b1 = true;
			}else {
				if(PaymentC.equalsIgnoreCase("15") || PaymentC.equalsIgnoreCase("30")) {
					pc = 1;
				}else if(PaymentC.equalsIgnoreCase("45") || PaymentC.equalsIgnoreCase("60")) {
					pc = 2;
				}
				if(month.equalsIgnoreCase("January")) {
					m = 1;
				}else if(month.equalsIgnoreCase("February")) {
					m = 2;
				}else if(month.equalsIgnoreCase("March")) {
					m = 3;
				}else if(month.equalsIgnoreCase("April")) {
					m = 4;
				}else if(month.equalsIgnoreCase("May")) {
					m = 5;
				}else if(month.equalsIgnoreCase("June")) {
					m = 6;
				}else if(month.equalsIgnoreCase("July")) {
					m = 7;
				}else if(month.equalsIgnoreCase("August")) {
					m = 8;
				}else if(month.equalsIgnoreCase("September")) {
					m = 9;
				}else if(month.equalsIgnoreCase("October")) {
					m = 10;
				}else if(month.equalsIgnoreCase("November")) {
					m = 11;
				}else if(month.equalsIgnoreCase("December")) {
					m = 12;
				}
				if(true) { 
					LocalDate today = LocalDate.now();
					cm = today.getMonthValue();
					cm = cm-pc;
					if( PaymentC.equalsIgnoreCase("15") || PaymentC.equalsIgnoreCase("45") ){
						if(m <= cm) {
							b1 = true;
						}else {
							b1 = false;
						}
					}else{
						if(m < cm) {
							b1 = true;
						}else {
							b1 = false;
						}
					}
				}
			}
		} catch (Exception e) {
		}
		return b1;
	}
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		boolean b1 = t1.ConfirmCycle("2018", "August","15");
		System.out.println(b1);
	}
}
