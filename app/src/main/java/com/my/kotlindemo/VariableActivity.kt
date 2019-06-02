package com.my.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_variable.*

class VariableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_variable)

        //val：相当于Java的final
        val origin:Float = 65.0f
        tv_origin.text = origin.toString()

        var int:Int
        btn_int.setOnClickListener {
            int = origin.toInt()
            tv_convert.text = int.toString()
        }
        var long:Long
        btn_long.setOnClickListener {
            long = origin.toLong()
            tv_convert.text = long.toString()
        }
        var float:Float
        btn_float.setOnClickListener {
            float = origin.toFloat()
            tv_convert.text = float.toString()
        }
        var double:Double
        btn_double.setOnClickListener {
            double = origin.toDouble()
            tv_convert.text = double.toString()

        }
        var boolean:Boolean
        btn_boolean.setOnClickListener {
            //isNan():检查是否是非数字值
            boolean = origin.isNaN()
            tv_convert.text = boolean.toString()
        }
        var char:Char
        btn_char.setOnClickListener {
            char = origin.toChar()
            tv_convert.text = char.toString()
        }
    }
}
