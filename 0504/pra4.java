class Animal{
    String type;
    String name;
    int age;
    void makeSound(){
        System.out.println("동물은 소리를 낸다");
    }
}
class Cat extends Animal{
    Cat(String name, int age){
        this.type="고양이";
        this.name=name;
        this.age=age;
    }
    void makeSound(){
        System.out.println("야옹");
    }
}
class Dog extends Animal{
    Dog(String name, int age){
        this.type="강아지";
        this.name=name;
        this.age=age;
    }
    void makeSound(){
        System.out.println("멍멍");
    }
}
public class pra4 {
    public static void main(String[] args) {
        Animal ani = new Animal();
        Cat cat = new Cat("나비",4);
        Dog dog = new Dog("쿠키",2);

        cat.makeSound();
        dog.makeSound();
    }
}