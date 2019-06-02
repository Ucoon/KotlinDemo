package com.my.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_array.*
import kotlinx.android.synthetic.main.activity_variable.*

class ArrayActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_array)
        //声明整型数组
        var int_array:IntArray = intArrayOf(1, 2, 3)
        //也可以按下面方式声明
        var int_array_sec:Array<Int> = arrayOf(1, 2, 3)

        //声明长整型数组
        var long_array:LongArray = longArrayOf(1, 2, 3)
        var long_array_sec:Array<Long> = arrayOf(1, 2, 3)

        //声明浮点数组
        var float_array:FloatArray = floatArrayOf(1.0f, 2.0f, 3.0f)
        var float_array_sec:Array<Float> = arrayOf(1.0f, 2.0f, 3.0f)

        //声明双精度数组
        var double_array:DoubleArray = doubleArrayOf(1.0, 2.0, 3.0)
        var double_array_sec:Array<Double> = arrayOf(1.0, 2.0, 3.0)

        //声明布尔型数组
        var boolean_array:BooleanArray = booleanArrayOf(true, false, true)
        var boolean_array_sec:Array<Boolean> = arrayOf(true, false, true)

        //声明字符数组
        var char_array:CharArray = charArrayOf('a', 'b', 'c')
        var char_array_sec:Array<Char> = arrayOf('a', 'b', 'c')

        //声明字符串数组
        var string_array:Array<String> = arrayOf("Hello", "World")
        btn_string.setOnClickListener {
            var str:String = ""
            var i:Int = 0
            while (i<string_array.size){
//                str = str + string_array[i] + ", "
                str = str + string_array.get(i) + ", "
                i++
            }
            tv_item_list.text = str
        }
    }
}