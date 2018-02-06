//again, you created a class here to keep things simple

//method parameters
//how to pass information to a method
//the two () after the method name are where you send info
//think of them as a tunnel...
//info goes in one end of the tunnel and comes out the other

class Robot {
	
	public void speak(String text){
		System.out.println(text);
	}
	
	public void jump(int inches){
		System.out.println(inches * 2);
	}
	
	public void move (String direction, double distance){
		System.out.println("Robot moves " + direction + " for " + distance + " feet.");
	}
}

public class Application {
	
	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("Hi, I am Sam.");
		sam.jump(14);
		sam.move("west",  12.2);
		
		Robot deb = new Robot();
		deb.speak("I'm Deb!");
		deb.jump(8);
		deb.move("east", 16.4);
		
		String greeting = "I'm very silly.";
		deb.speak(greeting);
	}
}

//in the example, sam.speak("stuff") gets passed to the method.
//up above, (String text) tells the method what kind of info will be passed in
//it's getting a String, called "text"
//so when the method runs, it prints whatever gets passed as "text"
//similar result with method jump
//except an int gets passed
//and move method is example of multiple parameters

//another thing you can do is create variables instead of literals
//then just pass the variable to the method