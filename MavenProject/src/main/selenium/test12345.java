
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class test12345 {
	
	public static void main(String[] args){
		List<Integer> givenList = Arrays.asList(1, 2, 3);
	    Random rand = new Random();
	    int randomElement = givenList.get(rand.nextInt(givenList.size()));
	    
	    System.out.println(randomElement);
	    
	    List<String> name = Arrays.asList("bharathi","devi","hema");
	    Random r = new Random();
	    String ranName=name.get(r.nextInt(name.size()));
	    System.out.println(ranName);
	}
}
