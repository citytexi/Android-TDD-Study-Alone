package com.citytexi.outsideintddexample.unittests

import com.citytexi.outsideintddexample.Car
import com.citytexi.outsideintddexample.Engine
import com.citytexi.outsideintddexample.utils.MainDispatcherRule
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.kotlin.whenever

class CarShould {

    /* Coroutine Test
    * private val engine: Engine = mock()
    private val car: Car = Car(engine, 5.0)
    * */

    private val engine: Engine = mock()
    private val car: Car

    init {
        runTest {
            whenever(engine.turnOn()).thenReturn(
                flow<Int> {
                    kotlinx.coroutines.delay(2000)
                    emit(25)
                    kotlinx.coroutines.delay(2000)
                    emit(50)
                    kotlinx.coroutines.delay(2000)
                    emit(95)
                }
            )
        }

        car = Car(engine, 5.0)
    }

    @get:Rule
    var coroutinesTestRule = MainDispatcherRule()

    @Test
    fun looseFuelWhenItTurnsOn() = runTest {
        car.turnOn()

        assertEquals(4.5, car.fuel)
    }

    @Test
    fun turnOnItsEngine() = runTest {
        car.turnOn()

        verify(engine, times(1)).turnOn()
    }

}