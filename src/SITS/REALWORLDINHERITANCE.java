package SITS;

class grandfather
{
public void gold()
{
System.out.println("GOLD");
}
public void house()
{
System.out.println("HOUSE");
}
}

class father extends grandfather
{
public void car()
{
System.out.println("CAR");
}
}

class me extends father
{
public void money()
{
System.out.println("MONEY");
}
}


public class REALWORLDINHERITANCE {

	public static void main(String[] args) {

father f=new father();
f.gold();
f.house();
f.car();

System.out.println("*********************");

me m=new me();
m.gold();
m.house();
m.car();
m.money();
	}
 
}
