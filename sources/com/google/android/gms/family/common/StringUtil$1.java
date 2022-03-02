package com.google.android.gms.family.common;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StringUtil$1 extends UnderlineSpan {
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
