package Test;

public class test7 {
	public static void main(String[] args){
		int[] arr=new int[]{40,17,41,2,1,6,4};

		int max=getmax(arr);
		System.out.println("Max value is "+max);
		int min=getmin(arr);
		System.out.println("Min value is "+min);
	}	

	public static int getmax(int[] b) {
		int maxvalue=b[0];
		for (int i=0;i<b.length;i++){
			if (b[i]>maxvalue){
          maxvalue=b[i];
			}
		}
		return maxvalue;
	}
	public static int getmin(int[] b) {
		int minvalue=b[0];
		for (int i=0;i<b.length;i++){
			if (b[i]<minvalue){
				minvalue=b[i];;
			}
		}
		return minvalue;
	}	
}
