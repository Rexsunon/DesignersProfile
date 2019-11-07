package com.rexindustries.designerprofile.fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.rexindustries.designerprofile.R;
import com.rexindustries.designerprofile.adapter.ProjectsAdapter;
import com.rexindustries.designerprofile.model.Project;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    private CircleImageView imageView;
    private RecyclerView projectsRecycler;
    private ProjectsAdapter adapter;

    private Context context;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        this.context = context;
    }

    public ProfileFragment() {
        // Required empty public constructor
    }

    public static ProfileFragment newInstance() {
        Bundle args = new Bundle();

        ProfileFragment profileFragment = new ProfileFragment();
        profileFragment.setArguments(args);

        return profileFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setProjectsRecycler(view);
        setImageView(view);
    }

    private void setImageView(View view) {
        imageView = view.findViewById(R.id.user_dp);

//        imageView.setImageResource(R.drawable.profile_pic);
        Glide.with(context)
                .load(R.drawable.profile_pic)
                .into(imageView);
    }

    private void setProjectsRecycler(View view) {
        projectsRecycler = view.findViewById(R.id.user_projects);

        GridLayoutManager manager = new GridLayoutManager(context, 2);
        projectsRecycler.setLayoutManager(manager);

        List<Project> projectList = new ArrayList<>();

        projectList.add(new Project(R.drawable.images1));
        projectList.add(new Project(R.drawable.images2));
        projectList.add(new Project(R.drawable.images3));
        projectList.add(new Project(R.drawable.images4));
        projectList.add(new Project(R.drawable.images6));
        projectList.add(new Project(R.drawable.images7));
        projectList.add(new Project(R.drawable.images8));
        projectList.add(new Project(R.drawable.images9));
        projectList.add(new Project(R.drawable.images10));

        adapter = new ProjectsAdapter(context, projectList);
        projectsRecycler.setAdapter(adapter);

    }
}
