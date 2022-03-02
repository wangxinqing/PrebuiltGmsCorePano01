package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: ysk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ysk implements icm {
    final /* synthetic */ ysm a;

    public ysk(ysm ysm) {
        this.a = ysm;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ void a(icl icl) {
        wlc wlc = (wlc) icl;
        ysm ysm = this.a;
        Status aO = wlc.aO();
        xfk b = wlc.b();
        if (aO.c()) {
            try {
                if (b.a() > 0) {
                    ysm.f = b.a(0).e();
                } else {
                    ysm.f = null;
                }
                b.c();
                ysm.k = true;
                ysm.d();
            } catch (Throwable th) {
                b.c();
                throw th;
            }
        }
    }
}
