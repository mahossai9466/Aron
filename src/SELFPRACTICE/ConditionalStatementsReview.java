package SELFPRACTICE;

public class ConditionalStatementsReview {

	public static void main(String[] args) {
int score;
score=98;
String grade;

if (score >= 98 && score <= 100)
{
grade = "A+";
}
else if (score >= 93 && score <= 97)
{
grade = "A";
}
else if (score >= 90 && score <= 92)
{
grade = "A-";	
}
else if (score >= 88 && score <= 89)
{
grade = "B+";
}
else if (score >= 83 && score <= 87)
{
grade = "B";
}
else if (score >=80 && score <= 82)
{
grade = "B-";
}
else if (score >= 78 && score <=79)
{
grade = "C+";
}
else if (score >= 73 && score <=77)
{
grade = "C";
}
else if (score >= 70 && score <=72)
{
grade = "C-";
}
else if (score>= 60 && score<= 69)
{
grade = "D";
}
else if (score>=50 && score<= 60)
{
grade = "F";
}
else
{
grade = "Invalid Grade";
}
System.out.println(score);
System.out.println("**********");
System.out.println(grade);
}
}


