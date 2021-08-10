// project 08 Vehicle Insurance         https://www.youtube.com/watch?v=Bqdx-GCwudI&list=PLtQo0sxRN7JKKla3_GAF05dySjyy3nINa&index=8
/*
  1. insurance premium depends on vehicle type: - car, truck, bus, motorcycle
  2. 3 types of trucks:  - light, heavy, commercial duty
  3. use nested switch-case
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Vehicle type: car, truck, bus, motorcycle ");
        Scanner vehicleInput = new Scanner(System.in);
        String vehicleType = vehicleInput.nextLine();

        int insurancePremium = 0;

        switch(vehicleType) {
            case "car":
                insurancePremium = 225;
                break;
            case "truck":
                System.out.println("enter duty rating: 1) light duty,  2) heavy duty,  3) commercial duty");
                String truckType = vehicleInput.nextLine();
                int truckTypeInt = Integer.parseInt(truckType);                      // we take the scanner object in as a string and parse it to an Integer
                    switch(truckTypeInt) {
                        case 1:
                            insurancePremium = 275;
                            break;
                        case 2:
                            insurancePremium = 335;
                            break;
                        case 3:
                            insurancePremium = 400;
                            break;
                        default:
                            System.out.println("Unknown Input");
                    }
                break;
            case "bus":
                insurancePremium = 400;
                break;
            case "motorcycle":
                insurancePremium = 75;
                break;
            default:
                System.out.println("Unknown Vehicle Input");
        }
        vehicleInput.close();                                                           // close out the Scanner (named 'vehicleInput')
        System.out.println("Your insurance premium will be:  $" + insurancePremium);

    }
}
