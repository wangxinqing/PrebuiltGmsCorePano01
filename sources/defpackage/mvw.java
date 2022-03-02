package defpackage;

import android.text.TextUtils;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import java.util.List;

/* renamed from: mvw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mvw implements Runnable {
    final /* synthetic */ ErrorReport a;
    final /* synthetic */ boolean b;
    final /* synthetic */ FeedbackChimeraActivity c;

    public mvw(FeedbackChimeraActivity feedbackChimeraActivity, ErrorReport errorReport, boolean z) {
        this.c = feedbackChimeraActivity;
        this.a = errorReport;
        this.b = z;
    }

    public final void run() {
        List a2;
        ErrorReport errorReport = this.a;
        mwg mwg = FeedbackChimeraActivity.d;
        if (mwg != null) {
            muv muv = mwg.g;
            String str = mwg.c.h;
            String str2 = muv.a.B;
            if (!TextUtils.isEmpty(str2) && (a2 = muv.a(str2)) != null) {
                if (a2.isEmpty()) {
                    muv.a.ai = 1;
                } else if (!TextUtils.isEmpty(str) && !str2.equals(str)) {
                    List a3 = muv.a(str);
                    if (a3 != null) {
                        if (a2.size() == a3.size() && a2.containsAll(a3)) {
                            muv.a.ah = a2;
                        } else {
                            muv.a.ai = 3;
                        }
                    }
                } else {
                    muv.a.ah = a2;
                }
            }
            errorReport = mwg.g();
        }
        if (mwg != null && mwg.f()) {
            this.c.a(mwg, this.b);
        } else {
            this.c.b(errorReport, this.b);
        }
    }
}
