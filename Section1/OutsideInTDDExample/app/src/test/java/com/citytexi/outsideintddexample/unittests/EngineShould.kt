package com.citytexi.outsideintddexample.unittests

import com.citytexi.outsideintddexample.Engine
import junit.framework.TestCase
import org.junit.Test

class EngineShould {

    private val engine = Engine()

    @Test
    fun turnOn() {
        engine.turnOn()

        TestCase.assertTrue(engine.isTurnedOn)
    }

    @Test
    fun riseTheTemperatureWhenItTurnsOn() {
        engine.turnOn()

        TestCase.assertEquals(95, engine.temperature)
    }

}