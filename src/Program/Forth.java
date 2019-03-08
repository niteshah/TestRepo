package Program;

import java.text.DecimalFormat;

public class Forth {
	static DecimalFormat df = new DecimalFormat("#.##");
	public double Add(String s1, String s2){
		Double d1 = new Double(s1);
		Double d2 = new Double(s2);
		Double d3 = d1 + d2;
		String s3 = df.format(d3); 
		Double d4 = Double.parseDouble(s3);
		System.out.println(d4);
		return d4;
	}
	
	public double Sub(String s1, String s2){
		Double d1 = new Double(s1);
		Double d2 = new Double(s2);
		Double d3 = d1 - d2;
		String s3 = df.format(d3); 
		Double d4 = Double.parseDouble(s3);
		System.out.println(d4);
		return d4;
	}
	
	public String Compare(String s1, String s2){
		String str = "Pass";
		Double d1 = new Double(s1);
		Double d2 = new Double(s2);
		if(Double.compare(d1, d2) == 0){
		str = "Pass";
		System.out.println("Done");	
		}
		return str;
	}
	public static void main(String[] args) {
		Forth a1 = new Forth();
		Double d1 = a1.Add("0.01", "0.01");
		Double d2 = a1.Sub("0.35", df.format(d1));
		a1.Compare("0.33", df.format(d2));
	}
}
