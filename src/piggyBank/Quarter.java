package piggyBank;

public class Quarter implements Coin {
    private static final int VALUE=25;

    private static int count=0;

    public Quarter(){
        count++;
    }

    public Quarter(int num){
        count+=num;
    }

    @Override
    public int getCount() {
        return count;
    }
    @Override
    public int getTotal(){
        return count*VALUE;
    }

    @Override
    public String toString() {
        return count + (count>1?" Quarters":" Quarter");
    }
}
