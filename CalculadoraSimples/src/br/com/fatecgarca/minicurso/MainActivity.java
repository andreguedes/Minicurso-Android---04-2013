package br.com.fatecgarca.minicurso;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener, OnCheckedChangeListener{

	EditText primeiroValor, segundoValor;
	RadioGroup operacao;
	Button calcula, limpa;
	TextView resultado;
	String operacaoSelecionada = "add";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		primeiroValor = (EditText)findViewById(R.id.valor1);
		segundoValor = (EditText)findViewById(R.id.valor2);
		operacao = (RadioGroup)findViewById(R.id.rgOperacao);
		calcula = (Button)findViewById(R.id.btnCalcular);
		limpa = (Button)findViewById(R.id.btnLimpar);
		resultado = (TextView)findViewById(R.id.txtResultado);
		
		calcula.setOnClickListener(this);
		operacao.setOnCheckedChangeListener(this);
		limpa.setOnClickListener(this);
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
		if(v.getId() == R.id.btnCalcular){
			calculaValor();
		}else
			if(v.getId() == R.id.btnLimpar){
				limpar();
			}
	}
	
	private void calculaValor(){

		if(primeiroValor.getText().toString().equals("")){
			Toast.makeText(this, "Digite o primeiro valor!", Toast.LENGTH_SHORT).show();
		}else
			if(segundoValor.getText().toString().equals("")){
				Toast.makeText(this, "Digite o segundo valor!", Toast.LENGTH_SHORT).show();
			}else
			{
				double valor1 = Double.parseDouble(primeiroValor.getText().toString());
				double valor2 = Double.parseDouble(segundoValor.getText().toString());
				
				
				double resultadoConta = 0;
				if(operacaoSelecionada.equals("add")){
					resultadoConta = valor1 + valor2;
				}else
					if(operacaoSelecionada.equals("sub")){
						resultadoConta = valor1 - valor2;
					}else
						if(operacaoSelecionada.equals("mul")){
							resultadoConta = valor1 * valor2;
						}else
							if(operacaoSelecionada.equals("div")){
								resultadoConta = valor1 / valor2;
							}else
								if(operacaoSelecionada.equals("por")){
									resultadoConta = (valor1 *  100) / valor2;
								}
				
				if(operacaoSelecionada.equals("por")){
					resultado.setText(String.valueOf(resultadoConta) + " %");
				}else{
					resultado.setText(String.valueOf(resultadoConta));
				}
		}
		
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		switch(checkedId){
		case R.id.radio_soma:
			operacaoSelecionada = "add";
			break;
		case R.id.radio_subtracao:
			operacaoSelecionada = "sub";
			break;
		case R.id.radio_multi:
			operacaoSelecionada = "mul";
			break;
		case R.id.radio_divisao:
			operacaoSelecionada = "div";
			break;
		case R.id.radio_porcent:
			operacaoSelecionada = "por";
			break;
		default:
			break;
		}
	}
	
	private void limpar() {
        primeiroValor.setText("");
        segundoValor.setText("");
        resultado.setText("0");
        primeiroValor.requestFocus();
    }

}
