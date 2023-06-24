package com.citytexi.myfirstunittest

import org.junit.Assert
import org.junit.Test


class EngineTest {

    private val engine = Engine(
        cc = 2000,
        horsePower = 100,
        temperature = 15,
        isTurnedOn = false
    )

    @Test
    fun engineTurnsOn() {
        engine.turnOn()

        Assert.assertEquals(true, engine.isTurnedOn)
        Assert.assertEquals(95, engine.temperature)
    }

    @Test
    fun engineTurnsOff() {
        engine.turnOn()

        engine.turnOff()

        Assert.assertEquals(false, engine.isTurnedOn)
        Assert.assertEquals(15, engine.temperature)
    }

}