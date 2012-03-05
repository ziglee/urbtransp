package net.cassiolandim.urbtransp.activity;

import java.util.List;

import net.cassiolandim.urbtransp.R;
import net.cassiolandim.urbtransp.map.ListItemizedOverlay;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class ShowMapActivity extends MapActivity {
    
	private MapView mapView;
	private MapController mapController;
	
	private List<Overlay> mapOverlays;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        
        mapView = (MapView) findViewById(R.id.mapview);
        mapView.setBuiltInZoomControls(true);
        
        mapOverlays = mapView.getOverlays();
        mapController = mapView.getController();
        
        Drawable googlePin = this.getResources().getDrawable(R.drawable.flag_blue);
		ListItemizedOverlay itemizedOverlay = new ListItemizedOverlay(googlePin);
        
        GeoPoint point = new GeoPoint(-16695600,-49276500);
        OverlayItem overlayitem = new OverlayItem(point, "", "");
        itemizedOverlay.addOverlay(overlayitem);
        mapOverlays.add(itemizedOverlay);
        
		mapController.setCenter(point);
        mapController.setZoom(14);
    }

	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}
}