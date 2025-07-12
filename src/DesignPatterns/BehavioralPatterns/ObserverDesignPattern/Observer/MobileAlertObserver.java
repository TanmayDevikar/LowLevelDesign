package DesignPatterns.BehavioralPatterns.ObserverDesignPattern.Observer;

import DesignPatterns.BehavioralPatterns.ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {

    StockObservable observable;
    String mobileNumber;

    public MobileAlertObserver(String mobileNumber, StockObservable observable) {
        this.observable = observable;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void update() {
        sendMessage(mobileNumber, observable);
    }

    private void sendMessage(String mobileNumber, StockObservable observable) {
        System.out.println("Message sent on mobile " + mobileNumber + " with the stock count " + observable.getStockCount() );
    }
}
