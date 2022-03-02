package com.google.android.gms.plus.sharebox;

import android.text.TextPaint;
import android.text.style.URLSpan;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MentionSpan extends URLSpan {
    public MentionSpan(URLSpan uRLSpan) {
        super(uRLSpan.getURL());
        if (!a(uRLSpan)) {
            throw new IllegalArgumentException(uRLSpan.getURL());
        }
    }

    public static boolean a(URLSpan uRLSpan) {
        String url = uRLSpan.getURL();
        return url != null && url.startsWith("+");
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(-13408564);
        textPaint.bgColor = 0;
        textPaint.setUnderlineText(false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MentionSpan(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            java.lang.String r1 = "+"
            if (r0 != 0) goto L_0x0012
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
            goto L_0x0016
        L_0x0012:
            java.lang.String r3 = r1.concat(r3)
        L_0x0016:
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.plus.sharebox.MentionSpan.<init>(java.lang.String):void");
    }
}
