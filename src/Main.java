public class Main {
    //task 1
    public static void main(String[] args) {
        int i = 0;
        while (i < 10){
            i++;
            System.out.printf(i + " ");
        }
        System.out.println();
        for (int k = 10; k > 0; k--) {
            System.out.printf(k + " ");

        }
        System.out.println();
        //task 2
        for (int day = 1; day <= 31; day= day+7){
            System.out.println("Сегодня пятница " + day + "-е число. Необходимо подготовить отчет.");
        }
        //task 3
        int year1 = 1823;
        int year2= 2123;
        int j = 0;
        while(j <= year2){
            if (j >= year1 && j % 79 == 0){
                System.out.println(j);
            }
             j++;
        }
    }
}