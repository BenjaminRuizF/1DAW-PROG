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
		}

		System.out.println("El precio mas bajo del proveedor: " + P[0].getNombreProveedor() + " sucedio el "
				+ P[0].getPrecioMinimo().getFecha() + " y fue de: " + P[0].getPrecioMinimo().getImporte());
		if (args.length > 1) {
			System.out.println("El precio mas bajo del proveedor: " + P[1].getNombreProveedor() + " sucedio el "
					+ P[1].getPrecioMinimo().getFecha() + " y fue de: " + P[1].getPrecioMinimo().getImporte());
		}
		System.out.println("El importe del dia 3-ene-2023 del proveedor: " + P[0].getNombreProveedor() + " fue de : "
				+ P[0].getImporte(3, 1, 2023));
		if (args.length > 1) {
			System.out.println("La media mensual para ene-2023 del proveedor: " + P[1].getNombreProveedor() + " fue de "
					+ P[1].getMediaMensual(1, 2023));
		}

	}
}
