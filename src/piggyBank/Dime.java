package piggyBank;

public class Dime {
    private static final int VALUE=10;

    private static int count=0;

    public Dime(){
        count++;
    }

    public Dime(int num){
        count+=num;
    }

    public static int getCount() {
        return count;
    }
    public int getTotal(){
        return count*VALUE;
    }
}
