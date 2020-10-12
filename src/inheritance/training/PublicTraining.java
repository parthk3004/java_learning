package inheritance.training;

public class PublicTraining extends Training {
    private int participants;

    public PublicTraining(int id, String subject, int fees, int participants) {
        super(id, subject, fees);
        this.participants = participants;
    }

    @Override
    public int getOrderValue() {
        return this.participants * super.getFees();
    }
}
