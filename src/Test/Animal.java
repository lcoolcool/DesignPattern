package Test;

public abstract class Animal {
    protected String name;
    protected int shoutNum = 3;

    public Animal(String name){
        this.name = name;
    }

    public Animal(){
        this.name = "无名";
    }

    public void setShoutNum(int value){
        if(value < 10)
            this.shoutNum = value;
    }
    public int getShoutNum(){
        return this.shoutNum;
    }
    public String shout(){
        String soundStr = (getSoundStr() + " ").repeat(this.shoutNum);
        return "my name is " + this.name + soundStr;
    }
    protected abstract String getSoundStr();
}
