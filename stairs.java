package abc;
import java.util.Scanner;
public class stairs {

	/**
	 * ��̬�滮  ��������ȷ�����һ����һ��̨�׻�������̨��
	 * f(n)=f(n-1)+f(n-2)
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("������¥����n:");
		int n = input.nextInt();
		System.out.println("����¥�ݵķ�����"+ClimbStairs(n)+"��");
	}
	
	public static int ClimbStairs(int n) {
		int []N = new int[n+1];
		N[0]=0;N[1]=1;N[2]=2;
		int i;
		if(n==1)
			return 1;
		for(i=3;i<=n;i++)
			N[i]=N[i-1]+N[i-2];
		return N[n];		
	}

}
