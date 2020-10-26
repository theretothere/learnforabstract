/**
 * 抽象类：
 * 1、包含抽象方法的类，就是抽象类。使用abstract关键字来修饰的
 * 2、抽象方法是不能够有具体的实现的
 * 3、在抽象类当中，可以定义和普通类相同的数据属性和方法
 * 4、抽象类是不可以进行实例化的
 *      Shape shape = new Shape();
 * 5、问题：那么抽象类存在的意义是什么？既然不能够进行实例化，那么数据成员和方法如何调用呢
 *      答案：抽象类天生就是为了被继承
 * 6、一个普通类继承了抽象类，就一定要重写抽象类的抽象方法
 * 7、如果一个类继承了抽象类，但是不想重写抽象方法，那么就将普通类转变成为抽象类，但是
 * 迟早都要重写的
 *8、抽象方法不能是private的
 */
abstract class Shape{
    public int a = 10;
    public abstract void draw ();
    public void func(){
        System.out.println("FUNC()");
    }
}
class Flower extends Shape{
    public void draw(){
        System.out.println("❀");
    }
}
class Cycle extends Shape{
    public void draw(){
        System.out.println("○");
    }
}
public class TestDemo {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        //Shape shape = new Shape(); error
        drawMap(new Flower());
        drawMap(new Cycle());
    }
}
