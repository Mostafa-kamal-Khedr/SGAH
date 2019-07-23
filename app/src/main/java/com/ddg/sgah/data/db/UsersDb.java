package com.ddg.sgah.data.db;

import android.content.Context;
import android.content.SharedPreferences;

import com.ddg.sgah.data.model.Users;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mostafa khedr on 16,يوليو,2019
 */
public class UsersDb {

    public static String userName;

    public static void setUserName(String userName) {
        UsersDb.userName = userName;
    }

    //                     maryam
    private static final String MARYAM_USERNAME = "maryam_username";
    private static final String MARYAM_IMAGE = "maryam_profileImage";
    private static final String MARYAM_PASSWORD = "maryam_password";
    private static final String MARYAM_EMAIL = "maryamEmail";
    private static final String MARYAM_SPE = "maryam_spe";

    //    _____________nouf__
    private static final String NOUF_USERNAME = "nouf_username";
    private static final String NOUF_IMAGE = "nouf_profileImage";
    private static final String NOUF_PASSWORD = "nouf_password";
    private static final String NOUF_EMAIL = "nouf_Email";
    private static final String NOUF_SPE = "nouf__spe";

    //    _____________admin
    private static final String ADMIN_USERNAME = "admin_username";
    private static final String ADMIN_IMAGE = "admin_profileImage";
    private static final String ADMIN_PASSWORD = "admin_password";
    private static final String ADMIN_EMAIL = "admin_Email";
    private static final String ADMIN_SPE = "admin_spe";

    //    _____________user
    private static final String USER_USERNAME = "user_username";
    private static final String USER_IMAGE = "user_profileImage";
    private static final String USER_PASSWORD = "user_password";
    private static final String USER_EMAIL = "user_Email";
    private static final String USER_SPE = "user_spe";


    public static String PREFS = "PREFS";

    public static SharedPreferences sharedPreferences;
    Context context;
    private static List<Users> usersList;

    public UsersDb(Context context) {
        this.context = context;

        sharedPreferences = context.getSharedPreferences(UsersDb.PREFS, context.MODE_PRIVATE);
    }

    public void saveMaryamImage(String image) {
        SharedPreferences.Editor myEditor = sharedPreferences.edit();
        myEditor.putString(MARYAM_IMAGE, image);
        myEditor.apply();
    }

    public String loadMaryamImage() {
        return sharedPreferences.getString(MARYAM_IMAGE, null);
    }


    public void saveMaryamData() {
        SharedPreferences.Editor myEditor = sharedPreferences.edit();
        myEditor.putString(MARYAM_USERNAME, "Maryam Al Raoumi");
        myEditor.putString(MARYAM_PASSWORD, "maryam12345600");
        myEditor.putString(MARYAM_EMAIL, "maryam.sgah.2019@gmail.com");
        myEditor.putString(MARYAM_SPE, "Electronics-Communication");
        myEditor.apply();
    }

    public Users loadMaryamData() {

        return new Users(sharedPreferences.getString(MARYAM_USERNAME, null),
                sharedPreferences.getString(MARYAM_PASSWORD, null),
                sharedPreferences.getString(MARYAM_EMAIL, null),
                sharedPreferences.getString(MARYAM_SPE, null));
    }


    //    _____________ Nouf_____________________
    public void saveNoufImage(String image) {
        SharedPreferences.Editor myEditor = sharedPreferences.edit();
        myEditor.putString(NOUF_IMAGE, image);
        myEditor.apply();
    }

    public String loadNoufImage() {
        return sharedPreferences.getString(NOUF_IMAGE, null);
    }


    public void saveNoufData() {
        SharedPreferences.Editor myEditor = sharedPreferences.edit();
        myEditor.putString(NOUF_USERNAME, "Nouf Al Rashed");
        myEditor.putString(NOUF_PASSWORD, "nouf12345600");
        myEditor.putString(NOUF_EMAIL, "nouf.sgah.2019@gmail.com");
        myEditor.putString(NOUF_SPE, "Electronics-Computer");
        myEditor.apply();
    }

    public Users loadNoufData() {

        return new Users(sharedPreferences.getString(NOUF_USERNAME, null),
                sharedPreferences.getString(NOUF_PASSWORD, null),
                sharedPreferences.getString(NOUF_EMAIL, null),
                sharedPreferences.getString(NOUF_SPE, null));
    }//


    //  _____________ Admin_____________________

    public void saveAdminImage(String image) {
        SharedPreferences.Editor myEditor = sharedPreferences.edit();
        myEditor.putString(ADMIN_IMAGE, image);
        myEditor.apply();
    }

    public String loadAdminImage() {
        return sharedPreferences.getString(ADMIN_IMAGE, null);
    }


    public void saveAdminData() {
        SharedPreferences.Editor myEditor = sharedPreferences.edit();
        myEditor.putString(ADMIN_USERNAME, "Admin");
        myEditor.putString(ADMIN_PASSWORD, "sgah12345600");
        myEditor.putString(ADMIN_EMAIL, "admin.sgah.2019@gmail.com");
        myEditor.apply();
    }

    public Users loadAdminData() {

        return new Users(sharedPreferences.getString(ADMIN_USERNAME, null),
                sharedPreferences.getString(ADMIN_PASSWORD, null),
                sharedPreferences.getString(ADMIN_EMAIL, null),
                sharedPreferences.getString(ADMIN_EMAIL, null));
    }//    _____________ User_____________________

    public void saveUserImage(String image) {
        SharedPreferences.Editor myEditor = sharedPreferences.edit();
        myEditor.putString(USER_IMAGE, image);
        myEditor.apply();
    }

    public String loadUserImage() {
        return sharedPreferences.getString(MARYAM_IMAGE, null);
    }


    public void saveUserData(Users users) {
        SharedPreferences.Editor myEditor = sharedPreferences.edit();
        myEditor.putString(USER_USERNAME, users.getUserName());
        myEditor.putString(USER_PASSWORD, users.getPassword());
        myEditor.putString(USER_EMAIL, users.getEmail());
        myEditor.putString(USER_SPE, users.getSpecializations());
        myEditor.apply();
    }

    public Users loadUserData() {

        return new Users(sharedPreferences.getString(USER_USERNAME, null),
                sharedPreferences.getString(USER_PASSWORD, null),
                sharedPreferences.getString(USER_EMAIL, null),
                sharedPreferences.getString(USER_SPE, null));
    }


    public static void saveUserName(Users users) {


        usersList.add(users);

    }

    public static List<Users> getUserName() {
        usersList = new ArrayList<>();

        usersList.add(new Users("admin.sgah.2019@gmail.com", "sgah12345600"));
        usersList.add(new Users("nouf.sgah.2019@gmail.com", "nouf12345600"));
        usersList.add(new Users("maryam.sgah.2019@gmail.com", "maryam12345600"));
        return usersList;
    }
}

