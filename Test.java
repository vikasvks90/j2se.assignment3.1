/*'jdk 1.8' Error: Main method not found in class Problem1, please define the main method as:
public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application*/

package Assignment3;

public class Test {
	
static{
	print(10);
}

static void print (int x) {
	System.out.println (x);
	System.exit(0);
}
}


//Answer b. Will throw a NoSuchMethod error at runtime.