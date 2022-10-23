package com.keegan.android.tipcalculator2;

public class TipCalculator {
    private float tip;
    private float bill;
    private int party;

    //default constructor
    public TipCalculator(){}

    public TipCalculator(float newTip, float newBill, int newParty){
        setTip(newTip);
        setBill(newBill);
        setParty(newParty);
    }

    public float getTip(){
        return tip;
    }

    public float getBill(){
        return bill;
    }

    public int getParty(){return party;}

    public void setTip(float newTip){
        if(newTip > 0){
            tip = newTip;
        }
    }

    public void setBill(float newBill) {
        if(newBill > 0){
            bill = newBill;
        }
    }

    public void setParty(int newParty){
        if(newParty > 0){
            party = newParty;
        }
    }

    public float tipAmount(){
        return bill * tip;
    }

    public float totalAmount(){
        return bill + tipAmount();
    }

    public float guestTipAmount(){return tipAmount()/party;}

    public float guestTotalAmount(){return totalAmount()/party;}
}
