package sky;
//Домашка 2.2 ООП часть 1. Инкапсуляция и наследование
public class Slytherin extends Hogwarts{
    private int cunning;
    private int resoluteness;
    private int ambition;
    private int inventiveness;
    private int powerLust;

    public Slytherin (String name, int magicPower, int transgressionDistance, int cunning, int resoluteness, int ambition, int inventiveness, int powerLust){
        super (name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.inventiveness = inventiveness;
        this.powerLust = powerLust;
    }

    public int getCunning(){ //геттер для хитрости
        return this.cunning;
    }

    public int getResoluteness(){ //геттер для решительности
        return this.resoluteness;
    }

    public int getAmbition(){ //геттер для амбициозности
        return this.ambition;
    }

    public int getInventiveness(){ //геттер для находчивости
        return this.inventiveness;
    }

    public int getPowerLust(){ //геттер для жажды власти
        return this.powerLust;
    }

    public int sumQualitySlytherin(){
        int sumQuality = this.cunning + this.resoluteness + this.ambition + this.inventiveness + this.powerLust;
        return sumQuality;
    }

    public void studentDescription(){
        String nameStudent=getName();
        int studentMagicPower = getMagicPower();
        int studetTransgressionDistance = getTransgressionDistance();
        System.out.println( nameStudent + " имеет следующие качества. Баллы за силу магии: " + studentMagicPower +
                ", расстояние трансгрессии " +studetTransgressionDistance+ " км, баллы хитрости: " +
                this.cunning + ", баллы решительности: " + this.resoluteness + ", баллы амбициозности: "+ this.ambition +
                ", баллы находчивости: " + this.inventiveness + ", баллы жажды власти: " + this.powerLust);
        System.out.println();
    }

    public static void compareStudents(Slytherin o1, Slytherin o2){
        System.out.println(o1.getName()+ " имеет следующие баллы факультета Слизерин: За хитрость - " + o1.cunning + ", за решительность - " + o1.resoluteness +
                ", за амбициозность -" + o1.ambition+ ", за находчивость -" + o1.inventiveness + ", за жажду власти - " + o1.powerLust +
                ". " + "Сумма баллов равна " + o1.sumQualitySlytherin() + ". "  );
        System.out.println(o2.getName()+ " имеет следующие баллы факультета Слизерин: За хитрость - " + o2.cunning + ", за решительность - " + o2.resoluteness +
                ", за амбициозность -" + o2.ambition+ ", за находчивость -" + o2.inventiveness + ", за жажду власти - " + o2.powerLust +
                ". " + "Сумма баллов равна " + o2.sumQualitySlytherin() + ". "  );
        if (o1.sumQualitySlytherin() >o2.sumQualitySlytherin() ){
            System.out.println(o1.getName() + " лучший Слизеринец чем " + o2.getName() );
        }
        else if (o1.sumQualitySlytherin() == o2.sumQualitySlytherin()){
            System.out.println(o1.getName()  + " и "+ o2.getName() + " одинаково хорошие Слизеринцы по сумме баллов.");
        }
        else{
            System.out.println(o2.getName()  + " лучший Слизеринец чем " +  o1.getName());
        }
        System.out.println();
    }
}
