package com.example.automation_espresso.screens

import com.agoda.kakao.check.KCheckBox
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import com.example.automation_espresso.R

class SecondFragmentScreen : Screen<SecondFragmentScreen>() {

    val secondFragmentTitle = KTextView { withId(R.id.textview_second) }
    val firstCheckBox = KCheckBox { withId(R.id.checkBox) }
    val secondCheckBox = KCheckBox { withId(R.id.checkBox2) }
    val thirdCheckBox = KCheckBox { withId(R.id.checkBox3) }
    val secondFragmentButton = KButton { withId(R.id.button_second) }
}