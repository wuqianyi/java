package abc;

import java.util.Arrays;

public class Perm {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("请依次待排列数组个数N：");
		int N = input.nextInt();
		System.out.println("请依次待排列数组：");
        int[] list = new int[N];
        for(int i=0;i<N;i++) {
        	list[i]=input.nextInt();
        }
		Perm(list, 0, list.length - 1);

	}
public static void Perm(int list[],int k,int m)
{//产生list[k:m]的所有排列
	if(k==m) {
		//只剩下一个元素
		for(int i=0;i<=m;i++) {
			System.out.print(list[i] + " ");
    }
    System.out.println();
    return;
	}
	else {//还有多个元素待排序，递归产生排列
		for(int i=k;i<=m;i++) {
			System.out.println("前 ：k="+k+"  list["+k+"]="+list[k]+"  i="+i+ "  list["+i+"]=" +list[i]);
			System.out.println(Arrays.toString(list));
			Swap(k,i,list);//相当于固定当前位置，在进行下一位的排列
			System.out.println("后 ：k="+k+"  list["+k+"]="+list[k]+"  i="+i+ "  list["+i+"]="  +list[i] + "   k+1="+(k+1));
			Perm(list,k+1,m); // 假设k位置确定，那么对k+1~m中的数继续递归
			Swap(k,i,list);       // 换过去后再还原
			System.out.println("/////k="+k+"  list["+k+"]="+list[k]+"  i="+i+ "  list["+i+"]="  +list[i]);
		}
	}
	
}
public static void Swap(int a,int b,int list[]) {
	
	int temp=list[b];
	list[b]=list[a];
	list[a]=temp;	
	System.out.println("交换还原后的数组："+Arrays.toString(list));
	
}
}
