package hu.nye.progtech.helloword.demeter;

public class Passeger {
    private Wallet wallet;
    public Passeger(Wallet wallet){
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
    public double pay(final  double amount){
        this.wallet.takeMoney(amount);
        return amount;
    }
}
