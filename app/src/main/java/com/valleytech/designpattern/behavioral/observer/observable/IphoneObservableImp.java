package com.valleytech.designpattern.behavioral.observer.observable;

import com.valleytech.designpattern.behavioral.observer.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImp implements StockObservable
{

    List<NotificationAlertObserver> list=new ArrayList<>();
    public int stockCount=0;
    @Override
    public void add(NotificationAlertObserver observer) {
        list.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
      list.remove(observer);
    }

    @Override
    public void notifySubscribers() {

        for(NotificationAlertObserver item:list)
        {
           item.update();
        }

    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount==0)
        {
            notifySubscribers();
        }

         stockCount=stockCount+newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
