package com.example.duvan.corteii;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;


import java.util.Calendar;

public class fecha extends AppCompatActivity {

    private int año;
    private int mes;
    private int dia;
    private EditText campoFecha;
    private Button Fecha;
    private static final int TIPO_DIALOGO = 0;
    private static DatePickerDialog.OnDateSetListener oyenteSelectorFecha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fecha);

         campoFecha =(EditText) findViewById(R.id.campofecha);
         Fecha =(Button) findViewById(R.id.fecha);
         Calendar calendario= Calendar.getInstance();
         dia =calendario.get(Calendar.DAY_OF_MONTH);
         mes =calendario.get(Calendar.MONTH);
         año =calendario.get(Calendar.YEAR);
        mostrarFecha();
        oyenteSelectorFecha=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int dayOfMonth, int monthOfyear, int year ) {

                dia=dayOfMonth;
                mes=monthOfyear;
                año=year;
                mostrarFecha();

            }
        };
    }

    @Override
    protected Dialog onCreateDialog(int id) {
       switch (id) {
           case 0:
               return new DatePickerDialog(this, oyenteSelectorFecha, dia, mes, año);


       }
       return null;

       }
    public void mostrarCalendario(View control){
        showDialog(TIPO_DIALOGO);
    }

    public void mostrarFecha(){
        campoFecha.setText(dia+"/"+(mes+1)+"/"+año);    }



}
