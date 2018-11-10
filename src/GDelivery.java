public class GDelivery {
    private String name;
    private String phone;

    int PriceForDistance(int distance) {
        // System.out.println("$10");
        if (distance < 10 && distance > 0) {
            return 10;
        } else if (distance > 10) {
            return 25;
        }
        return 0;
    }

    

    public int PriceForDistanceAndStairs(int distance) {
        {
            if (distance < 10 && distance > 0) {
                return 20;
            } else if (distance > 10) {
                return 35;
            }
            return 0;
        }

    }



    public int PriceForWeekEnd() {
        // TODO Auto-generated method stub
        return 50;
    }

}