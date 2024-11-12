package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    TextView lacteo,verdura,licor,total;
    double lacteoP,verduraP,licorP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lacteo=findViewById(R.id.txvLacteo);
        verdura=findViewById(R.id.txvVerdura);
        licor=findViewById(R.id.txvLicor);
        total=findViewById(R.id.txvtotal);
        lacteoP=getIntent().getDoubleExtra("totalLacteo",0);
        verduraP=getIntent().getDoubleExtra("totalVerdura",0);
        licorP=getIntent().getDoubleExtra("totalLicor",0);
        lacteo.setText("Lacteos "+lacteoP+" Bs.");
        verdura.setText("Verduras "+verduraP+" Bs.");
        licor.setText("Licor "+licorP+" Bs.");
        double totalT=lacteoP+verduraP+licorP;

        if(totalT>1000){
            totalT-=20;
        }
        else if(totalT>200)
            totalT-=12;
        else if(totalT>100)
            totalT-=5;

        total.setText("Monto Total "+totalT+" Bs.");
    }
}