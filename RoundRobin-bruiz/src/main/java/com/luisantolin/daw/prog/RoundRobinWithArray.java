package com.luisantolin.daw.prog;

import java.util.Arrays;

public class RoundRobinWithArray implements RoundRobin {
	private String[] RoundRobin;
	private int Iterador = 0;

	public RoundRobinWithArray() {
		RoundRobin = new String[0];
	}

	@Override
	public void add(String nuevo) {
		// TODO Auto-generated method stub
		String[] newArray = Arrays.copyOf(RoundRobin, RoundRobin.length + 1);
		RoundRobin = newArray;
		RoundRobin[RoundRobin.length - 1] = nuevo;
	}

	@Override
	public void add(String[] nuevos) {
		// TODO Auto-generated method stub
		String[] newArray = Arrays.copyOf(RoundRobin, RoundRobin.length + nuevos.length);

		for (int i = RoundRobin.length; i < newArray.length; i++) {
			newArray[i] = nuevos[i - RoundRobin.length];
		}
		RoundRobin = newArray;
	}

	@Override
	public String del() {
		// TODO Auto-generated method stub
		String retorno = RoundRobin[0];
		String[] aux = new String[RoundRobin.length - 1];
		for (int i = 1; i < RoundRobin.length; i++) {
			aux[i - 1] = RoundRobin[i];
		}
		RoundRobin = aux;
		return retorno;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return RoundRobin.length;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		String retorno;
		if (Iterador >= RoundRobin.length) {
			Iterador = 0;
			retorno = RoundRobin[Iterador];
			Iterador++;
		} else
			retorno = RoundRobin[Iterador];
		Iterador++;

		return retorno;
	}

	@Override
	public void resetIterator() {
		// TODO Auto-generated method stub
		Iterador = 0;
	}

	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		if (index >= RoundRobin.length) {
			return RoundRobin[index % RoundRobin.length];
		} else {
			return RoundRobin[index];
		}
	}
	public void sacar() {
		for (int i = 0; i < RoundRobin.length; i++) {
			System.out.println(RoundRobin[i]);
		}
	}
}
