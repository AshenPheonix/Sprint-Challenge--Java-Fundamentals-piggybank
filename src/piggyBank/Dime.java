package piggyBank;

public class Dime implements Coin{
    private static final int VALUE=10;

    private static int count=0;

    public Dime(){
        count++;
    }

    public Dime(int num){
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
        return count + (count>1?" Dimes":" Dime");
    }
}
