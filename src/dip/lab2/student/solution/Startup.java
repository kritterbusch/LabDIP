package dip.lab2.student.solution;

import java.util.Scanner;

/**
 * Startup Main class.
 *
 * @author kritterbusch
 */
public class Startup {

    public static void main(String[] args) {
        double billAmount;
        Scanner keyboard = new Scanner(System.in);

        TipStrategy tip = new FoodServiceTipCalculator();
        tip = new BaggageServiceTipCalculator();
        
        System.out.println("How much was the restaurant bill?");
        billAmount = keyboard.nextDouble();
        tip.setBillAmount(billAmount);
        System.out.println(tip.getBillAmount());

    }

//        double bill;
//        String qualityInput;
//        
//        TipService tip = new FoodServiceTipCalculator();
////        tip = new BaggageServiceTipCalculator();
////        TipService.ServiceQuality serviceQuality;
//        
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("how much was the bill?");
//        bill = keyboard.nextDouble();
//        tip.setBill(bill);
//        System.out.println("how was the service quality? Good, Fair, or Poor? ");
//        qualityInput = keyboard.nextLine();
//        TipService tip = ServiceQuality.valueOf(qualityInput);
//System.out.println(qualityInput);
//
////        serviceQuality = tip.getServiceQualityRating(qualityInput);
////        tip.setServiceRating(serviceQuality);
//        System.out.println(tip.getTip());
}


