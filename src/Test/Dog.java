package Test;

public class Dog extends Animal implements IFly{

    public Dog(){
        super();
    }
    public Dog(String name){
        super(name);
    }
    @Override
    protected String getSoundStr(){
        return "汪";
    }

    @Override
    public String changeFly(String flyType){
        return "我是狗，我有羞羞的铁拳，可以飞行" + flyType;
    }
}
