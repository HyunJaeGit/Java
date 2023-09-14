package other;

/*
 	클래스의 접근 제어자
 	1. public
 	- 외부에서 사용 가능한 클래스
 	- .java 파일과 이름이 같아야 한다
 	- 따라서, 페이지당 한개만 작성 가능
 	
 	2. package
 	- 같은 패키지에서만 사용 가능
 	- .java파일과 이름이 같을 필요 없다
 	- 한 페이지에 여러개 작성 가능
 	
 */

class Unit {

	public void showInfo() {
		// 클래스가 package이므로 외부에 공개가 안됨
		// 따라서 showInfo()의 public은 무의미
		
	}
}
