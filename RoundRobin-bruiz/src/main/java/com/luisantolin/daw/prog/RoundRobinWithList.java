package com.luisantolin.daw.prog;

import java.util.ArrayList;
import java.util.List;

public class RoundRobinWithList implements RoundRobin {
	private List<String> RoundRobin;
	private int Iterador = 0;

	public RoundRobinWithList() {
		RoundRobin = new ArrayList<String>();
	}

	@Override
	public void add(String nuevo) {
		// TODO Auto-generated method stub
		RoundRobin.add(nuevo);
	}

	@Override
	public void add(String[] nuevos) {
		// TODO Auto-generated method stub
		for (int i = 0; i < nuevos.length; i++) {
			RoundRobin.add(nuevos[i]);
		}
	}

	@Override
	public String del() {
		// TODO Auto-generated method stub
		String Eliminado = RoundRobin.get(0);
		RoundRobin.remove(0);
		return Eliminado;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return RoundRobin.size();
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		String retorno;
		if (Iterador == RoundRobin.size()) {
			Iterador = 0;
			retorno = RoundRobin.get(Iterador);
			return retorno;
		} else {
			retorno = RoundRobin.get(Iterador);
			Iterador++;
			return retorno;
		}

	}

	@Override
	public void resetIterator() {
		// TODO Auto-generated method stub
		Iterador = 0;
	}

	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		if (index >= RoundRobin.size()) {
			return RoundRobin.get(index % RoundRobin.size());
		} else {
			return RoundRobin.get(index);
		}
	}

}
