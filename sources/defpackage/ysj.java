package defpackage;

import com.google.android.gms.common.server.FavaDiagnosticsEntity;

/* renamed from: ysj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ysj implements Runnable {
    final /* synthetic */ ysm a;

    public ysj(ysm ysm) {
        this.a = ysm;
    }

    public final void run() {
        ysm ysm = this.a;
        if (!ysm.p && ysm.d != null) {
            ysm.p = true;
            if (ysm.i != null) {
                FavaDiagnosticsEntity favaDiagnosticsEntity = new FavaDiagnosticsEntity(ysm.n, ysm.o);
                int i = ysm.s;
                if (i == 2 || i == 1) {
                    ibq ibq = ykq.a;
                    ywk.a(ysm.d, ysm.i, ylp.g, favaDiagnosticsEntity);
                } else if (i == 0) {
                    ibq ibq2 = ykq.a;
                    ywk.a(ysm.d, ysm.i, ylp.f, favaDiagnosticsEntity);
                }
            }
        }
    }
}
