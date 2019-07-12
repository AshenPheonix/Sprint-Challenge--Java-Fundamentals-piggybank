package piggyBank;

public class Nickel implements Coin{
    private static final int VALUE=5;

    private static int count=0;

    public Nickel(){
        count++;
        print(1);
    }

    public Nickel(int num){
        count+=num;
        print(num);
    }

    private void print(int num){
        if(num>1)
            System.out.printf("%d Nickel",num);
        else
            System.out.printf("%d Nickels",num);
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
    public String toString() {
        return count + (count>1?" Nickels":" Nickel");
    }
}
