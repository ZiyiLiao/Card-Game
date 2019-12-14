import java.util.Random;

public class Computer
{
	private int mode;	//0 stupid, 1 smart

	public Computer(int m)
	{
		mode = m;
	}

	public int action(int marbles)
	{
		if(mode == 0)
		{
			return new Random().nextInt( marbles / 2 ) + 1;
		}
		else
		{
			int n = 1;
			while(n*2 <= marbles)
			{
				n *= 2;
			}
			if(marbles - (n-1) > marbles/2)
				return new Random().nextInt( marbles / 2 ) + 1;
			else
				return marbles - (n-1);
		}
	}
}
