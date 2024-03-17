package TestNgBasic;

public class Annotation2 extends Annoations1 {
	@Override
public void m2() {
	System.out.println("bye");
}
public static void main(String[] args) {
	Annoations1 a=new Annotation2();
}
}
