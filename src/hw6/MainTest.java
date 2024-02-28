package hw6;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pencil p=new Pencil("STAEDTLER",120);
		InkBrush i=new InkBrush("STABILO",150);
		p.write();
		p.getPencil();
		System.out.println("__________________________________________________");
		i.write();
		i.getInkBrush();
		
		
	}

}
