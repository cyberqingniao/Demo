package com.yisuoyanyu.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.yisuoyanyu.R;
/**
 * 叶建平
 * 2018-05-28
 *
 * 强制下载更新弹出窗口
 * */
public class UpdateDialog extends Dialog {
    private Context mContext;

    public UpdateDialog(@NonNull Context context) {
        super(context, R.style.UpdateDialog);
        init();
    }

    public UpdateDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        mContext = context;
        init();
    }

    private void init() {
        setContentView(R.layout.dialog_update);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    @Override
    public void show() {
        super.show();
        Window window = getWindow();
        WindowManager.LayoutParams params = window.getAttributes();
        params.width = ViewGroup.LayoutParams.MATCH_PARENT;
        params.height = ViewGroup.LayoutParams.MATCH_PARENT;
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setAttributes(params);
    }
}
