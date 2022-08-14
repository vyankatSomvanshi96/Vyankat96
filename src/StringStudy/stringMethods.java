package StringStudy;

public class stringMethods {

	public static void main(String[] args) {
		String v0="Vyanki";  // It means v0 is the object of  String class ----> Without use of new keywords
		String v="Vyanki";
		
		String v1=new String("Vyankat");  // With use of new keywords
		
		// Use Of Length Method
		
		System.out.println(v.length());
		System.out.println(v1.length());
		System.out.println(v0.length());
		
		int s = v1.length();   // Select the option of Create local variable on holding mouse on variable name --> if I want to Re-use line no 8 Contain
        System.out.println(s);
        System.out.println("============");
        
        String s2="";  
        System.out.println(s2.length());
        
     //   String s3=null;  // If we write null keyword any where in the program then we will get Null Pointer expection (Exception in thread "main" java.lang.NullPointerException)
     //   System.out.println(s3.length());
        
        
        // Use Of toUpperCase Method
        
        String m="Pune";
        System.out.println("++++");
        System.out.println(m);
        System.out.println(m.toUpperCase()); // If I want to print contain in upper case then I need to use (  Object.toUpperCase();  )
        
        String z = m.toUpperCase();  // if I want to Re-use line no 29 contain
        System.out.println(z.length());  // If I want to print length of object m then I have to write (  syso___(object.length();)  )
        
        // Use Of toLowerCase() Method
        
        System.out.println(m.toLowerCase());  // If I want to print contain in lower case then I need to use (  Object.toLowerCase();  )
        
        String x="VYANKAT";
        System.out.println(x.toLowerCase());
        
        // Use Of Equal Method
        
        
        String A="Somvanshi";
        String B="Somvanshi";
        String C=new String("Somvanshi");
        String D=new String("Somvanshi");
        String E=new String("somvanshi");
        System.out.println("It's Equal Method with one way");
        System.out.println(A==B);  // If I write in this way then I will get result on the basis of Compare Memory Location
        System.out.println(B==C);
        System.out.println(C==D);
        System.out.println(E==D);
        System.out.println("It's Equal Method with another way");   
        System.out.println(A.equals(B)); // If I write in this way then I will get result on the basis of Contain (It means Length of contain)
        System.out.println(B.equals(C));
        System.out.println(C.equals(D));
        System.out.println(D.equals(E));
        System.out.println(D.equalsIgnoreCase(E)); // If I write in this way then I will get result on the basis of contain It's compare only contain not comparing Upper or Lower case
        
        // Use Of Contain
        String G="Mona";
        System.out.println("It's Contain method");
        System.out.println(G.contains("n"));  // Compare contain---> Return type is boolean
        System.out.println("==========");
        
        
        // Use Of isEmpty
        
        String F="Pune";
        String I="";
        String J="  ";
        
        System.out.println("It's Empty Method");
        System.out.println(F.isEmpty());  // True If It'a length is Zero
        System.out.println(I.isEmpty());
        System.out.println(J.isEmpty());
        
        // Use of IsBlank
        
        String K="Pu";
        String L="";
        String M="  ";
        String N="       ";
        
        System.out.println("============");
        System.out.println("It's Blank Method");
        System.out.println(K.isBlank());
        System.out.println(L.isBlank());
        System.out.println(M.isBlank());
        System.out.println(N.isBlank());
        
        
        // Use Of CharAt Method
        
        String O="Vyankat";
        System.out.println("It's CharAt Method");
        System.out.println("======");
        System.out.println(O.charAt(4));
        System.out.println(O.charAt(3));
      //  System.out.println(O.charAt(9)); -----> StringIndexOutOfBoundsException
        System.out.println("======");
        
        
        // Use Of endWith
        String P="Somvanshi";
        System.out.println("It's endWith Method");
        System.out.println(P.endsWith("i"));
        System.out.println(P.endsWith("shi"));
        System.out.println(P.endsWith("hi"));
        System.out.println(P.endsWith("nsh"));
        System.out.println("===");
        
        String q=new String("Somvan");  // With use of new keyword
        boolean w = q.endsWith("m");
       System.out.println(w); 
       System.out.println("===");
       
             
       // Use Of starts Method
       String Q="Vyanki";
       System.out.println("It's starts Method");
       System.out.println(Q.startsWith("v"));
       System.out.println(Q.startsWith("V"));
       System.out.println(Q.startsWith("Vya"));
       System.out.println(Q.startsWith("ki"));
       System.out.println("=====");
       
       // Use Of subString Method
       String R="Mona";
       System.out.println("it's subString Method");
       System.out.println(R.substring(2));
       System.out.println(R.substring(1));
       System.out.println(R.substring(0));
       System.out.println("====");
       System.out.println(R.substring(0, 3));
       System.out.println(R.substring(1, 3));
       System.out.println("=========");
       
       // Use Of Concat Method
       String S="Vyankat";
       String T=" Somvanshi";
       System.out.println("It's Concat Method");
       System.out.println(S.concat(T));
       
       System.out.println(S.concat(" Patil"));
       System.out.println("=========="); 
       
       
     //IndexOf method use 
       String U="vyankAt";
       System.out.println("It's IndexOf Method");
       System.out.println(U.indexOf("a"));
       System.out.println(U.lastIndexOf("A"));
       
       System.out.println("========");
       System.out.println(U.indexOf("A", 4));  // If we want to call index of A then we have to write (Index value of A-1)
       System.out.println("========"); 
       
       // Use of Replace Method 
        String V="Somavanshi";
        System.out.println(V.replace('S', 'P'));
        System.out.println(V.replaceAll("shi", ""));
        System.out.println(V.replace('a', 'A'));
        
	}

}
