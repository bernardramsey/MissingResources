package com.gerralizza.missingresources

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(
            this,
            MissingStringProvider().getMissingString(),
            Toast.LENGTH_SHORT
        ).show()

        Toast.makeText(
            this,
            R.string.main_str_ru,
            Toast.LENGTH_SHORT
        ).show()
    }
}
