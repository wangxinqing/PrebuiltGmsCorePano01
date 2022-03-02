package defpackage;

import android.text.Spannable;

/* renamed from: alit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alit {
    public static void a(Spannable spannable, Object obj, Object... objArr) {
        int spanStart = spannable.getSpanStart(obj);
        int spanEnd = spannable.getSpanEnd(obj);
        spannable.removeSpan(obj);
        for (Object span : objArr) {
            spannable.setSpan(span, spanStart, spanEnd, 0);
        }
    }
}
