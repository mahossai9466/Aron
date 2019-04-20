package SELFPRACTICE;

class beyonce
{
public void haunted()
{
System.out.println("It's what you do");
}
public void sasha()
{
System.out.println("Sasha");
}
}

class kelly extends beyonce
{
public void whenjesussayyes ()
{
System.out.println("When Jesus Say Yes");
}
}

class michelle extends kelly
{
public void poormichelle()
{
System.out.println("Poor Michelle! That's not what my accountant said!");
}
}

public class inheritmeeeeee {

	public static void main(String[] args) {
		
beyonce b=new beyonce();
b.haunted();
b.sasha();
System.out.println("********************");

kelly k=new kelly();
k.haunted();
k.sasha();
k.whenjesussayyes();
System.out.println("********************");

michelle m=new michelle();
m.haunted();
m.sasha();
m.whenjesussayyes();
m.poormichelle();


	}

}
