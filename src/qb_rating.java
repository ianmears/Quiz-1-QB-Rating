import java.util.Scanner;
public class qb_rating 
{
	public static double completionsAvg(int comp,int att)
	{	
		double result;
		double a = (((comp/att)-.3)*5);
		if(a>2.375)
		{
			result=2.375;
		}
		else if(a<0)
		{
			result = 0;
		}
		else
		{
			result = a;
		}
		return result;
	}
	public static double yardsAvg(double yds, double att)
	{
		double result;
		double a = (((yds/att)-3)*.25);
		if(a>2.375)
		{
			result=2.375;
		}
		else if(a<0)
		{
			result = 0;
		}
		else
		{
			result = a;
		}
		return result;
	}
	public static double tdAvg(int td, int att)
	{
		double result;
		double a = ((td/att)*20);
		if(a>2.375)
		{
			result=2.375;
		}
		else if(a<0)
		{
			result = 0;
		}
		else
		{
			result = a;
		}
		return result;
	}
	public static double intAvg(int ints, int att)
	{
		double result;
		double a = (2.375-((ints/att)*25));
		if(a>2.375)
		{
			result=2.375;
		}
		else if(a<0)
		{
			result = 0;
		}
		else
		{
			result = a;
		}
		return result;
	}
	public static void main(String[] args) 
	{
		int att;
		int comp;
		double yds;
		int td;
		int interceptions;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the number of pass attempts");
		att=a.nextInt();
		System.out.println("Enter the number of pass completions");
		comp=a.nextInt();
		System.out.println("Enter the total number of pass yards");
		yds=a.nextDouble();
		System.out.println("Enter the number of Touch Downs");
		td=a.nextInt();
		System.out.println("Enter the number of interceptions thrown");
		interceptions=a.nextInt();
		double compAvg = completionsAvg(comp,att);
		double ydsAvg = yardsAvg(yds,att);
		double tdAvg = tdAvg(td,att);
		double interAvg = intAvg(interceptions,att);
		double rating = (((compAvg+ydsAvg+tdAvg+interAvg)/6)*100);
		System.out.println("QB RATING =" + rating);
	}

}
