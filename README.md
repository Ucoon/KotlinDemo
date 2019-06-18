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

11. 字符串与基本类型的转换：![Kotlin字符串与基本数据的转换](http://sdssdccddd.gitee.io/myblogimg/Kotlin字符串与基本数据的转换.png)

12. 字符串的常用方法（Kotlin基本兼容Java的相关方法）

    查找子串：index()；截取指定位置子串：substring()；替换子串：replace()；分隔子串：split()

    1. 在Java中，split()方法返回的是String[]；但是在Kotlin中，split()返回的是```List<String>```

    2. Kotlin允许直接通过下标访问字符串指定位置的字符，也可以通过get方法获取指定位置上的字符

       ```java
       tv_convert.text = origin[number].toString()
       tv_convert.text = origin.get(number).toString()
       ```

    3. Kotlin格式化字符串：符号$后面跟变量名，系统会自动匹配最长的变量名；如果在取值前需要先运算，则需用大括号把运算表达式给括起来；$属于特殊字符，打印需转义：```${'***'}```
    
13. Kotlin中的容器

    Kotlin有三类基本容器：**集合Set，队列List，映射Map**，每类容器又分作只读与可变两种类型，这是为了判断该容器能否进行增、删、改等操作（**Kotlin对变量的修改操作很慎重，每个变量在定义的时候就必须指定能否修改**）

    1. 容器默认为只读容器，如果需要允许修改该容器变量，则需加上Mutable前缀形成新的容器：MutableSet表示可变集合，MutableList表示可变队列，MutableMap表示可变映射。

    2. Kotlin允许在声明容器变量的时候就进行初始赋值，如同对数组变量进行初始化那样。

       ```kotlin
       val satellites:List<String> = listOf("水星", "金星", "地球","火星","木星","土星")
       ```

    3. 容器公共方法如下：

       ```kotlin
       isEmpty：判断该容器是否为空
       isNotEmpty：判断该容器是否非空
       clear：清空该容器
       contains：判断该容器是否包含指定元素
       iterator：获取该容器的迭代器
       count：获取该容器包含的元素个数，也可通过size属性
       ```
 4. 各种容器与其初始化方法的对应关系：

       ![Kotlin的容器及其初始化方法](http://sdssdccddd.gitee.io/myblogimg/Kotlin的容器及其初始化方法.png)

13.1 集合Set/MutableSet

1. 集合的特性：
    1. 容器内部的元素不按顺序排列，因此无法按照下标进行访问
    2. 容器内部的元素存在唯一性，通过哈希值检验是否存在相同的元素，若存在，则将其覆盖。

2. MutableSet的变更操作的限制：
   1. MutableSet的add方法仅仅往集合中添加元素，由于集合是无序的，因此没办法知道添加的具体位置
   2. MutableSet没有修改元素值的方法，一个元素一旦被添加，就不可修改
   3. MutableSet的remove方法用于删除指定元素，但无法删除某个位置的元素，这是因为集合内的元素不是按顺序排列的
3. 集合的遍历：for-in循环、迭代器遍历、forEach遍历
   1. 迭代器与指针的概念接近，它自身并非具体的元素，而是指向元素的存放地址，所以迭代器遍历其实是遍历所有元素的地址。
   2. forEach方法在编码时采用匿名函数的形式，内部使用it代表每个元素
