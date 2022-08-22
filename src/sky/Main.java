package sky;
//Домашка 2.2 ООП часть 1. Инкапсуляция и наследование
public class Main
{
    public static void main(String[] args) {
        Gryffindor[] gryffindors = new Gryffindor[3];
        gryffindors[0] = new Gryffindor ("Гарри Поттер",70, 100, 65, 90, 70);
        gryffindors[1]  = new Gryffindor ("Гермиона Грейнджер",66, 90, 70, 80, 75);
        gryffindors[2] = new Gryffindor ("Рон Уизли",60, 95, 60, 40, 55);

        Hufflepuff[] hufflepuffs = new Hufflepuff[3];
        hufflepuffs[0] = new Hufflepuff ("Захария Смит", 50, 75, 80, 70, 65);
        hufflepuffs[1] = new Hufflepuff ("Седрик Диггори", 45, 70, 65, 50, 35);
        hufflepuffs[2] = new Hufflepuff ("Джастин Финч-Флетчли", 54, 60, 40, 80, 54);

        Ravenclaw[] ravenclaws = new Ravenclaw[3];
        ravenclaws[0] = new Ravenclaw ("Чжоу Чанг", 73, 80, 70, 70, 90, 42);
        ravenclaws[1] = new Ravenclaw ("Падма Патил", 60, 70, 55, 65, 40, 90);
        ravenclaws[2] = new Ravenclaw ("Маркус Белби", 68, 100, 50, 40, 70, 32);

        Slytherin[] slytherins = new Slytherin[3];
        slytherins[0] = new Slytherin ("Драко Малфой", 69, 97, 80, 75, 92, 48, 99);
        slytherins[1] = new Slytherin ("Грэхэм Монтегю", 56, 70, 40, 85, 62, 78, 30);
        slytherins[2] = new Slytherin ("Грегори Гойл", 65, 82, 50, 78, 10, 38, 45);

		/*Сделайте метод, который выводит на экран описание студента.
		В описание надо включать качества, которые присущи всем студентам, плюс качества,
		которые присущи студенту, потому что он учится на конкретном факультете. */
        gryffindors[0].studentDescription();
        hufflepuffs[2].studentDescription();
        ravenclaws[0].studentDescription();
        slytherins[0].studentDescription();

		/*Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой учеников одного факультета по свойствам.
		У каждого ученика нужно сложить баллы по каждому свойству, которое присуще ученику данного факультета. */
        Gryffindor.compareStudents(gryffindors[0], gryffindors[1]);
        Hufflepuff.compareStudents(hufflepuffs[2], hufflepuffs[0]);
        Ravenclaw.compareStudents(ravenclaws[1], ravenclaws[0]);
        Slytherin.compareStudents(slytherins[1], slytherins[2]);

        //Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии.
        Hogwarts.comparePowerStudents (ravenclaws[0], slytherins[2]);
    }
}
