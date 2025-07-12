package DesignPatterns.BehavioralPatterns.ObserverDesignPattern.Observable;

import DesignPatterns.BehavioralPatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable {

    int stockCount = 0;
    List<NotificationAlertObserver> list = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver obj) {
        list.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        list.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver observer : list) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int count) {

        if(stockCount == 0){ //stock count is 0 that is out of stock and now, stock is going to be added with the value present in count, so update the observers.
            stockCount += count;
            notifyObservers();

        } else {
            stockCount += count; // else if stock is already present, only update the stock
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
