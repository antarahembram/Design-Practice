public class Run {
    public static  void main(String[] args)
    {
        User user1= new User("A");
        User user2=new User("B");

        Restaurant r1=new Restaurant("Chicken",0,"Chili Chicken");
        Restaurant r2=new Restaurant("Biryani Store",0,"Biryani");
        Restaurant r3=new Restaurant("Noodles Store",0,"Noodles");

        user1.orderDish(r1,2);
        user2.orderDish(r3,3);

        user1.rate(r1,4,"Good one");
       user2.rate(r1,5,"Great ");
       user1.rate(r1,0);

        /*To print the restaurant rating*/
        System.out.println("Rating " + r1.resName+ " : " + r1.getAvgRating());
        //r1.getRating();

    }
}
