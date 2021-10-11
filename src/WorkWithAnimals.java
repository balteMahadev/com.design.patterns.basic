public class WorkWithAnimals
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.setName("thor");
        System.out.println("Dog name is "+dog.getName());
        dog.sound();
        System.out.println(dog.getSound());
        dog.play();
        dog.setWeight(15);
        System.out.println("----------------------------");
        Cat cat = new Cat();
        cat.setName("dypsi");
        System.out.println("cat name is "+cat.getName());
        cat.sound();
        cat.play();
        System.out.println(cat.getSound());
        cat.setWeight(4);




    }
}
