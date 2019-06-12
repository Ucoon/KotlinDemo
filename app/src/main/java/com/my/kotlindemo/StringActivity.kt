package com.my.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_string.*

class StringActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_string)

        val origin:String = tv_origin.text.toString()
        var origin_trim:String = origin
        if (origin.trim().indexOf('.') >0){
            origin_trim = origin_trim.substring(0, origin_trim.indexOf('.'))
        }
//        tv_convert.text = origin_trim
        //String-->Int
        var int:Int
        btn_int.setOnClickListener { int = origin_trim.toInt(); tv_convert.text = int.toString() }
        //String-->Long
        var long:Long
        btn_long.setOnClickListener { long = origin_trim.toLong(); tv_convert.text = long.toString() }
        //String-->Float
        var float:Float
        btn_float.setOnClickListener {
            float = origin_trim.toFloat()
            tv_convert.text = float.toString()
        }
        //String-->Double
        var double:Double
        btn_double.setOnClickListener {
            double = origin_trim.toDouble()
            tv_convert.text = double.toString()
        }
        //只能转换字符串“true”和“false”
//        origin_trim.toBoolean();
        //String-->CharArray
        var char_array:CharArray
        btn_chararray.setOnClickListener {
            char_array = origin.toCharArray()
            var str:String = ""
            for (item in char_array){
                str = str + item.toString() + ", "
            }
            tv_convert.text = str
        }
        //replace()
        btn_replace.setOnClickListener{
            tv_convert.text = origin.replace(".", "+")
        }
        //split()
        btn_split.setOnClickListener {
            var strList:List<String> = origin.split(".")
            var strResult:String = ""
            for (item in strList){
                strResult = strResult + item + ", "
            }
            tv_convert.text = strResult
        }
        var number:Int
        btn_cut.setOnClickListener {
            number = et_number.text.toString().toInt()
            tv_convert.text = origin[number].toString()
//            tv_convert.text = origin.get(number).toString()
        }
//        btn_format.setOnClickListener {
//            tv_convert.text = "字符串值为 $origin"
//        }
        btn_format.setOnClickListener {
            tv_convert.text = "字符串值为 $origin_trim"
        }
        btn_length.setOnClickListener {
            tv_convert.text = "字符串长度为 ${origin.length}"
        }
        btn_dollar.setOnClickListener {
            tv_convert.text = "美元金额为 ${'$'}$origin"
        }
    }
}