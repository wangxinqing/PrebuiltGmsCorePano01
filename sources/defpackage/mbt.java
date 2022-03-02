package defpackage;

import android.os.RemoteException;

/* renamed from: mbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mbt implements mbu {
    final /* synthetic */ mbv a;

    public mbt(mbv mbv) {
        this.a = mbv;
    }

    public final int a() {
        return 5;
    }

    public final void b() {
        try {
            this.a.c.b.b();
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }
}
