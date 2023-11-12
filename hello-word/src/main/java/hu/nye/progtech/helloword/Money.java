package hu.nye.progtech.helloword;

import java.util.Currency;

public class Money {
    public double value;
    public Currency currency;

    public Money(double value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

   /* public  double how_much(){
        return value;
    }
    public Currency what(){
        return  currency;
    }

    */
    public Money add(Money moneyztogiveMeh){
        moneyztogiveMeh = convertMoney(moneyztogiveMeh);
        if (moneyztogiveMeh == null) return  null;
        this.value += moneyztogiveMeh.getValue();
        return this;

    }
    public Money add(Money moneyztogiveMeh){//we change the name moneyztogiveMeh for moneyToAdd
        //convert
        if (!this.currency.equals(moneyztogiveMeh.getCurrency())){
            if (this.getCurrency().equals(Currency.getInstance("USD")) && moneyztogiveMeh.getCurrency().equals(Currency.getInstance("HUF")))
                moneyztogiveMeh = new Money(moneyztogiveMeh.value * 0.0034 , Currency.getInstance("USD"));
            else if (this.getCurrency().equals(Currency.getInstance("HUF")) && moneyztogiveMeh.getCurrency().equals(Currency.getInstance("USD")))
                moneyztogiveMeh = new Money(moneyztogiveMeh.value * 249.3, Currency.getInstance("HUF"));
            //else if (this.what().equals(Currency.getInstance("HUF")) && moneyztogiveMeh.what().equals(Currency.getInstance("USD")))
              //  moneyztogiveMeh = new Money(moneyztogiveMeh.val * 249.3, Currency.getInstance("ASD"));
            else return null;

        }
        this.value += moneyztogiveMeh.getValue();
        return this;

    }
    //WE THIS METHOD FOR ANOTHER ONE
    /*public Integer compareTo(Money m){//we change the name Money me for Money moneyTocompare
        if (!this.currency.equals(m.getCurrency())) {
            if (this.getCurrency().equals(Currency.getInstance("USD")) && m.getCurrency().equals(Currency.getInstance("HUF")))
                m = new Money(m.value * 0.0034, Currency.getInstance("USD"));
            else if (this.getCurrency().equals(Currency.getInstance("HUF")) && m.getCurrency().equals(Currency.getInstance("USD")))
                m = new Money(m.value * 249.3, Currency.getInstance("HUF"));
        }
        return Double.compare(this.getValue(), m.getValue());
    }

     */

    public Integer compareTo(Money m){
        m = convertMoney(m);
        if (m == null) return null;
        return  Double.compare(this.getValue(), m.getValue());
    }


}
