/***
 * �ַ������ӷ�+��String���ǻ����������ͣ���ʵ���Ǹ�����
 * @author HYaoDong
 *ֻҪ+������һ����String���ͣ���ô��ӵĽ������String����
 */
public class C {
	public static void main( String[] args ) {
		String a = "3" ;
		int b = 4 ;
		int c = 5 ;
		System.out.println( a+b );//���ʱ���ӡ�Ľ��34���ַ���
		System.out.println( a+b+c );//a+b="34" , "34"+5="345"
 		System.out.println( b+c+a );//b+c=9 , 9+"3"="93"
		
 		String str = 4+"";//���һ��""��ʾ��4ת�������ַ���
 		
 		char d = 'a' ;
 		char e = 'b' ;
 		System.out.println( d+b );//�ַ��͵����ӷ����Ǽӷ�����˼
 		System.out.println( d+e );//������Ȱ��ַ�ת���ɶ�Ӧ��unicode�룬�ٽ�����Ӽ������������
 		
	}
}
