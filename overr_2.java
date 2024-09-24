class one {
    public int small(){
        return 4;
    }
}
class two extends one{
    public int small(){
        return 14;
    }
}
public class overr_2 {
    public static void main(String[] args) {
one o= new one();
two t= new two();
int y=t.small();
int x= o.small();
System.out.println(x);
System.out.println(y);
    
}
}