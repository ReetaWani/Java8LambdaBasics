interface Messageable{
	Message message(String msg);
}

class Message {
	Message(String msg){
		System.out.println("Hello From Constructor");
	}
}
		

public class ConstructorReferenceJava8 {
	public static void main(String args[]) {
		Messageable messageable = Message::new;
		messageable.message("Hello");
	}
}
