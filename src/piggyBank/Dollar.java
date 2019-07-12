package piggyBank;

public class Dollar implements Coin{
    private static final int VALUE=100;

    private static int count=0;

    public Dollar(){
        count++;
        print(1);
    }

    public Dollar(int num){
        count+=num;
        print(num);
    }

    private void print(int num){
        System.out.printf("$%d",num);
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
        return "$"+count;
    }
}
