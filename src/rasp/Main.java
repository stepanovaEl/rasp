package rasp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int numOfPars;
        numOfPars = 5;
        /*System.out.println("Enter max number of pars");
        Scanner sc1 = new Scanner(System.in);
        numOfPars = sc1.nextInt();*/

        System.out.println("Enter number of cabinets");
        Scanner sc2 = new Scanner(System.in);
        int numOfCabs;
        numOfCabs = sc2.nextInt();

        int numOfDays;
        numOfDays = 6;
        /*System.out.println("Enter number learning days in a week");
        Scanner sc3 = new Scanner(System.in);
        numOfDays = sc3.nextInt();*/

        String nameCab[] = new String[numOfCabs];
        for (int q = 0; q < numOfCabs; q++)
        {
            System.out.println("Enter the name of cabinet");
            Scanner cab = new Scanner(System.in);
            nameCab[q] = cab.nextLine();
           // System.out.println(nameCab[q]);
        }

        int num = numOfPars*numOfCabs*numOfDays;
        Raspisanie rasp [] = new Raspisanie[num];
        for (int i = 0; i < num; i++)
        {
            rasp[i] = new Raspisanie();
        }

        int x = 1;
        int y = 0;

        for (int j = 0; j < numOfPars*numOfCabs; j++)
        {
            rasp[j].dayOfWeek = "Понедельник";

            if (j<numOfPars)
            {
                rasp[j].numOfPara = j+1;
                rasp[j].cabinet = nameCab[y];
                if (j == numOfPars-1)
                    {y++;}
            }
            if (j>=numOfPars && x<6)
            {
                rasp[j].numOfPara = x;
                rasp[j].cabinet = nameCab[y];
                x++;
                if (x>5)
                {
                    x=1;
                    y++;
                }
            }
        }
        x = 1;
        y = 0;
        for (int j = numOfPars*numOfCabs; j < numOfPars*numOfCabs*2; j++)
        {
            rasp[j].dayOfWeek = "Вторник";
            if (j<numOfPars)
            {rasp[j].numOfPara = j+1;
                rasp[j].cabinet = nameCab[y];
                if (j == numOfPars-1)
                {y++;}
            }
            if (j>=numOfPars && x<6)
            {
                rasp[j].numOfPara = x;
                rasp[j].cabinet = nameCab[y];
                x++;
                if (x>5)
                {
                    x=1;
                    y++;
                }
            }
        }
        x = 1;
        y = 0;
        for (int j = numOfPars*numOfCabs*2; j < numOfPars*numOfCabs*3; j++)
        {
            rasp[j].dayOfWeek = "Среда";
            if (j<numOfPars)
            {rasp[j].numOfPara = j+1;
                rasp[j].cabinet = nameCab[y];
                if (j == numOfPars-1)
                {y++;}
            }
            if (j>=numOfPars && x<6)
            {
                rasp[j].numOfPara = x;
                rasp[j].cabinet = nameCab[y];
                x++;
                if (x>5)
                {
                    x=1;
                    y++;
                }
            }
        }
        x = 1;
        y = 0;
        for (int j = numOfPars*numOfCabs*3; j < numOfPars*numOfCabs*4; j++)
        {
            rasp[j].dayOfWeek = "Четверг";
            if (j<numOfPars)
            {rasp[j].numOfPara = j+1;
                rasp[j].cabinet = nameCab[y];
                if (j == numOfPars-1)
                {y++;}
            }
            if (j>=numOfPars && x<6)
            {
                rasp[j].numOfPara = x;
                rasp[j].cabinet = nameCab[y];
                x++;
                if (x>5)
                {
                    x=1;
                    y++;
                }
            }
        }
        x = 1;
        y = 0;
        for (int j = numOfPars*numOfCabs*4; j < numOfPars*numOfCabs*5; j++)
        {
            rasp[j].dayOfWeek = "Пятница";
            if (j<numOfPars)
            {rasp[j].numOfPara = j+1;
                rasp[j].cabinet = nameCab[y];
                if (j == numOfPars-1)
                {y++;}
            }
            if (j>=numOfPars && x<6)
            {
                rasp[j].numOfPara = x;
                rasp[j].cabinet = nameCab[y];
                x++;
                if (x>5)
                {
                    x=1;
                    y++;
                }
            }
        }
        x = 1;
        y = 0;
        for (int j = numOfPars*numOfCabs*5; j < numOfPars*numOfCabs*6; j++)
        {
            rasp[j].dayOfWeek = "Суббота";
            if (j<numOfPars)
            {rasp[j].numOfPara = j+1;
                rasp[j].cabinet = nameCab[y];
                if (j == numOfPars-1)
                {y++;}
            }
            if (j>=numOfPars && x<6)
            {
                rasp[j].numOfPara = x;
                rasp[j].cabinet = nameCab[y];
                x++;
                if (x>5)
                {
                    x=1;
                    y++;
                }
            }
        }
        System.out.println("If you want to add new para, press 1");
        Scanner ans = new Scanner(System.in);
        int answer;
        answer = ans.nextInt();

        while (answer == 1)
        {
            System.out.println("Enter the name of teacher");
            Scanner name = new Scanner(System.in);
            String namePrepod;
            namePrepod = name.nextLine();
            System.out.println("Enter the name of predmet");
            Scanner pred = new Scanner(System.in);
            String predmet;
            predmet = pred.nextLine();

            System.out.println("Enter the group");
            Scanner gr = new Scanner(System.in);
            String group;
            group = gr.nextLine();

            int first = 0;
            int second = num - 1;
            int random = first + (int) (Math.random() * second);

            //System.out.println("Число рандомное" + random);

            if (rasp[random].prepodName == null)
            {
                rasp[random].prepodName = namePrepod;
                rasp[random].predmet = predmet;
                rasp[random].group = group;
                }
            for (int p = 0; p < num; p++)
            {
                if ((rasp[random].prepodName == rasp[p].prepodName) && (p!=random) && (rasp[random].numOfPara == rasp[p].numOfPara) && (rasp[random].dayOfWeek == rasp[p].dayOfWeek))
                {
                    System.out.println("Error! One teacher can not be at two cabinets at the same time!");
                    rasp[random].prepodName = null;
                    rasp[random].predmet = null;
                    rasp[random].group = null;
                }
                if ((rasp[random].group == rasp[p].group) && (p!=random) && (rasp[random].numOfPara == rasp[p].numOfPara) && (rasp[random].dayOfWeek == rasp[p].dayOfWeek))
                {
                    System.out.println("Error! One group can not be at two cabinets at the same time!");
                    rasp[random].prepodName = null;
                    rasp[random].predmet = null;
                    rasp[random].group = null;
                }
            }
            System.out.println("If you want to add new para, press 1, if you won't - press any other number");
            Scanner as = new Scanner(System.in);
            int an;
            an = as.nextInt();
            if (an != 1)
            {break;}
            }
        System.out.println("If you want to see all timetable, press 1, and if you want to see only added pars, press 2");
        Scanner ras = new Scanner(System.in);
        int timetable;
        timetable = ras.nextInt();
        switch (timetable)
        {
            case 1:
            for (int t = 0; t < num; t++)
            {
                System.out.println(rasp[t]);
                System.out.println("_______________");
            }
            break;
            case 2:
                for (int t = 0; t < num; t++)
                {
                    if (rasp[t].prepodName != null)
                    {System.out.println(rasp[t]);
                        System.out.println("_______________");}
                }
                break;
            default: System.out.println("Error! You press wrong number");
            break;
        }
    }
}
