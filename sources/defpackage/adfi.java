package defpackage;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;

/* renamed from: adfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adfi implements LineHeightSpan {
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Spanned spanned = (Spanned) charSequence;
        if (i == spanned.getSpanStart(this) && i != 0) {
            double d = (double) fontMetricsInt.ascent;
            Double.isNaN(d);
            int round = (int) Math.round(d * 1.25d);
            fontMetricsInt.ascent = Math.min(fontMetricsInt.ascent, round);
            fontMetricsInt.top = Math.min(fontMetricsInt.top, round);
        }
        if (i2 == spanned.getSpanEnd(this) && i2 != charSequence.length()) {
            double d2 = (double) fontMetricsInt.descent;
            Double.isNaN(d2);
            int round2 = (int) Math.round(d2 * 1.25d);
            fontMetricsInt.descent = Math.max(fontMetricsInt.descent, round2);
            fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, round2);
        }
    }
}
