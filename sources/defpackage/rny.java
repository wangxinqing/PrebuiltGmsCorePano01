package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: rny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class rny {
    protected final Context a;
    protected final rns b;
    public final nz c = new nz(1);
    public final rng d;
    public final rnr e;
    public final ob f;
    public boolean g;
    public boolean h;

    public rny(Context context, rns rns) {
        this.a = context;
        this.b = rns;
        this.d = new rnv(this);
        this.e = new rnw(this);
        this.f = new ob(2);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = -792039641(0xffffffffd0ca6f27, float:-2.71702569E10)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 97798435(0x5d44923, float:1.996325E-35)
            if (r0 == r1) goto L_0x0020
            r1 = 1843485230(0x6de15a2e, float:8.7178935E27)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "network"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "fused"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "passive"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x003e
            if (r0 == r3) goto L_0x003e
            if (r0 == r2) goto L_0x003e
            r4.b(r5, r6)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rny.a(java.lang.String, boolean):void");
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    public final void b(String str, boolean z) {
        synchronized (this.c) {
            int i = 0;
            if (z) {
                if (!this.f.add(str)) {
                    return;
                }
            } else if (!this.f.remove(str)) {
                return;
            }
            while (true) {
                nz nzVar = this.c;
                if (i < nzVar.h) {
                    Executor executor = (Executor) this.c.c(i);
                    executor.execute(new rnx(this, (rnh) nzVar.b(i), executor, str, z));
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        boolean z = false;
        if (this.g && this.h) {
            z = true;
        }
        b("network", z);
    }
}
