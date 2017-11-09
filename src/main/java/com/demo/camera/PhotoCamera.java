package com.demo.camera;

public class PhotoCamera {

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

