package com.rexindustries.designerprofile.fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.rexindustries.designerprofile.R;
import com.rexindustries.designerprofile.util.Manager;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserProfileImage extends Fragment {

    private ImageButton profileBtn;

    private Context context;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    public UserProfileImage() {
        // Required empty public constructor
    }

    public static UserProfileImage newInstance() {
        Bundle args = new Bundle();

        UserProfileImage profileImage= new UserProfileImage();
        profileImage.setArguments(args);

        return profileImage;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_profile_image, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        openProfileView(view);
    }

    private void openProfileView(View view) {
        profileBtn = view.findViewById(R.id.profile_btn);

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Manager().fragmentManager(context, new ProfileFragment());
            }
        });
    }
}
