package com.my.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_set_of.*

class SetOfActivity : AppCompatActivity(){
    //Set是只读集合，不能进行增删操作,初始化赋值后便不可修改
    private var goodsSet: Set<String> = setOf<String>()
    //MutableSet是个可变集合，允许进行增删操作
    private var goodsMutSet: MutableSet<String> = mutableSetOf<String>()
    private val goodsA:String = "iPhone8"
    private val goodsB:String = "Mate10"
    private val goodsC:String = "小米6"
    private val goodsD:String = "OPPO R11"
    private val goodsE:String = "vivo X9S"
    private val goodsF:String = "魅族Pro6S"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_of)

        //Set/MutableSet只是简单的集合，无顺序排列，故不提供下标访问。
        //因此它无法修改指定位置的记录，也无法删除指定位置的记录；
        //也无法进行排序操作，也无法根据下标遍历集合的所有记录。
        btn_set_add.setOnClickListener {
            goodsMutSet.add(goodsA)
            goodsMutSet.add(goodsB)
            goodsMutSet.add(goodsC)
            goodsMutSet.add(goodsD)
            goodsMutSet.add(goodsE)
            goodsMutSet.add(goodsF)
            tv_set_result.text = "手机畅销榜已添加，当前共有${goodsMutSet.size}款手机"
        }

        btn_remove_tail.setOnClickListener {
            if (goodsMutSet.isNotEmpty()){
                goodsMutSet.remove(goodsF)
            }
            tv_set_result.text = "手机畅销榜已添加，当前共有${goodsMutSet.size}款手机"
        }

        btn_set_clear.setOnClickListener {
            goodsMutSet.clear()
            tv_set_result.text = "手机畅销榜已清空"
        }

        btn_set_for.setOnClickListener {
            var desc = ""
            for (item in goodsMutSet){
                desc = "${desc}名称：${item}\n"
            }
            tv_set_result.text = "手机畅销榜包含以下${goodsMutSet.size}款手机：\n$desc"
        }

        btn_set_iterator.setOnClickListener {
            var desc = ""
            val iterator = goodsMutSet.iterator()
            while (iterator.hasNext()){
                val item = iterator.next()
                desc = "${desc}名称：${item}\n"
            }
            tv_set_result.text = "手机畅销榜包含以下${goodsMutSet.size}款手机：\n$desc"
        }

        btn_set_foreach.setOnClickListener {
            var desc = ""
            goodsMutSet.forEach { desc = "${desc}名称：${it}\n" }
            tv_set_result.text = "手机畅销榜包含以下${goodsMutSet.size}款手机：\n$desc"
        }
    }
}