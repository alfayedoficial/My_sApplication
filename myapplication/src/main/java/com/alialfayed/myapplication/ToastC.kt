package com.alialfayed.myapplication

import android.content.Context
import android.widget.Toast

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do :
 * Date 11/10/2021 - 4:39 PM
 */
class ToastC {

    fun cToast(con : Context) = Toast.makeText(con , "Test" , Toast.LENGTH_LONG).show()
}