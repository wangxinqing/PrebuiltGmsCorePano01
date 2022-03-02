package com.google.android.gms.contactsheet;

import android.text.TextPaint;
import android.text.style.URLSpan;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SmartProfileUtil$1 extends URLSpan {
    final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmartProfileUtil$1(String str, int i) {
        super(str);
        this.a = i;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        int i = this.a;
        if (i != -1) {
            textPaint.setColor(i);
        }
    }
}
