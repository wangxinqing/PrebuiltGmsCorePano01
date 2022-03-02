package com.google.android.location.fused;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FusionScheduler extends nla implements jky, rng {
    private static final long p = TimeUnit.SECONDS.toMillis(15);
    public final aiiy a;
    public final aijb b;
    public final aijf c;
    public final aija d;
    public final aiiz e;
    public final aiin f;
    public final aiio g;
    public final jkz h;
    public final rns i;
    public final Context j;
    public final Handler k;
    public int l = 63;
    public Collection m = Collections.emptyList();
    public boolean n;
    public boolean o;
    private final aifi q = new aifi();
    private final aifi r = new aifi();
    private final aifi s = new aifi();
    private boolean t = true;

    public FusionScheduler(aiiy aiiy, aijb aijb, aijf aijf, aija aija, aiiz aiiz, aiin aiin, aiio aiio, jkz jkz, rns rns, Context context, Looper looper) {
        super("location");
        this.k = new qvr(looper);
        this.a = aiiy;
        this.b = aijb;
        this.c = aijf;
        this.d = aija;
        this.e = aiiz;
        this.f = aiin;
        this.g = aiio;
        this.j = context;
        this.h = jkz;
        this.i = rns;
        this.n = false;
        this.o = false;
    }

    private final boolean a() {
        return ayap.g() && this.o && this.q.f < Long.MAX_VALUE;
    }

    private final boolean a(int i2) {
        return (i2 & this.l) != 0;
    }

    public final void d() {
        if (this.n && !this.o) {
            this.o = true;
            if (ayap.g()) {
                a(false);
            }
        }
    }

    public final void e() {
        if (this.n && this.o) {
            this.o = false;
            if (ayap.g()) {
                a(false);
            }
        }
    }

    public final void a(int i2, int i3) {
        boolean z;
        if (ayap.a.a().flpParticleFusionDisableStepAndArProviderControllerWhenLocationDisabled()) {
            aijf aijf = this.c;
            if (i3 != 0) {
                z = true;
            } else {
                z = false;
            }
            aijf.a(z);
            this.c.f();
            this.f.a(z);
            this.f.f();
        }
        a(false);
    }

    public final void a(Context context, Intent intent) {
        if ("com.google.android.location.internal.server.ACTION_RESTARTED".equals(intent.getAction())) {
            this.d.c();
            this.e.c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0214  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r13) {
        /*
            r12 = this;
            java.util.Collection r0 = r12.m
            android.content.Context r1 = r12.j
            boolean r1 = defpackage.rns.b(r1)
            if (r1 != 0) goto L_0x0010
            amrm r1 = defpackage.aifi.e
            java.lang.Iterable r0 = defpackage.anbs.a((java.lang.Iterable) r0, (defpackage.amrm) r1)
        L_0x0010:
            aifi r1 = r12.q
            amrm r2 = defpackage.aifi.b
            java.lang.Iterable r2 = defpackage.anbs.a((java.lang.Iterable) r0, (defpackage.amrm) r2)
            r1.a(r2)
            aifi r1 = r12.r
            amrm r2 = defpackage.aifi.c
            java.lang.Iterable r2 = defpackage.anbs.a((java.lang.Iterable) r0, (defpackage.amrm) r2)
            r1.a(r2)
            aifi r1 = r12.s
            amrm r2 = defpackage.aifi.d
            java.lang.Iterable r0 = defpackage.anbs.a((java.lang.Iterable) r0, (defpackage.amrm) r2)
            r1.a(r0)
            boolean r0 = r12.t
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L_0x003b
            goto L_0x007f
        L_0x003b:
            aifi r0 = r12.s
            long r3 = r0.f
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x007f
            aifi r3 = r12.r
            long r4 = r3.f
            r6 = 300000(0x493e0, double:1.482197E-318)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x007f
            r3.f = r6
            long r4 = r3.g
            long r8 = r0.g
            long r4 = java.lang.Math.min(r4, r8)
            long r4 = java.lang.Math.max(r6, r4)
            r3.g = r4
            aifi r0 = r12.r
            aifi r3 = r12.s
            java.util.Collection r4 = r3.k
            java.util.Collection r3 = r3.l
            java.util.Collection r5 = r0.k
            r5.clear()
            java.util.Collection r5 = r0.k
            r5.addAll(r4)
            java.util.Collection r4 = r0.l
            r4.clear()
            java.util.Collection r0 = r0.l
            r0.addAll(r3)
            aifi r0 = r12.s
            r0.a()
        L_0x007f:
            aifi r0 = r12.r
            long r3 = r0.f
            aifi r0 = r12.s
            long r5 = r0.f
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x008c
            goto L_0x008f
        L_0x008c:
            r0.a()
        L_0x008f:
            aifi r0 = r12.q
            long r3 = r0.f
            boolean r5 = r12.n
            if (r5 != 0) goto L_0x0098
            goto L_0x00cb
        L_0x0098:
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x00cb
            r5 = 4
            boolean r5 = r12.a((int) r5)
            if (r5 == 0) goto L_0x00cb
            aiiy r5 = r12.a
            r5.a((long) r3)
            aiiy r3 = r12.a
            java.util.Collection r4 = r0.k
            r3.a((java.util.Collection) r4)
            aiiy r3 = r12.a
            boolean r0 = r0.j
            r3.b(r0)
            aiiy r0 = r12.a
            r0.s = r13
            r0.b()
            r0 = 64
            boolean r0 = r12.a((int) r0)
            if (r0 == 0) goto L_0x00d5
            aiio r0 = r12.g
            r0.b()
            goto L_0x00d5
        L_0x00cb:
            aiiy r0 = r12.a
            r0.e()
            aiio r0 = r12.g
            r0.e()
        L_0x00d5:
            aifi r0 = r12.q
            boolean r3 = r12.n
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0126
            ayap r3 = defpackage.ayap.a
            ayaq r3 = r3.a()
            boolean r3 = r3.flpUsePdr()
            if (r3 == 0) goto L_0x0126
            ayap r3 = defpackage.ayap.a
            ayaq r3 = r3.a()
            boolean r3 = r3.flpEnablePdrOnlyWhenScreenIsOn()
            if (r3 != 0) goto L_0x00f6
            goto L_0x00fb
        L_0x00f6:
            boolean r3 = r12.o
            if (r3 != 0) goto L_0x00fb
            goto L_0x0126
        L_0x00fb:
            long r6 = r0.f
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x0126
            r3 = 8
            boolean r3 = r12.a((int) r3)
            if (r3 == 0) goto L_0x0126
            long r6 = r0.f
            long r8 = p
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x0126
            aijf r3 = r12.c
            boolean r6 = r0.j
            r3.b(r6)
            aijf r3 = r12.c
            java.util.Collection r0 = r0.k
            r3.a((java.util.Collection) r0)
            aijf r0 = r12.c
            r0.b()
            r0 = 1
            goto L_0x012c
        L_0x0126:
            aijf r0 = r12.c
            r0.e()
            r0 = 0
        L_0x012c:
            aifi r3 = r12.q
            boolean r6 = r12.n
            if (r6 == 0) goto L_0x0180
            long r6 = r3.f
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 >= 0) goto L_0x0180
            r6 = 16
            boolean r6 = r12.a((int) r6)
            if (r6 != 0) goto L_0x0141
            goto L_0x0180
        L_0x0141:
            if (r0 != 0) goto L_0x0144
            goto L_0x0155
        L_0x0144:
            boolean r0 = r12.a()
            if (r0 == 0) goto L_0x0155
            ayap r0 = defpackage.ayap.a
            ayaq r0 = r0.a()
            long r6 = r0.flpMinArScreenOnHighAccuracyIntervalMs()
            goto L_0x015f
        L_0x0155:
            ayap r0 = defpackage.ayap.a
            ayaq r0 = r0.a()
            long r6 = r0.flpMinArScreenOfOrNoHighAccuracyIntervalMs()
        L_0x015f:
            aijf r0 = r12.c
            boolean r8 = r3.j
            r0.b(r8)
            aiin r0 = r12.f
            long r8 = r3.f
            long r6 = java.lang.Math.max(r8, r6)
            r0.a((long) r6)
            aiin r0 = r12.f
            r0.s = r13
            java.util.Collection r3 = r3.k
            r0.a((java.util.Collection) r3)
            aiin r0 = r12.f
            r0.b()
            goto L_0x0185
        L_0x0180:
            aiin r0 = r12.f
            r0.e()
        L_0x0185:
            aifi r0 = r12.q
            long r6 = r0.f
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0195
            aiiy r0 = r12.a
            boolean r0 = r0.v
            if (r0 == 0) goto L_0x0195
            r0 = 1
            goto L_0x0196
        L_0x0195:
            r0 = 0
        L_0x0196:
            aifi r3 = r12.r
            aija r6 = r12.d
            boolean r7 = r3.j
            r6.b(r7)
            boolean r6 = r12.a((int) r5)
            r7 = 2
            if (r6 != 0) goto L_0x01c1
            boolean r6 = r12.a()
            if (r6 == 0) goto L_0x01b4
            r6 = 32
            boolean r6 = r12.a((int) r6)
            if (r6 != 0) goto L_0x01c1
        L_0x01b4:
            boolean r6 = r12.a((int) r7)
            if (r6 == 0) goto L_0x01bd
            r6 = 1
            goto L_0x01c2
        L_0x01bd:
            if (r0 == 0) goto L_0x01c1
            r6 = 0
            goto L_0x01c2
        L_0x01c1:
            r6 = 1
        L_0x01c2:
            long r8 = r3.f
            boolean r10 = r12.n
            if (r10 != 0) goto L_0x01c9
            goto L_0x01f3
        L_0x01c9:
            int r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x01f3
            if (r6 == 0) goto L_0x01f3
            aija r6 = r12.d
            r6.a((long) r8)
            aija r6 = r12.d
            long r10 = r3.g
            long r8 = java.lang.Math.max(r8, r10)
            r6.b(r8)
            aija r6 = r12.d
            r6.d()
            aija r6 = r12.d
            r6.s = r13
            java.util.Collection r3 = r3.k
            r6.a((java.util.Collection) r3)
            aija r3 = r12.d
            r3.b()
            goto L_0x01f8
        L_0x01f3:
            aija r3 = r12.d
            r3.e()
        L_0x01f8:
            aifi r3 = r12.s
            aifi r6 = r12.r
            aiiz r8 = r12.e
            boolean r9 = r3.j
            if (r9 != 0) goto L_0x0208
            boolean r6 = r6.j
            if (r6 != 0) goto L_0x0208
            r6 = 0
            goto L_0x0209
        L_0x0208:
            r6 = 1
        L_0x0209:
            r8.b(r6)
            boolean r6 = r12.a((int) r7)
            if (r6 == 0) goto L_0x0214
            r4 = 1
            goto L_0x0218
        L_0x0214:
            if (r0 == 0) goto L_0x0217
            goto L_0x0218
        L_0x0217:
            r4 = 1
        L_0x0218:
            long r5 = r3.f
            boolean r0 = r12.n
            if (r0 != 0) goto L_0x021f
            goto L_0x0249
        L_0x021f:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0249
            if (r4 == 0) goto L_0x0249
            aiiz r0 = r12.e
            r0.a((long) r5)
            aiiz r0 = r12.e
            long r1 = r3.g
            long r1 = java.lang.Math.max(r5, r1)
            r0.b(r1)
            aiiz r0 = r12.e
            r0.d()
            aiiz r0 = r12.e
            r0.s = r13
            java.util.Collection r13 = r3.k
            r0.a((java.util.Collection) r13)
            aiiz r13 = r12.e
            r13.b()
            return
        L_0x0249:
            aiiz r13 = r12.e
            r13.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.location.fused.FusionScheduler.a(boolean):void");
    }
}
