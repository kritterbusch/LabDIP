package dip.lab2.student.solution;

/**
 * Holds data for calculating tip for a food service.
 *
 * @author kritterbusch
 */
public class FoodServiceTipCalculator implements TipStrategy {



    private double billAmount;
    private double tipPercent;
    private ServiceQuality q;

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
    
    @Override
    public void setServiceQuality (ServiceQuality q) {
        
    }
}




