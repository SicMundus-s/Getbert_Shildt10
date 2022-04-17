package chapter05_If_switch_operations;

public class Main {
    public static void main(String args[])
    {
        int month = 4; // Апрель
        String season;
        if (month == 12 || month == 1 || month == 2)
        season = "зиме" ;
        else if(month == 3 || month == 4 || month == 5)
        season = "весне";
        else if(month == 6 || month == 7 || month == 8)
        season = "лету";
        else if(month == 9 || month == 10 || month == 11)
        season = "осени";
        else
        season = "вымышленным месяцам";
        System.out.println("Время года: " + season);

        switch (month)
        {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Вымышленный месяц");

                // while_for test = new while_for();
                // test.chois('1');

        }
    }


}

