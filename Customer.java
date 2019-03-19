public class Customer
{
	int arrivaltime, servicetime, waitingtime;
	
	public Customer(int arrivaltime, int servicetime, int waitingtime)
	{
		this.arrivaltime = arrivaltime; 
		this.servicetime = servicetime;
		this.waitingtime = waitingtime;
	}
	public int getArr()
	{
		return arrivaltime;
	}
	public int getSer()
	{
		return servicetime;
	}
	public int getWai()
	{
		return waitingtime;
	}
	

}
