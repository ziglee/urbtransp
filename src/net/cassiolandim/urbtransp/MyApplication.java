package net.cassiolandim.urbtransp;

import net.cassiolandim.urbtransp.service.BusLineService;
import net.cassiolandim.urbtransp.service.BusLineWebService;
import android.app.Application;

public class MyApplication extends Application implements IMyApplication {

	private BusLineService busLineService;
	
	@Override
    public void onCreate() {
		super.onCreate();
		
		if (busLineService == null) {
			busLineService = new BusLineWebService();
		}
	}

	@Override
	public BusLineService getBusLineService() {
		return busLineService;
	}
}
