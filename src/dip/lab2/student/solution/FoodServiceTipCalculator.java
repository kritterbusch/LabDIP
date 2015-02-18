package dip.lab2.student.solution;

/**
 * Holds data for calculating tip for a food service.
 *
 * @author kritterbusch
 */
public class FoodServiceTipCalculator implements TipStrategy {

    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR
            = "Error: bill must be greater than or equal to " + MIN_BILL;
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;

    private double billAmount;
    private double tipPercent;

    public FoodServiceTipCalculator() {
        if (billAmount < 0) {
            throw new IllegalArgumentException(
                    "Restaurant bill must be greater than $0.");

        } else {
            this.billAmount = billAmount;

        }

        if (tipPercent < 0 || tipPercent >= 100) {
            throw new IllegalArgumentException("Tip percent must be greater than 0 and less than or equal to 100");
        } else {
            this.tipPercent = tipPercent / 100;
        }
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public final void setTipPercent(final double tipPercent) {
        if (tipPercent < 0 || tipPercent >= 100) {
            throw new IllegalArgumentException("Tip percent must be grater than 0 and less than or equal to 100");
        } else {
            this.tipPercent = tipPercent / 100;
        }
    }
@Override
    public final double calculateTip() {
        return billAmount * tipPercent;
    }
}

public enum ServiceQuality {

    GOOD, FAIR, POOR
}






//    public double getTip() {
//        double tip = 0.00; // always initialize local variables
//
//        switch (serviceQuality) {
//            case GOOD:
//                tip = bill * GOOD_RATE;
//                break;
//            case FAIR:
//                tip = bill * FAIR_RATE;
//                break;
//            case POOR:
//                tip = bill * POOR_RATE;
//                break;
//        }
//
//        return tip;
//    }
//
//    public final void setBill(double billAmt) {
//        if (billAmt < MIN_BILL) {
//            throw new IllegalArgumentException(BILL_ENTRY_ERR);
//        }
//        bill = billAmt;
//    }
//    public final void setServiceRating(ServiceQuality q) {
//        // No need to validate because enums provide type safety!
//        serviceQuality = q;
//    }

