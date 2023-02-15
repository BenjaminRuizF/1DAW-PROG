package net.benja.practicas.ProveedoresGasoil_bruiz;

public class App {
	public static void main(String[] args) {
		String nombreProveedor = "";
		if (args.length < 1) {
			System.err.println("Necesitas minimo un proveedor");
			return;
		}
		if (args.length > 10) {
			System.err.println("No puedes tener mas de 10 proveedores");
			return;
		}
		int primerSeparador = args[0].lastIndexOf("\\");
		int segundoSeparador = args[0].lastIndexOf(".");
		nombreProveedor = args[0].substring(primerSeparador + 1, segundoSeparador);

		Proveedor P1 = new Proveedor(nombreProveedor);
		Proveedor P2 = new Proveedor(nombreProveedor);
		System.out.println(nombreProveedor);
		P1.leerFichero(args[0]);
		//P2.leerFichero(args[1]);
		System.out.println(P1.getImporte(8, 01, 2023));
		System.out.println(P1.toString());
		System.out.println(P1.getMediaMensual(01, 2023));
	}
}
