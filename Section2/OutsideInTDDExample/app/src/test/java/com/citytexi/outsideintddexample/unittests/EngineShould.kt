package com.citytexi.outsideintddexample.unittests

import com.citytexi.outsideintddexample.Engine
import com.citytexi.outsideintddexample.utils.MainDispatcherRule
import junit.framework.TestCase
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.Test

class EngineShould {

    private val engine = Engine()

    @get:Rule
    var coroutinesTestRule = MainDispatcherRule()

    @Test
    fun turnOn() = runTest {
        engine.turnOn()

        TestCase.assertTrue(engine.isTurnedOn)
    }

    @Test
    fun riseTheTemperatureWhenItTurnsOn() = runTest {
        /*
        * Coroutine Test
        * engine.turnOn()
        * TestCase.assertEquals(95, engine.temperature)
        * */

        val flow = engine.turnOn()
        val action = flow.toList()

        TestCase.assertEquals(listOf(25, 50, 95), action)

    }

}