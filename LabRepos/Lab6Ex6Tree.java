public class Lab6Ex6Tree{
	public static void main(String[] args){
		int i, j;
		int rows = 4;
		int spc;
		for(i = rows; i > 0; i--){
		// add beginning spaces here
			spc = ((7-i)-(i-1));
			for(int k=0;k<spc;k++){
				System.out.print(" ");
			}
			for(j = 1; j <= i; j++){
				System.out.print(i);
				if(j<i){
					System.out.print(" ");
				}
				// add spaces in the middle here
			}
		// add ending spaces here	
		System.out.print("\n");
		}
	}
}