package ArrayStudy;

public class ArrayStdy {

	public static void main(String[] args) {


       // Array Declaration 
		
		String District[]=new String[6];
		
		//2. Array initialize
		
		District[0]="DharaShiv";
		District[1]="Solpaur";
		District[2]="Pune";
		District[3]="Goa";
		District[4]="Satara";
		District[5]="Raigad";
		
		// Usage
		System.out.println(District[0]);
		System.out.println(District[1]);
		System.out.println(District[2]);
		System.out.println(District[3]);
		System.out.println(District[4]);
		System.out.println(District[5]);
	//	System.out.println(District[9]);  ----> java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println("===For Method===");
		for(int d=0; d<=5; d++)
		{
			System.out.println(District[d]);
		}
		
		for(int f=5; f>=0; f--)
		{
			System.out.println(District[f]);
		}
		
		
		
		//Example 2 -----> Array in int
		
		int rollNo[]=new int[5];    // Array Declared
		
		// Array Initialize
		
		rollNo[0]=91;
		rollNo[1]=92;
		rollNo[2]=93;
		rollNo[3]=94;
		rollNo[4]=95;
		
		// Usage
		System.out.println(rollNo[0]);
		System.out.println(rollNo[1]);
		System.out.println(rollNo[2]);
		System.out.println(rollNo[3]);
		System.out.println(rollNo[4]);
		
		
		//Example 3 -----> Array in char
		char shortNm[]=new char[10];
		
		shortNm[0]='A';  shortNm[1]='B';  shortNm[3]='C';  shortNm[4]='D';  shortNm[5]='E';  shortNm[6]='F';
		shortNm[7]='G';  shortNm[8]='H';  shortNm[9]='I';  
		
		System.out.println(shortNm[0]);  // Static Coding
		System.out.println(shortNm[1]);
		System.out.println(shortNm[2]);
		System.out.println(shortNm[3]);
		System.out.println(shortNm[4]);
		System.out.println(shortNm[5]);
		System.out.println(shortNm[6]);
		System.out.println(shortNm[7]);
		System.out.println(shortNm[8]);
		System.out.println(shortNm[9]);
		System.out.println("=============");
		System.out.println("=====");
		
		for(char a=0; a<=shortNm.length-1; a++)  // Ascending Order  -->Dynamic Coding
		{
			System.out.println(shortNm[a]);
		}
		System.out.println("Descending order");
		
		for(int f=shortNm.length-1; f>=0; f--)  // Descending Order  -->Dynamic Coding
		{
			System.out.println(shortNm[f]);
		}	
		
		System.out.println("=====");
		
		
		
		
		
		
		// String Method's Practice
		
		String v=new String("Vyank");
		
		System.out.println(v.length());
		
		int V = v.length();
		System.out.println(V);
		
		String s="Vyankat Bhau";
		
		System.out.println(s.toUpperCase());  // Use of ToUpperCase
		System.out.println(s.toLowerCase());  // Use of ToLowerCase
		
		// Use Equal Method
		String a="vynkat";
		String b="Vyankat";
		String c="Vyankat";
		String d="vyankii";
		
		System.out.println(a==b);  // Compare Location of contain
		System.out.println(b==c);
		System.out.println(c==d);
		System.out.println(d==a);
		System.out.println("===");
		System.out.println(a.equals(b));  // Compare Contain
		System.out.println(b.equals(c));
		System.out.println(c.equals(d));
		System.out.println("=======");
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(b.equalsIgnoreCase(c));
		System.out.println("===");
		
		System.out.println("Use of contain");
		System.out.println(a.contains("k"));
		System.out.println("====");
		
		
		System.out.println("Use of isEmpty");
		String f="";
		String g="vynk";
		String h="  ";
		
		System.out.println(f.isEmpty());  // Use of Empty
		System.out.println(g.isEmpty());
		System.out.println(h.isEmpty());
		System.out.println("====");
		
		System.out.println("Use of Blank");
		System.out.println(f.isBlank());   // Use of Blank
		System.out.println(g.isBlank());
		System.out.println(h.isBlank());
		
		System.out.println("Use of CharAt");
		System.out.println(g.charAt(3));
		System.out.println(g.charAt(1));
		
		
		System.out.println("Use of Endwith & Startwith");
		String j="Patil";
		
		System.out.println(j.endsWith("t"));
		System.out.println(j.endsWith("l"));
		System.out.println("====");
		
		System.out.println(j.startsWith("p"));
		System.out.println(j.startsWith("P"));
		System.out.println(j.startsWith("i"));
		System.out.println("=====");
		
		System.out.println("Use of Concat Method");
		String k="Somsvanshi ";
		String l="Patil";
		
		System.out.println(k.concat(l));
		System.out.println(k.concat("Jadhav"));
		
	    // Use of index
		System.out.println(k.indexOf("s"));
		
		System.out.println(k.indexOf("s", 6));  // s-1
	    System.out.println(k.indexOf("s", 2));		
	    System.out.println(k.indexOf("h", 7));   // h-1
	    
	    // Use of replace
	    System.out.println(k.replace('s', 'S'));
	    System.out.println(k.replaceAll("svanshi", "VanShi"));
	    
	    //Practicing Array
	    String ss[]=new String[2];  // Array with 'new' keyword
	    
	    ss[0]="vsk";
	    ss[1]="VSS";
	  //  ss[2]="vkks";
	    
	    System.out.println(ss[0]);
	    System.out.println(ss[1]);
	 //   System.out.println(ss[2]);
	    
	    String vss[]= {"vynki", "vynku", "vynkiss"};  // Array without 'new' keyword
	    
	    System.out.println(vss[2]);
	    System.out.println(vss[0]);
	    System.out.print(vss[1]);
	    
	    // Multi type Array====>
	    
	    int vl[][]=new int[2][2];
	    
	    vl[0][0]=1;
	    vl[0][1]=2;
	    vl[1][0]=3;
	    vl[1][1]=4;
	    
	    System.out.println(vl[0][0]+" ");
	    System.out.print(vl[0][1]+" ");
	    System.out.println(vl[1][0]+" ");
	    System.out.print(vl[1][1]+" ");
	    
	    System.out.println("========");
	    
	    
	    for(int i=0; i<=1; i++)   // Outer For loop for Row
	    {
	    	for(int u=0; u<=1; u++)  // Inner For loop for Column
	    	{
	    		System.out.print(vl[i][u]+" ");
	    	}
	    }
	    System.out.println();
	    
	    
	    
	}

}
