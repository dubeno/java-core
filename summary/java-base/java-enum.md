# 枚举 enum
 
带有构造方法的枚举。

带有抽象方法的枚举。

对WeekDay枚举类采用抽象方法定义nextDay，可以将大量的if/else转换成一个个独立的类，使代码更加清晰。

如果枚举只有一个成员，可以使用单例模式实现，同样对于单例模式可以使用枚举实现。

同样，交通灯TrafficLamp也可以定义为枚举类，它也有一个方法nextLamp。