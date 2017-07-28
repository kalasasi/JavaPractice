package Lamda;


interface Interface{
	//void displayLamda();
	void dispaly(int a,int b);
}
public class LambaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Interface i=()->{
			System.out.println("lamda");
		};*/
		Interface lamda=(a,b)->{
			System.out.println("Parameter ");
		};
		lamda.dispaly(12,14);
	}

}
