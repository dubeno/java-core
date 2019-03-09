package javabase.javase.object;

/**
 * <p>
 *
 * @author liyazhou1
 * @date 2018/12/12
 */
public class Oop {
    /*

    举例：
        大象装进冰箱。


    面向过程：
        打开冰箱。
        存储大象。
        关上冰箱。

        对于面向过程思想，强调的是过程(动作).
        C语言.


    面向对象：
        冰箱打开。
        冰箱存储。
        冰箱关闭。

        对于面向对象思想，强调的是对象(实体)。
        C++  Java

    特点：
        1，面向对象就是一种常见的思想。符合人们的思考习惯。
        2，面向对象的出现，将复杂的问题简单化。
        3，面向对象的出现，让曾经在过程中的执行者，变成了对象中的指挥者。
     */



    /*

     面向对象：

     1，面向对象和面向过程思想。

     	面向对象强调的是对象实例。
     	面向过程强调的是动作。
     	对象将动作进行封装。

     	在问题领域中，我们先去找的都是涉及的对象，
     	然后分析对象的属性和行为。


     2，面向对象的特点。
     	1，是一种常见思想。
     	2，复杂变简单。
     	3，执行者变指挥者。
     	举例：面试的例子。


     3，类与对象的关系。
     	类：就是对事物的描述，其实类就是将对象共性的内容进行抽取。
     	对象：就是该类事物实实在在存在个体，在java中通过new来完成创建的，
     		堆内存的对象主要用于封装对象中的特有数据。


     4，类中的成员：
     	成员变量：事物的属性，
     	成员函数：事物的行为。

     	成员变量和局部变量的区别？
     	答：

     	如何使用成员，只要建立该类对象，并通过 "对象.对象成员" 就可以完成调用

     5，封装。
     	隐藏实现细节，并对外提供公共的访问方式。

     	函数或者类都是一个封装体。

     	特点：
     	1，隔离的变量。
     	2，便于使用。
     	3，提高复用。
     	4，提高安全性。

     	举例：机箱的例子


     	体现之一：私有。

     	私有在源代码中的使用就是在本类中有效。

     	通常会将成员变量xxx私有化，并对外提供对应的setXxx getXxx方法对其进行访问。
     	其实目的就是成员变量访问进行控制。 让成员的访问具备可控性，提高了程序的健壮性。

     	私有仅仅是封装的体现形式之一而已。

     	自定义一个Person类。动手。

     6，构造函数。
     	写法特点：
     	1，函数名和类名相同。
     	2，不需要定义返回值类型
     	3，没有具体的返回值。但是有return语句，用于结束构造函数。

     	使用特点：
     	1，定义类中，有默认的空参数构造函数。如果已经自定义，那么默认就没有了。
     	2，构造函数在类有多个，是重载形式体现出来的。

     	构造函数的作用：
     	用于给对象进行针对性的初始化。



     	构造函数和一般函数的区别？
     	1，
     	2，
     	3，

     	什么时候使用构造函数呢？
     	当对象创建时就需要一些内容(数据和行为)，那么这些内容都定义在构造函数中。

         7，this关键字.
             this：代表的是对象。哪个对象调用了this所在的函数，this就代表哪个对象。

             用法体现
             1，当成员变量和局部变量同名时，可以用this区别。
             2，当构造函数中调用本类其他构造函数时，可以用this完成。 this(实际参数);
                 这种调用必须定义在构造函数的第一行。初始化动作先完成。

             应用：只要在定义功能时，用到了本类对象，那么就使用this来表示。


         8，static关键字：

     	特点：
     	1，修饰成员。，
     	2，随着类加载，随着类消失。
     	3，优先于对象。
     	4，用类名直接访问

     	使用注意事项:
     	1，静态方法只能访问静态，静态有访问局限性。
     	2，静态方法中不能有this super关键字。
     	3，主函数是静态的。

     	静态变量和成员变量的区别？
     	1，
     	2，
     	3，
     	4，


     	什么时候使用静态？
     	1，当成员变量的数据各个对象都相同时，可以用static修饰，让多个对象共享。
     	2，函数如果访问了特有数据(非静态成员变量),该函数是非静态的。
     	   函数如果没有访问特有数据，那么该函数就可以静态修饰。



     	如果类中的功能都是静态的，那么该类创建对象是没有意义的，所以构造函数需要私有化。



         9，代码块。
             1，局部代码快。
                 对局部变量的生命周期进行控制。
             2，构造代码块。
                 对所有对象进行初始化。
             3，静态代码块。
                 对类进行初始化。


         10，单例设计模式：
             1，解决的问题：保证类在内存的对象唯一性。
             2，思路：
             3，步骤：
             4，两种方式的区别？懒汉式(延迟加载方式)，饿汉式


         设计的内存图要会画！必须的。

     */
}