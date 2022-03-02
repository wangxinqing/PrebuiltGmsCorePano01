package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: mwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mwy extends ClickableSpan {
    final /* synthetic */ mxc a;

    public mwy(mxc mxc) {
        this.a = mxc;
    }

    public void onClick(View view) {
        if (this.a.getActivity() instanceof mwa) {
            ((mwa) this.a.getActivity()).h();
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
