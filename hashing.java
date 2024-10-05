import java.util.*;
public class hashing {
    public static void main(String[] args) {
    // everything that exists in pairs{similar to dictionary jn python}
    HashMap<String , Integer> students = new HashMap<>();
    // write data type in< key type, value type> hash map name
    // 1) INSERTION
    students.put("vidhi",01);
    students.put("mahi",02);
    students.put("vaidik",03);
    System.out.println(students);// unordered output
    //keys are unique is overwritten value is updated , values can be same
    //2) SEARCH MAP.CONTAINSKEY()- RETURNS BOOLEAN
    if(students.containsKey("Ayushi")){
        System.out.println("yes.. key present in the map");
    }
    else{
        System.out.println("not present");
    }
    System.out.println(students.get("vaidik"));// getting corresponding key value
    // if key  DOESNT EXISTS
    System.out.println(students.get("naman"));// NULL
    //3)ITERATION for(value{sort of variable where the values in our collection where will be stored}: collection name)
    // both value and collection must be of same data type 
    int [] arr={1,2,3};
    for(int i=0;i<3;i++)
{
    System.out.print(arr[i]+" ");
}
    System.out.println(" ");
    for( int value:arr){
        System.out.print(value+" ");

    }

    for(Map.Entry<String,Integer> e :students.entrySet()){
        System.out.println(e.getValue());
        System.out.println(e.getKey());
    }
    //4)REMOVE
    students.remove("vaidik");//key
    System.out.println(students);
}}
