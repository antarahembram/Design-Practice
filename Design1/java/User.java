public class User {
    String username;
    public User(String username)
    {
        this.username=username;
    }
    //order dish
    void orderDish(Restaurant restaurant,int count)
    {
        Order order=new Order(this.username,restaurant,count);
        System.out.println("Yehh Order is confirmed from "+restaurant.resName);
        System.out.println("OrderId: " +order.getOrderId() +" ----> "+ restaurant.getDish()+" ---> "+count);
    }

    //rating
    void rate(Restaurant restaurant,float rating,String comment)
    {
        restaurant.giveRating(this.username,rating,comment);
    }
    void rate(Restaurant restaurant,float rating)
    {
        restaurant.giveRating(username,rating);
    }
}
