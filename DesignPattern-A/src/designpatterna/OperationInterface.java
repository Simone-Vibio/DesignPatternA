package designpatterna;

import java.util.ArrayList;
import java.util.List;

public interface OperationInterface 
{
	public List<Float>data = new ArrayList();

	public abstract void calculate(List<Float>data);
	
}
