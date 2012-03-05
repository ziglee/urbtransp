package net.cassiolandim.urbtransp.activity;

import java.util.List;

import net.cassiolandim.urbtransp.IMyApplication;
import net.cassiolandim.urbtransp.R;
import net.cassiolandim.urbtransp.adapter.ComplexBusLineRowAdapter;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BusLineListActivity extends ListActivity {

	private EditText searchText;
	private List<String> busLines;
	private Button searchButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.busline_list);
		
		searchText = (EditText) findViewById(R.id.bus_line_search_field);
		searchButton = (Button) findViewById(R.id.bus_line_search_button);
		
		searchButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				String text = searchText.getText().toString();
				IMyApplication myApplication = (IMyApplication) getApplication();
				busLines = myApplication.getBusLineService().findAll();
				refreshList();
			}
		});
	}
	
	private void refreshList() {
		IMyApplication myApplication = (IMyApplication) getApplication();
		getListView().setAdapter(new ComplexBusLineRowAdapter(this, busLines, myApplication.getBusLineService()));
	}
}
