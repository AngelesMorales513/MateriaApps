package com.example.firebaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
   //declarar objetos de la vista
    EditText etxTema;
    Spinner spiCarrera, spiMateria;
    Button btnReg;
    private DatabaseReference refDiario; // referencia a la BD

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        refDiario = FirebaseDatabase.getInstance().getReference("Clase");

        etxTema = (EditText) findViewById(R.id.etxTema);
        spiCarrera = (Spinner) findViewById(R.id.spiCarrera);
        spiMateria= (Spinner) findViewById(R.id.spiMateria);
        btnReg = (Button) findViewById(R.id.btnRegistar);

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrarClase();
            }
        });
    }

    public void registrarClase(){
        String carrera = spiCarrera.getSelectedItem().toString();
        String materia = spiMateria.getSelectedItem().toString();
        String tema = etxTema.getText().toString();

        if (!TextUtils.isEmpty(tema)){
            String id = refDiario.push().getKey();
            Clase leccion = new Clase(id, carrera, materia, tema);

            refDiario.child("Lecciones").child(id).setValue(leccion);
            Toast.makeText(this, "clase registrada",
            Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Falta ingresar tema",
                    Toast.LENGTH_LONG).show();
        }
    }
}
