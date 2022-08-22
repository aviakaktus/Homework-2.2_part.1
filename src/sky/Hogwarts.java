package sky;
//Домашка 2.2 ООП часть 1. Инкапсуляция и наследование
public class Hogwarts{
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts (String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName(){ //геттер для имени
        return this.name;
    }

    public int getMagicPower(){ //геттер силы магии
        return this.magicPower;
    }

    public int getTransgressionDistance(){ //геттер для расстояния трансгресии
        return this.transgressionDistance;
    }

    public int sumQualityHogwarts(){
        int sumQuality = this.magicPower + this.transgressionDistance;
        return sumQuality;
    }

    public static void comparePowerStudents(Hogwarts o1, Hogwarts o2){
        if (o1.magicPower > o2.magicPower){
            System.out.println(o1.getName() + " обладает большей мощностью магии чем " + o2.getName());
        }
        else if (o1.magicPower == o1.magicPower){
            System.out.println(o1.getName() + " обладает равной мощностью магии с " + o2.getName());
        }
        else {
            System.out.println(o2.getName() + " обладает большей мощностью магии чем " + o1.getName());
        }

        if (o1.transgressionDistance > o2.transgressionDistance){
            System.out.println(o1.getName() + " может трансгрессировать на большее расстояние чем " + o2.getName());
        }
        else if (o1.transgressionDistance == o2.transgressionDistance){
            System.out.println(o1.getName() + " и " + o2.getName() + " трансгрессируют на равное расстояние.");
        }
        else {
            System.out.println(o2.getName() + " может трансгрессировать на большее расстояние чем " + o1.getName());
        }

    }
}