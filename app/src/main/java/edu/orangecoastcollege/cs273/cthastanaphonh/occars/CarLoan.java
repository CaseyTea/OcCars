package edu.orangecoastcollege.cs273.cthastanaphonh.occars;

/**
 * Created by CaseyTea on 9/14/17.
 */

public class CarLoan {

    private static final double STATE_TAX = 0.08;
    private double mPrice;
    private double mDownPayment;
    private int mTerm;

/**
* This method returns the borrowed amount, as a double, by 
* subtracting the price from the down payment. 
*/
    public double borrowedAmount()
    {
        return mPrice - mDownPayment;
    }

/**
* This method returns the tax amount as a double
* by multiplying the price by the sales tax percentage 
*/
    public double taxAmount()
    {
        return mPrice * STATE_TAX;
    }
    
/**
* This method returns the total amount as a double
* by adding the price to the tax amount 
*/
    public double totalAmount()
    {
        return mPrice + taxAmount();
    }

/**
* This method returns the interest amount as a double
* by first determining which term was selected and 
* multiplying the borrowed amount to the interest rate
* based on the term selected. 
*/
    public double interestAmount()
    {
        double interestRate;

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
/**
* This method returns the monthly payments as a double
*/
    public double monthlyPayment()
    {
        return (borrowedAmount() + interestAmount()) / (mTerm * 12);
    }
}
