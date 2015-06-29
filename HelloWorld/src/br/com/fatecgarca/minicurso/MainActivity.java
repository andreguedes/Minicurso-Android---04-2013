package br.com.fatecgarca.minicurso;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) { //metodo de criação
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main); //metodo que usa como parametro o layout para exibir
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
