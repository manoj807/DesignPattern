package com.valleytech.designpattern.structure.facade;

public class FacadeShopKeeper {

    private MobileShop blackBerry;
    private MobileShop samsung;
    private MobileShop iphone;
    public FacadeShopKeeper()
    {
      blackBerry=new BlackBerry();
      samsung=new Samsung();
      iphone=new Iphone();

    }

    public void iphoneSale()
    {
      iphone.modelNo();
      iphone.price();
    }

    public void samsungSale()
    {
        samsung.modelNo();
        samsung.price();
    }

    public void blackBerrySale()
    {
        iphone.modelNo();
        iphone.price();
    }



}
