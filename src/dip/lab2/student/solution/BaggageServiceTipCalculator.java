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

    private ServiceQuality q;

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

    public void setBagCount(int bagCount) {
        this.bagCount = bagCount;
    }

    public int getBagCount() {
        return bagCount;
    }

    @Override
    public double calculateTip() {
        return billAmount * tipPercent;
    }

    @Override
    public void setTipPercent(double tipPercent) {
        if (tipPercent < 0 || tipPercent > 100) {
            throw new IllegalArgumentException("Tip percent must be grater than 0 and less than or equal to 100");
        } else {
            this.tipPercent = tipPercent / 100;
        }
    }

    @Override
    public void setServiceQuality(ServiceQuality q) {

    }

    @Override
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public double getBillAmount() {
        return this.billAmount = billAmount;
    }



}
