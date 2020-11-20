import java.util.*;
public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="1354";
       int a=123;
       
       int b=53;
       Integer ic=(Integer)b;
      Integer in=new Integer(a);
     
    //integer wrapper classes
      int i=Integer.parseInt(str);
     System.out.println(i);
     System.out.println(in.MAX_VALUE);
     System.out.println(in.BYTES);
     System.out.println(in.MIN_VALUE);
     System.out.println(in.SIZE);
     System.out.println(in.TYPE);
     System.out.println(in.byteValue());
     System.out.println(in.MAX_VALUE);
     System.out.println(in.decode(str));
     System.out.println(in.intValue());
     System.out.println(in.toString());
     System.out.println(Integer.toBinaryString(ic));
     System.out.println(Integer.toString(b));
     System.out.println(Integer.valueOf(a).compareTo(Integer.valueOf(b)));
     System.out.println(in.compareTo(ic));
     System.out.println(in.doubleValue());
     System.out.println(in.equals(ic));
     System.out.println(in.floatValue());
     System.out.println(in.hashCode());
     System.out.println(in.intValue());
     System.out.println(in.longValue());
     System.out.println(in.toString());
     System.out.println(in.byteValue());
     System.out.println(in.getClass());
     System.out.println(in.shortValue());
     System.out.println(in.bitCount(2));
     System.out.println(in.getClass());
     System.out.println(in.max(5, 6));
     System.out.println(in.compare(5, 5));
     System.out.println(in.min(9,22 ));
     System.out.println(in.MAX_VALUE);
     System.out.println(in.numberOfLeadingZeros(2));
     System.out.println(in.parseInt(str));
     System.out.println(in.reverse(6));
     System.out.println(in.sum(5, 6));
     System.out.println(in.toUnsignedLong(6));
     System.out.println(in.compare(6,6));
     System.out.println(in.rotateLeft(b, 5));
     System.out.println(in.getClass());
     System.out.println(in.toHexString(a));
     System.out.println(in.toString(b));
     System.out.println(in.toUnsignedString(a));
     
     
     
     //character wrapper classes
     char ch='v';
     Character ch1=new Character(ch);
     Character ch2=new Character('v');
     
     System.out.println(ch1.BYTES);
     System.out.println(Character.toUpperCase(ch1));
     System.out.println(Character.toLowerCase(ch1));
     System.out.println(Character.valueOf(ch1));
     System.out.println(Character.compare(ch1, ch2));
     System.out.println(Character.toString(ch1));
     System.out.println(Character.toTitleCase(ch2));
     System.out.println(ch1.MIN_VALUE);
     System.out.println(ch1.MAX_VALUE);
     System.out.println(ch1.MODIFIER_LETTER);
     System.out.println(ch1.TYPE);
     System.out.println(Integer.hashCode(in));
     System.out.println(ch1.charValue());
     System.out.println(ch1);
     System.out.println(ch1.compareTo(ch2));
     System.out.println(ch1.equals(ch2));
     System.out.println(ch1.hashCode());
     System.out.println(ch1.toString());
     System.out.println(ch1.getClass());
     System.out.println(ch1.BYTES);
     System.out.println(ch1.MAX_CODE_POINT);
     System.out.println(ch1.MAX_HIGH_SURROGATE);
     System.out.println(ch1.MAX_LOW_SURROGATE);
     System.out.println(ch1.MAX_RADIX);
     System.out.println(ch1.MAX_VALUE);
     System.out.println(ch1.charCount(b));
     System.out.println(ch1.compare(ch, 'v'));
     System.out.println(ch1.getName(1));
     System.out.println(ch1.getName(ch));
     System.out.println(ch1.isAlphabetic(ch2));
     System.out.println(ch1.getType(ch2));
     System.out.println(ch1.isDefined(ch2));
     System.out.println(ch1.isLowerCase(ch));
     System.out.println(ch1.isUpperCase(ch2));
     System.out.println(ch1.isISOControl(ch2));
     System.out.println(ch1.isSpace(ch));
     System.out.println(ch1.toTitleCase(ch2));
     System.out.println(ch1.toTitleCase(0));
     System.out.println(ch1.UPPERCASE_LETTER);
     System.out.println(ch1.UNASSIGNED);
     System.out.println(ch1.toString(0));
     System.out.println(ch1.toString(ch2));
     
     
     //boolean wrapper classes
     
     boolean e=true;
     Boolean f=(Boolean)e;
     Boolean g= false;
     System.out.println(f.FALSE);
     System.out.println(f.TRUE);
     System.out.println(f.TYPE);
     System.out.println(ch1.BYTES);
     System.out.println(Boolean.valueOf(str));
     System.out.println(Boolean.parseBoolean(str));
     System.out.println(f.booleanValue());
     System.out.println(f.compareTo(e));
     System.out.println(f.equals(e));
     System.out.println(f.hashCode());
     System.out.println(f);
     System.out.println(f.logicalAnd(e, f));
     System.out.println(f.logicalAnd(f, g));
     System.out.println(f.logicalOr(f, g));
     System.out.println(f.logicalXor(f, g));
     System.out.println(f.parseBoolean(str));
     System.out.println(f.FALSE);
     System.out.println(f.TRUE);
     System.out.println(f.valueOf(g));
     System.out.println(f.valueOf(f));
     
     }

}
