package dip.lab2.student.solution;

/**
 * Service Class
 *
 * @author kritterbusch
 */
public class TipService {

    private TipStrategy tip; //abstractions   
    private ServiceQuality q;
    private double billAmount;

    public TipService() {
    }

    public TipService(TipStrategy tip) {
        this.tip = tip;

    }

    public void setTipPercent(double tipPercent) {
        tip.setTipPercent(tipPercent);
    }

    public double calculateTip() {
        return tip.calculateTip();
    }



}
