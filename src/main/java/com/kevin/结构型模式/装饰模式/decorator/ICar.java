package com.kevin.结构型模式.装饰模式.decorator;

/**
 * @author kevin
 * @version 1.0
 * @description     抽象组件
 * @createDate 2019/3/2
 */
// Component抽象构件角色（车）
public interface ICar {

    void move();
}

// Decorator装饰角色
class SuperCar implements ICar{

    protected ICar car;
    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

// ConcreteComponent具体构建角色（真实对象）
class Car implements ICar{

    @Override
    public void move() {
        System.out.println("陆地行驶！");
    }
}

// ConcreteComponent具体装饰角色
class FlyCar extends SuperCar {

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("天上行驶");
    }

    @Override
    public void move() {
        car.move();
        fly();
    }

}

// ConcreteComponent具体装饰角色
class WaterCar extends SuperCar {

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim(){
        System.out.println("水上行驶");
    }

    @Override
    public void move() {
        car.move();
        swim();
    }

}

// ConcreteComponent具体装饰角色
class AICar extends SuperCar {

    public AICar(ICar car) {
        super(car);
    }

    public void autoMove(){
        System.out.println("自动行驶");
    }

    @Override
    public void move() {
        car.move();
        autoMove();
    }

}
