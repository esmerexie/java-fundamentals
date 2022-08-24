package inheritance;

public class Restaurant {

    public String name;
    public int reviewStars;
    public int price;

    public Restaurant(String name, int reviewStars, int price) {
        this.name = name;
        this.reviewStars = reviewStars;
        this.price = price;
    }


    public String toString(){
        return String.format("Restaurant: %s\nStars: %d", this.name, this.reviewStars);
    }
}
