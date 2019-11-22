package p6_14;

public class CannonballRunner
{
	public static void main(String[] args)
	{
		//runSimulation(150, 45);
		runSimulation(150, 30);
	}

	/**
	 * Simulates a cannonball being shot up with the specified initial velocity at the specified
	 * angle
	 * 
	 * @param initVelocity
	 *            the initial velocity
	 * @param angle
	 *            the firing angle
	 */
	public static void runSimulation(double initVelocity, double angle)
	{
		Cannonball ball = new Cannonball(initVelocity, angle);

		System.out.println(ball);

		double lastTime = ball.time();
		boolean done = false;
		while (!done)
		{
			ball.step();

			if (((int) ball.time()) > lastTime)
				System.out.println("\n" + ball);

			lastTime = ball.time();
			done = ball.verticalPosition() == 0;
		}

		System.out.println("\n" + ball);
	}
}
