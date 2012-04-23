package net.cassiolandim.urbtransp.adapter;

import java.util.List;

import net.cassiolandim.urbtransp.R;
import net.cassiolandim.urbtransp.entity.BusLinePojo;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ComplexBusLineRowAdapter extends ArrayAdapter<BusLinePojo> {

	private LayoutInflater mInflater;
	
	public ComplexBusLineRowAdapter(Activity context, List<BusLinePojo> busLines) {
		super(context, R.layout.complex_row, busLines);
		this.mInflater = LayoutInflater.from(context);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		
		Holder holder = null;
		if (null == convertView) {
			row = mInflater.inflate(R.layout.complex_row, null);
			holder = new Holder(row);
			row.setTag(holder);
		} else {
			holder = (Holder) row.getTag();
		}

		holder.populateFrom(getItem(position));		
		
		return row;
	}
	
	private class Holder {
		
		private TextView name;
		private TextView code;
		
		Holder (View view) {
			name = (TextView) view.findViewById(R.id.name);
			code = (TextView) view.findViewById(R.id.code);
		}
		
		void populateFrom(BusLinePojo pojo) {
			name.setText(pojo.name);
			code.setText(pojo.code);
		}
	}
}