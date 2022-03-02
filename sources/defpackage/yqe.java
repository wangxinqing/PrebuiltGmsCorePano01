package defpackage;

import com.google.android.gms.plus.audience.CircleCreationChimeraActivity;
import com.google.android.gms.plus.circles.AddToCircleConsentData;

/* renamed from: yqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yqe implements icm {
    final /* synthetic */ CircleCreationChimeraActivity a;

    public yqe(CircleCreationChimeraActivity circleCreationChimeraActivity) {
        this.a = circleCreationChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        wlf wlf = (wlf) icl;
        CircleCreationChimeraActivity circleCreationChimeraActivity = this.a;
        if (wlf.aO().c()) {
            circleCreationChimeraActivity.a = new AddToCircleConsentData(wlf.b(), wlf.c(), wlf.d(), wlf.e());
        } else {
            circleCreationChimeraActivity.a = null;
        }
    }
}
