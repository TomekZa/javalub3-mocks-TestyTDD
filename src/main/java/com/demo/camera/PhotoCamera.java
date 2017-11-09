package com.demo.camera;

public class PhotoCamera {

    private boolean cameraOn;
    private boolean blinkButton;
    ImageSensor powerSensor;


    public PhotoCamera() {
        this(false, false);
    }

    public PhotoCamera(ImageSensor powerSensor) {  //Dependency Injection (Wstrzykiwanie)
        this.powerSensor = powerSensor;
    }

    public PhotoCamera(boolean powerButton, boolean blinkButton) {
        this.blinkButton = blinkButton;
        this.cameraOn = powerButton;
    }

    public void setBlinkButton(boolean blinkButton) {
        this.blinkButton = blinkButton;
    }

    public void setCameraOn(boolean cameraOn) {
        this.cameraOn = cameraOn;
    }

    public boolean getBlinkButton(){
        return this.blinkButton;
    }
    public boolean getCameraOn(){
        return this.cameraOn;
    }


    public void turnOn() {
        this.cameraOn =true;
        this.powerSensor.turnOn();

    }
    public void turnOff() {
        this.cameraOn =false;
        this.powerSensor.turnOff();
    }

    public void pressButton() {
        // not implemented
    }

}

