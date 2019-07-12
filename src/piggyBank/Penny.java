package piggyBank;

public class Penny implements Coin{
    private static final int VALUE=1;

    private static int count=0;

    public Penny(){
        count++;
        print(1);
    }

    public Penny(int num){
        count+=num;
        print(num);
    }

    private void print(int num){
        if(num>1)
            System.out.printf("%d Penny",num);
        else
            System.out.printf("%d Pennies",num);
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
        return count + (count>1?" Pennies":" Penny");
    }
}
