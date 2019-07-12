package piggyBank;

public class Dime extends Coin{
    private static final int VALUE=10;

    private static int count=0;

    public Dime(){
        count++;
        print(1);
    }

    public Dime(int num){
        count+=num;
        print(num);
    }

    private void print(int num){
        if(num>1)
            System.out.printf("%d Dime",num);
        else
            System.out.printf("%d Dimes",num);
        System.out.println();
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
    public void remove(int num) {
        count-=num;
    }

    @Override
    public int getValue() {
        return 10;
    }

    @Override
    public String toString() {
        return count + (count>1?" Dimes":" Dime");
    }
}
