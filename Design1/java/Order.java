public class Order {
    private static int orderId=1;
    Restaurant restaurant;
    int count;
    String username;

    public Order( String username,Restaurant restaurant, int count) {
        this.restaurant = restaurant;
        this.count = count;
        this.username = username;
    }

    public int getOrderId() {
//        int k=Integer.parseInt(orderId);

        return orderId++;
    }
}
