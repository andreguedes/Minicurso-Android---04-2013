package br.com.fatecgarca.minicursoandroid;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class PrincipalActivity extends Activity implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		View bh = findViewById(R.id.btnBH);
		bh.setOnClickListener(this);
		
		View ct = findViewById(R.id.btnCT);
		ct.setOnClickListener(this);
		
		View pa = findViewById(R.id.btnPA);
		pa.setOnClickListener(this);
		
		View re = findViewById(R.id.btnRE);
		re.setOnClickListener(this);
		
		View rj = findViewById(R.id.btnRJ);
		rj.setOnClickListener(this);
		
		View sa = findViewById(R.id.btnSA);
		sa.setOnClickListener(this);
		
		View sp = findViewById(R.id.btnSP);
		sp.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.btnSP){
			Intent sp = new Intent(this, Sao_Paulo.class);
			startActivity(sp);
		}else
			if(v.getId() == R.id.btnSA){
				Intent sa = new Intent(this, Salvador.class);
				startActivity(sa);
			}else
				if(v.getId() == R.id.btnRJ){
					Intent rj = new Intent(this, Rio.class);
					startActivity(rj);
				}else
					if(v.getId() == R.id.btnRE){
						Intent re = new Intent(this, Recife.class);
						startActivity(re);
					}else
						if(v.getId() == R.id.btnPA){
							Intent pa = new Intent(this, Porto_Alegre.class);
							startActivity(pa);
						}else
							if(v.getId() == R.id.btnCT){
								Intent ct = new Intent(this, Curitiba.class);
								startActivity(ct);
							}else
								if(v.getId() == R.id.btnBH){
									Intent bh = new Intent(this, Belo_Horizonte.class);
									startActivity(bh);
								}
	}

}
