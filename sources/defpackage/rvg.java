package defpackage;

import android.os.RemoteException;

/* renamed from: rvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rvg {
    private final rwg a;

    public rvg(rwg rwg) {
        iva.a((Object) rwg);
        this.a = rwg;
    }

    public final String b() {
        try {
            return this.a.c();
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rvg)) {
            return false;
        }
        try {
            return this.a.a(((rvg) obj).a);
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public final int hashCode() {
        try {
            return this.a.d();
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public final void a() {
        try {
            this.a.b();
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }
}
