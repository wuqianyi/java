package abc;

import java.util.Arrays;

public class Perm {
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("�����δ������������N��");
		int N = input.nextInt();
		System.out.println("�����δ��������飺");
        int[] list = new int[N];
        for(int i=0;i<N;i++) {
        	list[i]=input.nextInt();
        }
		Perm(list, 0, list.length - 1);

	}
public static void Perm(int list[],int k,int m)
{//����list[k:m]����������
	if(k==m) {
		//ֻʣ��һ��Ԫ��
		for(int i=0;i<=m;i++) {
			System.out.print(list[i] + " ");
    }
    System.out.println();
    return;
	}
	else {//���ж��Ԫ�ش����򣬵ݹ��������
		for(int i=k;i<=m;i++) {
			System.out.println("ǰ ��k="+k+"  list["+k+"]="+list[k]+"  i="+i+ "  list["+i+"]=" +list[i]);
			System.out.println(Arrays.toString(list));
			Swap(k,i,list);//�൱�ڹ̶���ǰλ�ã��ڽ�����һλ������
			System.out.println("�� ��k="+k+"  list["+k+"]="+list[k]+"  i="+i+ "  list["+i+"]="  +list[i] + "   k+1="+(k+1));
			Perm(list,k+1,m); // ����kλ��ȷ������ô��k+1~m�е��������ݹ�
			Swap(k,i,list);       // ����ȥ���ٻ�ԭ
			System.out.println("/////k="+k+"  list["+k+"]="+list[k]+"  i="+i+ "  list["+i+"]="  +list[i]);
		}
	}
	
}
public static void Swap(int a,int b,int list[]) {
	
	int temp=list[b];
	list[b]=list[a];
	list[a]=temp;	
	System.out.println("������ԭ������飺"+Arrays.toString(list));
	
}
}
