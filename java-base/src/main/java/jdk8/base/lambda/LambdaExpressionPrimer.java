package jdk8.base.lambda;

import org.junit.Test;

/**
 * <p>Description: <p/>
 *
 * @author liyazhou1
 * @date 2018/7/27 16:02
 */
public class LambdaExpressionPrimer {

    /*
        Lambda expression eliminates the need of anonymous class and
        gives a very simple yet powerful functional programming capability to Java.


        Lambda表达式，在函数式接口上使用，实现了和匿名内部类一样传递方法的功能，并且简化了编程。


        使用Lambda表达式
            1. 定义一个函数式接口；
            2. 定义一个动作类，动作类包含一个方法，其专门调用函数式接口方法，
                  它接收函数式接口对象和接口方法需要的参数，方法体是
                  通过函数式接口对象调用接口方法；
            3. 创建函数式接口对象；
            4. 创建动作类实例，调用动作类的特定方法（将函数式接口对象和参数
                  传递给动作类的方法，完成函数式接口方法被调用的过程）

         使用Lambda表达式
         (1) 函数式接口作为方法的参数（接口的实例可以被方法使用）
         (2) Lambda表达式作为函数式接口的实例（Lambda定义不同的行为，传递给方法）


        lambda 表达式原理
            会传递给某个函数式接口的唯一抽象方法， 函数式接口.方法（参数列表）
            比如，
                Comparator<String> comparator =
                    (String str1, String str2) -> str1.compareTo(str2);
                相当于
                Comparator<String> strCmp = new Comparator<>() {
                    @Override
                    public int compare(String s1, String s2) {
                        return s1.compareTo(s2);
                    }
                };

            Lambda表达式是 (String str1, String str2) -> str1.compareTo(str2)
            接口与函数是    Comparator.compare(T t1, T t2)
            compare的方法体将被初始化为 str1.compareTo(str2)


        本质
            将通过Lambda表达式的参数和主体分别传递给函数式接口的唯一抽象方法的参数列表和方法体。
            此时，函数式接口的唯一抽象方法被初始化了，因此可以创建接口的实例，通过该实例完成方法的传递。

            函数式接口为参数，lambda表达式作为函数式接口的实例。
            在写一个类的通用方法时，将函数式接口作为参数；
            在调用该类的通用方法时，将lambda表达式作为函数式接口的实例传递给该方法。


        Lambda表达式使用局部变量
            int finalField = 10;
            Runnable r = () -> System.out.println(finalField);
            finalField = 11; // ERROR
        Lambda表达式引用的局部变量必须是最终的（final），或者事实上是最终的，也即Lambda表达式使用之后它的值没有被修改。


     */




    @Test
    public void lambdaExp() {
        /* Lambda表达式主体是 代码块，和普通Java代码一样，若需要返回值则使用return */
        MathOperation addition = (int a, int b) -> { return a + b; };

        /* Lambda表达式主体是 表达式，则最后一个表达式即是返回值，不可使用return */
        MathOperation subtraction = (int a, int b) -> a - b;
        MathOperation multiplication = (int a, int b) -> a * b;

        /* 推荐，同时省略Lambda表达式的参数类型和return，代码更为简洁 */
        MathOperation division = (a, b) -> a / b;

        int a = 20, b = 5;
        // 先创建对象，然后再调用对象的方法，程序不灵活
        System.out.println(a + " + " + b + " = " + addition.operate(a, b));
        System.out.println(a + " + " + b + " = " + subtraction.operate(a, b));
        System.out.println(a + " + " + b + " = " + multiplication.operate(a, b));
        System.out.println(a + " + " + b + " = " + division.operate(a, b));

        System.out.println("................................");

        // 可以将对象作为参数，通过对象传递方法，程序更加灵活，扩展性更强
        IntComputer intComputer = new IntComputer();
        System.out.println(a + " + " + b + " = " + intComputer.compute(a, b, addition));
        System.out.println(a + " - " + b + " = " + intComputer.compute(a, b, subtraction));
        System.out.println(a + " * " + b + " = " + intComputer.compute(a, b, multiplication));
        System.out.println(a + " / " + b + " = " + intComputer.compute(a, b, division));

        System.out.println("-------------------------------------");

        System.out.println(a + " + " + b + " = " + intComputer.compute(a, b, MathOperationEnum.ADDITION));
        System.out.println(a + " - " + b + " = " + intComputer.compute(a, b, MathOperationEnum.SUBTRACTION));
        System.out.println(a + " * " + b + " = " + intComputer.compute(a, b, MathOperationEnum.MULTIPLICATION));
        System.out.println(a + " / " + b + " = " + intComputer.compute(a, b, MathOperationEnum.DIVISION));
    }
}


/**
 * 操作函数式接口唯一抽象方法的类
 *
 * @author liyazhou1
 * @date 2018/7/28
 */
class IntComputer {

    /*
     * 定义调用Lambda接口方法的方法，需要接收Lambda接口对象和接口方法需要的参数
     *
     * 其实，Lambda接口的实例可以直接调用接口方法，
     * 但是，为了提高程序的灵活性，需要定义一个方法，
     *      其接收Lambda接口对象和接口方法需要的参数，方法体是接口对象调用接口方法，传入接口方法需要的参数
     */

    /**
     * a, b 是函数式接口的唯一抽象方法需要的参数
     * operation 是函数式接口的引用
     */
    public int compute(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}



/**
 * 函数式接口，包含一个抽象方法，该方法接收参数
 *
 * @author liyazhou1
 * @date 2018/7/28
 */
@FunctionalInterface
interface MathOperation {

    int operate(int a, int b);

}


/**
 * 枚举实现接口，为接口创建几个常用的实例
 *
 * @author liyazhou1
 * @date 2018/7/28
 */
enum MathOperationEnum implements MathOperation {
    ADDITION() {
        @Override
        public int operate(int a, int b) {
            return a + b;
        }
    },
    SUBTRACTION() {
        @Override
        public int operate(int a, int b) {
            return a - b;
        }
    },
    MULTIPLICATION() {
        @Override
        public int operate(int a, int b) {
            return a * b;
        }
    },
    DIVISION() {
        @Override
        public int operate(int a, int b) {
            return a - b;
        }
    }

}


