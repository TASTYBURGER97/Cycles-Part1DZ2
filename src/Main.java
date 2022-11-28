public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("//Task1");
        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }
        }



        //Task2
        System.out.println("//Task2");
        for (int i = 7; i <= 98 ; i+=7) {
            System.out.println(i+ " ");
        }
        System.out.println();


        //Task3
        System.out.println("//Task3");
        int number = 1;
        System.out.print(number + " ");
        for (int i = 0; i < 9; i++) {
            number = number * 2;
            System.out.println(number + " ");
        }

    }
}