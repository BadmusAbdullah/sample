public class switches {
    public static void main(String[] args) {
        String day = "Friday";
        switch (day) {
            case "Monday":
                System.out.println("Pharmacology");
                break;
            case "Tuesday":
                System.out.println("Physiology class");
                break;
            case "Wednesday":
                System.out.println("Histology class");
                break;
            case "Thursday":
                System.out.println("Anatomy class");
                break;
            case "Friday":
                System.out.println("Jumah");
                break;
            case "Saturday":
                System.out.println("Laundry");
                break;
            case "Sunday":
                System.out.println("Cook");
                break;
            default:
                System.out.println("Not a day!");;
        }
    }
}
