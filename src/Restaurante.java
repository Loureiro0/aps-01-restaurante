
public class Restaurante {
	final int vfim = 3;
	Prato vprato[] = new Prato[vfim];
	
	public void mostrarCardapio() {
		for (int x =0;x < vprato.length; x++) {
			System.out.println(vprato[x]);
		}
	}

}
