package util;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.fengbin.customloadingdialog.R;

/**
 * Created by fengbin on 2017/2/10.
 */

public class LoadingDialogUtil {

    public static Dialog initLoadingDialogAt(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.view_loading_dialog, null);
        RelativeLayout rl = (RelativeLayout) view.findViewById(R.id.loading_dialog);
        Dialog loadingDialog = new Dialog(context, R.style.LoadingDialog);           //可自定制style
        loadingDialog.setCancelable(true);                                          //设置不可取消
        loadingDialog.setContentView(rl,
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT));
        return loadingDialog;
    }

}
