package piggyBank;

public class Dollar {
    private static final int VALUE=100;

    private static int count=0;

    public Dollar(){
        count++;
    }

    public Dollar(int num){
        count+=num;
    }

    public static int getCount() {
        return count;
    }
    public int getTotal(){
        return count*VALUE;
    }
}
