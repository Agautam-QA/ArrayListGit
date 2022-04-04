import java.util.ArrayList;
public class ArrayListPrac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] fruits=new String[3];
		fruits [0]="Mango";
		fruits[1]="Apple";
		fruits[2]="Strawberry";
		System.out.println(1);// prints apple
		// now we do this on ArrayList below
		
		ArrayList fruitlist=new ArrayList(); // appeared error to bring"import java.util.ArrayList;
        fruitlist.add("Mango");
        fruitlist.add("Apple");
        fruitlist.add("Strawberry");
        System.out.println(fruitlist);
        // result prints [Mango, Apple, Strawberry]
        
        //we also can use all available methods as below:
        
        fruitlist.clear();
        fruitlist.remove(0);
        fruitlist.addAll(0, fruitlist );
	}

}
