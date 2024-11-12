package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText nombre,precio,cantidad;
    Spinner tipo;
    ArrayList<Lacteo> lacteos=new ArrayList<>();
    ArrayList<Verdura> verduras=new ArrayList<>();
    ArrayList<Licor> licores=new ArrayList<>();
    double totalVerdura=0,totalLacteo=0,totalLicor=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tipo=findViewById(R.id.spinner);
        nombre=findViewById(R.id.edtNombre);
        precio=findViewById(R.id.edtPrecio);
        cantidad=findViewById(R.id.edtCantidad);
    }

    public void crear(View v){
        String nombreP=nombre.getText().toString();
        double precioP=Double.parseDouble(precio.getText().toString());
        int cantidadP=Integer.parseInt(cantidad.getText().toString());
        String tipoP=tipo.getSelectedItem().toString();

        if(tipoP.equals("Lacteo")){
            Lacteo producoNuevo=new Lacteo(123,nombreP,precioP,cantidadP,tipoP);
            lacteos.add(producoNuevo);
            totalLacteo+=precioP;
        }
        else if(tipoP.equals("Verdura")){
            Verdura producoNuevo=new Verdura(456,nombreP,precioP,cantidadP,tipoP);
            verduras.add(producoNuevo);
            totalVerdura+=precioP;
        }
        else{
            Licor producoNuevo=new Licor(789,nombreP,precioP,cantidadP,tipoP);
            licores.add(producoNuevo);
            totalLicor+=precioP;
        }
    }
    public void pasar(View v){
        Intent it=new Intent(getApplicationContext(), MainActivity2.class);
        it.putExtra("totalLacteo",totalLacteo);
        it.putExtra("totalVerdura",totalVerdura);
        it.putExtra("totalLicor",totalLicor);
        startActivity(it);
    }
}