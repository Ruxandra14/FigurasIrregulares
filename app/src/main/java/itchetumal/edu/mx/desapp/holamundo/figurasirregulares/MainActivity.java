package itchetumal.edu.mx.desapp.holamundo.figurasirregulares;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText edtX1 = (EditText)findViewById(R.id.edtX1);
    EditText edtY1 = (EditText)findViewById(R.id.edtY1);


    //guardarPuntos graficaFigura

    public void guardarPuntos(View control){
        //Intent itAct2 = new Intent(this,Actividad2.class);

        //Creamos las variables
        //EditText edtUsr = (EditText)findViewById(R.id.edtUsuario);
        //EditText edtpass = (EditText)findViewById(R.id.edtpass);

        //Creamos una condicion para poder saber si el usuario y contraseña que ingreso es correcta.
       /* if((edtUsr.getText().toString().equals("Pelusa"))&&(edtpass.getText().toString().equals("barco"))){
            //Con putExtra pasamos un parametro y luego lo que obtendremos del EditText.
            itAct2.putExtra("edtUsr",edtUsr.getText().toString());
            //Iniciamos nuestra segunda actividad.
            startActivity(itAct2);
        }*/

    }

    public void graficaFigura(View control){
        //Intent itAct2 = new Intent(this,Actividad2.class);

        //Creamos las variables
        //EditText edtUsr = (EditText)findViewById(R.id.edtUsuario);
        //EditText edtpass = (EditText)findViewById(R.id.edtpass);

        //Creamos una condicion para poder saber si el usuario y contraseña que ingreso es correcta.
       /* if((edtUsr.getText().toString().equals("Pelusa"))&&(edtpass.getText().toString().equals("barco"))){
            //Con putExtra pasamos un parametro y luego lo que obtendremos del EditText.
            itAct2.putExtra("edtUsr",edtUsr.getText().toString());
            //Iniciamos nuestra segunda actividad.
            startActivity(itAct2);
        }*/

    }


}
