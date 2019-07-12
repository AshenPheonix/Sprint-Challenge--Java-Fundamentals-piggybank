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
            System.out.println(currentQuarter);
        }else if(added instanceof Dollar){
            currentDollar=(Dollar)added;
            System.out.println(currentDollar);
        }else if(added instanceof Dime){
            currentDime=(Dime)added;
            System.out.println(currentDime);
        }else if(added instanceof Nickel){
            currentNickel=(Nickel)added;
            System.out.println(currentNickel);
        }else if(added instanceof Penny){
            currentPenny=(Penny)added;
            System.out.println(currentPenny);
        }
    }

    public void print(){
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        double total=0;

        total+=(currentQuarter.getTotal()/100.0);
        total+=(currentDollar.getTotal()/100.0);
        total+=(currentDime.getTotal()/100.0);
        total+=(currentPenny.getTotal()/100.0);
        total+=(currentNickel.getTotal()/100.0);

        System.out.println("The Piggy Bank Holds "+fp.format(total));
    }
}
