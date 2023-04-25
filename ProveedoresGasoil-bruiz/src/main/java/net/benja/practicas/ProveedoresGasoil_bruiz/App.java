package net.benja.practicas.ProveedoresGasoil_bruiz;

public class App {
	/**
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) {
		Proveedor[] P = new Proveedor[args.length];
		if (args.length < 1) {
			System.err.println("Necesitas minimo un proveedor");
			return;
		}
		if (args.length > 10) {
			System.err.println("No puedes tener mas de 10 proveedores");
			return;
		}
		for (int i = 0; i < args.length; i++) {
			P[i] = new Proveedor(args[i]);
		}
		for (int i = 0; i < args.length; i++) {
			System.out.println(P[i].toString());
			System.out.println("El precio mas bajo del proveedor: " + P[i].getNombreProveedor() + " sucedio el "
					+ P[i].getPrecioMinimo().getFecha() + " y fue de: " + P[i].getPrecioMinimo().getImporte());
			System.out.println("El importe del dia 3-ene-2023 del proveedor: " + P[i].getNombreProveedor()
					+ " fue de : " + P[i].getImporte(3, 1, 2023));
			System.out.println("La media mensual para ene-2023 del proveedor: " + P[i].getNombreProveedor() + " fue de "
					+ P[i].getMediaMensual(1, 2023));
		}

	}
}
