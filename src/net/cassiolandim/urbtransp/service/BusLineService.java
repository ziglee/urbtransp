package net.cassiolandim.urbtransp.service;

import java.util.List;

import net.cassiolandim.urbtransp.entity.BusLinePojo;

public interface BusLineService {

	List<BusLinePojo> find(String query);
}
