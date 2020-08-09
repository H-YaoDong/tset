/***
 * 字符串连接符+，String不是基本数据类型，它实际是个对象
 * @author HYaoDong
 *只要+两边有一个是String类型，那么相加的结果就是String类型
 */
public class C {
	public static void main( String[] args ) {
		String a = "3" ;
		int b = 4 ;
		int c = 5 ;
		System.out.println( a+b );//这个时候打印的结果34是字符串
		System.out.println( a+b+c );//a+b="34" , "34"+5="345"
 		System.out.println( b+c+a );//b+c=9 , 9+"3"="93"
		
 		String str = 4+"";//添加一个""表示把4转换成了字符串
 		
 		char d = 'a' ;
 		char e = 'b' ;
 		System.out.println( d+b );//字符型的连接符就是加法的意思
 		System.out.println( d+e );//程序会先把字符转换成对应的unicode码，再进行相加减，结果是整形
 		
	}
}
