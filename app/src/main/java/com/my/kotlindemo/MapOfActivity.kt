package com.my.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_map_of.*

public class MapOfActivity: AppCompatActivity(){
    //Map是只读映射，不能进行增、删、改等操作
//    private var goodsMap: Map<String, String> = mapOf<String, String>()
    //Map是可变映射，允许进行增、删、改等操作
    private var goodsMutMap: MutableMap<String, String> = mutableMapOf<String, String>()
    private val goodsA:String = "iPhone8"
    private val goodsB:String = "Mate10"
    private val goodsC:String = "小米6"
    private val goodsD:String = "OPPO R11"
    private val goodsE:String = "vivo X9S"
    private val goodsF:String = "魅族Pro6S"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map_of)

        btn_map_add.setOnClickListener {
//        goodsMap = mapOf<String, String>("苹果" to goodsA, "华为" to goodsB, "小米" to goodsC,
//                "欧珀" to goodsD, "步步高" to goodsE, "魅族" to goodsF)
            goodsMutMap.put("苹果", goodsA)
            goodsMutMap.put("华为", goodsB)
            goodsMutMap.put("小米", goodsC)
            goodsMutMap.put("欧珀", goodsD)
            goodsMutMap.put("步步高", goodsE)
            goodsMutMap.put("魅族", goodsF)
            tv_map_result.text = "手机畅销榜已更新，当前共有${goodsMutMap.size}款手机"
        }

        btn_map_pair.setOnClickListener {
            //使用Pair配对方式初始化映射
            goodsMutMap = mutableMapOf(Pair("苹果", goodsA), Pair("华为", goodsB),
                    Pair("小米", goodsC), Pair("欧珀", goodsD), Pair("步步高", goodsE), Pair("魅族", goodsF))
            tv_map_result.text = "手机畅销榜已更新，当前共有${goodsMutMap.size}款手机"
        }

        btn_map_clear.setOnClickListener {
            goodsMutMap.clear()
            tv_map_result.text = "手机畅销榜已清空"
        }

        btn_map_for.setOnClickListener {
            var desc = ""
            for (item in goodsMutMap){
                desc = "${desc}厂家：${item.key}, 名称：${item.value}\n"
            }
            tv_map_result.text = "手机畅销榜已更新，当前共有${goodsMutMap.size}款手机:\n$desc"
        }

        btn_map_iterator.setOnClickListener {
            var desc = ""
            val iterator = goodsMutMap.iterator()
            while (iterator.hasNext()){
                val item = iterator.next()
                desc = "${desc}厂家：${item.key}, 名称：${item.value}\n"
            }
            tv_map_result.text = "手机畅销榜已更新，当前共有${goodsMutMap.size}款手机:\n$desc"
        }

        //forEach需要API 24及以上版本支持
        btn_map_foreach.setOnClickListener {
            var desc = ""
            //forEach内部使用key指代每条记录的键，使用value指代每条记录的值
            goodsMutMap.forEach { key, value ->  desc = "${desc}厂家：${key}, 名称：${value}\n"}
            tv_map_result.text = "手机畅销榜已更新，当前共有${goodsMutMap.size}款手机:\n$desc"
        }
    }
}