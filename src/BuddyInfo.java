
public class BuddyInfo {
	
	 int age;
	 String name;
// testing
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo myBudd=new BuddyInfo(10,"ali");
		System.out.println("Hello "+ myBudd.getName() );
		// checking the new branch
		
	}
	public BuddyInfo(int age,String name){
		this.age=age;this.name=name;
		
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
