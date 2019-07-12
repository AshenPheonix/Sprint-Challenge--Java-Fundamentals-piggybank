package piggyBank;

public abstract class Coin {
    public abstract int  getCount();
    public abstract int  getTotal();
    public abstract int getValue();
    public abstract void  remove(int num);
    
    public int parse(int total){
        int temp=total;

        if(temp>this.getTotal()){
            temp-=this.getTotal();
            this.remove(this.getCount());
        }else{
            int removed=temp/this.getValue();
            temp-=removed*getValue();
            this.remove(removed);
        }
        return temp;
    } 
}
