package com.valleytech.designpattern.facade;

public class FacadePatternClient {



   public  static void main(String str[])
   {

       FacadeShopKeeper shopKeeper=new FacadeShopKeeper();
       shopKeeper.blackBerrySale();
       shopKeeper.iphoneSale();
       shopKeeper.samsungSale();


   }





}
