package com.google.android.gms.common.account;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BaseAccountChipAccountPickerChimeraActivity$2 extends URLSpan {
    final /* synthetic */ Resources.Theme a;
    final /* synthetic */ int b;
    final /* synthetic */ Context c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseAccountChipAccountPickerChimeraActivity$2(String str, Resources.Theme theme, int i, Context context) {
        super(str);
        this.a = theme;
        this.b = i;
        this.c = context;
    }

    public void onClick(View view) {
        Context context = this.c;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(getURL()));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return;
        }
        Toast.makeText(context, context.getResources().getString(R.string.common_no_browser_found), 1).show();
        hzc.a.e("no handler found for credentials management url", new Object[0]);
    }

    public final void updateDrawState(TextPaint textPaint) {
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(this.b, new int[]{R.attr.common_account_link_color});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        textPaint.setColor(color);
        textPaint.setUnderlineText(false);
    }
}
