package DesignPatterns.BehavioralPatterns.ObserverDesignPattern.Observable;

import DesignPatterns.BehavioralPatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {

    void add(NotificationAlertObserver obj);

    void remove(NotificationAlertObserver obj);

    void notifyObservers();

    void setStockCount(int count);

    int getStockCount();

}
