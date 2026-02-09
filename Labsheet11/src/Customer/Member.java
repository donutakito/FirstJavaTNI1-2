package Customer;

public class Member extends Customer implements Rewardable {
    private String member_level;

    Member(String name, double billAmount, String memberLevel) {
        super(name, billAmount);
        this.member_level = member_level;
    }

    //Reward
    public double getDiscountRate() {
        if (this.member_level.equalsIgnoreCase("gold")) return 0.15;
        if (this.member_level.equalsIgnoreCase("premium")) return 0.20;
        return 0;
    }

    //Reward
    public int collectPoints() {
        return (int)(super.getBillAmount() / 100);
    }

    //มาจากclass customer
    @Override
    double calculateFinalBill() {
        return super.getBillAmount() - getDiscountRate();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMember level: " + this.member_level + "(Discount " + getDiscountRate() + ")\n" +
                "Get Point: " + collectPoints() +
                "\nTotal price: " + calculateFinalBill();
    }

}