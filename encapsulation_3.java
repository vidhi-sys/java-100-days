//Write a Java program to create a class called Movie with private instance variables
// title, director, and duration. Provide public getter and setter methods to access and modify 
//these variables. Add a method called getMovieDetails() that returns a formatted string containing the movie details
class movie{
    private String title;
    private String director;
    private String duration;

    public  void setter(String title,String director,String duration){
        this.title=title;
        this.director = director;
        this.duration=duration;
    }
    public void getter(){
        System.out.println("title of my movie : " +title);
        System.out.println("director credits  : "+  director);
        System.out.println("this movie lasts :" + duration);
    }
    public String getmovie_details(){
        System.out.println("formatted string: ");
        return (title+director+duration);
    }
    
}

public class encapsulation_3 {
    public static void main(String[] args) {
        movie m= new movie();
        m.setter("life of pi","imtiaz ali","2 hrs");
        m.getter();
        m.getmovie_details();
        
    }
}
