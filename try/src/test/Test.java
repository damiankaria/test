package test;

public class Test {

		public static int som(int x){
			if (x==0) {
				return 0;
			}
			else {
				return x + som(x-1);
			}
		}
		
		public static void main(String args[]){
			int i = 0;
			for (int x = 0; x <= 153; x++){
				i = i + x;
			}
			System.out.println(i);
		}
	}


