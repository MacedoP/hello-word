package hu.nye.progtech.helloword.demeter;

import java.time.Duration;
import java.util.Objects;

public class Wallet {
    private double money;

    public Wallet(double money){
        this.money =money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public void takeMoney(final double amount){
        this.money -= amount;
    }
    public void addMoney(final double amount){
        this.money += amount;
    }
    
    public boolean eguals(Object o){
        if (this == o )
            return true;
        if (o == null || getClass() != o.getClass() )
            return  false;
        Wallet wallet = (Wallet) o;
        return Double.compare(wallet.money, money) == 0;
        
    }
    public  int hashCode(){
        return Objects.hash(money);
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "money=" + money +
                '}';
    }
}
