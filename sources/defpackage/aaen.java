package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: aaen  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaen implements aabi {
    public final List a = new ArrayList();
    public final SparseArray b = new SparseArray();
    public final aabj c;
    public final aaez d;
    public final acrz e;
    public final njy f;
    public boolean g = false;
    public final aabn h;
    public final aadt i;
    public final aaeh j;
    public final aaeh k;
    public final aaba l;
    private final Set m = new HashSet();
    private final nsg n = new aaem(this);
    private final aabo[] o;
    private final Context p;
    private final aacr q;
    private final ExecutorService r;
    private long s;
    private boolean t = false;
    private final aaed u;
    private final aaeu v;
    private final ntv w;
    private final Looper x;
    private Handler y;
    private final aabw z = new aaek(this);

    public aaen(Context context, aacr aacr, aaed aaed, aaez aaez, ExecutorService executorService, Looper looper, aabo[] aaboArr, ntv ntv, aabj aabj, aabn aabn, aaeu aaeu, aadt aadt) {
        ntv ntv2 = ntv;
        aadt aadt2 = aadt;
        aadz aadz = new aadz(ntv2);
        aaba aaba = new aaba(context);
        aaeh aaeh = new aaeh(aadz, 2, aadt2, aaba);
        aaeh aaeh2 = new aaeh(aadz, 1, aadt2, aaba);
        this.p = context;
        this.q = aacr;
        this.u = aaed;
        this.d = aaez;
        this.o = aaboArr;
        this.r = executorService;
        this.x = looper;
        this.w = ntv2;
        this.c = aabj;
        this.h = aabn;
        this.v = aaeu;
        this.i = aadt2;
        this.l = aaba;
        this.k = aaeh;
        this.j = aaeh2;
        this.e = new acrz(context, 1, "*gms_scheduler*:internal", "scheduler", "com.google.android.gms", "GCM");
        if (axcf.b()) {
            this.f = new njy((Class) getClass(), 16, "StandaloneSchedulingEngine", "scheduler");
        } else {
            this.f = new njy((Class) getClass(), 16, "scheduler");
        }
    }

    private static final int a(Map map) {
        int i2 = 0;
        for (aabq o2 : map.keySet()) {
            if (o2.o()) {
                i2++;
            }
        }
        return i2;
    }

    private final void b(aabq aabq, aabq aabq2, int i2) {
        synchronized (this.a) {
            aabo[] aaboArr = this.o;
            int length = aaboArr.length;
            aaboArr[0].a(aabq, aabq2, i2);
        }
    }

    private final int c(aabq aabq) {
        int i2;
        qyl a2 = aabq.j().a();
        synchronized (this.a) {
            i2 = 0;
            for (aabq r2 : this.a) {
                if (a2.a(r2.r())) {
                    i2++;
                }
            }
        }
        return i2;
    }

    private final aaee e() {
        synchronized (this.a) {
            aabo[] aaboArr = this.o;
            int length = aaboArr.length;
            aabo aabo = aaboArr[0];
            if (!(aabo instanceof aaee)) {
                return null;
            }
            aaee aaee = (aaee) aabo;
            return aaee;
        }
    }

    public final nsg b() {
        return this.n;
    }

    public final nxk d() {
        aucd o2 = nxk.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nxk nxk = (nxk) o2.b;
        nxk.b = 2;
        nxk.a |= 1;
        aubn a2 = augi.a(SystemClock.elapsedRealtime() - this.s);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nxk nxk2 = (nxk) o2.b;
        a2.getClass();
        nxk2.c = a2;
        nxk2.a |= 2;
        return (nxk) o2.i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0155, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.aabq r10, int r11) {
        /*
            r9 = this;
            java.util.List r0 = r9.a
            monitor-enter(r0)
            java.util.List r1 = r9.a     // Catch:{ all -> 0x0165 }
            monitor-enter(r1)     // Catch:{ all -> 0x0165 }
            nxc r2 = r10.a     // Catch:{ all -> 0x0162 }
            long r2 = r2.e     // Catch:{ all -> 0x0162 }
            int r3 = (int) r2     // Catch:{ all -> 0x0162 }
            r9.b((int) r3)     // Catch:{ all -> 0x0162 }
            android.util.SparseArray r2 = r9.b     // Catch:{ all -> 0x0162 }
            nxc r3 = r10.a     // Catch:{ all -> 0x0162 }
            long r3 = r3.e     // Catch:{ all -> 0x0162 }
            int r4 = (int) r3     // Catch:{ all -> 0x0162 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x0162 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x0162 }
            java.lang.Object r2 = r2.get(r10)     // Catch:{ all -> 0x0162 }
            aabx r2 = (defpackage.aabx) r2     // Catch:{ all -> 0x0162 }
            amri r2 = defpackage.amri.c(r2)     // Catch:{ all -> 0x0162 }
            monitor-exit(r1)     // Catch:{ all -> 0x0162 }
            ampu r1 = defpackage.ampu.a     // Catch:{ all -> 0x0165 }
            boolean r3 = r2.a()     // Catch:{ all -> 0x0165 }
            r4 = 4
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x00a8
            java.lang.Object r11 = r2.b()     // Catch:{ all -> 0x0165 }
            aabx r11 = (defpackage.aabx) r11     // Catch:{ all -> 0x0165 }
            boolean r1 = r10.o()     // Catch:{ all -> 0x0165 }
            if (r1 != 0) goto L_0x003e
            goto L_0x0079
        L_0x003e:
            qwd r11 = r11.h     // Catch:{ all -> 0x0165 }
            boolean r11 = r11.a     // Catch:{ all -> 0x0165 }
            if (r11 == 0) goto L_0x0079
            int r11 = r10.l()     // Catch:{ all -> 0x0165 }
            r1 = 18000000(0x112a880, float:2.6936858E-38)
            if (r11 < r1) goto L_0x0079
            java.util.Set r11 = r9.m     // Catch:{ all -> 0x0165 }
            monitor-enter(r11)     // Catch:{ all -> 0x0165 }
            java.util.Set r1 = r9.m     // Catch:{ all -> 0x0076 }
            int r1 = r1.size()     // Catch:{ all -> 0x0076 }
            long r1 = (long) r1     // Catch:{ all -> 0x0076 }
            axbn r3 = defpackage.axbn.a     // Catch:{ all -> 0x0076 }
            axbx r3 = r3.a()     // Catch:{ all -> 0x0076 }
            long r3 = r3.I()     // Catch:{ all -> 0x0076 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x006e
            java.lang.String r10 = "NetworkScheduler"
            java.lang.String r1 = "Too many postponed requests - dropping this one"
            android.util.Log.e(r10, r1)     // Catch:{ all -> 0x0076 }
            monitor-exit(r11)     // Catch:{ all -> 0x0076 }
            goto L_0x0074
        L_0x006e:
            java.util.Set r1 = r9.m     // Catch:{ all -> 0x0076 }
            r1.add(r10)     // Catch:{ all -> 0x0076 }
            monitor-exit(r11)     // Catch:{ all -> 0x0076 }
        L_0x0074:
            monitor-exit(r0)     // Catch:{ all -> 0x0165 }
            return
        L_0x0076:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0076 }
            throw r10     // Catch:{ all -> 0x0165 }
        L_0x0079:
            java.lang.Object r11 = r2.b()     // Catch:{ all -> 0x0165 }
            aabx r11 = (defpackage.aabx) r11     // Catch:{ all -> 0x0165 }
            java.util.List r1 = r9.a     // Catch:{ all -> 0x0165 }
            monitor-enter(r1)     // Catch:{ all -> 0x0165 }
            android.util.SparseArray r2 = r9.b     // Catch:{ all -> 0x00a5 }
            aabq r3 = r11.a     // Catch:{ all -> 0x00a5 }
            nxc r3 = r3.a     // Catch:{ all -> 0x00a5 }
            long r7 = r3.e     // Catch:{ all -> 0x00a5 }
            int r3 = (int) r7     // Catch:{ all -> 0x00a5 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x00a5 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x00a5 }
            aabq r3 = r11.a     // Catch:{ all -> 0x00a5 }
            r2.remove(r3)     // Catch:{ all -> 0x00a5 }
            aacr r2 = r9.q     // Catch:{ all -> 0x00a5 }
            r2.a((defpackage.aabx) r11, (int) r6)     // Catch:{ all -> 0x00a5 }
            aabq r11 = r11.a     // Catch:{ all -> 0x00a5 }
            amri r11 = defpackage.amri.b(r11)     // Catch:{ all -> 0x00a5 }
            monitor-exit(r1)     // Catch:{ all -> 0x00a5 }
            r1 = r11
            r5 = 4
            goto L_0x00d9
        L_0x00a5:
            r10 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a5 }
            throw r10     // Catch:{ all -> 0x0165 }
        L_0x00a8:
            java.util.List r2 = r9.a     // Catch:{ all -> 0x0165 }
            int r2 = r2.indexOf(r10)     // Catch:{ all -> 0x0165 }
            r3 = -1
            if (r2 == r3) goto L_0x00d8
            java.util.List r1 = r9.a     // Catch:{ all -> 0x0165 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0165 }
            aabq r1 = (defpackage.aabq) r1     // Catch:{ all -> 0x0165 }
            amri r1 = defpackage.amri.b(r1)     // Catch:{ all -> 0x0165 }
            if (r11 == 0) goto L_0x00d6
            if (r11 != r5) goto L_0x00d5
            qxx r11 = r10.n     // Catch:{ all -> 0x0165 }
            r2 = r1
            amrt r2 = (defpackage.amrt) r2     // Catch:{ all -> 0x0165 }
            java.lang.Object r2 = r2.a     // Catch:{ all -> 0x0165 }
            aabq r2 = (defpackage.aabq) r2     // Catch:{ all -> 0x0165 }
            qxx r2 = r2.n     // Catch:{ all -> 0x0165 }
            boolean r11 = r11.equals(r2)     // Catch:{ all -> 0x0165 }
            if (r11 != 0) goto L_0x00d3
            goto L_0x00d9
        L_0x00d3:
            monitor-exit(r0)     // Catch:{ all -> 0x0165 }
            return
        L_0x00d5:
            goto L_0x00d9
        L_0x00d6:
            monitor-exit(r0)     // Catch:{ all -> 0x0165 }
            return
        L_0x00d8:
            r5 = 1
        L_0x00d9:
            java.lang.Object r11 = r1.c()     // Catch:{ all -> 0x0165 }
            aabq r11 = (defpackage.aabq) r11     // Catch:{ all -> 0x0165 }
            r9.a((defpackage.aabq) r10, (defpackage.aabq) r11, (int) r5)     // Catch:{ all -> 0x0165 }
            aadt r11 = r9.i     // Catch:{ all -> 0x0165 }
            java.util.List r2 = r9.a     // Catch:{ all -> 0x0165 }
            r11.a((java.util.Collection) r2)     // Catch:{ all -> 0x0165 }
            boolean r11 = r10.c     // Catch:{ all -> 0x0165 }
            if (r11 != 0) goto L_0x00ee
            goto L_0x0154
        L_0x00ee:
            r11 = 0
            if (r5 == r4) goto L_0x0114
            boolean r2 = r1.a()     // Catch:{ all -> 0x0165 }
            if (r2 == 0) goto L_0x0114
            java.lang.Object r1 = r1.b()     // Catch:{ all -> 0x0165 }
            aabq r1 = (defpackage.aabq) r1     // Catch:{ all -> 0x0165 }
            nxf r2 = r10.b     // Catch:{ all -> 0x0165 }
            nxf r3 = r1.b     // Catch:{ all -> 0x0165 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0165 }
            if (r2 == 0) goto L_0x0112
            nwq r2 = r10.m     // Catch:{ all -> 0x0165 }
            nwq r1 = r1.m     // Catch:{ all -> 0x0165 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x0165 }
            if (r1 == 0) goto L_0x0112
            goto L_0x0115
        L_0x0112:
            r11 = 1
            goto L_0x0115
        L_0x0114:
        L_0x0115:
            if (r5 != r6) goto L_0x0118
            goto L_0x0144
        L_0x0118:
            if (r11 != 0) goto L_0x0144
            java.lang.String r11 = "NetworkScheduler"
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0165 }
            java.lang.String r1 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0165 }
            int r1 = r1.length()     // Catch:{ all -> 0x0165 }
            int r1 = r1 + 96
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0165 }
            r2.<init>(r1)     // Catch:{ all -> 0x0165 }
            java.lang.String r1 = "Immediate task was not started "
            r2.append(r1)     // Catch:{ all -> 0x0165 }
            r2.append(r10)     // Catch:{ all -> 0x0165 }
            java.lang.String r10 = ". Rescheduling immediate tasks can cause excessive battery drain."
            r2.append(r10)     // Catch:{ all -> 0x0165 }
            java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x0165 }
            android.util.Log.w(r11, r10)     // Catch:{ all -> 0x0165 }
            goto L_0x0154
        L_0x0144:
            java.lang.String r10 = "trigger_CLIENT_LIB"
            amkr r10 = defpackage.amlv.a((java.lang.String) r10)     // Catch:{ all -> 0x0165 }
            nxn r11 = defpackage.nxn.CLIENT_LIB     // Catch:{ all -> 0x0156 }
            r9.a((defpackage.nxn) r11)     // Catch:{ all -> 0x0156 }
            if (r10 == 0) goto L_0x0154
            r10.close()     // Catch:{ all -> 0x0165 }
        L_0x0154:
            monitor-exit(r0)     // Catch:{ all -> 0x0165 }
            return
        L_0x0156:
            r11 = move-exception
            if (r10 == 0) goto L_0x0161
            r10.close()     // Catch:{ all -> 0x015d }
            goto L_0x0161
        L_0x015d:
            r10 = move-exception
            defpackage.apev.a((java.lang.Throwable) r11, (java.lang.Throwable) r10)     // Catch:{ all -> 0x0165 }
        L_0x0161:
            throw r11     // Catch:{ all -> 0x0165 }
        L_0x0162:
            r10 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0162 }
            throw r10     // Catch:{ all -> 0x0165 }
        L_0x0165:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0165 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaen.a(aabq, int):void");
    }

    public final void b(int i2) {
        synchronized (this.a) {
            if (this.b.get(i2) == null) {
                this.b.put(i2, new nz((int) axmd.b()));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r1 = (defpackage.aabq) r0.next();
        a(r1, r1.n.i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0 = r1.listIterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0.hasNext() == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r3 = this;
            java.util.Set r0 = r3.m
            monitor-enter(r0)
            java.util.Set r1 = r3.m     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0030
            java.util.Set r1 = r3.m     // Catch:{ all -> 0x0032 }
            amzy r1 = defpackage.amzy.a((java.util.Collection) r1)     // Catch:{ all -> 0x0032 }
            java.util.Set r2 = r3.m     // Catch:{ all -> 0x0032 }
            r2.clear()     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            anhk r0 = r1.listIterator()
        L_0x001b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = r0.next()
            aabq r1 = (defpackage.aabq) r1
            qxx r2 = r1.n
            int r2 = r2.i
            r3.a((defpackage.aabq) r1, (int) r2)
            goto L_0x001b
        L_0x002f:
            return
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            goto L_0x0036
        L_0x0035:
            throw r1
        L_0x0036:
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaen.c():void");
    }

    public final void b(aabq aabq) {
        synchronized (this.a) {
            aabo[] aaboArr = this.o;
            int length = aaboArr.length;
            aaboArr[0].a(aabq);
        }
        this.d.a(aabq);
    }

    public final void c(nxn nxn) {
        this.y.removeMessages(2);
        Message.obtain(this.y, 2, nxn.p, 0).sendToTarget();
    }

    public final void b(nxn nxn) {
        amsv amsv;
        boolean z2;
        ixy ixy;
        ixy ixy2;
        aaeu aaeu = this.v;
        if (nxn != nxn.EXECUTION_CALLBACK) {
            amsv a2 = amta.a(aaeq.a);
            synchronized (aaeu.a) {
                int ordinal = nxn.ordinal();
                if (ordinal == 1) {
                    z2 = axbn.a.a().A();
                    amsv = amta.a(aaer.a);
                } else if (ordinal == 2) {
                    z2 = axbn.a.a().z();
                    amsv = amta.a(aaes.a);
                } else if (ordinal != 3) {
                    amsv = a2;
                    z2 = false;
                } else {
                    z2 = axbn.a.a().y();
                    amsv = amta.a(aaet.a);
                }
                if (z2) {
                    if (!aaeu.a.containsKey(nxn) || !((String) ((Pair) aaeu.a.get(nxn)).first).equals(amsv.a())) {
                        Map map = aaeu.a;
                        String str = (String) amsv.a();
                        String str2 = (String) amsv.a();
                        List c2 = amsk.a(',').b().c(str2);
                        if (c2.size() != 3) {
                            String valueOf = String.valueOf(str2);
                            Log.e("NetworkScheduler.Wakeup", valueOf.length() == 0 ? new String("Flag does not have three values: ") : "Flag does not have three values: ".concat(valueOf));
                            ixy2 = ixy.a;
                        } else {
                            try {
                                int i2 = aaeu.c;
                                ixy2 = new ixy(Integer.parseInt((String) c2.get(0)), Integer.parseInt((String) c2.get(1)), Integer.parseInt((String) c2.get(2)));
                            } catch (NumberFormatException e2) {
                                String valueOf2 = String.valueOf(str2);
                                Log.e("NetworkScheduler.Wakeup", valueOf2.length() == 0 ? new String("Flag does not have correct format: ") : "Flag does not have correct format: ".concat(valueOf2));
                                ixy2 = ixy.a;
                            }
                        }
                        map.put(nxn, Pair.create(str, ixy2));
                    }
                    ixy = (ixy) ((Pair) aaeu.a.get(nxn)).second;
                } else {
                    aaeu.a.remove(nxn);
                    ixy = ixy.a;
                }
            }
            if (ixy.a()) {
                synchronized (aaeu.b) {
                    aaeu.b.put(nxn, Long.valueOf(SystemClock.elapsedRealtime()));
                }
            } else {
                aabn aabn = this.h;
                nxk d2 = d();
                aucd o2 = nxp.f.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                nxp nxp = (nxp) o2.b;
                nxp.b = nxn.p;
                int i3 = nxp.a | 1;
                nxp.a = i3;
                nxp.e = 3;
                nxp.a = i3 | 8;
                aabn.a(d2, (nxp) o2.i());
                return;
            }
        }
        if (!axmd.a.a().d()) {
            synchronized (this.a) {
                aaay a3 = aaaz.a(this.p);
                for (int i4 = 0; i4 < this.b.size(); i4++) {
                    int keyAt = this.b.keyAt(i4);
                    if (nqw.d(keyAt)) {
                        Map map2 = (Map) this.b.get(keyAt);
                        if (map2.size() >= a3.a) {
                            if (a3.b <= 0) {
                                continue;
                            } else if (a(map2) >= a3.b) {
                            }
                        }
                    }
                }
                return;
            }
        }
        if (this.v.e() > SystemClock.elapsedRealtime()) {
            aabn aabn2 = this.h;
            nxk d3 = d();
            aucd o3 = nxp.f.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            nxp nxp2 = (nxp) o3.b;
            nxp2.b = nxn.p;
            int i5 = nxp2.a | 1;
            nxp2.a = i5;
            nxp2.e = 5;
            int i6 = i5 | 8;
            nxp2.a = i6;
            nxp2.a = i6 | 4;
            nxp2.d = 0;
            aabn2.a(d3, (nxp) o3.i());
            return;
        }
        this.y.removeMessages(0);
        Message obtain = Message.obtain(this.y, 0);
        obtain.arg1 = nxn.p;
        obtain.sendToTarget();
    }

    private final void a(boolean z2) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            long currentTimeMillis = System.currentTimeMillis() - (axlu.f() * 1000);
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                Iterator it = ((Map) this.b.valueAt(i2)).values().iterator();
                while (it.hasNext()) {
                    aabx aabx = (aabx) it.next();
                    if (aabx.a.g <= currentTimeMillis) {
                        if (axbn.a.a().j()) {
                            if (aabx.a.k) {
                                it.remove();
                            }
                        }
                        this.q.a(aabx, 3);
                        it.remove();
                        arrayList.add(aabx);
                    }
                }
            }
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            aabx aabx2 = (aabx) arrayList.get(i3);
            if (aabx2.a.o() && z2) {
                aabq aabq = aabx2.a;
                if (aabq.o != 1) {
                    synchronized (this.a) {
                        this.a.remove(aabx2.a);
                        if (axbn.c()) {
                            this.v.a(aabx2.a);
                        }
                        b(aabx2.a);
                    }
                } else {
                    a(aabj.b(aabq), 1);
                }
            } else {
                a(aabj.c(aabx2.a), 0);
            }
            this.h.a(aabx2.a, 3);
            this.h.a(d(), aabx2, 5);
        }
    }

    private final void a(boolean z2, qyl qyl) {
        String str;
        amkr a2;
        if (!z2) {
            str = "nts:standalone:cancel";
        } else {
            str = "nts:standalone:cancelAll";
        }
        if (qyl != null) {
            qye qye = new qye(str);
            try {
                amkr a3 = amlv.a("scheduler_cancel");
                try {
                    synchronized (this.a) {
                        Iterator it = this.a.iterator();
                        boolean z3 = false;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            aabq aabq = (aabq) it.next();
                            if (qyl.a(aabq.r())) {
                                it.remove();
                                if (axbn.c()) {
                                    this.v.a(aabq);
                                }
                                b(aabq);
                                z3 = true;
                                if (!z2) {
                                    break;
                                }
                            }
                        }
                        Map map = (Map) this.b.get(qyl.a);
                        if (map != null) {
                            for (aabx aabx : map.values()) {
                                if (qyl.a(aabx.a.r())) {
                                    aabx.a.k = true;
                                    this.q.a(aabx, 2);
                                    if (!z2) {
                                        break;
                                    }
                                }
                            }
                        }
                        if (z3) {
                            this.i.a((Collection) this.a);
                        }
                    }
                    if (this.v.c()) {
                        a2 = amlv.a("trigger_CLIENT_LIB");
                        a(nxn.CLIENT_LIB);
                        if (a2 != null) {
                            a2.close();
                        }
                    }
                    if (a3 != null) {
                        a3.close();
                    }
                    qye.close();
                    return;
                } catch (Throwable th) {
                    if (a3 != null) {
                        a3.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    qye.close();
                } catch (Throwable th3) {
                    apev.a(th2, th3);
                }
                throw th2;
            }
        } else {
            return;
        }
        throw th;
    }

    public final void b(qyl qyl) {
        a(true, qyl);
    }

    /* access modifiers changed from: package-private */
    public final int a(aaeh aaeh, nxn nxn) {
        int i2;
        int i3;
        long j2;
        long j3;
        aabq aabq;
        aaeh aaeh2 = aaeh;
        nxn nxn2 = nxn;
        synchronized (this.a) {
            amkr a2 = amlv.a("checkActiveTasksTimeout");
            try {
                int i4 = 1;
                if (axbn.a.a().N()) {
                    synchronized (this.a) {
                        a(true);
                    }
                } else {
                    a(false);
                }
                if (a2 != null) {
                    a2.close();
                }
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int a3 = aaeh2.a(this.p);
                Collections.sort(this.a, aaeh2);
                this.v.a();
                Iterator it = this.a.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    aabq aabq2 = (aabq) it.next();
                    aabq2.l = 2;
                    if (nxn2 != nxn.INVOKE_ALL) {
                        i3 = aaeh2.a(aabq2);
                    } else {
                        i3 = 1;
                    }
                    if (i3 == 0) {
                        aabq = aabq2;
                        j3 = elapsedRealtime;
                        int i5 = aabq.l;
                        if (i5 == 8) {
                            this.g = true;
                            j2 = j3;
                        } else {
                            if (i5 == 3) {
                                j2 = j3;
                            } else if (i5 == 7) {
                                j2 = j3;
                            } else if (i5 == 10 || i5 == 12 || i5 == 5 || i5 == 11 || i5 == 13 || i5 == 15 || i5 == 16) {
                                j2 = j3;
                            }
                            this.u.a(this.p, i5);
                        }
                        aaeh2 = aaeh;
                        elapsedRealtime = j2;
                        i4 = 1;
                    } else if (i3 != i4) {
                        it.remove();
                        b(aabq2);
                        j2 = elapsedRealtime;
                        aaeh2 = aaeh;
                        elapsedRealtime = j2;
                        i4 = 1;
                    } else {
                        aaay a4 = aaaz.a(this.p);
                        synchronized (this.a) {
                            b((int) aabq2.a.e);
                            Map map = (Map) this.b.get((int) aabq2.a.e);
                            if (map.get(aabq2) == null) {
                                if (map.size() >= a4.a) {
                                    if (aabq2.o()) {
                                        if (a4.b > 0 && a(map) < a4.b) {
                                        }
                                    }
                                    aabq2.l = 4;
                                    aabq = aabq2;
                                    j3 = elapsedRealtime;
                                }
                                PackageManager c2 = this.w.c((int) aabq2.a.e);
                                if (c2 != null) {
                                    aabq = aabq2;
                                    aabx aabx = r2;
                                    j3 = elapsedRealtime;
                                    aabx aabx2 = new aabx(aabq2, this.p, this.z, this.r, c2, this.h, aabx.a(), nxn, a3);
                                    aabq.g = System.currentTimeMillis();
                                    synchronized (this.a) {
                                        b((int) aabq.a.e);
                                        ((Map) this.b.get((int) aabq.a.e)).put(aabq, aabx);
                                    }
                                    acwa a5 = this.q.a(this.p, aabx);
                                    aaaz aaaz = aabg.a().a;
                                    if (aaaz != null) {
                                        a5.a(aaaz.b, (acvp) new aaei(this, aabx, nxn2));
                                        it.remove();
                                        i2++;
                                        aaeh2 = aaeh;
                                        elapsedRealtime = j3;
                                        i4 = 1;
                                    }
                                } else {
                                    aabq = aabq2;
                                    j3 = elapsedRealtime;
                                    aabq.l = 14;
                                }
                            } else {
                                aabq = aabq2;
                                j3 = elapsedRealtime;
                                aabq.l = 6;
                            }
                        }
                    }
                    j2 = j3;
                    this.v.a(j2, aabq);
                    aaeh2 = aaeh;
                    elapsedRealtime = j2;
                    i4 = 1;
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Throwable th3) {
                        apev.a(th2, th3);
                    }
                }
                throw th2;
            }
        }
        this.v.d();
        this.h.b(nxn2);
        return i2;
    }

    public final void a() {
        amky b2 = this.f.b("init");
        try {
            synchronized (this.a) {
                if (!this.t) {
                    this.s = SystemClock.elapsedRealtime();
                    qye qye = new qye("nts:standalone:init");
                    try {
                        qvr qvr = new qvr(this.x);
                        aabo[] aaboArr = this.o;
                        int length = aaboArr.length;
                        aaboArr[0].a((Handler) qvr);
                        this.y = new aaej(this.x, this.e, this);
                        ArrayList<aabq> arrayList = new ArrayList<>(this.d.c());
                        ArrayList<aabq> arrayList2 = new ArrayList<>();
                        for (aabq aabq : arrayList) {
                            if (!this.c.a(aabq, c(aabq))) {
                                arrayList2.add(aabq);
                            }
                        }
                        for (aabq a2 : arrayList2) {
                            this.d.a(a2);
                        }
                        arrayList.removeAll(arrayList2);
                        int size = arrayList2.size();
                        for (aabq b3 : arrayList) {
                            b(b3, (aabq) null, 1);
                        }
                        this.a.addAll(arrayList);
                        this.i.a((Collection) this.a);
                        nwu e2 = this.d.e();
                        List a3 = aadn.a((Iterable) this.a);
                        aubn a4 = augi.a(SystemClock.elapsedRealtime() - this.s);
                        aabn aabn = this.h;
                        nxk d2 = d();
                        aucd o2 = nxa.g.o();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        nxa nxa = (nxa) o2.b;
                        e2.getClass();
                        nxa.f = e2;
                        int i2 = nxa.a | 8;
                        nxa.a = i2;
                        int i3 = i2 | 2;
                        nxa.a = i3;
                        nxa.c = (long) size;
                        a4.getClass();
                        nxa.b = a4;
                        nxa.a = i3 | 1;
                        o2.G(a3);
                        aabn.a(d2, (nxa) o2.i());
                        this.t = true;
                        qye.close();
                    } catch (Throwable th) {
                        apev.a(th, th);
                    }
                }
            }
            if (b2 != null) {
                b2.close();
                return;
            }
            return;
            throw th;
        } catch (Throwable th2) {
            if (b2 != null) {
                try {
                    b2.close();
                } catch (Throwable th3) {
                    apev.a(th2, th3);
                }
            }
            throw th2;
        }
    }

    public final void a(int i2) {
        aaee e2 = e();
        if (e2 != null) {
            e2.a(i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r1.remove(r7.a) == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r6, defpackage.aabx r7) {
        /*
            r5 = this;
            java.util.List r0 = r5.a
            monitor-enter(r0)
            android.util.SparseArray r1 = r5.b     // Catch:{ all -> 0x0061 }
            int r2 = r7.k()     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0061 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            aabq r2 = r7.a     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r1.remove(r2)     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x003e
        L_0x001a:
            java.lang.String r1 = "NetworkScheduler"
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0061 }
            int r3 = r3.length()     // Catch:{ all -> 0x0061 }
            int r3 = r3 + 25
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r4.<init>(r3)     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = "No record of active task "
            r4.append(r3)     // Catch:{ all -> 0x0061 }
            r4.append(r2)     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0061 }
            android.util.Log.w(r1, r2)     // Catch:{ all -> 0x0061 }
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            boolean r6 = defpackage.aacr.a((int) r6)
            if (r6 == 0) goto L_0x005b
            aabq r6 = r7.a
            aabq r6 = defpackage.aabj.c(r6)
            r7 = 2
            r6.l = r7
            java.util.List r0 = r5.a
            monitor-enter(r0)
            java.util.List r7 = r5.a     // Catch:{ all -> 0x0058 }
            r7.add(r6)     // Catch:{ all -> 0x0058 }
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return
        L_0x0058:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            throw r6
        L_0x005b:
            aabq r6 = r7.a
            r5.b((defpackage.aabq) r6)
            return
        L_0x0061:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaen.a(int, aabx):void");
    }

    public final void a(aabq aabq) {
        amkr a2;
        String valueOf = String.valueOf(aabq.e());
        qye qye = new qye(valueOf.length() == 0 ? new String("nts:standalone:schedule:") : "nts:standalone:schedule:".concat(valueOf));
        try {
            a2 = amlv.a("schedule");
            if (this.c.a(aabq, c(aabq))) {
                this.c.a(aabq);
                a(aabq, aabq.n.i);
                if (a2 != null) {
                    a2.close();
                }
            } else if (a2 != null) {
                a2.close();
            }
            qye.close();
            return;
        } catch (Throwable th) {
            try {
                qye.close();
            } catch (Throwable th2) {
                apev.a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    public final void a(aabq aabq, aabq aabq2, int i2) {
        synchronized (this.a) {
            if (aabq2 != null) {
                this.a.remove(aabq2);
                if (axbn.c()) {
                    this.v.a(aabq2);
                }
            }
            aabq.l = 2;
            this.a.add(aabq);
            b(aabq, aabq2, i2);
            this.d.a(aabq, aabq2);
            if (this.v.a(SystemClock.elapsedRealtime(), aabq)) {
                this.v.d();
            }
        }
    }

    public final void a(PrintWriter printWriter, String[] strArr) {
        printWriter.println();
        printWriter.println("Global GmsTaskScheduler stats:");
        synchronized (this.a) {
            this.v.a(printWriter);
            printWriter.println("\nActive tasks:");
            synchronized (this.a) {
                boolean z2 = false;
                for (int i2 = 0; i2 < this.b.size(); i2++) {
                    for (aabx a2 : ((Map) this.b.valueAt(i2)).values()) {
                        a2.a(printWriter);
                        z2 = true;
                    }
                }
                if (!z2) {
                    printWriter.println("   none.");
                }
            }
            printWriter.println();
            this.u.a(printWriter);
        }
        synchronized (this.a) {
            this.i.a(printWriter);
            aabj.a(printWriter, strArr, Collections.unmodifiableList(this.a), this.h);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        r0 = r10.h;
        r1 = d();
        r3 = defpackage.nxp.f.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        if (r3.c != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        r3.c();
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        r4 = (defpackage.nxp) r3.b;
        r4.b = r11.p;
        r11 = r4.a | 1;
        r4.a = r11;
        r4.e = 4;
        r4.a = r11 | 8;
        r0.a(r1, (defpackage.nxp) r3.i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.nxn r11) {
        /*
            r10 = this;
            aaeu r0 = r10.v
            axmd r1 = defpackage.axmd.a
            axme r1 = r1.a()
            boolean r1 = r1.e()
            r2 = 1
            if (r1 == 0) goto L_0x007e
            long r3 = android.os.SystemClock.elapsedRealtime()
            java.util.EnumMap r1 = r0.b
            monitor-enter(r1)
            java.util.EnumMap r5 = r0.b     // Catch:{ all -> 0x007b }
            java.lang.Object r5 = r5.get(r11)     // Catch:{ all -> 0x007b }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x007b }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x007b }
            axmd r7 = defpackage.axmd.a     // Catch:{ all -> 0x007b }
            axme r7 = r7.a()     // Catch:{ all -> 0x007b }
            long r7 = r7.n()     // Catch:{ all -> 0x007b }
            long r6 = r6.toMillis(r7)     // Catch:{ all -> 0x007b }
            if (r5 != 0) goto L_0x0031
            goto L_0x0070
        L_0x0031:
            long r8 = r5.longValue()     // Catch:{ all -> 0x007b }
            long r8 = r8 + r6
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x0070
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            aabn r0 = r10.h
            nxk r1 = r10.d()
            nxp r3 = defpackage.nxp.f
            aucd r3 = r3.o()
            boolean r4 = r3.c
            if (r4 != 0) goto L_0x004c
            goto L_0x0052
        L_0x004c:
            r3.c()
            r4 = 0
            r3.c = r4
        L_0x0052:
            aucj r4 = r3.b
            nxp r4 = (defpackage.nxp) r4
            int r11 = r11.p
            r4.b = r11
            int r11 = r4.a
            r11 = r11 | r2
            r4.a = r11
            r2 = 4
            r4.e = r2
            r11 = r11 | 8
            r4.a = r11
            aucj r11 = r3.i()
            nxp r11 = (defpackage.nxp) r11
            r0.a((defpackage.nxk) r1, (defpackage.nxp) r11)
            return
        L_0x0070:
            java.util.EnumMap r0 = r0.b     // Catch:{ all -> 0x007b }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x007b }
            r0.put(r11, r3)     // Catch:{ all -> 0x007b }
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            goto L_0x007e
        L_0x007b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            throw r11
        L_0x007e:
            android.os.Handler r0 = r10.y
            r0.removeMessages(r2)
            android.os.Handler r0 = r10.y
            android.os.Message r0 = android.os.Message.obtain(r0, r2)
            int r11 = r11.p
            r0.arg1 = r11
            r0.sendToTarget()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaen.a(nxn):void");
    }

    public final void a(qvz qvz, Uri uri, int i2) {
        aaee e2 = e();
        if (e2 != null && qvz != null) {
            e2.a(qvz, uri, i2);
        }
    }

    public final void a(qyl qyl) {
        a(false, qyl);
    }
}
