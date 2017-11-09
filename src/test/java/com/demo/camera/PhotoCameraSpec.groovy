package com.demo.camera


import spock.lang.Specification

class PhotoCameraSpec extends Specification {


    def "Should power up the sensor when camera is switched on"() {
        given:
        PhotoCamera camera = new PhotoCamera(false, false)

        when:
        camera.turnOn()

        then:
        camera.getPowerSensor() == true
    }


    def "Should power down the sensor when camera is switched off"() {
        given:
        PhotoCamera camera = new PhotoCamera(true, true)

        when:
        camera.turnOff()

        then:
        camera.getPowerSensor() == false
    }

}
