package Test;

public class Test {
    int testAge;
    public Test(String name){
        System.out.println("my name is: " + name);
    }
    public void setAge(int age){
        testAge = age;
    }
    public int getAge(){
        return testAge;
    }

    public static void main(String[] args){
        Animal[] arrayAnimal = new Animal[5];
        for(int i=0; i<5; i++){
            if(i==3)
                arrayAnimal[i] = new Cat("小猫 " + i);
            else
                arrayAnimal[i] = new Dog("小狗 " + i);
        }
        for(int i=0; i<5; i++){
            System.out.println(arrayAnimal[i].shout());
        }
        Cat cat_shout = new Cat("猫咪1");
        Dog dog_shout = new Dog("狗狗1");
        cat_shout.setShoutNum(19);
        dog_shout.setShoutNum(8);
        Test cattest = new Test(cat_shout.shout());
        Test dogtest = new Test(dog_shout.shout());
        cattest.setAge(18);
        System.out.println(cattest.getAge());
        System.out.println(cattest.testAge);
        IFly[] array = new IFly[2];
        array[0] = cat_shout;
        array[1] = dog_shout;
        System.out.println(array[0].changeFly("fffff"));
        System.out.println(array[1].changeFly("tttttt"));
    }
}