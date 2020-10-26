package com.liu;

/**
 * 1、接口中的方法不能够有具体的实现的
 * 2、接口当中的default修饰的方法才能够有具体的实现，但是很少有人这么去做
 * 3、接口当中的成员变量，都是public static final的
 * 4.接口当中的方法都是public abstract
 * 5、如果不写，默认都是
 * 6、接口不能实例化
 * 7、接口也可以发生向上转型和运行时绑定
 */
interface  Shape{
    public int a = 10;
    public abstract void draw ();
//    public void func(){
//        System.out.println("FUNC()");
//    } 1、接口中的方法不能够有具体的实现的
    //2、接口当中的default修饰的方法才能够有具体的实现，但是很少有人这么去做
}
class Cycle implements Shape{
//    protected void draw(){
//    父类中的访问限制修饰符是public
    //子类的访问限制修饰符要大于等于父类
//    }
    public void draw(){
        System.out.println("○");
    }
}
class Flower implements Shape{
    //    protected void draw(){
    //    父类中的访问限制修饰符是public
    //子类的访问限制修饰符要大于等于父类
    //    }
    public void draw(){
        System.out.println("❀");
    }
}
public class TestDemo2 {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1 = new Flower();
        shape1.draw();
        Shape shape2 = new Cycle();
        shape2.draw();

        Flower flower = new Flower();
        drawMap(flower);
        drawMap(new Flower());
    }
}
