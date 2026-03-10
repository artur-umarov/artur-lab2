package ru.omgtu.lr2.activities;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import ru.omgtu.lr2.fragments.BaseFragment;

import ru.omgtu.lr2.R;
import ru.omgtu.lr2.fragments.FirstFragment;

public class MainActivity extends AppCompatActivity implements BaseFragment.OnFragmentInteractionListener {

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

    @Override
    public void onButtonPressed(int buttonId) {
        switch (buttonId) {
            case 1:
                Toast.makeText(this, "Хотим открыть второй экран", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "Хотим показать Toast", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}