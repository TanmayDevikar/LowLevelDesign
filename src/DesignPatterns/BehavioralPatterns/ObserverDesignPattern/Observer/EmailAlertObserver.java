package DesignPatterns.BehavioralPatterns.ObserverDesignPattern.Observer;

import DesignPatterns.BehavioralPatterns.ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    StockObservable observable;
    String emailId;

    public EmailAlertObserver(String emailId, StockObservable observable) {
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail(emailId, observable);
    }

    private void sendEmail(String emailId, StockObservable observable) {
        System.out.println("Email send to " + emailId + " with the stock count " + observable.getStockCount());
    }
}
