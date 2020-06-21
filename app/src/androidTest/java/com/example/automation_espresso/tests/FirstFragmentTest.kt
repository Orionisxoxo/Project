package com.example.automation_espresso.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import com.example.automation_espresso.AssertionTexts
import com.example.automation_espresso.BasicsForTests
import com.example.automation_espresso.FirstFragment
import com.example.automation_espresso.screens.FirstFragmentScreen
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@SmallTest
class FirstFragmentTest : BasicsForTests() {

    private val firstFragment = FirstFragment()
    private val firstFragmentScreen = FirstFragmentScreen()

    @Before
    fun setUp() {
        openFragment(firstFragment)
    }

    @Test
    fun checkVisibilityAndTextMatchingOfFirstViewTitle() {
        firstFragmentScreen {
            titleTest(firstFragmentTitle, AssertionTexts.firstTitle)
        }
    }

    @Test
    fun checkFirstSwitchClickableAndClick() {
        firstFragmentScreen {
            switchTest(firstSwitch, AssertionTexts.firstSwitchText)
        }
    }

    @Test
    fun checkSecondSwitchClickableAndClick() {
        firstFragmentScreen {
            switchTest(secondSwitch, AssertionTexts.secondSwitchText)
        }
    }

    @Test
    fun checkAndClickButtonOfFirstView() {
        firstFragmentScreen {
            buttonTest(firstFragmentButton)
        }
    }
}