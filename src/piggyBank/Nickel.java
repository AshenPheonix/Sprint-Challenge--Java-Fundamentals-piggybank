package piggyBank;

public class Nickel {
    private static final int VALUE=5;

    private static int count=0;

    public Nickel(){
        count++;
    }

    public Nickel(int num){
        count+=num;
    }

    public static int getCount() {
        return count;
    }
    public int getTotal(){
        return count*VALUE;
    }
}
