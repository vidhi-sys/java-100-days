interface greet{
    int a=25;
void morning();
void evening();

}
class hello implements greet{
public void morning(){
    System.out.println("good morning");
}
public void evening(){
    System.out.println("good evening");
}
}
public class inter_face {
    //keyword interferance followed by class name
    // cannot create obj
    public static void main(String[] args) {
        hello h= new hello();
        h.evening();
        h.morning();    }

}
