package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: tdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class tdk {
    public static final anil b = anil.a("NearbyBootstrap");
    public final ased c;
    tdj d;
    public asfn e = null;
    public asfz f = null;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j;
    public Device k;
    protected final String l;
    protected final String m;
    public final byte n;
    protected final tde o;
    protected final tdv p;
    protected final tdy q;
    protected final arwa r;

    public tdk(ased ased, arwa arwa, String str, String str2, byte b2, tdv tdv, tdy tdy, tde tde) {
        iva.a((Object) ased);
        this.c = ased;
        iva.a((Object) arwa);
        this.r = arwa;
        this.l = str;
        this.m = str2;
        this.n = b2;
        this.o = tde;
        this.p = tdv;
        this.q = tdy;
    }

    static final boolean a(IInterface iInterface) {
        return (iInterface == null || iInterface.asBinder() == null || !iInterface.asBinder().isBinderAlive()) ? false : true;
    }

    public abstract boolean a(Device device);

    public final boolean b(byte[] bArr) {
        asfn asfn = this.e;
        if (asfn == null) {
            ((anih) ((anih) b.c()).a("tdk", "b", 252, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SocketDevice: device is not connected before send");
            return false;
        }
        aucd o2 = asgk.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asgk asgk = (asgk) o2.b;
        asfn.getClass();
        asgk.b = asfn;
        asgk.a |= 1;
        aucd o3 = asfp.c.o();
        auay a = auay.a(bArr);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        asfp asfp = (asfp) o3.b;
        a.getClass();
        asfp.a |= 1;
        asfp.b = a;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asgk asgk2 = (asgk) o2.b;
        asfp asfp2 = (asfp) o3.i();
        asfp2.getClass();
        asgk2.c = asfp2;
        asgk2.a |= 2;
        this.c.a((asgk) o2.i(), (asgs) new tdi());
        return true;
    }

    public abstract void d();

    public abstract void e();

    public final void f() {
        try {
            SystemClock.elapsedRealtime();
            if (a((IInterface) this.p)) {
                this.r.a(12, this);
                this.p.a(this.k, (byte[]) null);
            }
            this.o.b();
        } catch (RemoteException e2) {
            ((anih) ((anih) b.c()).a("tdk", "f", 112, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SocketDevice: fail to call ConnectionListener.onConnected");
        }
    }

    public void g() {
        try {
            if (a((IInterface) this.p)) {
                this.r.a(13, this);
                this.p.b();
            }
            this.o.b();
        } catch (RemoteException e2) {
            ((anih) ((anih) b.c()).a("tdk", "g", 127, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SocketDevice: fail to call ConnectionListener.onDisconnected");
        }
    }

    public final void h() {
        try {
            if (a((IInterface) this.p)) {
                this.p.a(13);
            }
            this.o.b();
        } catch (RemoteException e2) {
            ((anih) ((anih) b.c()).a("tdk", "h", 164, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SocketDevice: fail to call ConnectionListener.onError(ERROR)");
        }
    }

    public final void i() {
        try {
            if (a((IInterface) this.p)) {
                this.p.a(16);
            }
            this.o.b();
        } catch (RemoteException e2) {
            ((anih) ((anih) b.c()).a("tdk", "i", 177, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SocketDevice: fail to call ConnectionListener.onError(CANCELED)");
        }
    }

    public void j() {
        this.j = true;
    }

    public void k() {
        this.j = false;
        m();
    }

    public final void l() {
        if (this.f == null) {
            ((anih) ((anih) b.c()).a("tdk", "l", 224, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SocketDevice: unable to confirm before connect");
            return;
        }
        aucd o2 = asgp.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asgp asgp = (asgp) o2.b;
        asgp.b = 1;
        int i2 = 1 | asgp.a;
        asgp.a = i2;
        String str = this.f.b;
        str.getClass();
        asgp.a = i2 | 2;
        asgp.c = str;
        this.c.a((asgp) o2.i());
    }

    public final void m() {
        asfz asfz = this.f;
        if (asfz != null) {
            this.i = true;
            this.c.a(asfz.b);
            this.f = null;
        }
    }

    public final boolean n() {
        return this.e != null;
    }

    public final void a(asfj asfj) {
        tdj tdj = new tdj(this);
        this.d = tdj;
        this.h = false;
        this.i = false;
        this.f = this.c.a(asfj, (asgs) tdj);
    }

    public final void a(String str) {
        try {
            SystemClock.elapsedRealtime();
            if (a((IInterface) this.p)) {
                this.p.b(str);
            }
        } catch (RemoteException e2) {
            ((anih) ((anih) b.c()).a("tdk", "a", 151, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SocketDevice: fail to call DataListener.onDataReceived");
        }
    }

    public final void a(byte[] bArr) {
        try {
            SystemClock.elapsedRealtime();
            if (a((IInterface) this.q)) {
                this.q.a(bArr);
            }
        } catch (RemoteException e2) {
            ((anih) ((anih) b.c()).a("tdk", "a", 139, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SocketDevice: fail to call DataListener.onDataReceived");
        }
    }
}
