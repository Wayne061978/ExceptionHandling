package exceptions;

public class ExceptionHandle {

    public void checkEligibility(int StAge, double StGpa)
    {
        if(StAge < 18 || StGpa < 2)
        {
            throw new ArithmeticException("Student is not eligible for registration");
        }
        else
        {
            System.out.println("Student is eligible for registration");
        }
    }

}
