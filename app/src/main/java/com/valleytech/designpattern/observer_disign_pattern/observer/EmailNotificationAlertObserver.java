package com.valleytech.designpattern.observer_disign_pattern.observer;

import com.valleytech.designpattern.observer_disign_pattern.observable.StockObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver
{
    private String emailId;
    private  StockObservable stockObservable;
  public EmailNotificationAlertObserver(String emailId, StockObservable stockObservable)
  {
      this.emailId=emailId;
      this.stockObservable=stockObservable;
  }
    @Override
    public void update() {
        sendEmail(emailId,"Product in Stock");
    }

    public void sendEmail(String emailId,String msg)
    {
        System.out.println("emailId:"+emailId);
    }
}
