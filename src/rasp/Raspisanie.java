package rasp;

public class Raspisanie {
    String dayOfWeek;             //день недели
    Integer numOfPara;              //номер пары
    String cabinet;                 //номер кабинета
    String prepodName;              //преподаватель
    String group;                   //учебная группа
    String predmet;                 //предмет

    Raspisanie(){
        this.dayOfWeek = dayOfWeek;
        this.numOfPara = numOfPara;
        this.cabinet = cabinet;
        this.prepodName = prepodName;
        this.group = group;
        this.predmet = predmet;
    }

    @Override
    public String toString() {
        return  this.dayOfWeek + "  " + this.numOfPara + " пара\nКабинет №" + this.cabinet + "\n" + this.prepodName + "  " + this.predmet + "\nГруппа " + this.group;
    }
}
