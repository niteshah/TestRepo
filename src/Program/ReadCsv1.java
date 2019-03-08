package Program;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Properties;

public class ReadCsv1 {
	ArrayList<String> list1 = new ArrayList<String>(); // Cookie available in file
	ArrayList<String> list2 = new ArrayList<String>(); // Cookie is not available in file
	StringBuffer sb = null;
	BufferedReader br = null;
	BufferedReader br1 = null;
	String line = "";
	String cvsSplitBy = ",";
	int flag = 0;
	InputStream input= null;
	String url1 = null; // Need to add Comma
	String url2 = null; // Actual File
	String Addhyphen = null;

	Properties prop = new Properties();
	public void m1() {
		try {
			br = new BufferedReader(new FileReader(url1));
			while ((line = br.readLine()) != null) {
				// use comma as separator
				String[] cookieid = line.split(cvsSplitBy);
				//System.out.println("cookieid = :" + cookieid[0].trim());
				sb = new StringBuffer();
				if(cookieid[0].length()==32){
					char[] chars = cookieid[0].toCharArray();
					for (int i = 0, n = chars.length; i < n; i++) {
						char c = chars[i];
						if(i==7 ||i==11 || i==15 || i==19 ){
							if(Addhyphen.equalsIgnoreCase("Y")){
							sb.append(c+"-");
							}
						}else{
							sb.append(c);
						}
					}
					System.out.println(sb);
					compare(sb.toString(), cookieid[0]);
				}else{
					System.out.println("Escape the Record");	
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}	
	}

	public void compare(String C1, String C2){
		try {
			br1 = new BufferedReader(new FileReader(url2));
			l1:
				while ((line = br1.readLine()) != null) {
					flag = 0;
					// use comma as separator
					String[] c2 = line.split(cvsSplitBy);
					//System.out.println(c2[0]);
					if(c2[0].trim().equalsIgnoreCase(C1.trim())) {
						++flag;
						break l1;
					}else {

					}
				}
			if(flag==0){ // Not available
				list2.add(C2); 
				System.out.println("Not Matching  Cookies "+C2);
			}else{
				list1.add(C2); // available
				System.out.println("Matching  Cookies "+C2);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br1 != null) {
				try {
					br1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}	
	 }
	
	public void SaveResult1() {
		FileOutputStream out; 
		PrintStream p;
		try
		{
			out = new FileOutputStream(System.getProperty("user.dir")+"//availableCookie.txt");
			p = new PrintStream( out );
			p.append (list1.toString());
			p.close();
		}
		catch (Exception e)
		{
			System.err.println ("Error writing to file");
		}
	}
	
	public void SaveResult2(){
		FileOutputStream out; // declare a file output object
		PrintStream p; // declare a print stream object
		try
		{
			out = new FileOutputStream(System.getProperty("user.dir")+"//Notavailablecookie.txt");
			p = new PrintStream( out );
			p.append (list2.toString());
			p.close();
		}
		catch (Exception e)
		{
			System.err.println ("Error writing to file");
		}
	}
	public void Initialize() {
		try {
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//CookieCheck.properties");
			prop.load(fs);
			url1 = prop.getProperty("File1");
			url2 = prop.getProperty("File2");
			Addhyphen = prop.getProperty("Addhyphen");
		}catch (IOException ex) {
			ex.printStackTrace();
		}finally {
			if (input != null){
				try {
					input.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	 }
	public void m3(){
		System.out.println("available : "+list1);
		System.out.println("not available : "+list2);
	}
}