public class Animal
{
    private String name;
    private double weight;
    private String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight)
    {
        if (weight > 0)
        {
            this.weight = weight;
            System.out.println(name+" is of "+weight+"  kgs");
        }
        else
        {
            System.out.println("Weight is always greater then zero or 0");
        }
    }
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
}
