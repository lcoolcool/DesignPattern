package Test;

public class Cat extends Animal implements IFly{

    public Cat(){
        super();
    }
    public Cat(String name){
        super(name);
    }
    @Override
    protected String getSoundStr(){
        return "喵";
    }

    @Override
    public String changeFly(String flyType) {
        return "我是猫，我倒立用头发尿尿，可以飞行" + flyType;
    }
}
