package com.ddg.sgah.helper;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;

import com.ddg.sgah.R;
import com.github.barteksc.pdfviewer.PDFView;


/**
 * Created by mostafa kamal khedr on 16,September,2018
 */
public class FileDialog {


//    private static ProgressBar progressBar;

    public static void viewPdf(Activity context, String assetsName) {

        final Dialog dialog = new Dialog(context, android.R.style.Theme_Light);


        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.open_file);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


        /*____________________Inflate Layout___________________________*/

        PDFView pdfView = dialog.findViewById(R.id.pdfView);


        pdfView.fromAsset(assetsName).load();

        dialog.show();

    }


}
