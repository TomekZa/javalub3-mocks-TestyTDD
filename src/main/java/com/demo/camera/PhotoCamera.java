package com.demo.camera;

public class PhotoCamera {

    private boolean powerButton;
    private boolean blinkButton;
    ImageSensor powerSensor;
    ImageSensor copyData;
    Card writeData;


    public PhotoCamera() {
        this(false, false);
    }

    public PhotoCamera(ImageSensor powerSensor) {  //Dependency Injection (Wstrzykiwanie)
        this.powerSensor = powerSensor;
    }

    public PhotoCamera(ImageSensor copyData, Card writeData) {
        this.copyData = copyData;
        this.writeData = writeData;
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


    public void turnOn() {
        this.powerButton=true;
        this.powerSensor.turnOn();

    }
    public void turnOff() {
        this.powerButton=false;
        this.powerSensor.turnOff();
    }

    public void pressButton() {
        if (powerButton == true) {
            this.writeData = (Card) this.copyData;
        }
    }

}

