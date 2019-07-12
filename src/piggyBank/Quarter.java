package piggyBank;

public class Quarter {
    private static final int VALUE=25;

    private static int count=0;

    public Quarter(){
        count++;
    }

    public Quarter(int num){
        count+=num;
    }

    public static int getCount() {
        return count;
    }
    public int getTotal(){
        return count*VALUE;
    }
}
