package com.aimeeramirez;

public class MobilePhone implements ITelephone{
    private boolean isOn = false;
    private int myNumber;
    private boolean isRinging;


    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone is powered up.");

    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now ringing " + phoneNumber + " on deskphone");
        }else{
            System.out.println("Phone is switched off.");
        }
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the mobile phone.");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn ) {
            isRinging = true;
            System.out.println("Melody Ring.");
        } else {
            isRinging = false;
            System.out.println("Mobile phone is not on or Number different.");
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
