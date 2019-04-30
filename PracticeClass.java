
/**
 * Write a description of class PracticeClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PracticeClass
{
    // instance variables - replace the example below with your own
    private int a;
    private int b;

    /**
     * Constructor for objects of class PracticeClass
     */
    public PracticeClass()
    {
        // initialise instance variables
        a = 1;
        b = 2;
    }
    public void yuh()
    {
        while(b < 10) {
            b = a + b;
            a++;
            System.out.println(a + ", " + b);
        
        }
    }
    public void psoInte()
    {

        int total = 0;
        while(total <= 100)
        {
            total = total + 2;
            System.out.println(total);
        }
    }

    public void sum()
    {
        int sum = 0;
        for(int i = 11; i <15; i++)
        {
            sum = sum + i;
            System.out.println(sum);
        }
    }

    public void multiplesOfSeven1()
    {
        for(int total = 7; total < 78; total = total + 7)
        {
            System.out.println(total);
        }

    }

    public void multiplesOfFour2()
    {
        int total = 0;
        while(total <= 60)
        {
            total = total + 4;
            System.out.println(total);
        }

    }

    public void forloopPractice()
    {
        for(int i = 30; i > 10; i--)
        {
            System.out.println(i);
        }
    }

    public int squareOdd1(int number)
    {
        return number * number;
    }

    public void squareOdd2()
    {
        System.out.println(1 * 1);
        System.out.println(9 * 9);
        System.out.println(25 * 25);
        System.out.println(49 * 49);
        System.out.println(81 * 81);
        System.out.println(121 * 121);
    }
}
 