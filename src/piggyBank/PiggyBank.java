package piggyBank;

import java.text.DecimalFormat;

public class PiggyBank {
    private Quarter currentQuarter;
    private Dollar currentDollar;
    private Dime currentDime;
    private Nickel currentNickel;
    private Penny currentPenny;

    public void add(Coin added){
        if(added instanceof Quarter){
            currentQuarter=(Quarter)added;
        }else if(added instanceof Dollar){
            currentDollar=(Dollar)added;
        }else if(added instanceof Dime){
            currentDime=(Dime)added;
        }else if(added instanceof Nickel){
            currentNickel=(Nickel)added;
        }else if(added instanceof Penny){
            currentPenny=(Penny)added;
        }
    }

    public void print(){
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        System.out.println("The Piggy Bank Holds "+fp.format(total()));
    }

    private double total(){
        double total=0;

        total+=(currentQuarter.getTotal()/100.0);
        total+=(currentDollar.getTotal()/100.0);
        total+=(currentDime.getTotal()/100.0);
        total+=(currentPenny.getTotal()/100.0);
        total+=(currentNickel.getTotal()/100.0);
        return total;
    }

    public void contents(){
        if(currentDollar.getCount()>0)
            System.out.println(currentDollar);
        if(currentQuarter.getCount()>0)
            System.out.println(currentQuarter);
        if(currentDime.getCount()>0)
            System.out.println(currentDime);
        if(currentNickel.getCount()>0)
            System.out.println(currentNickel);
        if(currentPenny.getCount()>0)
            System.out.println(currentPenny);
    }

    public void remove(double amount){
        int temp=(int)(amount*100);
        if(amount>total()) {
            System.out.println("Not enough money in the piggy bank");
        }else {
            temp = currentDollar.parse(temp);
            temp = currentQuarter.parse(temp);
            temp = currentDime.parse(temp);
            temp = currentNickel.parse(temp);
            temp = currentPenny.parse(temp);
            contents();
        }
    }
}
