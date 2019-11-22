package p10_5;

public class Manager extends Employee
{
	private String department;
	
	public Manager(String mName, double mSalary, String mDepartment)
	{
		super(mName, mSalary);
		department = mDepartment;
	}
	
	public String department()
	{
		return department;
	}
	
	public String toString()
	{
		return name() + " works in " + department() + " and earns $" + salary();
		/* note: If a format such as:
		 * 
		 *    Brandon earns $100000 and works in South
		 *    
		 * was desired, super.toString() could have been called and the department
		 * appended. This technique is demonstrated in Executive.
		 */
	}
}
