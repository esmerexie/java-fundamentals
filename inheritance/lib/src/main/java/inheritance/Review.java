package inheritance;

public class Review {

    public String reviewForFood;
    public String author;
    public int stars;

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
        if(stars < 0  || stars > 5){
            throw new IllegalArgumentException("Please give a rating from 1 - 5");
        }
        this.stars = stars;
    }

    public String toString(){
        return String.format("Review: " + this.reviewForFood + " Author " + this.author + " Stars Recived: " + this.stars);
    }
}
