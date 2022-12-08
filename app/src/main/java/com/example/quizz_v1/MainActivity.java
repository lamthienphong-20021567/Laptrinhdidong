package com.example.quizz_v1;

import static com.example.quizz_v1.Check.Trangthai;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import android.content.Intent;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quizz_v1.databinding.FragmentScreen04Binding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import org.jetbrains.annotations.NonNls;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String version = getVersion();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("QUIZ");

        BottomNavigationView navigationView = findViewById(R.id.bottomNavigationView2);
        navigationView.setOnItemSelectedListener(item -> {
            if(item.getItemId()==R.id.play) {

                Navigation.findNavController(this,R.id.nav_host_fragment).navigate(R.id.screen_1);
                return true;
            }
            if(item.getItemId()==R.id.history)
            {
                Navigation.findNavController(this,R.id.nav_host_fragment).navigate(R.id.action_screen_1_to_screen_lichsu);
                return true;
            }
            return super.onOptionsItemSelected(item);
            //return true;
        });


    }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.mymenu, menu);
            return  true;
        }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String version = getVersion();
        if(item.getItemId()==R.id.feebback)
        {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT, "Ý kiến của bạn");
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"20021567@vnu.edu.vn"});
            intent.putExtra(Intent.EXTRA_SUBJECT, "Góp ý: "+version);
                startActivity(Intent.createChooser(intent,"Gửi góp ý"));
                return true;
            }
        if(item.getItemId()==R.id.info)
        {
                Navigation.findNavController(this, R.id.nav_host_fragment).navigate(R.id.screen_info);

            return true;
        }
        return super.onOptionsItemSelected(item);

    }
    public String getVersion(){
        String release = Build.VERSION.RELEASE;
        int sdk = Build.VERSION.SDK_INT;
        String version = "ANDROID SDK: "+sdk+" ("+release+")";
        return version;
    }

}