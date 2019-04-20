package SELFPRACTICE;



class student_loans
{

public void collegeloans()
{
System.out.println("COLLEGE LOANS");
}

public void creditcardloans()
{
System.out.println("CREDIT CARD LOANS");
}
}

class car_loans extends student_loans
{
public void carpayments()
{
System.out.println("CAR PAYMENTS");
}
}

class mortgage_loans extends car_loans
{
public void mortgagepayments()
{
System.out.println("MORTGAGE PAYMENTS");
}
}


public class inheritancehwrepeat {

	public static void main(String[] args) {

		
student_loans s=new student_loans();
s.collegeloans();
s.creditcardloans();

System.out.println("**************************");

car_loans c=new car_loans();
c.collegeloans();
c.creditcardloans();
c.carpayments();

System.out.println("**************************");

mortgage_loans m=new mortgage_loans();
m.collegeloans();
m.creditcardloans();
m.carpayments();
m.mortgagepayments();

	}

	}


