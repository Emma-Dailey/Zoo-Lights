import java.util.Arrays;
import java.lang.Math;



public class haruka {
        public static void name(String name){
            System.out.println("Full name: " + name);
        }
        public static void cost(String cost) {
            System.out.println("Total cost: " + cost);
        }

        public static void date(String date) {
            String day = date.substring(0, 1);
            String month = date.substring(3, 4);
            String year = date.substring(6, 7);
        }
        public static void bdate(String bdate) {
            String bday = bdate.substring(0, 1);
            String bmonth = bdate.substring(3, 4);
            String byear = bdate.substring(6, 7);
        }
        public static void age(int age) {
            int age = (year - byear);
            if (month < bmonth) {
                if (date < bdate) {
                    age++;
                }
            }
            System.out.println("Age: " + age);
            if (age >= 21) {
                System.out.println("Can ride train.");
            } else {
                System.out.println("Cannot ride train.");
            }
        }

    public static void train(int weight, int height) {
        if (weight < 300 && height > 48) {
            System.out.println("Can ride train.");
        } else {
            System.out.println("Cannot ride train.");
        }
    }
    int count = 0;
    int[] id = new int[5];
    public int ID(){
    for(int i=0;i<=4;i++){
        id[i]= (int)(Math.random()*9);
        System.out.println("Ticket ID: " +Arrays.toString(id));

    }
}
