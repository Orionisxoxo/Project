package com.example.automation_espresso.screens

import com.agoda.kakao.screen.Screen
import com.agoda.kakao.switch.KSwitch
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import com.example.automation_espresso.R

class FirstFragmentScreen : Screen<FirstFragmentScreen>() {

    val firstFragmentTitle = KTextView { withId(R.id.textview_first) }
    val firstSwitch = KSwitch { withId(R.id.switch1) }
    val secondSwitch = KSwitch { withId(R.id.switch2) }
    val firstFragmentButton = KButton { withId(R.id.button_first) }
}