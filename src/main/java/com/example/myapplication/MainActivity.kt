package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main), DataSenListner, DataSenListnerB {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun sendData(data: String) {

        supportFragmentManager.fragments.forEach { fragment->
            if(fragment is BMainFragment){
                fragment.getData(data)
            }
        }

        supportFragmentManager.fragments.forEach{ fragment ->
            if(fragment is AMainFragment){
                fragment.getData(data)
            }

        }
    }

}