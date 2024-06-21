import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContinentFragment continentFragment = new ContinentFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer, continentFragment)
                .commit();
    }
}