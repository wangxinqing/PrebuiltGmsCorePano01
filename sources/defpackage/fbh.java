package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;

/* renamed from: fbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fbh implements ow {
    private final fbk a;

    public fbh(fbk fbk) {
        this.a = fbk;
    }

    public final Object a() {
        fbk fbk = this.a;
        Intent a2 = pzw.a(fbk.getContext().getApplicationContext(), fbk.q, fbk.r, true);
        aorl.a(qan.a((qcd) fbk.getActivity()).a(200, a2), new fbj(fbk), new jls((Handler) new qvr(Looper.getMainLooper())));
        return fbk.g.a(qcr.CONSENT_RECORD_GRANTS);
    }
}
