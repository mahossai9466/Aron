package SELFPRACTICE;


class emaye
{
public void anger()
{
	System.out.println("ANGER");
}
public void beauty()
{
System.out.println("BEAUTY");
}
}

class mom extends emaye
{
public void love()
{
System.out.println("LOVE");
}
public void impatience()
{
System.out.println("IMPATIENCE");
}
}

class aron extends mom
{
public void browneyes()
{
System.out.println("BROWN EYES");
}
}



public class GENETICINHERITANCE {

	public static void main(String[] args) {
mom m=new mom();
m.anger();
m.beauty();
m.love();
m.impatience();

System.out.println("xxxxxxxxxxxxxxxxxx");

aron a=new aron();
a.anger();
a.beauty();
a.love();
a.impatience();
a.browneyes();


}
}