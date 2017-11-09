package com.demo.camera;

public class PhotoCamera {

    private boolean cameraOn;
    ImageSensor powerSensor;
    ImageSensor copyData;
    Card writeData;

    public PhotoCamera(ImageSensor powerSensor) {  //Dependency Injection (Wstrzykiwanie)
        this.powerSensor = powerSensor;
    }

    public PhotoCamera(ImageSensor copyData, Card writeData) {
        this.copyData = copyData;
        this.writeData = writeData;
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
        if (cameraOn == true) {
            this.writeData.write(this.copyData.read());
        }
    }
}

