package com.example.myapplication

import android.content.ContentValues.TAG
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import org.w3c.dom.Text

class BMainFragment : Fragment(R.layout.fragment_b_main) {

    private lateinit var dataSendListnerB: DataSenListnerB

    override fun onAttach(context: Context) {
        Log.d(TAG, "onAttach")
        super.onAttach(context)
        val listnerB = (context as DataSenListnerB)
        dataSendListnerB = listnerB
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate")
        super.onCreate(savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG, "onViewCreated")
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_send).setOnClickListener {
            dataSendListnerB.sendData("누름")
        }
    }

    fun getData(data: String) {
        requireView().findViewById<TextView>(R.id.tv_receive).text = data
    }

    override fun onStart() {
        Log.d(TAG, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(TAG, "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(TAG, "onDetach")
        super.onDetach()
    }

    companion object {
        private const val TAG = "결과 BMainFragment"
    }
}

interface DataSenListnerB {
    fun sendData(data: String)
}
