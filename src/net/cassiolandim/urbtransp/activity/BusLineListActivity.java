package net.cassiolandim.urbtransp.activity;

import java.util.List;

import net.cassiolandim.urbtransp.IMyApplication;
import net.cassiolandim.urbtransp.R;
import net.cassiolandim.urbtransp.adapter.ComplexBusLineRowAdapter;
import net.cassiolandim.urbtransp.entity.BusLinePojo;
import net.cassiolandim.urbtransp.service.BusLineService;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BusLineListActivity extends ListActivity {

	private EditText searchText;
	private Button searchButton;
	private List<BusLinePojo> busLines;
	
	private BusLineService busLineService;
	private IMyApplication myApplication;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.busline_list);

		myApplication = (IMyApplication) getApplication();
		busLineService = myApplication.getBusLineService();
		
		searchText = (EditText) findViewById(R.id.bus_line_search_field);
		searchButton = (Button) findViewById(R.id.bus_line_search_button);
		
		searchButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				String text = searchText.getText().toString();
				busLines = busLineService.find(text);
				setListAdapter(new ComplexBusLineRowAdapter(BusLineListActivity.this, busLines));
			}
		});
	}
}
