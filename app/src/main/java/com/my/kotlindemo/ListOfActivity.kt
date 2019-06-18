package com.my.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_list_of.*

public class ListOfActivity : AppCompatActivity(){
    //List是只读队列，不能进行增删操作,初始化赋值后便不可修改
    private var goodsList:List<String> = listOf<String>()
    //MutableList是个可变集合，允许进行增删操作
    private var goodsMutList:MutableList<String> = mutableListOf<String>()
    private val goodsA:String = "iPhone8"
    private val goodsB:String = "Mate10"
    private val goodsC:String = "小米6"
    private val goodsD:String = "OPPO R11"
    private val goodsE:String = "vivo X9S"
    private val goodsF:String = "魅族Pro6S"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_of)

        btn_list_add.setOnClickListener {
            goodsMutList.add(goodsA)
            goodsMutList.add(goodsB)
            goodsMutList.add(goodsC)
            goodsMutList.add(goodsD)
            goodsMutList.add(goodsE)
            goodsMutList.add(goodsF)
            tv_list_result.text = "手机畅销榜已添加，当前共有${goodsMutList.size}款手机"
        }

        btn_remove_tail.setOnClickListener {
            if (goodsMutList.isNotEmpty()){
                goodsMutList.removeAt(goodsMutList.size - 1)
                tv_list_result.text = "手机畅销榜已添加，当前共有${goodsMutList.size}款手机"
            }
        }

        btn_list_clear.setOnClickListener {
            goodsMutList.clear()
            tv_list_result.text = "手机畅销榜已清空"
        }

        var sortAsc = true
        btn_sort_by.setOnClickListener {
            if (sortAsc){
                //sortBy表示升序排列，后面跟的是排序条件
                goodsMutList.sortBy { it.length }
            }else{
                //sortByDescending表示降序排列
                goodsMutList.sortByDescending { it.length }
            }
            var desc = ""
            for (item in goodsMutList){
                desc = "${desc}名称：${item}\n"
            }
            tv_list_result.text = "手机畅销榜已按照长度${if (sortAsc) "升序" else "降序"}重新排列：\n$desc"
            sortAsc = !sortAsc
        }
        btn_list_for.setOnClickListener {
            var desc = ""
            for (item in goodsMutList){
                desc = "${desc}名称：${item}\n"
            }
            tv_list_result.text = "手机畅销榜包含以下${goodsMutList.size}款手机：\n$desc"
        }
        btn_list_iterator.setOnClickListener {
            var desc = ""
            val iterator = goodsMutList.iterator()
            while (iterator.hasNext()){
                val item = iterator.next()
                desc = "${desc}名称：${item}\n"
            }
            tv_list_result.text = "手机畅销榜包含以下${goodsMutList.size}款手机：\n$desc"
        }
        btn_list_foreach.setOnClickListener {
            var desc = ""
            goodsMutList.forEach { desc = "${desc}名称：${it}\n" }
            tv_list_result.text = "手机畅销榜包含以下${goodsMutList.size}款手机：\n$desc"
        }
        btn_for_index.setOnClickListener {
            var desc = ""
            //indices是队列的下标数组
            for (i in goodsMutList.indices){
                val item = goodsMutList[i]
                desc = "${desc}名称：${item}\n"
            }
            tv_list_result.text = "手机畅销榜包含以下${goodsMutList.size}款手机：\n$desc"
        }
    }
}