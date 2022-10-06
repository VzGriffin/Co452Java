package Week2;

import helpers.InputReader;

public class Week02 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 2 Java Selection & Iteration ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();
        /*
        int lenth = InputReader.getInt("Enter Lenth ");
        int Hight = InputReader.getInt("Enter Hight ");
        int permieter = (lenth + Hight)*2;
        int area = lenth * Hight;
        System.out.println("The Permiter is " + permieter);
        System.out.println("the Area is " + area);
        */
        int N1 = InputReader.getInt("Enter Number 1 ");
        int N2 = InputReader.getInt("Enter Number 2 ");
        int total = InputReader.getInt("Enter total");
        int amount = N1 + N2;
        int avrage = (total / amount);
        System.out.println("The Avrage is " + amount);
        System.out.println("The Avrage is " + avrage);
        int num;

    }     
}
