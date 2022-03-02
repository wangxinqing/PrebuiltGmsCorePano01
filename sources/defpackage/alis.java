package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* renamed from: alis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alis extends ClickableSpan {
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.alir
            if (r0 == 0) goto L_0x000d
            r0 = r3
            alir r0 = (defpackage.alir) r0
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0031
        L_0x000d:
            android.content.Context r0 = r3.getContext()
        L_0x0011:
            boolean r1 = r0 instanceof defpackage.aliq
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L_0x0020
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x0011
        L_0x0020:
            r0 = 0
            goto L_0x0024
        L_0x0022:
            aliq r0 = (defpackage.aliq) r0
        L_0x0024:
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "LinkSpan"
            java.lang.String r1 = "Dropping click event. No listener attached."
            android.util.Log.w(r0, r1)
            goto L_0x0036
        L_0x002e:
            r0.a()
        L_0x0031:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3.cancelPendingInputEvents()
        L_0x0036:
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x004a
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.CharSequence r3 = r3.getText()
            boolean r0 = r3 instanceof android.text.Spannable
            if (r0 == 0) goto L_0x004a
            android.text.Spannable r3 = (android.text.Spannable) r3
            r0 = 0
            android.text.Selection.setSelection(r3, r0)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alis.onClick(android.view.View):void");
    }
}
