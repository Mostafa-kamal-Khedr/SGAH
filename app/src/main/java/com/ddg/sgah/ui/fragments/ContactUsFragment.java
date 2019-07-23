package com.ddg.sgah.ui.fragments;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.ddg.sgah.R;
import com.ddg.sgah.helper.HideKeyBoard;
import com.ddg.sgah.helper.Validation;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.ddg.sgah.ui.activity.BaseActivity.navigationView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactUsFragment extends Fragment {


    @BindView(R.id.edt_contactUs_emailFrom)
    TextView edtContactUsEmailFrom;
    @BindView(R.id.edt_contactUs_email)
    EditText edtContactUsEmail;
    @BindView(R.id.edt_contactUs_subject)
    EditText edtContactUsSubject;
    @BindView(R.id.edt_contactUs_message)
    EditText edtContactUsMessage;
    @BindView(R.id.btn_contactUs_send)
    Button btnContactUsSend;
    @BindView(R.id.appbar_title)
    TextView appbarTitle;
    @BindView(R.id.iv_back)
    ImageView ivBack;
    private Validation validation;

    public ContactUsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_contact_us, container, false);

        ButterKnife.bind(this, inflate);
        navigationView.getMenu().findItem(R.id.nav_contactUs).setChecked(true);

        inflateAppBar(inflate);
        onBackPress();
        init();
        contactUsSend();
        return inflate;
    }

    public void onBackPress() {
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();

            }
        });
    }

    // components initial value
    private void init() {
        validation = new Validation(getActivity());


    }

    // delete android app bar and create custom one
    private void inflateAppBar(View inflate) {

        TextView appbarTitle = inflate.findViewById(R.id.appbar_title);
        appbarTitle.setText(R.string.contactUs);
    }

    public void contactUsSend() {
        btnContactUsSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validation();

            }
        });

    }

    // input validation
    public void validation() {


        if ((validation.setEmptyValidation(edtContactUsEmail)) &&
                (validation.setEmptyValidation(edtContactUsSubject)) &&
                (validation.setEmptyValidation(edtContactUsMessage))) {
            HideKeyBoard.hideSoftKeyboard(getActivity());
            sendEmail();
        }


    }

    // set email setting and open g-mail
    private void sendEmail() {

        Intent send = new Intent(Intent.ACTION_SENDTO);

        String uriText = "mailto:" + Uri.encode("project.sgah.2019@gmail.com") +
                "?subject=" + Uri.encode(edtContactUsSubject.getText().toString()) +
                "&body=" + Uri.encode(edtContactUsMessage.getText().toString());
        Uri uri = Uri.parse(uriText);

        send.setData(uri);
        startActivity(Intent.createChooser(send, "Send mail..."));
    }


}
