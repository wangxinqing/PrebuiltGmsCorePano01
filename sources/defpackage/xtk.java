package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: xtk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xtk extends ClickableSpan {
    final /* synthetic */ xtl a;

    public xtk(xtl xtl) {
        this.a = xtl;
    }

    public void onClick(View view) {
        this.a.a(ayqr.d());
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.a.f);
    }
}
