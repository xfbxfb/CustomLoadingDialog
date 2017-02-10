package com.example.fengbin.customloadingdialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import util.LoadingDialogUtil;

public class MainActivity extends Activity {

    private Dialog loadingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 动态注入
        loadingDialog = LoadingDialogUtil.initLoadingDialogAt(this);

        findViewById(R.id.btn_on).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadingDialog.show();
            }
        });

        findViewById(R.id.btn_off).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadingDialog.dismiss();
            }
        });
    }

}
