package net.cassiolandim.urbtransp.service;

import java.util.ArrayList;
import java.util.List;

import net.cassiolandim.urbtransp.entity.BusLinePojo;

public class BusLineWebService implements BusLineService {

	private static final List<BusLinePojo> list = new ArrayList<BusLinePojo>();
	
	static {
		list.add(new BusLinePojo("Circular sentido Horário", "900"));
		list.add(new BusLinePojo("Circular sentido Anti-Horário", "901"));
		list.add(new BusLinePojo("Parque Atheneu / Praça Universitária / Praça Cívica", "905"));
		list.add(new BusLinePojo("Cj. Cruzeiro do Sul / Av. 85 / Praça Universitária", "906"));
		list.add(new BusLinePojo("Garavelo / Av. T-63 / Praça Universitária", "907"));
		list.add(new BusLinePojo("Garavelo / Avenida T 9 / Praça Universitária", "908"));
		list.add(new BusLinePojo("Res. Eldorado / Av. T-7 / Praça Universitária", "909"));
		list.add(new BusLinePojo("Aeroporto / Pça. Universitária / Pça. Cívica", "913"));
		list.add(new BusLinePojo("Campus UFG / Praça Universitária / Praça Cívica", "914"));
		list.add(new BusLinePojo("Nova Esperança / Av. Bernardo Sayão / Praça Universitária", "917"));
	}
	
	@Override
	public List<BusLinePojo> find(String query) {
		return list;
	}
}
