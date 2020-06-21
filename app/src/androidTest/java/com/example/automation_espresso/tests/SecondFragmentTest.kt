package com.example.automation_espresso.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import com.example.automation_espresso.AssertionTexts
import com.example.automation_espresso.BasicsForTests
import com.example.automation_espresso.SecondFragment
import com.example.automation_espresso.screens.SecondFragmentScreen
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@SmallTest
class SecondFragmentTest : BasicsForTests() {

    private val secondFragment = SecondFragment()
    private val secondFragmentScreen = SecondFragmentScreen()

    @Before
    fun setUp() {
        openFragment(secondFragment)
    }

    @Test
    fun checkVisibilityAndTextMatchingOfSecondViewTitle() {
        secondFragmentScreen {
            titleTest(secondFragmentTitle, AssertionTexts.secondTitle)
        }
    }

    @Test
    fun checkStateAndClickFirstCheckBox() {
        secondFragmentScreen {
            checkBoxTest(firstCheckBox, AssertionTexts.firstCheckBoxText)
        }
    }

    @Test
    fun checkStateAndClickSecondCheckBox() {
        secondFragmentScreen {
            checkBoxTest(secondCheckBox, AssertionTexts.secondCheckBoxText)
        }
    }

    @Test
    fun checkStateAndClickThirdCheckBox() {
        secondFragmentScreen {
            checkBoxTest(thirdCheckBox, AssertionTexts.thirdCheckBoxText)
        }
    }

    @Test
    fun checkAndClickButtonOfSecondView() {
        secondFragmentScreen {
            buttonTest(secondFragmentButton)
        }
    }
}