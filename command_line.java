public class command_line {
    public static void main(String[] args) {
//command line args-arguments passed from command prompt , jvm makes its own array with these arguments , passing that array as args
//customizing behaviour of main method is the main pourpose
int n=Integer.parseInt(args[0]);
System.out.println(n);
for(int i=0;i<=args.length;i++) {
    System.out.println(args[i]);
    // array ndex out of bounds exception replacing <= by < we wont get any runtime exception
} 
String [] argh={"X","Y"};
args= argh;
for( String s :args){
    System.out.println(s);}
}
}
