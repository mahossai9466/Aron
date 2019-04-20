package SITS;

class ford
{
public void start()
{
System.out.println("Start the car.");
}
public void stop ()
{
System.out.println("Stop the car.");
}
}

class bmw extends ford
{
public void bmw_spec()
{
System.out.println("Special Future of BMW.");
}
}

class porsche extends bmw
{
public void porsche_spec()
{
System.out.println("Special Future of Porsche.");
}
}



public class INHERITANCE {

public static void main(String[] args) {

porsche p=new porsche();
p.start();
p.stop();
p.bmw_spec();
p.porsche_spec();

System.out.println("*****************************");

bmw b=new bmw();
b.start();
b.stop();
b.bmw_spec();
	
	}

}
