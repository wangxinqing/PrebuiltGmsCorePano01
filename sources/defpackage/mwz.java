package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: mwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mwz extends ClickableSpan {
    final /* synthetic */ String a;
    final /* synthetic */ mxc b;

    public mwz(mxc mxc, String str) {
        this.b = mxc;
        this.a = str;
    }

    public void onClick(View view) {
        this.b.b(this.a);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
