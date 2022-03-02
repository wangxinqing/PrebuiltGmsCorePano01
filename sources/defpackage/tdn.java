package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.nearby.bootstrap.Device;
import java.security.SecureRandom;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: tdn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class tdn extends tdk {
    public static final anil s = anil.a("NearbyBootstrap");
    private final CountDownLatch a = new CountDownLatch(1);
    public boolean t = false;
    public String u;
    private asfz v = null;
    private final SecureRandom w = new SecureRandom();

    public tdn(ased ased, arwa arwa, String str, String str2, byte b, tdv tdv, tdy tdy, tde tde) {
        super(ased, arwa, str, str2, b, tdv, tdy, tde);
    }

    private final void b(String str) {
        if (this.o.c()) {
            try {
                if (a((IInterface) this.p)) {
                    this.p.a(str);
                }
            } catch (RemoteException e) {
                ((anih) ((anih) s.c()).a("tdn", "b", 185, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("TargetDevice: fail to call ConnectionListener.onTokenFailure");
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract Device a(asem asem);

    public final void a(asfs asfs) {
        if (this.g) {
            ((anih) ((anih) s.c()).a("tdn", "a", 110, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("TargetDevice: target device is receiving");
            return;
        }
        String str = this.u;
        aucd o = asfj.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfj asfj = (asfj) o.b;
        asfs.getClass();
        asfj.b = asfs;
        int i = asfj.a | 1;
        asfj.a = i;
        asfj.d = 3;
        asfj.a = i | 4;
        auay a2 = auay.a(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfj asfj2 = (asfj) o.b;
        a2.getClass();
        asfj2.a |= 2;
        asfj2.c = a2;
        a((asfj) o.i());
    }

    /* access modifiers changed from: protected */
    public abstract boolean a();

    /* access modifiers changed from: protected */
    public abstract asel b();

    /* access modifiers changed from: protected */
    public abstract void c();

    public final void d() {
        String a2 = tcv.a(this.w);
        this.u = a2;
        b(a2);
        this.o.b();
    }

    public final void e() {
        m();
        String a2 = tcv.a(this.w);
        this.u = a2;
        b(a2);
        this.o.b();
    }

    public final void g() {
        super.g();
        this.a.countDown();
    }

    public final void j() {
        super.j();
        this.u = tcv.a(this.w);
        if (this.t) {
            ((anih) ((anih) s.c()).a("tdn", "j", 76, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("TargetDevice: target device is accepting connection");
        } else {
            this.v = this.c.a(b(), (asgs) new tdm(this));
        }
        if (!a()) {
            ((anih) ((anih) s.c()).a("tdn", "j", 81, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("TargetDevice: fail to start advertising");
        }
    }

    public final void k() {
        super.k();
        try {
            this.a.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        this.u = null;
        asfz asfz = this.v;
        if (asfz != null) {
            this.c.a(asfz.b);
            this.v = null;
        }
        c();
    }

    public final boolean a(Device device) {
        Device device2 = this.k;
        return device2 != null && device2.d.equals(device.d) && n();
    }
}
