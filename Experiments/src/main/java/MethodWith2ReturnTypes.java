import java.util.HashMap;
import java.util.Map;

public class MethodWith2ReturnTypes{
	
	static Map<Integer,String> fillMap=new HashMap<Integer,String>();
	
	public static Map<Integer, String> fillingHashMaps()
	{
	
		fillMap.put(1, "Sumeet");
		fillMap.put(2, "Rastogi");
		fillMap.put(3, "Awesome");
		
		
		return fillMap;
	}
	
	static Map<Integer, String> DeleteMapValue(int i)
	{
		fillMap.remove(i);
		return fillMap;
	}
	
	public static void main(String args[])
	{
		Map<Integer,String> myMap=fillingHashMaps();
		System.out.println(myMap);
		Map<Integer,String> removeFromMap=DeleteMapValue(1);
		System.out.println(removeFromMap);
		
		
	}
	
}