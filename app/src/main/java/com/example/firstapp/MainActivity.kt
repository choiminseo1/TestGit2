package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        printf("hello world")
        //1.변수
        var a = 10
        val b = 20
        printf(""+a)
        printf(""+b)
        printf(""+a+b)
        if(a!=10){
            printf("true")
        }else{
            printf("false")
        }
        when(a){//switch
            10, 20 -> printf("a = 10")
            29 -> printf("a = 29")
            else -> printf("a null")
        }
        //for, while
        //for(i = 0; i < 10; i++)
        for(i in 0..10 step 3){
            printf("for : "+i)
        }

    }
    fun printf(str : String){
        Log.d("test", str)
    }
}