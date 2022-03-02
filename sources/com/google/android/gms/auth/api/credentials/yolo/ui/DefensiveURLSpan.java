package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.content.ActivityNotFoundException;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DefensiveURLSpan extends URLSpan {
    private boolean a;

    public DefensiveURLSpan(String str, boolean z) {
        super(str);
        this.a = z;
    }

    public void onClick(View view) {
        try {
            super.onClick(view);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(view.getContext(), view.getResources().getString(R.string.common_no_browser_found), 1).show();
            Log.e("CredentialsApi", "Cannot find the activity.", e);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.a);
    }
}
