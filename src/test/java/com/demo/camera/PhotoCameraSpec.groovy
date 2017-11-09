package com.demo.camera


import spock.lang.Specification

class PhotoCameraSpec extends Specification {


    def "Should power up the sensor when camera is switched on"() {
        given:
        ImageSensor powerSensor = Mock(ImageSensor)
        PhotoCamera camera = new PhotoCamera(powerSensor)

        when:
        camera.turnOn()

        then:
        1 * powerSensor.turnOn()
    }


    def "Should power down the sensor when camera is switched off"() {
        given:
        ImageSensor powerSensor = Mock(ImageSensor)
        PhotoCamera camera = new PhotoCamera(powerSensor)

        when:
        camera.turnOff()

        then:
        1 * powerSensor.turnOff()
    }

}
