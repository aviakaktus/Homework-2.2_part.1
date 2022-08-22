package sky;
//Домашка 2.2 ООП часть 1. Инкапсуляция и наследование
public class Ravenclaw extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw (String name, int magicPower, int transgressionDistance, int mind, int wisdom, int wit, int creation){
        super (name, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind(){ //геттер для ума
        return this.mind;
    }

    public int getWisdom(){ //геттер для мудрости
        return this.wisdom;
    }

    public int getWit(){ //геттер для остроумия
        return this.wit;
    }

    public int getCreation(){ //геттер для творчества
        return this.creation;
    }

    public int sumQualityRavenclaw(){
        int sumQuality = this.mind + this.wisdom + this.wit + this.creation;
        return sumQuality;
    }

    public void studentDescription(){
        String nameStudent=getName();
        int studentMagicPower = getMagicPower();
        int studetTransgressionDistance = getTransgressionDistance();
        System.out.println( nameStudent + " имеет следующие качества. Баллы за силу магии: " + studentMagicPower +
                ", расстояние трансгрессии " +studetTransgressionDistance+ " км, баллы ума: " +
                this.mind + ", баллы мудрости: " + this.wisdom + ", баллы остроумия: "+ this.wit + ", баллы творчества: " + this.creation);
        System.out.println();
    }

    public static void compareStudents(Ravenclaw o1, Ravenclaw o2){
        System.out.println(  o1.getName()+ " имеет следующие баллы факультета Когтевран: За ум - " + o1.mind + ", за мудрость - " + o1.wisdom +
                ", за остроумие -" + o1.wit+ ", за творчество -" + o1.creation + ". " + "Сумма баллов равна " + o1.sumQualityRavenclaw() + ". "  );
        System.out.println(  o2.getName()+ " имеет следующие баллы факультета Когтевран: За ум - " + o2.mind + ", за мудрость - " + o2.wisdom +
                ", за остроумие -" + o2.wit+ ", за творчество -" + o2.creation + ". " + "Сумма баллов равна " + o2.sumQualityRavenclaw() + ". "  );
        if (o1.sumQualityRavenclaw() >o2.sumQualityRavenclaw() ){
            System.out.println(o1.getName() + " лучший Когтевранец чем " + o2.getName() );
        }
        else if (o1.sumQualityRavenclaw() == o2.sumQualityRavenclaw()){
            System.out.println(o1.getName()  + " и "+ o2.getName() + " одинаково хорошие Когтевранцы по сумме баллов.");
        }
        else{
            System.out.println(o2.getName()  + " лучший Когтевранец чем " +  o1.getName());
        }
        System.out.println();
    }
}