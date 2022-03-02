package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: asbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asbn implements ashv {
    public static final /* synthetic */ int i = 0;
    private static final asik j = asik.b();
    final String a;
    amoq b;
    public amog c;
    public final BlockingQueue d = new LinkedBlockingQueue();
    asja e;
    public final CountDownLatch f = new CountDownLatch(1);
    public final CountDownLatch g = new CountDownLatch(1);
    final amop h = new asbj(this);
    private final Context k;
    private final String l;
    private final boolean m;
    private Future n;

    public asbn(Context context, ampi ampi) {
        this.k = context;
        this.m = false;
        this.a = ampi.c();
        this.b = new ampq(ampi, this.h);
        this.l = ((asih) j).a();
    }

    public final String a() {
        return this.l;
    }

    public final byte[] b() {
        if (d()) {
            return this.e.b();
        }
        throw new IOException("BleGattConnection disconnected");
    }

    public final synchronized void c() {
        if (this.m) {
            if (this.b == null) {
                this.n = new ampb(this.k, asbi.a, asda.b, asda.d, asda.c, 23).a(this.a);
                try {
                    jjg jjg = asil.a;
                    this.c = (amog) this.n.get();
                    ampo ampo = new ampo(this.c, this.h);
                    this.b = ampo;
                    ampo.f();
                } catch (InterruptedException e2) {
                    e = e2;
                    throw new IOException("Failed to create connection", e);
                } catch (ExecutionException e3) {
                    e = e3;
                    throw new IOException("Failed to create connection", e);
                }
            }
        }
        try {
            this.f.await();
        } catch (InterruptedException e4) {
            ((anih) ((anih) asil.a.c()).a("asbn", "c", 112, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while waiting for getting connected");
        }
        if (!this.b.c()) {
            ((anih) ((anih) asil.a.c()).a("asbn", "c", 116, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleGattConnection fail to connect");
            return;
        }
        asja asja = new asja(this.m, new asbk(this.d), new asbl(this.b));
        this.e = asja;
        asja.c();
    }

    public final void close() {
        jjg jjg = asil.a;
        if (this.b == null) {
            Future future = this.n;
            if (future != null) {
                future.cancel(true);
            }
        } else if (this.g.getCount() > 0) {
            this.b.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r1 = this;
            amoq r0 = r1.b
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0014
            asja r0 = r1.e
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.a
            if (r0 == 0) goto L_0x0014
            r0 = 1
            return r0
        L_0x0014:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asbn.d():boolean");
    }

    public final asfn e() {
        aucd o = asfn.d.o();
        String str = this.l;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfn asfn = (asfn) o.b;
        str.getClass();
        asfn.a |= 1;
        asfn.b = str;
        aucf aucf = (aucf) asfo.c.o();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        asfo asfo = (asfo) aucf.b;
        asfo.b = 0;
        asfo.a |= 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfn asfn2 = (asfn) o.b;
        asfo asfo2 = (asfo) aucf.i();
        asfo2.getClass();
        asfn2.c = asfo2;
        asfn2.a |= 2;
        return (asfn) o.i();
    }

    public final boolean f() {
        return this.m;
    }

    public final asfw g() {
        aucd o = asfw.c.o();
        String str = this.l;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfw asfw = (asfw) o.b;
        str.getClass();
        asfw.a |= 1;
        asfw.b = str;
        return (asfw) o.i();
    }

    public final void a(byte[] bArr) {
        if (d()) {
            this.e.a(bArr);
            return;
        }
        throw new IOException("BleGattConnection disconnected");
    }

    public asbn(Context context, boolean z, String str) {
        this.k = context;
        this.m = z;
        this.a = str;
        this.l = ((asih) j).a();
    }
}
