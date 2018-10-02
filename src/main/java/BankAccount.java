
/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {
    /**
     * Enumerates different account types.
     */
    public enum BankAccountType {
        /**
         * checking.
         */
        CHECKINGS,
        /**
         * savings.
         */
        SAVINGS,
        /**
         * student.
         */
        STUDENT,
        /**
         * work.
         */
        WORKPLACE
    }


    /**
     *Account number.
     */
    private int accountNumb;

    /**
     *Account type.
     */
    private BankAccountType accountType;

    /**
     *Money in account.
     */
    private double accountBalance;

    /**
     *Name of account owner.
     */
    private String ownerName;

    /**
     *Interest rate on account.
     */
    private double interestRate;

    /**
     *Interest earned.
     */
    private double interestEarned;

    /**
     * Constructor for bank account.
     * @param name name of account owner
     * @param accountCategory type of account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     * @return account number
     */
    public int getAccountNumber() {
        return accountNumb;
    }

    /**
     * @param accountNumber account number
     */
    public void setAccountNumber(final int accountNumber) {
        this.accountNumb = accountNumber;
    }

    /**
     * @return account type
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * @param accountTyp account type
     */
    public void setAccountType(final BankAccountType accountTyp) {
        this.accountType = accountTyp;
    }

    /**
     * @return account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * @param accountBalanc account balance
     */
    public void setAccountBalance(final double accountBalanc) {
        this.accountBalance = accountBalanc;
    }

    /**
     * @return owner name
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * @param ownerNam owner name
     */
    public void setOwnerName(final String ownerNam) {
        this.ownerName = ownerNam;
    }

    /**
     * @return interest rate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * @param interestRat interest rate
     */
    public void setInterestRate(final double interestRat) {
        this.interestRate = interestRat;
    }

    /**
     * @return interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

}
