import java.util.Scanner;

public class JobMarketAnalysis {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int industryChoice;
        int hiringRate;

        System.out.println("===== Job Market Trends Analysis System =====");

        System.out.println("Select Industry:");
        System.out.println("1. IT");
        System.out.println("2. Healthcare");
        System.out.println("3. Finance");

        industryChoice = input.nextInt();

        System.out.println("Enter Hiring Rate Percentage:");
        hiringRate = input.nextInt();

        switch(industryChoice) {

            case 1:

                System.out.println("Selected Industry: IT");

                if(hiringRate >= 70) {
                    System.out.println("High Job Demand");
                }
                else {
                    System.out.println("Low Job Demand");
                }

                break;

            case 2:

                System.out.println("Selected Industry: Healthcare");
                System.out.println("Moderate Job Demand");

                break;

            case 3:

                System.out.println("Selected Industry: Finance");
                System.out.println("Stable Job Demand");

                break;

            default:

                System.out.println("Invalid Industry Selection");
        }

        input.close();
    }
}
