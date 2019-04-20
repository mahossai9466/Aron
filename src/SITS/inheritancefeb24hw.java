package SITS;


class studentloans
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

class carloans extends studentloans
{
public void carpayments()
{
System.out.println("CAR PAYMENTS");
}
}

class mortgageloans extends carloans
{
public void mortgagepayments()
{
System.out.println("MORTGAGE PAYMENTS");
}
}


public class inheritancefeb24hw {

	public static void main(String[] args) {

carloans c=new carloans();
c.collegeloans();
c.creditcardloans();
c.carpayments();

System.out.println("xxxxxxxxxxxxxxxxx");

mortgageloans m=new mortgageloans();
m.collegeloans();
m.creditcardloans();
m.carpayments();
m.mortgagepayments();

		
//this is what happens when you get richer; you "inherit" more payments		
		
	

}
}