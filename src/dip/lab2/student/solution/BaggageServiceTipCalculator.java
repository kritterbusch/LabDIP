package dip.lab2.student.solution;

/**
 * Holds data for calculating tip for a baggage service.
 *
 * @author kritterbusch
 */
public class BaggageServiceTipCalculator implements TipStrategy {

    private double tipPercent;
    private double billAmount;
    private final double baseTipPerBag = 1.00;
    private int bagCount;
    double tip;

    public BaggageServiceTipCalculator() {
        if (bagCount < 0 || bagCount > 20) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");

        } else {
            this.billAmount = bagCount * baseTipPerBag;

        }

        if (tipPercent < 0 || tipPercent >= 100) {
            throw new IllegalArgumentException("Tip percent must be grater than 0 and less than or equal to 100");
        } else {
            this.tipPercent = tipPercent / 100;
        }
    }

    public int getBagCount() {
        return bagCount;
    }

    @Override
    public void calculateTip() {
        System.out.println("Tip: $" + (billAmount * tipPercent));
    }

    @Override
    public void setTipPercent(double tipPercent) {
        if (tipPercent < 0 || tipPercent > 100) {
            throw new IllegalArgumentException("Tip percent must be grater than 0 and less than or equal to 100");
        } else {
            this.tipPercent = tipPercent / 100;
        }
    }
    
        public enum ServiceQuality {

        GOOD, FAIR, POOR
    }
    private ServiceQuality serviceQuality;

//    public enum ServiceQuality {
//
//        GOOD, FAIR, POOR
//    }
//    private ServiceQuality serviceQuality;
//
//    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
//        this.setServiceRating(q); // perform validation
//        this.setBagCount(bags);
//
//        baseTipPerBag = 1.00; // set default value
//    }
//
//    public double getTip() {
//        tip = 0.00; // always initialize local variables
//
//        switch (serviceQuality) {
//            case GOOD:
//                tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
//                break;
//            case FAIR:
//                tip = baseTipPerBag * bagCount * (1 + FAIR_RATE);
//                break;
//            case POOR:
//                tip = baseTipPerBag * bagCount * (1 + POOR_RATE);
//                break;
//        }
//
//        return tip;
//    }
//    public final void setServiceRating(ServiceQuality q) {
//        // No need to validate because enums provide type safety!
//        serviceQuality = q;
//    }
//
//    public ServiceQuality getServiceQuality() {
//        return serviceQuality;
//    }


}
