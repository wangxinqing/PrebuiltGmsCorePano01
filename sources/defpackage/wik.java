package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: wik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wik extends ClickableSpan {
    final /* synthetic */ View.OnClickListener a;

    public wik(View.OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    public void onClick(View view) {
        this.a.onClick(view);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
