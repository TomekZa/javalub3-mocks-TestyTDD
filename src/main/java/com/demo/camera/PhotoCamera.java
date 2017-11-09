package com.demo.camera;

public class PhotoCamera {

    private boolean powerButton;
    private boolean blinkButton;
    private boolean powerSensor;


    public PhotoCamera() {
        this(false, false);
    }

    public PhotoCamera(boolean powerButton, boolean blinkButton) {
        this.blinkButton = blinkButton;
        this.powerButton = powerButton;
    }

    public void setBlinkButton(boolean blinkButton) {
        this.blinkButton = blinkButton;
    }

    public void setPowerButton(boolean powerButton) {
        this.powerButton = powerButton;
    }
    public boolean getPowerSensor(){
        return this.powerSensor;
    }
    public boolean getBlinkButton(){
        return this.blinkButton;
    }
    public boolean getPowerButton(){
        return this.powerButton;
    }


    public void turnOn() {
        // not implemented
    }

    public void turnOff() {
        // not implemented
    }

    public void pressButton() {
        // not implemented
    }
}

