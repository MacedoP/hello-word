package hu.nye.progtech.helloword.demeter;

import java.time.Duration;

public class Taxi {
    private String id;
    private String name;
    private Wallet wallet;
    private Passeger passeger;

    private void taekMonney(final double distanceInMeter, final Duration timeDuration, final double tarfiff){
        double  price = this.calculatepriceOfTransfer(distanceInMeter, timeDuration, tarfiff);
        this.wallet.addMoney(passeger.pay(price));
    }
    private double calculatepriceOfTransfer(final double distanceinMeter , final  Duration timeOut, final double tariff){
        return 1;
    }
}
