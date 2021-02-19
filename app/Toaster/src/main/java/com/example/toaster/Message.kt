package com.example.toaster

import android.content.Context
import android.widget.Toast

class Message {
    companion object{
        fun Show(context: Context, message:String){
            Toast.makeText(context,message,Toast.LENGTH_LONG).show()
        }
    }
}