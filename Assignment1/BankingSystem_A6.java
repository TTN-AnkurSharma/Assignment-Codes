package Assignment;
public class BankingSystem_A6 {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        BOI boi = new BOI();
        ICICI icici = new ICICI();
        System.out.println(sbi);
        System.out.println(boi);
        System.out.println(icici);}}
class Bank {
    private String name;
    private String headOfficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    public Bank(String name,String headOfficeAddress, String chairmanName, int branchCount, double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        this.name = name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }
    private double homeLoanInterestRate;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getHeadOfficeAddress() { return headOfficeAddress; }
    public void setHeadOfficeAddress(String headOfficeAddress) { this.headOfficeAddress = headOfficeAddress; }
    public String getChairmanName() { return chairmanName; }
    public void setChairmanName(String chairmanName) { this.chairmanName = chairmanName; }
    public int getBranchCount() { return branchCount; }
    public void setBranchCount(int branchCount) { this.branchCount = branchCount; }
    public double getFdInterestRate() { return fdInterestRate; }
    public void setFdInterestRate(double fdInterestRate) { this.fdInterestRate = fdInterestRate; }
    public double getPersonalLoanInterestRate() { return personalLoanInterestRate; }
    public void setPersonalLoanInterestRate(double personalLoanInterestRate) { this.personalLoanInterestRate = personalLoanInterestRate; }
    public double getHomeLoanInterestRate() { return homeLoanInterestRate; }
    public void setHomeLoanInterestRate(double homeLoanInterestRate) { this.homeLoanInterestRate = homeLoanInterestRate; }
    public String toString() {
        return "Bank Name: " + name +
               "\nHead Office: " + headOfficeAddress +
               "\nChairman: " + chairmanName +
               "\nBranch Count: " + branchCount +
               "\nFD Interest Rate: " + fdInterestRate + "%" +
               "\nPersonal Loan Interest Rate: " + personalLoanInterestRate + "%" +
               "\nHome Loan Interest Rate: " + homeLoanInterestRate + "%\n"; }}
class SBI extends Bank {
    public SBI() {
        super("SBI", "Crossing Republic", "Anurag Mishra", 22000, 5.4, 9.6, 8.5);}}
class BOI extends Bank {
  public BOI() {
      super("BOI","Pilkhuwa","Aryan Chaudhary",1500,6,8.5,6);}}
class ICICI extends Bank {
    public ICICI() {
        super("ICICI","Hapur","Akshay Bhardwaj",10000,7.5,5,7);}}

