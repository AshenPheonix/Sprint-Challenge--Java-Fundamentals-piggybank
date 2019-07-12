package piggyBank;

public class Nickel implements Coin{
    private static final int VALUE=5;

    private static int count=0;

    public Nickel(){
        count++;
    }

    public Nickel(int num){
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
        return count + (count>1?" Nickels":" Nickel");
    }
}
