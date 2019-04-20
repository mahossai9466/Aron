package SITS;

public class Conditionalswithbound {

	public static void main(String[] args) {
		int score=75;
		String grade;
		if (score>=90&& score<=100)
		{
			grade="A";
			}
		else if (score>=80&& score<90)
		{
			grade="B";
			}
		else if (score>=70&& score<80)
		{
			grade="C";
		}
		else if (score>=0&& score<70)
		{
			grade="F";
		}
		else
		{
		grade="You have entered an invalid score.";
			}
		System.out.println(grade);
		}
	}


