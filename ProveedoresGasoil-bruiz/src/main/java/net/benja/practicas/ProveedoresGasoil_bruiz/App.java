package net.benja.practicas.ProveedoresGasoil_bruiz;

public class App {
	public static void main(String[] args) {
		String nombreProveedor[] = new String[args.length];

		if (args.length < 1) {
			System.err.println("Necesitas minimo un proveedor");
			return;
		}
		if (args.length > 10) {
			System.err.println("No puedes tener mas de 10 proveedores");
			return;
		}
		for (int i = 0; i < args.length; i++) {
			int primerSeparador = args[i].lastIndexOf("\\");
			int segundoSeparador = args[i].lastIndexOf(".");
			nombreProveedor[i] = args[i].substring(primerSeparador+1, segundoSeparador);
		}
		Proveedor P1 = new Proveedor(nombreProveedor[0]);
		System.out.println(nombreProveedor[0]);
		P1.leerFichero(args[0]);
	}
}
