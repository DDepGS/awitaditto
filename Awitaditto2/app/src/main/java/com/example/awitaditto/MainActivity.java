package com.example.awitaditto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TipoUsuarioRegistro(View view) {
            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.PacienteIn:
                    if (checked)
                        // Pirates are the best
                        break;
                case R.id.EspecialistaIn:
                    if (checked)
                        // Ninjas rule
                        break;
            }
        }
}