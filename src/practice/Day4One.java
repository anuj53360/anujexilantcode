package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day4One {

	public static void printDay4(String s){
		
		boolean b=false;
		String[] s1=s.split(" ");
		List<String> list=new ArrayList<>();
		
		
		for(int i=0;i<s1.length;i++){
            
			List list1=Arrays.asList(s1[i]);
		 list.addAll(list1);
		//System.out.println(s1[i]);
		
		
		
	}
	//System.out.println(list);
	
	
	l1:	for(int i=0;i<list.size();i++){
		
		l2:for(int j=i+1;j<list.size();j++){
			
			list.get(i);
	String s2=""+list.get(i);
	String s3=""+list.get(j);
		int x=s2.compareTo(s3);
		
		if(x==0){
			b=true;
		break l1;
		}
		else{
			b=false;
		}
		}
	}
	System.out.println(b);
	
	

	}
	
	public static void main(String[] args) {
	
		//String s="aa bb cc dd ee";
		//String s="aa bb cc dd ee aa";
	//String s="aa bb cc dd ee aaa";
		//String s="aa bb cc dd ee dd";
		
	String s="bdwdjjo avricm cjbmj ran lmfsom ivsof";
		printDay4(s);

		
	}

}
