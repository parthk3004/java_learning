package inheritance.training;
public class CorporateTraining extends Training {
    private int days;
    public CorporateTraining(int id, String subject, int fees, int days) {
        super(id, subject, fees);
        this.days = days;
    }
    @Override
    public int getOrderValue() {
        return this.days*super.getFees();
    }

}