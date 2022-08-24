package inheritance;

public class Theater {

    public String name;
    public String movies;

    public Theater(String name, String movies) {
        this.name = name;
        this.movies = movies;
    }

    public void addMovie(Theater movies){
        return movies.addMovie("lol");
    }
}
