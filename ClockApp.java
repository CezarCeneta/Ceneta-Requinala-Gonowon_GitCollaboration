import java.util.Scanner;

public class ClockApp {
    private double hours;
   
    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHours() {
        return this.hours;
    }

    public static void ShowSelection() {
        System.out.println("[1] Hours to Minutes");
        System.out.println("[2] Hours to Seconds");
        System.out.println("[3] Minutes to Hours");
        System.out.println("[4] Minutes to Seconds");
        System.out.println("[5] Seconds to Hours");
        System.out.println("[6] Seconds to Minutes");

        }
    
        public void HoursToMinutes() {
            Scanner entervalue = new Scanner(System.in);
            System.out.print("Enter value: ");
            double ValueInput = entervalue.nextDouble();
            double hours = ValueInput;
            String MinutesLabel = (ValueInput == 1) ? " minutes" : " minute";
            double totalMinutes = hours * 60;
            System.out.println("Hours to Minutes " + totalMinutes + MinutesLabel);
        }
    
        public void HoursToSeconds() {
            Scanner entervalue = new Scanner(System.in);
            System.out.print("Enter value: ");
            double ValueInput = entervalue.nextDouble();
            double hours = ValueInput;
            String SecondsLabel = (ValueInput == 1) ? " seconds" : " second";
            double totalSeconds = hours * 3600;
            System.out.println("Hours to Seconds: " + totalSeconds + SecondsLabel);
        }
           
    public static void main(String[] args) {
    ClockApp method = new ClockApp();
    Scanner in = new Scanner(System.in);
    boolean continueApp = true;


    while (continueApp) {

        ShowSelection();

        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch(choice) {
            case 1:
                method.HoursToMinutes();
                break;

            case 2:
                method.HoursToSeconds();
                break;

           
                
            default:
                System.out.println("Invalid choice! Please try again;");


        }

        boolean ValidInput = false;
        
        while (!ValidInput) {
                System.out.print("\nDo you want to convert time? (Y/N): ");
                char continueInput = in.next().charAt(0);
                if (continueInput == 'N') {
                    ValidInput = true;
                    continueApp = false; 
                    System.out.println("App Closed");
                } else if (continueInput == 'Y') {
                    ValidInput = true;
                    continueApp = true;
                } else {
                    System.out.print("Invalid choice! Please try again;");
                }
            }
            System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
    }
    in.close();
    }

}
