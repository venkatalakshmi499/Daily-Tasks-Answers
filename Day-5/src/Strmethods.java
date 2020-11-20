
public class Strmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="ABCD";
      str="venky";
      String b="     HI ALL      ";
      String str1="venkata Laxmi";
      String name1="VENKATA LAXMI";
      //some of the string methods
      
      System.out.println(str);
      String str2=new String("raj");
      str2="dil";
      System.out.println(str2);
      System.out.println(str==str2);
      System.out.println("TITLE".toLowerCase());
      System.out.println("lakshmi".toUpperCase());
      System.out.println(b.trim());
      System.out.println(b.split(b));
      System.out.println(b.toCharArray());
      System.out.println(b.format(str, b, args));
      System.out.println(b.valueOf(str2));
      System.out.println(b.toLowerCase());
      System.out.println(b.join("This is your friend"));
      System.out.println(b);
      System.out.println(b.contains("hi"));
      System.out.println(b.contains("ALL"));
      System.out.println(b.concat("This your friend"));
      System.out.println(str2.substring(1));
      System.out.println(b.lastIndexOf(str2));
      System.out.println(b.length());
      System.out.println(b.indexOf("L"));
      System.out.println(str.startsWith("v"));
      System.out.println(str1.charAt(5));
      System.out.println(str1.codePointAt(8));
      System.out.println(str1.codePointBefore(6));
      System.out.println(str1.codePointCount(2, 9));
      System.out.println(str1.compareTo(str));
      System.out.println(str1.compareToIgnoreCase("VENKATA LAXMI"));
      System.out.println(str1.concat("madhabattula"));
      System.out.println(str1.contains(b));
      System.out.println(str1.endsWith("i"));
      System.out.println(str1.codePointCount(2, 8));
      System.out.println(str1.endsWith("s"));
      System.out.println(str1.indexOf("v"));
      System.out.println(str1.isBlank());
      System.out.println(str1.isEmpty());
      System.out.println(str1.lastIndexOf('s'));
      System.out.println(str1.lastIndexOf(str2, 2));
      System.out.println(str1.strip());
      System.out.println(str1.hashCode());
      System.out.println(str1.indent(6));
      System.out.println(str1.length());
      System.out.println(str1.toCharArray());
      System.out.println(str1.startsWith("v"));
      System.out.println(str1.startsWith("v"));
      System.out.println(str1.replace('e', 'h'));
      System.out.println(str1.toLowerCase());
      System.out.println(str1.toUpperCase());
      System.out.println(str1.trim());
     
      // some of the methods stringbuffer 
      
     StringBuffer sb= new StringBuffer("sruthi dhavala");
     StringBuffer sb1=new StringBuffer("S R U T H I D H A V A L A");
     System.out.println(sb.capacity());
     System.out.println(sb.charAt(3));
     System.out.println(sb.codePointAt(5));
     System.out.println(sb.codePointBefore(6));
     System.out.println(sb.compareTo(sb1));
     System.out.println(sb.equals(sb1));
     System.out.println(sb.hashCode());
     System.out.println(sb.length());
     System.out.println(sb.substring(3));
     System.out.println(sb.substring(2, 6));
     System.out.println(sb.toString());
     System.out.println(sb.append("v"));
     System.out.println(sb.append('d'));
     System.out.println(sb.append('h'));
     System.out.println(sb.append(6));
     System.out.println(sb.append(name1));
     System.out.println(sb.insert(3, 4));
     System.out.println(sb.reverse());
     System.out.println(sb.insert(3, 'e'));
     System.out.println(sb.insert(5, sb1));
     
     
     // some of the string builder methods
     
     StringBuilder sb3=new StringBuilder("krishnababu");
     System.out.println(sb3.capacity());
     System.out.println(sb3.charAt(5));
     System.out.println(sb3.codePointAt(6));
     System.out.println(sb3.codePointBefore(3));
     System.out.println(sb3.codePointCount(2, 6));
     System.out.println(sb3.equals(sb1));
     System.out.println(sb3.hashCode());
     System.out.println(sb3.indexOf(name1));
     System.out.println(sb3.lastIndexOf("u"));
     System.out.println(sb3.length());
     System.out.println(sb3.lastIndexOf("b"));
     System.out.println(sb3.substring(5));
     System.out.println(sb3.substring(2, 3));
     System.out.println(sb3.toString());
     System.out.println(sb3.append('s'));
     System.out.println(sb3.append(sb1));
     System.out.println(sb3.append('c'));
     System.out.println(sb3.append(str2));
     System.out.println(sb3.insert(2, 3));
     System.out.println(sb3.insert(3, 'h'));
     System.out.println(sb3.append(sb1));
     
	}
	

}
