package piggyBank;

public class Penny implements Coin{
    private static final int VALUE=1;

    private static int count=0;

    public Penny(){
        count++;
    }

    public Penny(int num){
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
        return count + (count>1?" Pennies":" Penny");
    }
}
