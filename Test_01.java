package hxz.array;

public class Test_01 {
	public static void main(String[] args) {
		int[] array = new int[10];
		
		for(byte i=0 ; i<10 ; i++) {
			array[i]=10*i;
		}
		//如果数组元素是主数据类型元素那么for-each不能改变数组中的元素
		//要记住java中的参数传递是通过值传递实现的
		for(int m : array) {
			m = 2;
			System.out.println(m);
		}
		
		for(int m : array) {
			System.out.println(m);
		}
		
		User[] user = new User[3];
		user[0] = new User("hxz" , "360428***");
		user[1] = new User("hxz1" , "360428****");
		user[2] = new User("hxz2" , "360428******");
		
		//如果数组元素是引用类型，那么for-each就能够改变数组中的元素
		for( User us : user) {
			us.name = "hxz";
		}
		
		for(User us : user) {
			System.out.println(us.name);
		}
		
	}
}

class User{
	public String id;
	public String name;
	
	User(String name , String id) {
		this.name = name;
		this.id = id;
	}
	
}