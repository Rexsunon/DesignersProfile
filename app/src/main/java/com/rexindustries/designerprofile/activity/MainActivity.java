package com.rexindustries.designerprofile.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.rexindustries.designerprofile.util.Manager;
import com.rexindustries.designerprofile.R;
import com.rexindustries.designerprofile.fragment.UserProfileImage;

public class MainActivity extends AppCompatActivity {

//    private UserProfileImage profileImage = UserProfileImage.newInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager(new UserProfileImage());

    }

    private void fragmentManager(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.main_fragment_container, fragment)
                .addToBackStack(fragment.toString())
                .commit();
    }

}
