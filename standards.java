// java coding standards
/*1st statement must be written the PACKAGE
 every class must be public, class name must be meaningful 
 avoid instance methods use static in most of the cases */
 // java coding standards for CLASSES
 /* upper case char eg-StringBuffer ,nouns 
  *  java coding standards for INTERFACES
adjectives,start with upper case char eg-Runnable ,Comparablle etc
  * java coding standards for METHODS
genrally verbs {representing actions } eg- eat() etc or verb+ noun eg- getname(), getsleep(),start with lower case char
follows  * camel case convention * discussed in mentioned links
  * java coding standards for VARIABLES
genrally nouns, start with lower case inner word with upper case{camel case convention}
   * java coding standards for CONSTANTS[public statuc final]
eg-MAX_VALUE(wrapper class), MAX_PRIORITY{threads} , PI nouns but with fixed value , usually capital seprated with underscore
* JAVA BEAN CODING STANDARDS
java bean- class with private variables & public getter setter 
*SETTER SYNTAX - public, reeturn type void , prefix set, some arguments
*gETTER SYNTAX - public, return type shouldnt be void, no argument, prefix get   {is for boolean eg- isEempty }
*/
class studentBean{ // class name not neccesarily ends with bean 
    private String name;
    public void setname(String name){
        this.name = name;
    }
    public String get_name(){
        return(name); 
    }
}
public class standards {
    public int m1(int x, int y){
        return(x+y);
    }// amerpeet standard
    public static  int sum(int z, int w){
        return(z+w);// hi-tech  city standard[ preffered and better]
    }
    public static void main(String[] args) {
        studentBean b =  new studentBean();
        b.setname("vidhie");
        System.out.println(b.get_name());

    }
}

