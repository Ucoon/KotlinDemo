# KotlinDemo
《Kotlin从零到精通Android开发》学习系列
1. Kotlin是一种基于JVM的新型编程语言，它完全兼容Java语言，Kotlin代码可以编译成Java字节码，也可以编译成JavaScript，方便在没有JVM的设备上运行。

2. 优势：
   1. 更简洁
   2. 更安全，它能够在编码阶段自动检测常见的Bug（比如引用了空指针等）
   3. 更强大，它提供了扩展函数、默认参数、接口委托、属性代理等Java不具备的高级特性

3. Anko是使用Kotlin语言编写的一个Android增强库，它用于简化Android开发时的Kotlin代码，使得开发者只用较少的Kotlin代码便能表达完整的编程含义，同时也让App代码变得更加简洁易懂。

4. 配置Anko库和Kotlin扩展库

5. Lambda表达式其实是一个匿名函数，匿名函数是指：它是一个没有名字的函数，但函数体的内部代码是完整的

6. 基本类型的变量声明：var表示后面是一个变量声明语句：变量名:变量类型

   ![Kotlin基本数据类型](http://sdssdccddd.gitee.io/myblogimg/Kotlin基本数据类型.png)

7. 简单变量之间的转换：在Kotlin中，不允许通过Java的前缀表达式来强制转换类型，只能调用类型转换函数输出其他类型 的变量

   ![Kotlin数据类型转换函数](http://sdssdccddd.gitee.io/myblogimg/Kotlin数据类型转换函数.png)

8. val与var的区别：

   val修饰过的变量只能在第一次声明时赋值，后续不能再赋值，相当于Java里的final关键字；而var修饰过的变量在任何时候都允许赋值。

9. 数组的声明，以int为例，Kotlin的声明方式如下：

   ```kotlin
   var int_array:IntArray = intArrayOf(1, 2, 3)
   ```

   对比Java的声明：

   ```java
   int[] int_array = new int[]{1, 2, 3}
   ```

   (1) Kotlin另外提供了新的整型数组类型，即IntArray

   (2) 分配一个常量数组，Kotlin调用的是intArrayOf()方法，并不是使用new关键字

   ![Kotlin基本数组类型](http://sdssdccddd.gitee.io/myblogimg/Kotlin基本数组类型.png)

   （3）当然在Kotlin也有第二种声明方式，通过“Array<数据类型>”的方式：

   ```kotlin
   var int_array:Array<Int> = array(1, 2, 3)
   ```

10. 数组元素的操作：

    （1）获取数组的长度：Java用.length，而Kotlin用.size

    （2）获取指定位置的数组元素：(a)通过方括号加下角标来获取；（b）通过get和set方法

11. 字符串与基本类型的转换：![Kotlin字符串与基本数据的转换](http://sdssdccddd.gitee.io/myblogimg/Kotlin基本数据类型.pngKotlin字符串与基本数据的转换.png)

12. 字符串的常用方法（Kotlin基本兼容Java的相关方法）

    查找子串：index()；截取指定位置子串：substring()；替换子串：replace()；分隔子串：split()

