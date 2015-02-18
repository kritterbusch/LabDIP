package dip.lab2.student.solution;

/**
 * TipStrategy Interface
 * @author kritterbusch
 */
public interface TipStrategy {


    
    public void setPercent(final double tipPercent);
    public double calculateTip();
    public void setServiceQuality(ServiceQuality q);
    public void setBillAmount(double billAmount);
    public double getBillAmount();
    

}
