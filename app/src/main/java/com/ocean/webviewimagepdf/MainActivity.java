package com.ocean.webviewimagepdf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ocean.webviewimagepdf.databinding.ActivityMainBinding;
import com.ocean.webviewimagepdf.databinding.DialogImagePdfBinding;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Dialog dialog_attach_expense_info;
    DialogImagePdfBinding dialogBinding;
    String file_name, url_string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        file_name = "07092022114344-java_tutorial.pdf";
//        file_name = "07092022114344-1662530603380.jpg";
        dialog_attach_expense_info = new Dialog(MainActivity.this);
        binding.expenseAttach.setText(file_name);
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

        String url_pdf = "https://dev-test-erp.co.in/basic/expense/panel/uploads/exp_journal/" + file_name ;
        //TODO: image view code to view image from url (PDF/Image)
        dialogBinding.webView.loadUrl(url_pdf);
        dialogBinding.webView.setWebViewClient(new WebViewClient());
        /** dialogBinding.webView.setWebViewClient(new WebViewClient(){
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
        }
        }); */
        dialogBinding.webView.getSettings().setJavaScriptEnabled(true);
//        dialogBinding.webView.loadUrl("https://dev-test-erp.co.in/basic/expense/panel/uploads/exp_journal/" + file_name);
//        dialogBinding.webView.loadUrl("https://dev-test-erp.co.in/basic/expense/panel/uploads/exp_journal/" + file_name);

        dialogBinding.btnCloseDialog.setOnClickListener(v -> {
            dialog_attach_expense_info.dismiss();
        });
        dialogBinding.btnDownloadDialog.setOnClickListener(v -> {
            //TODO: download event

        });

        dialog_attach_expense_info.show();
    }
}