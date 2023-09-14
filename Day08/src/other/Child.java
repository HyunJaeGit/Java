package other;



public class Child {
	private String name;
	private Ball ball;
	
	public Child(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		String type = (ball == null) ? "없음" : ball.getType(); 
		
		System.out.printf("%s (공 : %s)\n", name, type);
	}
	
	public void takeBall(Ball ball) {
		this.ball = ball;
		
		System.out.printf("\n%s(이)가 %s(을)를 얻었다\n", name, ball.getType());
	}
	
	public void throwBall(Child tar) {
		tar.ball = ball;
		
		System.out.printf("\n%s(이)가 %s에게 %s을 던짐\n", name, tar.name, ball.getType());
		
		ball = null;
	}
	
	
}
