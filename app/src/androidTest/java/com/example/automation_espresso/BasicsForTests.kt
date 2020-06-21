package com.example.automation_espresso

import androidx.fragment.app.Fragment
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.check.KCheckBox
import com.agoda.kakao.switch.KSwitch
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import org.junit.Rule

open class BasicsForTests {

    @get:Rule
    var mainActivity = ActivityTestRule(MainActivity::class.java, false, true)

    fun openFragment(invokedFragment: Fragment) {
        mainActivity
            .activity
            .supportFragmentManager
            .beginTransaction()
            .attach(invokedFragment)
            .commit()
    }

    fun titleTest(kTextView: KTextView, text: String) {
        with(kTextView) {
            matches { withText(text) }
            isDisplayed()
        }
    }

    fun buttonTest(kButton: KButton) {
        with(kButton) {
            isEnabled()
            click()
        }
    }

    fun switchTest(kSwitch: KSwitch, text: String) {
        with(kSwitch) {
            matches { withText(text) }
            isClickable()
            click()
        }
    }

    fun checkBoxTest(kCheckBox: KCheckBox, text: String) {
        with(kCheckBox) {
            matches { withText(text) }
            isNotChecked()
            click()
            isChecked()
        }
    }
}