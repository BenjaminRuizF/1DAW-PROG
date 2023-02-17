package net.benja.practicas.ProveedoresGasoil_bruiz;

public class App {
	/**
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) {
		if (args.length < 1) {
			System.err.println("Necesitas minimo un proveedor");
			return;
		}
		if (args.length > 10) {
			System.err.println("No puedes tener mas de 10 proveedores");
			return;
		}
		Proveedor P1 = new Proveedor(args[0]);
		Proveedor P2 = new Proveedor(args[1]);
		System.out.println(P1.toString());
		System.out.println(P2.toString());
		System.out.println("El precio mas bajo del proveedor: " + P1.getNombreProveedor()+ " sucedio el "
				+ P1.getPrecioMinimo().getFecha() + " y fue de: " + P1.getPrecioMinimo().getImporte());
		System.out.println("El precio mas bajo del proveedor: " + P2.getNombreProveedor() + " sucedio el "
				+ P2.getPrecioMinimo().getFecha() + " y fue de: " + P2.getPrecioMinimo().getImporte());
		System.out.println("El importe del dia 3-ene-2023 del proveedor: " + P1.getNombreProveedor() + " fue de : "
				+ P1.getImporte(3, 1, 2023));
		System.out.println("La media mensual para ene-2023 del proveedor: " + P2.getNombreProveedor() + " fue de "
				+ P2.getMediaMensual(1, 2023));

	}
}
