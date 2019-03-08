package Program;

import java.text.DecimalFormat;
public class Third {
	static DecimalFormat df = new DecimalFormat("#.##");
	public static void main(String[] args) {
		String s1 = "0.01";
		String s2 = "0.01";
		String s3 = "0.19";
		Double d = new Double(s1);
		Double d2 = new Double(s2);
		Double d3 = new Double(s3);
		Double d4 = d + d2;
		if(Double.compare(d4, d3) == 0){
		System.out.println("Done");	
		}
  }
}