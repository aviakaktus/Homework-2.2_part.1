package sky;
//Домашка 2.2 ООП часть 1. Инкапсуляция и наследование
public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff (String name, int magicPower, int transgressionDistance, int industriousness, int loyalty, int honesty){
        super (name, magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness(){ //геттер для трудолюбия
        return this.industriousness;
    }

    public int getLoyalty(){ //геттер для верности
        return this.loyalty;
    }

    public int getHonesty(){ //геттер для честности
        return this.honesty;
    }

    public int sumQualityHufflepuff(){
        int sumQuality = this.industriousness + this.loyalty + this.honesty;
        return sumQuality;
    }

    public void studentDescription(){
        String nameStudent=getName();
        int studentMagicPower = getMagicPower();
        int studetTransgressionDistance = getTransgressionDistance();
        System.out.println( nameStudent + " имеет следующие качества. Баллы за силу магии: " + studentMagicPower +
                ", расстояние трансгрессии " +studetTransgressionDistance+ " км, баллы трудолюбия: " +
                this.industriousness + ", баллы верности: " + this.loyalty + ", баллы честности: "+ this.honesty);
        System.out.println();
    }

    public static void compareStudents(Hufflepuff o1, Hufflepuff o2){
        System.out.println(  o1.getName()+ " имеет следующие баллы факультета Пуффендуй: За трудолюбие - " + o1.industriousness + ", за верность - " + o1.loyalty +
                ", за честность -" + o1.honesty + ". " + "Сумма баллов равна " + o1.sumQualityHufflepuff() + ". "  );
        System.out.println(  o2.getName()+ " имеет следующие баллы факультета Пуффендуй: За трудолюбие - " + o2.industriousness + ", за верность - " + o2.loyalty +
                ", за честность -" + o2.honesty + ". " + "Сумма баллов равна " + o2.sumQualityHufflepuff() + ". "  );
        if (o1.sumQualityHufflepuff() >o2.sumQualityHufflepuff() ){
            System.out.println(o1.getName() + " лучший Пуффендуец чем " + o2.getName() );
        }
        else if (o1.sumQualityHufflepuff() == o2.sumQualityHufflepuff()){
            System.out.println(o1.getName()  + " и "+ o2.getName() + " одинаково хорошие Пуффендуйцы по сумме баллов.");
        }
        else{
            System.out.println(o2.getName()  + " лучший Пуффендуец чем " +  o1.getName());
        }
        System.out.println();
    }
}