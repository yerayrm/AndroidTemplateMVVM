package com.devyry.templatekotlinmvvm.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Yeray Rguez on 11/02/2019.
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}