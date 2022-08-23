package inheritance;

public class Review {

    private String reviewForFood;
    private String author;
    private int stars;

    public Review(String reviewForFood, String author, int stars) {
        this.reviewForFood = reviewForFood;
        this.author = author;
        this.stars = stars;
    }

    public String getReviewForFood() {
        return reviewForFood;
    }

    public void setReviewForFood(String reviewForFood) {
        this.reviewForFood = reviewForFood;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

}
