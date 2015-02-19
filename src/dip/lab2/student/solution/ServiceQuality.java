package dip.lab2.student.solution;

/**
 * @author kritterbusch
 */
public enum ServiceQuality {

    GREAT(.20), GOOD(.15), FAIR(.10), POOR(.05);

    private double tipPercent;

    ServiceQuality(double tipPercent) {
        this.tipPercent = tipPercent;
    }

    public double getTipPercent() {
        return this.tipPercent;
    }

    public void setPercent(double tipPercent) {
        this.tipPercent = tipPercent;
    }

    @Override
    public String toString() {
        switch (this) {
            case GREAT:
                System.out.println(tipPercent);
                break;
            case GOOD:
                System.out.println(tipPercent);
                break;
            case FAIR:
                System.out.println(tipPercent);
                break;
            case POOR:
                System.out.println(tipPercent);
        }
        return super.toString();
    }

}
