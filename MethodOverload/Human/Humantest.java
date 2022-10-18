package MethodOverload.Human;

public class Humantest {

	public static void main(String[] args) {
		
		Human Shambhu=new Human();
		Unknown unknown=new Unknown();
		Friend friend=new Friend();
		
		Shambhu.Speak(unknown);
		Shambhu.Speak(friend);
	}
}
