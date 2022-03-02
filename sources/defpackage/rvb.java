package defpackage;

import android.os.RemoteException;

/* renamed from: rvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rvb {
    public final rwa a;

    public rvb(rwa rwa) {
        iva.a((Object) rwa);
        this.a = rwa;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rvb)) {
            return false;
        }
        try {
            return this.a.a(((rvb) obj).a);
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public final int hashCode() {
        try {
            return this.a.c();
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

    public final void a(boolean z) {
        try {
            this.a.a(z);
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }
}
