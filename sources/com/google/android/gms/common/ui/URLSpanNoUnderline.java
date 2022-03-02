package com.google.android.gms.common.ui;

import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class URLSpanNoUnderline extends URLSpan {
    public URLSpanNoUnderline(String str) {
        super(str);
    }

    public static Spannable a(Spanned spanned) {
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(spanned);
        for (URLSpan uRLSpan : (URLSpan[]) newSpannable.getSpans(0, newSpannable.length(), URLSpan.class)) {
            int spanStart = newSpannable.getSpanStart(uRLSpan);
            int spanEnd = newSpannable.getSpanEnd(uRLSpan);
            newSpannable.removeSpan(uRLSpan);
            newSpannable.setSpan(new URLSpanNoUnderline(uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        return newSpannable;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
