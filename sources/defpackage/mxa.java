package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackChimeraActivity;

/* renamed from: mxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mxa extends ClickableSpan {
    final /* synthetic */ mxc a;

    public mxa(mxc mxc) {
        this.a = mxc;
    }

    public void onClick(View view) {
        String str;
        ErrorReport j = FeedbackChimeraActivity.j();
        try {
            mxc mxc = this.a;
            if (j == null) {
                str = "";
            } else {
                str = j.B;
            }
            Activity activity = mxc.getActivity();
            if (activity != null) {
                agxz.a(mxc, activity, str);
                return;
            }
            String valueOf = String.valueOf(mxc);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("Fragment ");
            sb.append(valueOf);
            sb.append(" not attached to Activity");
            throw new IllegalStateException(sb.toString());
        } catch (agxy e) {
            this.a.b(axgy.a.a().u());
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
