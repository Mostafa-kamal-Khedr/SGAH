package com.ddg.sgah.helper;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.widget.Toast;

import com.ddg.sgah.R;


/**
 * Created by mostafa kamal khedr on 06,July,2019
 */
public class HelperClass {
    private static final int ERROR_DIALOG_REQUEST = 9001;
    public void downLoad(String url,Activity activity) {
        DownloadManager downloadmanager = (DownloadManager) activity.getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse(url);

        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setTitle("My File");
        request.setDescription("Downloading");
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setVisibleInDownloadsUi(false);
//            request.setDestinationUri(Uri.parse("file://" + folderName + "/myfile.mp3"));

        downloadmanager.enqueue(request);

        Toast.makeText(activity, activity.getString(R.string.downLoad), Toast.LENGTH_LONG).show();
    }
}
