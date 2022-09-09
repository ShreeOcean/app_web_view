package com.ocean.webviewimagepdf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ViewGroup;

import com.ocean.webviewimagepdf.databinding.ActivityMainBinding;
import com.ocean.webviewimagepdf.databinding.DialogImagePdfBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Dialog dialog_attach_expense_info;
    DialogImagePdfBinding dialogBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        dialog_attach_expense_info = new Dialog(MainActivity.this);
        binding.expenseAttach.setOnClickListener(v -> {
            openDialogShowDownloadImagePDF();
        });
    }

    private void openDialogShowDownloadImagePDF() {

        dialogBinding = DialogImagePdfBinding.inflate(getLayoutInflater());


        dialog_attach_expense_info.setContentView(dialogBinding.getRoot());
        dialog_attach_expense_info.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog_attach_expense_info.setCancelable(false);
        dialog_attach_expense_info.getWindow().getAttributes().windowAnimations = R.style.animation;
        // set background transparent
        dialog_attach_expense_info.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //TODO: image view code to view image from url (PDF/Image)

        dialogBinding.btnCloseDialog.setOnClickListener(v -> {
            dialog_attach_expense_info.dismiss();
        });
        dialogBinding.btnDownloadDialog.setOnClickListener(v -> {
            //TODO: download event
        });

        dialog_attach_expense_info.show();
    }
}