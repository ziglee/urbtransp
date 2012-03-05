package net.cassiolandim.urbtransp.activity;

import net.cassiolandim.urbtransp.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }
    
    public void favoritosButtonOnClick(View view) {
    	startActivity(new Intent(this, ShowMapActivity.class));
    }
    
    public void mapaButtonOnClick(View view) {
    	startActivity(new Intent(this, ShowMapActivity.class));
    }
    
    public void buscaButtonOnClick(View view) {
    	startActivity(new Intent(this, BusLineListActivity.class));
    }
}