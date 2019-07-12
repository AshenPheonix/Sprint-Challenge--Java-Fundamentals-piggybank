package piggyBank;

public class Penny {
    private static final int VALUE=1;

    private static int count=0;

    public Penny(){
        count++;
    }

    public Penny(int num){
        count+=num;
    }

    public static int getCount() {
        return count;
    }
    public int getTotal(){
        return count*VALUE;
    }
}
