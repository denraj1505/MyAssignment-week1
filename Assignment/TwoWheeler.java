package Assignment;

public class TwoWheeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TwoWheeler obj=new TwoWheeler(); 
		   
		   int noOfWheels=obj.wheel(4);
		   System.out.println("Number of Wheels= "+noOfWheels);
		   short noOfMirrors=obj.mirror((short)2);
		   System.out.println("Number of Mirror= "+noOfMirrors);
		   long	chassisNumber=obj.chasnum(1234567890L);
		   System.out.println("Chassis Number= "+chassisNumber);
		   Boolean punct=obj.isPunctured();
		   System.out.println("IsCar wheel puncture= "+punct);
		   String biknam=obj.bikeName("Royal Enfield");
		   System.out.println("My Bike Name " + biknam);
		   double runningKM=obj.run(34587.9);
		   System.out.println("Number of KM "+ runningKM);
		   
		   
	}
	
	public int wheel(int w) {
		// TODO Auto-generated method stub
		int fourwheel=w;
		return fourwheel;
	}
	public short mirror(short mir)
	{
		short twomirror=mir;
		return twomirror;
	}
	public long chasnum(long chas)
	{
		long chasnum=chas;
		return chasnum;
	}
	public boolean isPunctured() {
		return true;
	}
	public String bikeName(String bikeName) {
		String bike=bikeName;
		return bike;
		
	}
	public double run(double runKM) {
		double KM=runKM;
		return KM;
	}
	}




