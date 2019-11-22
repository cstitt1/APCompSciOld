package p6_14;

/**
 * Represents a cannonball shot at an angle up.
 */
public class Cannonball
{
	/**
	 * The time interval represented by one run of <code>step</code>.
	 */
	public static final double INTERVAL = 0.01;

	private static final double G = 9.81; // downward acceleration due to gravity (m/(s^2))

	private double vx; // current velocity in horizontal direction (m/s)
	private double vy; // current velocity in vertical direction (m/s)
	private double sx; // current horizontal position (m)
	private double sy; // current vertical position (m)
	private double t; // current time (s)

	/**
	 * Constructs a cannonball with the specified initial velocity and firing angle. (precondition:
	 * initVelocity > 0 && fireAngle > 0 && fireAngle <= 90)
	 * 
	 * @param initVelocity
	 *            the initial velocity (in meters / second)
	 * @param fireAngle
	 *            the firing angle (in degrees)
	 * @throws IllegalArgumentException
	 *             if precondition is not met
	 */
	public Cannonball(double initVelocity, double fireAngle)
	{
		if (initVelocity <= 0 || fireAngle <= 0 || fireAngle > 90)
			throw new IllegalArgumentException("Precondition not met");

		if (fireAngle != 90)
			vx = initVelocity * Math.cos(Math.toRadians(fireAngle));
		else
			vx = 0;
		vy = initVelocity * Math.sin(Math.toRadians(fireAngle));
		sx = 0;
		sy = 0;
		t = 0;
	}

	/**
	 * Returns the horizontal position of the cannonball in meters.
	 * 
	 * @return the norizontal position of the cannonball in meters
	 */
	public double horizontalPosition()
	{
		return sx;
	}

	/**
	 * Returns the vertical position of the cannonball in meters.
	 * 
	 * @return the vertical position of the cannonball in meters
	 */
	public double verticalPosition()
	{
		return sy;
	}

	/**
	 * Returns the time for which the simulation has run in seconds.
	 * 
	 * @return the time for which the simulation has run in seconds
	 */
	public double time()
	{
		return t;
	}

	/**
	 * Advances the simulation forward by <code>INTERVAL</code> seconds. (precondition:
	 * <code>verticalPosition()</code> is greater than 0 or step has never been run)
	 * 
	 * @throws IllegalStateException
	 *             if <code>step</code> has already been run and <code>verticalPosition()</code> is
	 *             less than or equal to 0
	 */
	public void step()
	{
		// TODO: CHECK FOR PRECONDITION

		sx += vx * INTERVAL;
		sy += vy * INTERVAL;
		// vx is constant until ball hits ground
		vy -= G * INTERVAL;
		t += INTERVAL;

		if (sy <= 0)
		{
			sy = 0;
			vx = 0;
			vy = 0;
		}
	}
	
	// TODO: Document
	public String toString()
	{
		return "Time: " + time() + "\nHorizontal: " + horizontalPosition() + "\nVertical: " + verticalPosition();
	}
}
