import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    public String resName;
    private float avgRating;
    public  HashMap<String,Rating> rating=new HashMap<>();
    private String dish;

    public Restaurant(String resName,float avgRating,  String dish) {
        this.avgRating = avgRating;
        this.dish = dish;
        this.resName = resName;
    }

    public float getAvgRating() {
        return avgRating;
    }

    public String getDish() {
        return dish;
    }

    public void giveRating(String username,float rate,String comment)
    {
            if(this.rating.size()!=0 && this.rating.containsKey(username))
            {
                this.rating.remove(username);
            }

          //  System.out.println(username+rating+comment);
            float s=(float)this.rating.size();
            this.avgRating=(this.avgRating*s + rate)/(s+1);
            Rating r=new Rating(rate,comment);
            this.rating.put(username,r);
    }
    public void giveRating(String username,float rating)
    {
        if(this.rating.containsKey(username))
        {
            this.rating.remove(username);
        }
        float s=(float)this.rating.size();
        this.avgRating=(this.avgRating*s+ rating)/(s+1);
        Rating r=new Rating(rating);
        this.rating.put(username,r);
    }

    public void getRating() {
        if(this.rating.size()==0)
        {
            System.out.println("Empty");
        }
        for(Map.Entry<String, Rating> e : rating.entrySet()){
            System.out.println(e.getKey()+" -- " +e.getValue().comment + " "+ e.getValue().rate);
        }

    }
}
