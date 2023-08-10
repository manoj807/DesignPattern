package com.valleytech.designpattern.observer_disign_pattern;

import com.valleytech.designpattern.observer_disign_pattern.observable.IphoneObservableImp;
import com.valleytech.designpattern.observer_disign_pattern.observable.StockObservable;
import com.valleytech.designpattern.observer_disign_pattern.observer.EmailNotificationAlertObserver;
import com.valleytech.designpattern.observer_disign_pattern.observer.MobileNotificationAlertObserver;
import com.valleytech.designpattern.observer_disign_pattern.observer.NotificationAlertObserver;

public class Stock {

    public  static void main(String ar[])
    {
        StockObservable  stockObservable=new IphoneObservableImp();

        NotificationAlertObserver first=new EmailNotificationAlertObserver("mk@gmail.com",stockObservable);
        NotificationAlertObserver second=new MobileNotificationAlertObserver("8825",stockObservable);
        NotificationAlertObserver third=new MobileNotificationAlertObserver("88200000",stockObservable);
        stockObservable.add(first);
        stockObservable.add(second);
        stockObservable.add(third);
        stockObservable.setStockCount(4);
    }
}
