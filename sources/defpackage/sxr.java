package defpackage;

import android.os.RemoteException;

/* renamed from: sxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sxr implements Runnable {
    final /* synthetic */ sxk a;
    final /* synthetic */ sye b;

    public sxr(sye sye, sxk sxk) {
        this.b = sye;
        this.a = sxk;
    }

    public final void run() {
        sye sye = this.b;
        sug sug = sye.c;
        if (sug == null) {
            sye.E().c.a("Failed to send current screen to service");
            return;
        }
        try {
            sxk sxk = this.a;
            if (sxk == null) {
                sug.a(0, (String) null, (String) null, sye.z().getPackageName());
            } else {
                sug.a(sxk.c, sxk.a, sxk.b, sye.z().getPackageName());
            }
            this.b.q();
        } catch (RemoteException e) {
            this.b.E().c.a("Failed to send current screen to the service", e);
        }
    }
}
