package defpackage;

import android.os.RemoteException;

/* renamed from: rqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rqw {
    public final rus a;

    public rqw(rus rus) {
        this.a = rus;
    }

    public final void a() {
        try {
            this.a.b();
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public final void b() {
        try {
            this.a.c();
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public final void c() {
        try {
            this.a.d();
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public final void d() {
        try {
            this.a.e();
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public final void a(boolean z) {
        try {
            this.a.c(z);
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }
}
