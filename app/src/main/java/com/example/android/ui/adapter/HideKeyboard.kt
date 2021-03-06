package com.example.android.ui.adapter

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

interface HideKeyboard {
    companion object {
        fun hide(context: Context, view: View) {
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
}