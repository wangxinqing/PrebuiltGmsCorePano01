package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import com.google.android.chimera.FragmentTransaction;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: aglh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aglh extends agld implements agcv, agkv {
    public static final /* synthetic */ int a = 0;
    private static final anhq b = anhq.a("aglh");
    private final Application c;
    private final agcz d;
    private final aglf e;
    private final Map f = new HashMap();
    private final boolean g;
    private final int h;
    private final aglm i;
    private final agks j;
    private final bapu k;

    public aglh(agkt agkt, Application application, aglm aglm, amri amri, bapu bapu) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z);
        this.j = agkt.a((Executor) bapu.a(), new agnf(((aghc) amri.b()).d()));
        this.c = application;
        this.d = agcz.a(application);
        this.g = ((aghc) amri.b()).b();
        this.i = aglm;
        this.k = (bapu) ((aghc) amri.b()).e().c();
        this.h = agjl.a(application);
        aglf aglf = new aglf(new agle(this), this.g);
        this.e = aglf;
        this.d.a((agcy) aglf);
    }

    /* access modifiers changed from: private */
    public void a(int i2) {
        synchronized (this.f) {
            for (agll a2 : this.f.values()) {
                a2.a(i2, this.h);
            }
        }
    }

    public void a() {
    }

    public void b(Activity activity) {
        synchronized (this.f) {
            this.f.clear();
        }
    }

    public void c() {
        this.d.b(this.e);
        this.e.c();
        synchronized (this.f) {
            this.f.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r7) {
        /*
            r6 = this;
            java.util.Map r0 = r6.f
            monitor-enter(r0)
            java.util.Map r1 = r6.f     // Catch:{ all -> 0x0068 }
            boolean r1 = r1.containsKey(r7)     // Catch:{ all -> 0x0068 }
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r3 = "a"
            java.lang.String r4 = "aglh"
            if (r1 == 0) goto L_0x0028
            anhq r1 = b     // Catch:{ all -> 0x0068 }
            anie r1 = r1.c()     // Catch:{ all -> 0x0068 }
            anhn r1 = (defpackage.anhn) r1     // Catch:{ all -> 0x0068 }
            r5 = 242(0xf2, float:3.39E-43)
            anie r1 = r1.a((java.lang.String) r4, (java.lang.String) r3, (int) r5, (java.lang.String) r2)     // Catch:{ all -> 0x0068 }
            anhn r1 = (defpackage.anhn) r1     // Catch:{ all -> 0x0068 }
            java.lang.String r2 = "measurement already started: %s"
            r1.a((java.lang.String) r2, (java.lang.Object) r7)     // Catch:{ all -> 0x0068 }
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            return
        L_0x0028:
            java.util.Map r1 = r6.f     // Catch:{ all -> 0x0068 }
            int r1 = r1.size()     // Catch:{ all -> 0x0068 }
            r5 = 25
            if (r1 >= r5) goto L_0x0051
            java.util.Map r1 = r6.f     // Catch:{ all -> 0x0068 }
            aglm r2 = r6.i     // Catch:{ all -> 0x0068 }
            agll r2 = r2.a()     // Catch:{ all -> 0x0068 }
            r1.put(r7, r2)     // Catch:{ all -> 0x0068 }
            java.util.Map r7 = r6.f     // Catch:{ all -> 0x0068 }
            int r7 = r7.size()     // Catch:{ all -> 0x0068 }
            r1 = 1
            if (r7 != r1) goto L_0x004f
            boolean r7 = r6.g     // Catch:{ all -> 0x0068 }
            if (r7 != 0) goto L_0x004f
            aglf r7 = r6.e     // Catch:{ all -> 0x0068 }
            r7.a()     // Catch:{ all -> 0x0068 }
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            return
        L_0x0051:
            anhq r1 = b     // Catch:{ all -> 0x0068 }
            anie r1 = r1.c()     // Catch:{ all -> 0x0068 }
            anhn r1 = (defpackage.anhn) r1     // Catch:{ all -> 0x0068 }
            r5 = 246(0xf6, float:3.45E-43)
            anie r1 = r1.a((java.lang.String) r4, (java.lang.String) r3, (int) r5, (java.lang.String) r2)     // Catch:{ all -> 0x0068 }
            anhn r1 = (defpackage.anhn) r1     // Catch:{ all -> 0x0068 }
            java.lang.String r2 = "Too many concurrent measurements, ignoring %s"
            r1.a((java.lang.String) r2, (java.lang.Object) r7)     // Catch:{ all -> 0x0068 }
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            return
        L_0x0068:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aglh.a(java.lang.String):void");
    }

    public void a(String str, boolean z, barb barb) {
        agll agll;
        bapu bapu;
        synchronized (this.f) {
            agll = (agll) this.f.remove(str);
            if (this.f.isEmpty() && !this.g) {
                this.e.b();
            }
        }
        if (agll == null) {
            ((anhn) ((anhn) b.c()).a("aglh", "a", 273, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Measurement not found: %s", (Object) str);
        } else if (agll.a()) {
            aucd o = basu.s.o();
            bask b2 = agll.b();
            aucd aucd = (aucd) b2.c(5);
            aucd.a((aucj) b2);
            int b3 = agjl.b(this.c);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            bask bask = (bask) aucd.b;
            bask bask2 = bask.h;
            bask.a |= 16;
            bask.g = b3;
            if (o.c) {
                o.c();
                o.c = false;
            }
            basu basu = (basu) o.b;
            bask bask3 = (bask) aucd.i();
            bask3.getClass();
            basu.k = bask3;
            basu.a |= 2048;
            if (barb == null && (bapu = this.k) != null) {
                try {
                    barb = (barb) bapu.a();
                } catch (Exception e2) {
                    anhn anhn = (anhn) b.c();
                    anhn.a((Throwable) e2);
                    ((anhn) anhn.a("aglh", "a", 289, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Exception while getting jank metric extension!");
                }
            }
            if (barb.c.equals(barb)) {
                barb = null;
            }
            if (barb != null) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                basu basu2 = (basu) o.b;
                barb.getClass();
                basu2.l = barb;
                basu2.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            }
            this.j.a(str, z, (basu) o.i(), (barb) null, (String) null);
        }
    }
}
