public class two{
// continuing literals [char literals]- specified as single char within single quotes
public static void main(String[] args) {
    char ch='a';
    char ch_2='1';//valid identified as  char not string string
    System.out.println(ch_2);
    //char ch_3='ab';//invalid unclosed char literal(2), not a statement (error no.3)
// 2nd way - for every char UNICODE value is there
    char ch_4=97;//a
    System.out.println(ch_4);
// specifying char as integer representing UNICODE of char in decimal, hexadecimal or octal 
//range 0-65535
     char ch_5=0XFACE;
     System.out.println(ch_5);
     char ch_6=1970;
     System.out.println(ch_6);
     //  char ch=1971, 1970 both ? why  two possibility
     //1. 1971 has no char value in UNICODE
     //2. FONT NOT AVAILABLE IN IDE/ PLATFORM 
     char CH='\u0061';
     System.out.println(CH);
     // unicode representation 'backslack u XXXX' xxxx is 4 digit hexadecimal number
//ESCAPE CHARACTERS- every escape char is a char literal
    System.out.println("this is \' character "); 
    System.out.println("this is \" character "); 
    System.out.println("this is \\ character ");
//STRING LITERAL- non primitive{string is a predefined class in java}  
    String S="durga";
    //1.7 version enhancements wrt literals  
    //i) binary literals  prefixed with 0B or 0b, allowed digits 0 and 1
    int B=0B1111;
    System.out.println(B);// this will print from binary to decimal i.e. 15 
//ii) for large double numbers to increase readability use "_ " in numeric literals b/w digits 
    double big= 10_11_09;
    System.out.println(big);  
// main advantage is readability of code improved (only for .java file) after compilation _ removed
// no effect to jvm
    double one=123_456;
    double two_=1_2_3_456;
    // both are same
    double three=1__23;// any number of underscores are added
    System.out.println(three);
    //double four=_123_456; invalid

      
}
}