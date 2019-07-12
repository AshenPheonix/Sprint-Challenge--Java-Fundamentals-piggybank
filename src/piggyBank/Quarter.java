package piggyBank;

public class Quarter extends Coin {
    private static final int VALUE=25;

    private static int count=0;

    public Quarter(){
        count++;
        print(1);
    }

    public Quarter(int num){
        count+=num;
        print(num);
    }

    private void print(int num){
        if(num>1)
            System.out.printf("%d Quarter",num);
        else
            System.out.printf("%d Quarters",num);
        System.out.println();
    }

    @Override
    public int getValue() {
        return 25;
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
        if(count==0)
            return "";
        return count + (count>1?" Quarters":" Quarter");
    }

    @Override
    public void remove(int num) {
        count-=1;
    }
}
