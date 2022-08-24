package inheritance;

public class Review {

    public String reviewForFood;
    public String author;
    public int stars;
    public String movie;
    Restaurant restaurant;

    public Review(String reviewForFood, String author, int stars) {
        this.reviewForFood = reviewForFood;
        this.author = author;
        this.stars = stars;
    }

    public Review(String reviewForFood, String author, int stars, String movie, Restaurant restaurant) {
        this.reviewForFood = reviewForFood;
        this.author = author;
        this.stars = stars;
        this.movie = movie;
        this.restaurant = restaurant;
    }

    public void setStars(int stars) {
        if(stars < 0  || stars > 5){
            throw new IllegalArgumentException("Please give a rating from 1 - 5");
        }
        this.stars = stars;
    }

    public String toString(){
        return String.format("Review: " + this.reviewForFood + " Author " + this.author + " Stars Recived: " + this.stars);
    }
}
