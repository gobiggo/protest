package decorator;

/**
 * @author long
 * @Description
 * @date 2018-04-02 17:56
 */
public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        super.operation();
        this.addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    //本类的独有功能
    private void addedBehavior() {
        System.out.println("我是具体装饰对象B的独有方法");
    }
}
