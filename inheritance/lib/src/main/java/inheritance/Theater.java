package inheritance;

import java.util.ArrayList;

public class Theater {
    private ArrayList<String> movies;

    public Theater(String movie){
        this.movies = new ArrayList<>();
    }

    public void addMovie(String movie){
        this.movies.add(movie);
    }

    public void removeMovie(String movie){
        this.movies.remove(movie);
    }
}
