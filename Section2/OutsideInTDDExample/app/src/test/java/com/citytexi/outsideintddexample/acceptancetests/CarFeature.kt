package com.citytexi.outsideintddexample.acceptancetests

import com.citytexi.outsideintddexample.Car
import com.citytexi.outsideintddexample.Engine
import com.citytexi.outsideintddexample.utils.MainDispatcherRule
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.test.advanceTimeBy
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.Test

class CarFeature {

    private val engine = Engine()
    private val car = Car(engine, 6.0)

    @get:Rule
    var coroutinesTestRule = MainDispatcherRule()

    @Test
    fun carIsLoosingFuelWhenItTurnsOn() = runTest {

        car.turnOn()

        assertEquals(5.5, car.fuel)

    }

    /**
    *
    ``` Coroutine Test
    @Test
    fun carIsTurningOnItsEngineAndIncreasesTheTemperature() = runTest {
        car.turnOn()

        advanceTimeBy(6001)

        assertEquals(95, car.engine.temperature)

        assertTrue(car.engine.isTurnedOn)
    }
    ```
    **/


    @Test
    fun carIsTurningOnItsEngineAndIncreasesTheTemperatureGradually() = runTest {
        car.turnOn()

        advanceTimeBy(2001)
        assertEquals(25, car.engine.temperature)

        advanceTimeBy(2001)
        assertEquals(50, car.engine.temperature)

        advanceTimeBy(2001)
        assertEquals(95, car.engine.temperature)

        assertTrue(car.engine.isTurnedOn)
    }

}