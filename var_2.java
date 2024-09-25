public class var_2 {
    public static void main(String[] args) {
        int x;
// var under constructor,method,block ,loop to meet temp requirements of programmer is local var
// can be accessed only within where it is declared-TEMPORARY VAR/STACK VAR/AUTOMATIC VAR
//THREAD SAFETY-diff local var for each diff thread so THREAD SAFE
// JVM doesnt support properly local var , it faces scope related issues and default values as:
        int i=0;
        for (int j=0;j<3;j++){
            i=i+j;}
        //System.out.println("i value : "+ i +" j value : "+j); compile time error j not acessed
            // jvm doesnt allow default values for local var we should provide initialisation
            x=20;// need to initialise
            System.out.println(x);// error not initialised
            int y;
            if (args.length>0){
               y=10;
            }
            //System.out.println(y);// notinitialised
            else {
                y=20;
            }
            System.out.println(y);// no error
// only applicable modifier for local var is FINAL else compile time error{public,protected,static etc}
        // static int z=10; ILLEGAL MODIFIER
        final int z=10;
        //  genrally no modifer = default but by default local variables are not default
// PRIMITIVE OR REFRENCE?
// LOCAL PRIMITVE:
    int w=10;
//LOCAL REFRENCE 
    int[]W= new int[3];
    }}