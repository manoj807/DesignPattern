package com.valleytech.designpattern.observer_disign_pattern.observable;

import com.valleytech.designpattern.observer_disign_pattern.observer.NotificationAlertObserver;

public interface StockObservable
{
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int newStockAdded);

    public int getStockCount();

}
