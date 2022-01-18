package objs;

public class libroApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro lib1 = new Libro ();
		Libro lib2 = new Libro ();
		lib1.setISBN("12345ASDGF");
		lib2.setISBN("67890QWERT");
		lib1.setAutor("Pablo");
		lib2.setAutor("Ana");
		lib1.setN_pag(300);
		lib2.setN_pag(350);
		lib1.setTitulo("Guia del autoestopista intergalactico");
		lib2.setTitulo("El problema de los tres cuerpos");
		
		System.out.println(lib1);
		System.out.println(lib2);
		
		if(lib1.getN_pag() > lib2.getN_pag())
			System.out.println("El primer libro tiene más paginas");
		else
			System.out.println("El segundo libro tiene más paginas");
	}

}
