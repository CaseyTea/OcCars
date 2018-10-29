package edu.orangecoastcollege.cs273.cthastanaphonh.occars;

/**
 * Created by CaseyTea on 9/14/17.
 */

public class CarLoan {

    // Private variabled used in the app 
    private static final double STATE_TAX = 0.08;
    private double mPrice;
    private double mDownPayment;
    private int mTerm;






    // Returns the borrowed amount which is the Price subtracted from the downpayment
    public double borrowedAmount()
    {
        return mPrice - mDownPayment;
    }

    public double taxAmount()
    {
        return mPrice * STATE_TAX;
    }

    public double totalAmount()
    {
        return mPrice + taxAmount();
    }


    public double interestAmount()
    {
        double interestRate;
        
        // Creating switch statement cases based on the Term time selected by the user 
        switch (mTerm)
        {
            case 3:
                interestRate = .0462;
                break;

            case 4:
                interestRate = .0419;
                break;

            case 5:
                interestRate = .0416;
                break;

            default:
                //Should never be used
                interestRate = 0.10;
                break;
        }

        return borrowedAmount() * interestRate;

    }

    public double monthlyPayment()
    {
        return (borrowedAmount() + interestAmount()) / (mTerm * 12);
    }
}
