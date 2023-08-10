package com.valleytech.designpattern.observer_disign_pattern.observer;

import com.valleytech.designpattern.observer_disign_pattern.observable.StockObservable;

public class MobileNotificationAlertObserver implements NotificationAlertObserver
{
    private String mobile;
    private  StockObservable stockObservable;
   public MobileNotificationAlertObserver(String mobile, StockObservable stockObservable)
   {
      this.mobile=mobile;
      this.stockObservable=stockObservable;
   }
    @Override
    public void update() {
        sendEmail(mobile,"product in stock");
    }

    public void sendEmail(String mobile,String msg)
    {
        System.out.println("mobile:"+mobile);
    }
}
