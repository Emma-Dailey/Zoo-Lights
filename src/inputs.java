import java.util.Scanner;
public class inputs {
    Scanner scan = new Scanner(System.in);
    /* #ppl, first/last, date they want to attend
    (mm/dd/yy), discount code
    if they want train, height
    if they want to drive/walk thru, drive = no train/alcohol
    birthdate, (mm/dd/yy)
     */
    int numPpl;
    String firstLast;
    String date;
    String discount;
    double height;
    double weight;
    boolean wantsTrain;
    boolean wantsDrive;
    String bdate;
    public void input() {
        boolean wentThruTrain = false;
        boolean wentThruCar = false;

        System.out.println("Number of People: ");
        numPpl = scan.nextInt();
        scan.nextLine();
        System.out.println("Your name: ");
        firstLast = scan.nextLine();
        System.out.println("Desired date (mm/dd/yy): ");
        date = scan.nextLine();
        System.out.println("Discount code: ");
        discount = scan.nextLine();
        System.out.println("Height (in): ");
        height = scan.nextDouble();
        scan.nextLine();
        System.out.println("Weight (lbs): ");
        weight = scan.nextDouble();
        scan.nextLine();
        while(!wentThruTrain) {
            System.out.println("Do you want to ride the train? (y/n): ");
            String train = scan.nextLine();
            if (train.equalsIgnoreCase("y")) {
                wantsTrain = true;
                wentThruTrain =true;
            } else if (train.equalsIgnoreCase("n")) {
                wantsTrain = false;
                wentThruTrain =true;
            } else {
                System.out.println("Invalid format. Please retry.");
            }
        }
        while(!wentThruCar) {
            System.out.println("Do you want to ride the train? (y/n): ");
            String train = scan.nextLine();
            if (train.equalsIgnoreCase("y")) {
                wantsTrain = true;
                wentThruCar =true;
            } else if (train.equalsIgnoreCase("n")) {
                wantsTrain = false;
                wentThruCar =true;
            } else {
                System.out.println("Invalid format. Please retry.");
            }
        }

        System.out.println("Birthday (mm/dd/yy): ");
        bdate = scan.nextLine();
    }
    public int countPpl(){
        return numPpl;
    }
    public String name(){
        return firstLast;
    }
    public String date(){
        return date;
    }
    public boolean train(){
        return wantsTrain;
    }
    public boolean car(){
        return wantsDrive;
    }
    public double weight(){
        return weight;
    }
    public double height(){
        return height;
    }
    public String bdate(){
        return bdate;
    }
}
