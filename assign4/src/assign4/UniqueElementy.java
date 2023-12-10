package assign4;

public class UniqueElementy {
	public static int unique(int[] arr) {
		int max=0;
		int res=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[res]!=arr[i]) {
				max=Math.max(arr[i],arr[res]);
				res++;
			}
		}
		return max;
	}
  public static void main(String[] args) {
	   int[] arr= {1,2,1,1,1,1};
	System.out.println(unique(arr));
  }
}
