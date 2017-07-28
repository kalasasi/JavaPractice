package Lamda;
interface Note{
	void note();
}
public class ClassLamda {
	public static void main(String []args){
	Note n=new Note(){
		public void note(){
			System.out.println("Notes");
		}
	};
	n.note();
	Note nn=()->{
		System.out.println("hdtr");
	};
	
	/*Note nw=new Note(){
		public void  note(){
			System.out.println("some");
		}
	};
	nw.note();*/
}
}