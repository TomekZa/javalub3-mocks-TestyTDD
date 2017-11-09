package com.demo.camera;

public class PhotoCamera implements ImageSensor {

    private boolean powerButton;
    private boolean blinkButton;

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

    public boolean getBlinkButton(){
        return this.blinkButton;
    }
    public boolean getPowerButton(){
        return this.powerButton;
    }

    @Override
    public void turnOn() {
        // not implemented
    }
    @Override
    public void turnOff() {
        // not implemented
    }

    public void pressButton() {
        // not implemented
    }

    @Override
    public byte[] read() {
        return new byte[0];
    }
}

