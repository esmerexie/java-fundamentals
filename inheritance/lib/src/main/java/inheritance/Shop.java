package inheritance;

import java.util.Collection;

public class Shop {

    public String name;
    public String description;
    public float starRating;
    Collection<Review> reviews;

    public Shop(String name, String description, float starRating) {
        this.name = name;
        this.description = description;
        this.starRating = starRating;
    }

//    public addReview(Review review){
//        return review.add(review);
//    }

    public String toString(){
        return "Shop name: " + this.name + "Description: " + this.description + "shop rating: " + this.starRating;
    }
}
