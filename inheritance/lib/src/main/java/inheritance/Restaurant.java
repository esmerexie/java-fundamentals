package inheritance;

public class Restaurant {

    private String name;
    private int reviewStars;
    private int price;

    public Restaurant(String name, int reviewStars, int price) {
        this.name = name;
        this.reviewStars = reviewStars;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReviewStars() {
        return reviewStars;
    }

    public void setReviewStars(int reviewStars) {
        this.reviewStars = reviewStars;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
