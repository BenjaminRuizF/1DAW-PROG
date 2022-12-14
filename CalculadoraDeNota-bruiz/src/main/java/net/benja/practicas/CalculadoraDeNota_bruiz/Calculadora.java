package net.benja.practicas.CalculadoraDeNota_bruiz;

public class Calculadora {
	float notaFinal = 0;
	float notasExamen = 0;
	float notasPractica = 0;
	float notasAct = 0;
	float notasAsis = 0;
	int contadorExamen;
	int contadorPractica;
	int contadorAsistencia;
	int contadorActitud;

	public void calculadoraDeNota(String[] Notas) {
		if (Notas.length > 20 || Notas.length < 0) {
			System.err.println("Has superado el limite de notas posibles");
			return;
		} else {
			for (int i = 0; i < Notas.length; i++) {
				String[] descompuesto = Notas[i].split("-");
				esFloat(descompuesto[1]);
				float notaNumerica = Float.parseFloat(descompuesto[1]);
				switch (descompuesto[0]) {
				case "C":
					if (comprobarExamen(notaNumerica)) {
						Examenes(notaNumerica);
					} else {
						return;
					}
					break;
				case "P":
					if (comprobarPractica(notaNumerica)) {
						Practicas(notaNumerica);
					} else {
						return;
					}
					break;
				case "A":
					if (comprobarAsistencia(notaNumerica)) {
						Asistencia(notaNumerica);
					} else {
						return;
					}
					break;
				case "T":
					if (comprobarActitud(notaNumerica)) {
						Actitud(notaNumerica);
					} else {
						return;
					}
					break;
				default:
					System.err.println("Caracter no valido");
					return;
				}
			}
			media();
		}
	}

	public Boolean comprobarExamen(float examen) {
		contadorExamen++;
		if (examen > 10 || examen < 0) {
			System.err.println("Nota de examen erronea");
			return false;
		}
		if (examen < 3) {
			notaFinal = 0;
			System.out.println("La nota final es " + notaFinal + " porque tienes un examen por debajo del 3");
			return false;
		}
		return true;
	}

	public void Examenes(float examen) {
		notasExamen = notasExamen + examen;
	}

	public Boolean comprobarPractica(float practica) {
		contadorPractica++;
		if (practica > 10 || practica < 0) {
			System.err.println("Nota de practica erronea");
			return false;
		}
		if (practica < 5) {
			notaFinal = 0;
			System.out.println("La nota final es " + notaFinal + " porque tienes una practica por debajo");
			return false;
		}
		return true;
	}

	public void Practicas(float practica) {
		notasPractica = notasPractica + practica;
	}

	public Boolean comprobarAsistencia(float asis) {
		contadorAsistencia++;
		if (asis > 1 || asis < 0) {
			System.err.println("Nota de asistencia erronea");
			return false;
		}
		if (contadorAsistencia > 1) {
			System.err.println("Hay mas de una nota de actitud");
			return false;
		}
		return true;
	}

	public void Asistencia(float asis) {
		notasAsis = asis;
	}

	public Boolean comprobarActitud(float act) {
		contadorActitud++;
		if (act > 1 || act < 0) {
			System.err.println("Nota de actitud erronea");
			return false;
		}
		if (contadorActitud > 1) {
			System.err.println("Hay mas de una nota de actitud");
			return false;
		}
		return true;
	}

	public void Actitud(float act) {
		notasAct = act;
	}

	public void media() {
		float mediaExamen = notasExamen / contadorExamen;
		float mediaPractica = notasPractica / contadorPractica;

		float mediaTotal = (mediaPractica + mediaExamen) / 2;

		if (mediaTotal < 4.0) {
			notaFinal = mediaTotal;
			System.out.println("La nota final es " + notaFinal + "porque la nota final esta por debajo del 4");
		} else {
			notaFinal = ((mediaTotal * 80) / 100) + notasAsis + notasAct;
			if (notaFinal == 10)
				System.out.println("Tienes una MH");
			else
				System.out.println("La nota final es " + Math.round(notaFinal * 100) / 100d);
		}
	}

	public void salir(boolean error) {
		if (error == false) {
			System.exit(0);
		}
	}

	public Boolean entradas(String[] Notas) {
		String Acumulacion = "";
		for (int i = 0; i < Notas.length; i++) {
			Acumulacion = Acumulacion + Notas[i];
		}
		if (Acumulacion.indexOf("C") == -1) {
			System.err.println("No hay ninguna nota de examen");
			return false;
		}

		if (Acumulacion.indexOf("P") == -1) {
			System.err.println("No hay ninguna nota de practica");
			return false;
		}

		if (Acumulacion.indexOf("A") == -1) {
			System.err.println("No hay ninguna nota de asistencia");
			return false;
		}

		if (Acumulacion.indexOf("T") == -1) {
			System.err.println("No hay ninguna nota de actitud");
			return false;
		}
		return true;
	}

	public void esFloat(String candidatoFloat) {
		try {
			Float.parseFloat(candidatoFloat);
		} catch (Exception e) {
			System.err.println("Hay un caracter erroneo");
			System.exit(0);
		}
	}

}