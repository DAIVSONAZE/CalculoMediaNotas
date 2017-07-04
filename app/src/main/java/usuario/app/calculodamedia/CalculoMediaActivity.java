package usuario.app.calculodamedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.*;
import android.widget.*;
import android.view.*;

public class CalculoMediaActivity extends AppCompatActivity {

    EditText NotaUm, NotaDois;
    Button btnCalcularMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_media);

        NotaUm = (EditText) findViewById(R.id.ednotaum);
        NotaDois= (EditText) findViewById(R.id.ednotadois);

        btnCalcularMedia = (Button) findViewById(R.id.buttonmedia);

        btnCalcularMedia.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0){

               double Nota1 = Double.parseDouble(NotaUm.getText().toString());
                double Nota2 = Double.parseDouble(NotaDois.getText().toString());

                double media = (Nota1 + Nota2)/2;

                AlertDialog.Builder dialogoCalcMedia = new AlertDialog.Builder(CalculoMediaActivity.this);
                dialogoCalcMedia.setTitle("Calculo da Média");
                dialogoCalcMedia.setMessage("A média será " + media);
                dialogoCalcMedia.setNeutralButton("OK" , null);
                dialogoCalcMedia.show();



            }

        });
    }
}
