package defpackage;

import android.os.SystemClock;

/* renamed from: tnz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tnz extends tnx {
    public tnz(tob tob, tlh tlh, String str) {
        super(tob, "KeepAliveManager", tlh, str);
    }

    public final boolean a(tnm tnm) {
        if (tnm.d() == -1 || tnm.d() + aymi.a.a().ad() >= SystemClock.elapsedRealtime()) {
            tnm.a(tpk.a(asav.KEEP_ALIVE, (audx) asae.a).k());
            Thread.sleep(aymi.B());
            return true;
        }
        ((anih) tky.a.d()).a("No incoming frames were processed within the KeepAlive timeout for endpoint %s.", (Object) this.c);
        return false;
    }

    public final void run() {
        try {
            Thread.sleep(aymi.B());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        super.run();
    }
}
