package dal.gravity;

public class GravityConstant implements GravityModel{
    private double g;
    
    public GravityConstant(double input){
    	g = input;
    }
    
	public double getGravitationalField()
    {
    	return g;
    }   

	
}
