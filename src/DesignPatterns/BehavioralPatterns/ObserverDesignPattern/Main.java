package DesignPatterns.BehavioralPatterns.ObserverDesignPattern;

import DesignPatterns.BehavioralPatterns.ObserverDesignPattern.Observable.IphoneStockObservable;
import DesignPatterns.BehavioralPatterns.ObserverDesignPattern.Observable.StockObservable;
import DesignPatterns.BehavioralPatterns.ObserverDesignPattern.Observer.EmailAlertObserver;
import DesignPatterns.BehavioralPatterns.ObserverDesignPattern.Observer.MobileAlertObserver;
import DesignPatterns.BehavioralPatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Main {

    public static void main(String[] args) {

        StockObservable iphoneStockObservable = new IphoneStockObservable();

        NotificationAlertObserver tanmay = new EmailAlertObserver("tanmay@gmail.com", iphoneStockObservable);
        NotificationAlertObserver sanik = new EmailAlertObserver("sanik@gmail.com", iphoneStockObservable);
        NotificationAlertObserver rohit = new MobileAlertObserver("9921833908", iphoneStockObservable);

        iphoneStockObservable.add(tanmay);
        iphoneStockObservable.add(sanik);
        iphoneStockObservable.add(rohit);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(-10);
        iphoneStockObservable.setStockCount(20);



    }
}
