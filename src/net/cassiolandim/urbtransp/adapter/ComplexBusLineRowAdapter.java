package net.cassiolandim.urbtransp.adapter;

import java.util.List;

import net.cassiolandim.urbtransp.R;
import net.cassiolandim.urbtransp.service.BusLineService;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ComplexBusLineRowAdapter extends ArrayAdapter<String> {

	private BusLineService busLineService;
	private Activity context;
	private List<String> busLines;
	
	public ComplexBusLineRowAdapter(Activity context, List<String> busLines, BusLineService busLineService) {
		super(context, R.layout.complex_row, busLines);
		this.context = context;
		this.busLines = busLines;
		this.busLineService = busLineService;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;

		if (row == null) {
			LayoutInflater inflater = context.getLayoutInflater();
			row = inflater.inflate(R.layout.complex_row, null);
		}
		
		String busLine = busLines.get(position);
		
		TextView label = (TextView) row.findViewById(R.id.text1);
		label.setText(busLine);

		return (row);
	}
	
	@Override
	public long getItemId(int position) {
		return position;
	}
}