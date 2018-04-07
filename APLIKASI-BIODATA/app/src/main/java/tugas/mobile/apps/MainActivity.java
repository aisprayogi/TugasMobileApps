package tugas.mobile.apps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void arnando(View view){

        Intent pindah = new Intent(MainActivity.this, BiodataArnando.class);
        startActivity(pindah);

    }

    public  void dinil(View view){

        Intent pindah = new Intent(MainActivity.this, BiodataDinil.class);
        startActivity(pindah);

    }

    public  void iqbal(View view){

        Intent pindah = new Intent(MainActivity.this, BiodataIqbal.class);
        startActivity(pindah);

    }
}
