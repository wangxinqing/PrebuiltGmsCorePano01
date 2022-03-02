package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: mwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mwx extends ClickableSpan {
    final /* synthetic */ mxc a;

    public mwx(mxc mxc) {
        this.a = mxc;
    }

    public void onClick(View view) {
        if (this.a.getActivity() instanceof mwa) {
            ((mwa) this.a.getActivity()).f();
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
