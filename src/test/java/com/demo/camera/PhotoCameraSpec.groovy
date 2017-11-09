package com.demo.camera


import spock.lang.Specification

class PhotoCameraSpec extends Specification {


    def "Should power up the sensor when camera is switched on"() {
        given:
        def powerSensor = Mock(ImageSensor)
        PhotoCamera camera = new PhotoCamera(false, false)

        when:
        camera.turnOn()

        then:
        powerSensor == true
    }


    def "Should power down the sensor when camera is switched off"() {
        given:
        def powerSensor = Mock(ImageSensor)
        PhotoCamera camera = new PhotoCamera(true, true)

        when:
        camera.turnOff()

        then:
        powerSensor == false
    }

}
