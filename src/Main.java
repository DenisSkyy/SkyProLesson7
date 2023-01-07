public class Main {
    public static void main(String[] args) {

        for (int i = 1; i<=10; i ++) {
            System.out.println(i);
        }

        for (int i = 10; i>=1; i -- ){
            System.out.println(i);
        }

        for (int i = 0; i <= 17; i= i+2) {
            System.out.println(i);
        }

        for (int i = 10; i >= -10; i --){
            System.out.println(i);
        }

        for (int i = 1904; i <= 2096; i = i +4){
            System.out.println(i + " год является високосным");
        }

        for (int i = 7; i <= 98; i = i+7){
            System.out.println(i);
        }

        for (int i = 1; i <= 512; i = i*2){
            System.out.println(i);
        }

        int month = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++){
            total = total+month;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        double totalNew = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++){
            totalNew = totalNew+month;
            totalNew  = totalNew * (1+percent);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalNew + " рублей");
        }
}



}



