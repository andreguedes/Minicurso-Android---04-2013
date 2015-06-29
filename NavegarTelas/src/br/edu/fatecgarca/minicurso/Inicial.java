package br.edu.fatecgarca.minicurso;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Inicial extends Activity implements OnClickListener{

	Button btnReceita;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inicial);
		
		btnReceita = (Button)findViewById(R.id.btnReceitas);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inicial, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.btnReceitas){
			Toast.makeText(this, "Entrou", Toast.LENGTH_SHORT).show();
			Intent receita = new Intent(this, Receita.class);
			startActivity(receita);
		}
	}

}
