package sky;
//Домашка 2.2 ООП часть 1. Инкапсуляция и наследование
public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor (String name, int magicPower, int transgressionDistance, int nobility, int honour, int bravery){
        super (name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility(){ //геттер для благородства
        return this.nobility;
    }

    public int getHonour(){ //геттер для чести
        return this.honour;
    }

    public int getBravery(){ //геттер для храбрости
        return this.bravery;
    }

    public int sumQualityGryffindor(){
        int sumQuality = this.nobility + this.honour + this.bravery;
        return sumQuality;
    }

    public void studentDescription(){
        String nameStudent=getName();
        int studentMagicPower = getMagicPower();
        int studetTransgressionDistance = getTransgressionDistance();
        System.out.println( nameStudent + " имеет следующие качества. Баллы за силу магии: " + studentMagicPower +
                ", расстояние трансгрессии " +studetTransgressionDistance+ " км, баллы благородства: " +
                this.nobility + ", баллы чести: " + this.honour + ", баллы храбрости: "+ this.bravery);
        System.out.println();
    }

    public static void compareStudents(Gryffindor o1, Gryffindor o2){
        System.out.println(  o1.getName()+ " имеет следующие баллы факультета Гриффиндор: За благородство - " + o1.nobility + ", за честь - " + o1.honour +
                ", за храбрость -" + o1.bravery + ". " + "Сумма баллов равна " + o1.sumQualityGryffindor() + ". "  );
        System.out.println(o2.getName() + " имеет следующие баллы факультета Гриффиндор: За благородство - " + o2.nobility + ", за честь - " + o2.honour +
                ", за храбрость -" + o2.bravery + ". " + "Сумма баллов равна " + o2.sumQualityGryffindor() + ". ");

        if (o1.sumQualityGryffindor() >o2.sumQualityGryffindor() ){
            System.out.println(o1.getName() + " лучший Гриффиндорец чем " + o2.getName() );
        }
        else if (o1.sumQualityGryffindor() == o2.sumQualityGryffindor()){
            System.out.println(o1.getName()  + " и "+ o2.getName() + " одинаково хорошие Гриффиндорцы по сумме баллов.");
        }
        else{
            System.out.println(o2.getName()  + " лучший Гриффиндорец чем " +  o1.getName());
        }
        System.out.println();
    }
}