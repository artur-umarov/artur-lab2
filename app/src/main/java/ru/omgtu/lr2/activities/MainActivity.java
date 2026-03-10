package ru.omgtu.lr2.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import ru.omgtu.lr2.R;
import ru.omgtu.lr2.fragments.FirstFragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new FirstFragment())
                    .commit();
        }
    }
}