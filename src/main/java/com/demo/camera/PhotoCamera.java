package com.demo.camera;

import java.util.concurrent.TimeUnit;

public class PhotoCamera {

    private boolean cameraOn;
    private ImageSensor sensor;
    private Card card;

    public PhotoCamera(ImageSensor sensor) {  //Dependency Injection (Wstrzykiwanie)
        this.sensor = sensor;
    }

    public PhotoCamera(ImageSensor sensor, Card card) {
        this.sensor = sensor;
        this.card = card;
    }

    public void turnOn() {
        this.cameraOn = true;
        this.sensor.turnOn();

    }
    public void turnOff() {
        this.cameraOn = false;
        this.sensor.turnOff();
    }

    public void pressButton() throws InterruptedException {
        if (cameraOn == true) {
            TimeUnit.SECONDS.sleep(5);
            card.write(sensor.read());
        }
    }
}

