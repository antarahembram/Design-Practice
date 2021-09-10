public class Rating {
    float rate;
    String comment="";

    public Rating() {
    }

    public Rating(float rate, String comment) {
        this.rate = rate;
        this.comment = comment;
    }
    public Rating(float rate) {
        this.rate = rate;
    }
}
