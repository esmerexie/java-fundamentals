package inheritance;

import java.util.ArrayList;

public class Theater {
    public String name;
     ArrayList<String> movies;

    public Theater(String name){
        super();
        this.name = name;
        this.movies = new ArrayList<>();
    }

    public void addMovie(String movie){
        this.movies.add(movie);
    }

    public void removeMovie(String movie){
        this.movies.remove(movie);
    }


    public ArrayList<String> getMovies(){
        return movies;
    }
    public String toString(){
        return ("Theatre name: " + this.name);
    }
}
