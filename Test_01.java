package hxz.array;

public class Test_01 {
	public static void main(String[] args) {
		int[] array = new int[10];
		
		for(byte i=0 ; i<10 ; i++) {
			array[i]=10*i;
		}
		//�������Ԫ��������������Ԫ����ôfor-each���ܸı������е�Ԫ��
		//Ҫ��סjava�еĲ���������ͨ��ֵ����ʵ�ֵ�
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
		
		//�������Ԫ�����������ͣ���ôfor-each���ܹ��ı������е�Ԫ��
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