package com.google.android.gms.identity.common.ui.util;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UiTextUtil$1 extends URLSpan {
    final /* synthetic */ Resources.Theme a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ View.OnClickListener d;
    final /* synthetic */ Context e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UiTextUtil$1(String str, Resources.Theme theme, int i, int i2, View.OnClickListener onClickListener, Context context) {
        super(str);
        this.a = theme;
        this.b = i;
        this.c = i2;
        this.d = onClickListener;
        this.e = context;
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.d;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        qcn.a(this.e, getURL());
    }

    public final void updateDrawState(TextPaint textPaint) {
        Resources.Theme theme = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = qcn.a;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, new int[]{i2});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        textPaint.setColor(color);
        textPaint.setUnderlineText(false);
    }
}
