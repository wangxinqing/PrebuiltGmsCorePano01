package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: ysl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ysl implements icm {
    final /* synthetic */ ysm a;

    public ysl(ysm ysm) {
        this.a = ysm;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ void a(icl icl) {
        wky wky = (wky) icl;
        ysm ysm = this.a;
        Status aO = wky.aO();
        xfe b = wky.b();
        if (aO.c()) {
            ysm.g = null;
            try {
                if (b.a() > 0) {
                    ysm.g = b.a(0).c();
                }
                b.c();
                ysm.l = true;
                ysm.d();
            } catch (Throwable th) {
                b.c();
                throw th;
            }
        }
    }
}
