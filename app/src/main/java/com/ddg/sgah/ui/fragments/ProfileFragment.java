package com.ddg.sgah.ui.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ddg.sgah.R;
import com.ddg.sgah.helper.SharedPreferenceManager;
import com.ddg.sgah.ui.activity.LoginActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    @BindView(R.id.tv_mycoursesTitle)
    TextView tvMycoursesTitle;
    @BindView(R.id.imageView)
    CircleImageView imageView;
    @BindView(R.id.tv_profile_userName)
    TextView tvProfileUserName;
    @BindView(R.id.tv_profile_userSpecials)
    TextView tvProfileUserSpecials;
    @BindView(R.id.email_hint)
    TextView emailHint;
    @BindView(R.id.tv_email)
    TextView tvEmail;
    @BindView(R.id.gender_hint)
    TextView genderHint;
    @BindView(R.id.tv_gender)
    TextView tvGender;
    @BindView(R.id.birthdate_hint)
    TextView birthdateHint;
    @BindView(R.id.tv_birthDate)
    TextView tvBirthDate;
    @BindView(R.id.joinDate_hint)
    TextView joinDateHint;
    @BindView(R.id.tv_joinDate)
    TextView tvJoinDate;
    @BindView(R.id.logOut)
    TextView logOut;
    private SharedPreferenceManager sharedPreferenceManager;


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View inflate = inflater.inflate(R.layout.fragment_profile, container, false);
        ButterKnife.bind(this, inflate);

        sharedPreferenceManager = new SharedPreferenceManager(getActivity());
        setUserSession(sharedPreferenceManager);
        return inflate;
    }

    private void setUserSession(SharedPreferenceManager sharedPreferenceManager) {

        if (sharedPreferenceManager.loadUserName().equals("nouf")) {
            tvProfileUserName.setText("Nouf Al Rashed");
            tvProfileUserSpecials.setText("Electronics-Computer");
            tvEmail.setText("nouf.sgah.2019@gmail.com");
            tvBirthDate.setText("15/6/1995");
            tvJoinDate.setText("1/9/2015");

        }


    }




    @OnClick(R.id.logOut)
    public void onViewClicked() {
sharedPreferenceManager.removeUserSession();
getActivity().startActivity(new Intent(getActivity(), LoginActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
getActivity().finish();
    }
}
