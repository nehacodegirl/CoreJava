package assignment;

import java.io.*;
public class Q64 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
FileReader f1 = new FileReader("C:\\Users\\Pratik\\Desktop\\cdac-java\\File\\3.txt");
		



		BufferedReader b = new BufferedReader(f1);
		String s = null;
		int count = 0;
		int wcount = 0;
		int chcount=0;
		double avg;
		while((s = b.readLine()) != null) {
			System.out.println(s);
			String word[] = s.split(" ");
			   for(int i=0; i<word.length; i++) {
				   System.out.print(word[i]+" ");
				   wcount++;
				   for(int j=0; j<word[i].length();j++) {
					   chcount++;
				   }
				   System.out.println(chcount);
			   }
			   
			
			System.out.println(wcount);
			count++;
		}
		
		avg=chcount/wcount;
		System.out.println(avg);
		System.out.println(count+"\n");
		b.close();
		
		
		
		f1.close();
		System.out.println("success");
	}
	}


