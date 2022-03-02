package defpackage;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.api.ApiChimeraService;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: kdv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kdv {
    public static final EnumSet a = EnumSet.of(kaj.CREATE_FILE, kaj.CONTENT_AND_METADATA);
    private static final ith d = new ith("PendingActionManager", "");
    public final jfc b;
    public Runnable c;
    private final kkf e;
    private final Context f;
    private final lsm g;
    private final kdn h;
    private final khw i;
    private final ksw j;
    private final lfr k;
    private final jiq l;
    private final lhv m;
    private final List n = new LinkedList();
    private final Map o = new HashMap();
    private final List p = new ArrayList();
    private final Map q = new HashMap();
    private ThreadPoolExecutor r;
    private ThreadPoolExecutor s;
    private final lgy t;

    public kdv(kkf kkf, lgy lgy, Context context, kdl kdl, lsm lsm, kdn kdn, lsh lsh, khw khw, jfc jfc, ksw ksw, lfr lfr, jiq jiq, lhv lhv) {
        iva.a((Object) kkf);
        this.e = kkf;
        iva.a((Object) lgy);
        this.t = lgy;
        iva.a((Object) context);
        this.f = context;
        iva.a((Object) kdl);
        iva.a((Object) lsm);
        this.g = lsm;
        iva.a((Object) kdn);
        this.h = kdn;
        iva.a((Object) lsh);
        iva.a((Object) khw);
        this.i = khw;
        iva.a((Object) jfc);
        this.b = jfc;
        iva.a((Object) ksw);
        this.j = ksw;
        iva.a((Object) lfr);
        this.k = lfr;
        iva.a((Object) jiq);
        this.l = jiq;
        iva.a((Object) lhv);
        this.m = lhv;
    }

    private static final List a(List list, AppIdentity appIdentity, kkz kkz, List list2) {
        return lrl.a(list, new kdu(appIdentity, kkz, list2));
    }

    /* JADX INFO: finally extract failed */
    private final synchronized void b(List list) {
        for (kdw kdw : anda.a(list)) {
            try {
                a(kdw, true, 3, this.e, this.i, this.h);
                kdw.a(8, true);
                d(kdw);
                kdw.a.u();
                kdw.a();
                this.i.a();
            } catch (Throwable th) {
                d(kdw);
                kdw.a.u();
                kdw.a();
                this.i.a();
                throw th;
            }
        }
    }

    private final void c(kdw kdw) {
        this.n.add(kdw);
        if (kdw.e()) {
            List list = (List) this.o.get(kdw.b().s());
            if (list == null) {
                this.o.put(kdw.b().s(), new ArrayList());
                list = (List) this.o.get(kdw.b().s());
            }
            list.add(kdw);
        }
        c(kdw, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void d(defpackage.kdw r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.List r0 = r5.n     // Catch:{ all -> 0x0079 }
            boolean r0 = r0.remove(r6)     // Catch:{ all -> 0x0079 }
            if (r0 != 0) goto L_0x0012
            ith r0 = d     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "PendingActionManager"
            java.lang.String r2 = "The action was not found in the list of queued actions"
            r0.c((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0079 }
        L_0x0012:
            java.util.Map r0 = r5.q     // Catch:{ all -> 0x0079 }
            r0.remove(r6)     // Catch:{ all -> 0x0079 }
            kah r0 = r6.b()     // Catch:{ all -> 0x0079 }
            knc r0 = r0.s()     // Catch:{ all -> 0x0079 }
            java.util.Map r1 = r5.o     // Catch:{ all -> 0x0079 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0079 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x002c
            r1.remove(r6)     // Catch:{ all -> 0x0079 }
        L_0x002c:
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0043
            int r4 = r1.size()     // Catch:{ all -> 0x0079 }
            if (r4 > 0) goto L_0x0037
            goto L_0x0043
        L_0x0037:
            java.lang.Object r6 = r1.get(r3)     // Catch:{ all -> 0x0079 }
            kdw r6 = (defpackage.kdw) r6     // Catch:{ all -> 0x0079 }
            r5.c((defpackage.kdw) r6, (int) r2)     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)
            return
        L_0x0043:
            boolean r1 = r6.e()     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x0069
            kah r1 = r6.b()     // Catch:{ kco -> 0x006b }
            kkf r4 = r5.e     // Catch:{ kco -> 0x006b }
            khq r1 = r1.c((defpackage.kkf) r4)     // Catch:{ kco -> 0x006b }
            kkf r4 = r5.e     // Catch:{ kco -> 0x006b }
            kmp r0 = r4.a((defpackage.khq) r1, (defpackage.knc) r0)     // Catch:{ kco -> 0x006b }
            if (r0 == 0) goto L_0x0069
            com.google.android.gms.drive.events.internal.TransferProgressData r1 = new com.google.android.gms.drive.events.internal.TransferProgressData     // Catch:{ kco -> 0x006b }
            com.google.android.gms.drive.DriveId r4 = r0.g()     // Catch:{ kco -> 0x006b }
            r1.<init>(r3, r4)     // Catch:{ kco -> 0x006b }
            ksw r4 = r5.j     // Catch:{ kco -> 0x006b }
            r4.a((com.google.android.gms.drive.events.internal.TransferProgressData) r1, (defpackage.kmp) r0)     // Catch:{ kco -> 0x006b }
        L_0x0069:
            monitor-exit(r5)
            return
        L_0x006b:
            r0 = move-exception
            ith r0 = d     // Catch:{ all -> 0x0079 }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0079 }
            r1[r3] = r6     // Catch:{ all -> 0x0079 }
            java.lang.String r6 = "App no longer authorized so cannot notify upload listeners. Action: %s"
            r0.a((java.lang.String) r6, (java.lang.Object[]) r1)     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)
            return
        L_0x0079:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdv.d(kdw):void");
    }

    private final synchronized void g() {
        kkf kkf = this.e;
        kjp kjp = (kjp) kkf;
        kky a2 = kjp.a(((kjp) kkf).a.a(koi.a.b(), (String[]) null, (kqy) null, String.valueOf(koi.a.a.a()).concat(" ASC")), kof.b());
        try {
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                kdw a3 = a((kof) it.next());
                if (a3 != null) {
                    c(a3);
                }
            }
        } finally {
            a2.close();
        }
    }

    private final List h() {
        List list = this.n;
        List list2 = this.p;
        iva.a((Object) list2);
        ArrayList arrayList = new ArrayList(list.size());
        for (Object next : list) {
            if (!list2.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final synchronized void e() {
        if (this.c == null && !this.q.isEmpty()) {
            long longValue = ((Long) jzq.g.c()).longValue();
            if (longValue > 0) {
                kds kds = new kds(this);
                this.c = kds;
                this.b.a((Runnable) kds, longValue, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final synchronized void f() {
        for (kdw h2 : this.n) {
            h2.h();
        }
    }

    private static final List a(List list, kkz kkz, DriveId driveId) {
        return lrl.a(list, new kdt(kkz, driveId));
    }

    public static kdv a(kkf kkf, lgy lgy, Context context, kdl kdl, lsm lsm, kdn kdn, lsh lsh, khw khw, ksw ksw, lfr lfr, jiq jiq, lhv lhv) {
        iva.a(!kkf.b());
        kdv kdv = new kdv(kkf, lgy, context, kdl, lsm, kdn, lsh, khw, jfm.a(1, 9), ksw, lfr, jiq, lhv);
        kdv.a();
        return kdv;
    }

    private final kdw a(kof kof) {
        try {
            return new kdw(kof, kdl.a(this.e, kof), this.j, this.e, this.m);
        } catch (JSONException e2) {
            d.c("PendingActionManager", String.format("Discarded action that could not be deserialized: %s", new Object[]{kof}), e2);
            kof.u();
            this.i.a();
            return null;
        }
    }

    private final synchronized void c(kdw kdw, int i2) {
        List list = (List) this.o.get(kdw.b().s());
        boolean z = false;
        if (list != null && !list.isEmpty() && kdw.equals(list.get(0))) {
            z = true;
        }
        kdw.a(i2, z);
    }

    private final synchronized void b(kdw kdw) {
        if (!this.p.remove(kdw)) {
            d.c("PendingActionManager", "The action was not found in the list of executing actions");
        }
    }

    public final synchronized void c() {
        iva.a(!this.e.b());
        notifyAll();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (r4.c() == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d9, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.kdw b(boolean r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            lgy r0 = r6.t     // Catch:{ all -> 0x00da }
            boolean r0 = r0.a()     // Catch:{ all -> 0x00da }
            r1 = 0
            if (r0 == 0) goto L_0x00d8
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00da }
            r0.<init>()     // Catch:{ all -> 0x00da }
            java.util.List r2 = r6.n     // Catch:{ all -> 0x00da }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00da }
        L_0x0015:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00da }
            if (r3 == 0) goto L_0x00d8
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00da }
            kdw r3 = (defpackage.kdw) r3     // Catch:{ all -> 0x00da }
            java.util.List r4 = r6.p     // Catch:{ all -> 0x00da }
            boolean r4 = r4.contains(r3)     // Catch:{ all -> 0x00da }
            if (r4 != 0) goto L_0x0015
            kah r4 = r3.b()     // Catch:{ kcm -> 0x00ae }
            kkf r5 = r3.b     // Catch:{ kcm -> 0x00ae }
            r4.c((defpackage.kkf) r5)     // Catch:{ kcm -> 0x00ae }
            boolean r5 = r3.i()     // Catch:{ kcm -> 0x00ae }
            if (r5 != 0) goto L_0x009d
            boolean r4 = r4.j()     // Catch:{ kcm -> 0x00ae }
            if (r4 != 0) goto L_0x003f
            goto L_0x004a
        L_0x003f:
            lht r4 = r3.c     // Catch:{ kcm -> 0x00ae }
            if (r4 == 0) goto L_0x004a
            boolean r4 = r4.c()     // Catch:{ kcm -> 0x00ae }
            if (r4 != 0) goto L_0x004a
            goto L_0x009d
        L_0x004a:
            kah r4 = r3.b()     // Catch:{ all -> 0x00da }
            java.util.List r5 = r6.p     // Catch:{ all -> 0x00da }
            boolean r5 = a((defpackage.kah) r4, (java.util.List) r5)     // Catch:{ all -> 0x00da }
            if (r5 != 0) goto L_0x0094
            boolean r4 = a((defpackage.kah) r4, (java.util.List) r0)     // Catch:{ all -> 0x00da }
            if (r4 == 0) goto L_0x005d
            goto L_0x0094
        L_0x005d:
            if (r7 != 0) goto L_0x0060
            goto L_0x006c
        L_0x0060:
            java.util.EnumSet r4 = a     // Catch:{ all -> 0x00da }
            boolean r4 = r3.a((java.util.Set) r4)     // Catch:{ all -> 0x00da }
            if (r4 == 0) goto L_0x006c
            r0.add(r3)     // Catch:{ all -> 0x00da }
            goto L_0x0015
        L_0x006c:
            java.util.Map r4 = r6.q     // Catch:{ all -> 0x00da }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x00da }
            lsg r4 = (defpackage.lsg) r4     // Catch:{ all -> 0x00da }
            if (r4 == 0) goto L_0x0089
            boolean r5 = r4.d()     // Catch:{ all -> 0x00da }
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0086
            r4 = 4
            r6.c((defpackage.kdw) r3, (int) r4)     // Catch:{ all -> 0x00da }
            r0.add(r3)     // Catch:{ all -> 0x00da }
            goto L_0x0015
        L_0x0086:
            r4.g()     // Catch:{ all -> 0x00da }
        L_0x0089:
            java.util.List r7 = r6.p     // Catch:{ all -> 0x00da }
            r7.add(r3)     // Catch:{ all -> 0x00da }
            r7 = 6
            r6.c((defpackage.kdw) r3, (int) r7)     // Catch:{ all -> 0x00da }
            monitor-exit(r6)
            return r3
        L_0x0094:
            r4 = 3
            r6.c((defpackage.kdw) r3, (int) r4)     // Catch:{ all -> 0x00da }
            r0.add(r3)     // Catch:{ all -> 0x00da }
            goto L_0x0015
        L_0x009d:
            boolean r4 = r3.i()     // Catch:{ kcm -> 0x00ae }
            if (r4 != 0) goto L_0x00a5
            r4 = 2
            goto L_0x00a6
        L_0x00a5:
            r4 = 5
        L_0x00a6:
            r6.c((defpackage.kdw) r3, (int) r4)     // Catch:{ kcm -> 0x00ae }
            r0.add(r3)     // Catch:{ kcm -> 0x00ae }
            goto L_0x0015
        L_0x00ae:
            r4 = move-exception
            kkf r4 = r6.e     // Catch:{ all -> 0x00c6 }
            a((defpackage.kdw) r3, (defpackage.kkf) r4)     // Catch:{ all -> 0x00c6 }
            r2.remove()     // Catch:{ all -> 0x00da }
            kof r4 = r3.a     // Catch:{ all -> 0x00da }
            r4.u()     // Catch:{ all -> 0x00da }
            r3.a()     // Catch:{ all -> 0x00da }
            khw r3 = r6.i     // Catch:{ all -> 0x00da }
            r3.a()     // Catch:{ all -> 0x00da }
            goto L_0x0015
        L_0x00c6:
            r7 = move-exception
            r2.remove()     // Catch:{ all -> 0x00da }
            kof r0 = r3.a     // Catch:{ all -> 0x00da }
            r0.u()     // Catch:{ all -> 0x00da }
            r3.a()     // Catch:{ all -> 0x00da }
            khw r0 = r6.i     // Catch:{ all -> 0x00da }
            r0.a()     // Catch:{ all -> 0x00da }
            throw r7     // Catch:{ all -> 0x00da }
        L_0x00d8:
            monitor-exit(r6)
            return r1
        L_0x00da:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x00de
        L_0x00dd:
            throw r7
        L_0x00de:
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdv.b(boolean):kdw");
    }

    public final synchronized boolean c(kkz kkz, DriveId driveId) {
        boolean z;
        List<kdw> a2 = a(this.n, kkz, driveId);
        if (!a2.isEmpty()) {
            for (kdw h2 : a2) {
                h2.h();
            }
            notifyAll();
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((kdw) it.next()).f();
        }
    }

    private static void a(kdw kdw, kkf kkf) {
        kdw.a(new kam(kkf, kdw.a.m, (lfq) null));
    }

    public final synchronized void d() {
        Iterator it = this.q.values().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((lsg) it.next()).c()) {
                    notifyAll();
                    break;
                }
            } else {
                break;
            }
        }
    }

    static void a(kdw kdw, boolean z, int i2, kkf kkf, khw khw, kdn kdn) {
        synchronized (khw.f) {
            kdm a2 = kdw.b().a(kkf);
            if (z) {
                a(kdw, kkf);
            }
            if (a2 != null) {
                kdn.a(i2, a2);
            }
        }
    }

    static boolean a(kah kah, List list) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (((kdw) list.get(i2)).b().a(kah)) {
                return true;
            }
            i2 = i3;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean a(defpackage.kdw r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            kah r0 = r6.b()     // Catch:{ all -> 0x006c }
            boolean r0 = r0.l()     // Catch:{ all -> 0x006c }
            r1 = 0
            if (r0 == 0) goto L_0x006a
            kah r0 = r6.b()     // Catch:{ all -> 0x006c }
            knc r0 = r0.s()     // Catch:{ all -> 0x006c }
            java.util.List r2 = r5.n     // Catch:{ all -> 0x006c }
            int r2 = r2.size()     // Catch:{ all -> 0x006c }
            int r2 = r2 + -1
        L_0x001c:
            if (r2 < 0) goto L_0x0059
            java.util.List r3 = r5.n     // Catch:{ all -> 0x006c }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x006c }
            kdw r3 = (defpackage.kdw) r3     // Catch:{ all -> 0x006c }
            kah r3 = r3.b()     // Catch:{ all -> 0x006c }
            boolean r4 = r3 instanceof defpackage.kbj     // Catch:{ all -> 0x006c }
            if (r4 == 0) goto L_0x0043
            kbj r3 = (defpackage.kbj) r3     // Catch:{ all -> 0x006c }
            java.util.Set r3 = r3.o()     // Catch:{ all -> 0x006c }
            boolean r3 = r3.contains(r0)     // Catch:{ all -> 0x006c }
            if (r3 == 0) goto L_0x0056
            java.util.List r0 = r5.n     // Catch:{ all -> 0x006c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x006c }
            kdw r0 = (defpackage.kdw) r0     // Catch:{ all -> 0x006c }
            goto L_0x005a
        L_0x0043:
            knc r3 = r3.s()     // Catch:{ all -> 0x006c }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x006c }
            if (r3 == 0) goto L_0x0056
            java.util.List r0 = r5.n     // Catch:{ all -> 0x006c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x006c }
            kdw r0 = (defpackage.kdw) r0     // Catch:{ all -> 0x006c }
            goto L_0x005a
        L_0x0056:
            int r2 = r2 + -1
            goto L_0x001c
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r0 == 0) goto L_0x0068
            boolean r2 = r0.a((defpackage.kdw) r6)     // Catch:{ all -> 0x006c }
            if (r2 == 0) goto L_0x0068
            boolean r6 = r0.b(r6)     // Catch:{ all -> 0x006c }
            monitor-exit(r5)
            return r6
        L_0x0068:
            monitor-exit(r5)
            return r1
        L_0x006a:
            monitor-exit(r5)
            return r1
        L_0x006c:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x0070
        L_0x006f:
            throw r6
        L_0x0070:
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdv.a(kdw):boolean");
    }

    /* access modifiers changed from: protected */
    public final ThreadPoolExecutor a(boolean z, int i2) {
        int i3 = i2;
        int i4 = i2;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i3, i4, 10, TimeUnit.SECONDS, new kdg(this.g, this.e, this.t, this.h, this.i, this, this.k, this.l, z));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* access modifiers changed from: protected */
    public final synchronized kdw a(boolean z) {
        kdw b2;
        while (true) {
            b2 = b(z);
            if (b2 == null) {
                wait();
            }
        }
        return b2;
    }

    /* access modifiers changed from: protected */
    public final synchronized void a() {
        boolean z;
        boolean z2;
        if (this.r == null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        if (this.s == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(z2);
        g();
        ThreadPoolExecutor a2 = a(false, ((Integer) jzq.e.c()).intValue());
        this.r = a2;
        a2.prestartAllCoreThreads();
        if (((Integer) jzq.f.c()).intValue() > 0) {
            ThreadPoolExecutor a3 = a(true, ((Integer) jzq.f.c()).intValue());
            this.s = a3;
            a3.prestartAllCoreThreads();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void b(kdw kdw, int i2) {
        iva.a(!this.e.b());
        b(kdw);
        if (i2 != 1) {
            if (i2 != 4) {
                if (i2 != 5) {
                    d.b("PendingActionManager", "Cannot skip action using status: %s", Integer.valueOf(i2));
                }
            } else if (!this.q.containsKey(kdw)) {
                this.q.put(kdw, new lrq(((Long) jzq.a.c()).longValue(), ((Double) jzq.c.c()).doubleValue(), ((Long) jzq.b.c()).longValue()));
                e();
            }
            c(kdw, i2);
            notifyAll();
        }
        this.q.remove(kdw);
        c(kdw, i2);
        notifyAll();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            kkf r0 = r5.e     // Catch:{ all -> 0x0065 }
            kql r1 = defpackage.koi.a     // Catch:{ all -> 0x0065 }
            kqh r1 = r1.a     // Catch:{ all -> 0x0065 }
            kqy r1 = r1.e((long) r6)     // Catch:{ all -> 0x0065 }
            r2 = r0
            kjp r2 = (defpackage.kjp) r2     // Catch:{ all -> 0x0065 }
            kkb r2 = r2.a     // Catch:{ all -> 0x0065 }
            kql r3 = defpackage.koi.a     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = r3.b()     // Catch:{ all -> 0x0065 }
            r4 = 0
            android.database.Cursor r1 = r2.a((java.lang.String) r3, (java.lang.String[]) r4, (defpackage.kqy) r1, (java.lang.String) r4)     // Catch:{ all -> 0x0065 }
            kkp r2 = defpackage.kof.b()     // Catch:{ all -> 0x0065 }
            kjp r0 = (defpackage.kjp) r0     // Catch:{ all -> 0x0065 }
            kky r0 = r0.a((android.database.Cursor) r1, (defpackage.kkp) r2)     // Catch:{ all -> 0x0065 }
            java.lang.Object r0 = defpackage.kjp.b((defpackage.kky) r0)     // Catch:{ all -> 0x0065 }
            kof r0 = (defpackage.kof) r0     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0052
            kdw r6 = r5.a((defpackage.kof) r0)     // Catch:{ all -> 0x0065 }
            if (r6 == 0) goto L_0x0050
            boolean r7 = r5.a((defpackage.kdw) r6)     // Catch:{ all -> 0x0065 }
            if (r7 != 0) goto L_0x0050
            r5.c(r6)     // Catch:{ all -> 0x0065 }
            android.content.Context r6 = r5.f     // Catch:{ all -> 0x0065 }
            com.google.android.gms.drive.api.ApiChimeraService.b(r6)     // Catch:{ all -> 0x0065 }
            java.util.concurrent.ThreadPoolExecutor r6 = r5.r     // Catch:{ all -> 0x0065 }
            r6.prestartCoreThread()     // Catch:{ all -> 0x0065 }
            java.util.concurrent.ThreadPoolExecutor r6 = r5.s     // Catch:{ all -> 0x0065 }
            if (r6 == 0) goto L_0x004d
            r6.prestartCoreThread()     // Catch:{ all -> 0x0065 }
        L_0x004d:
            r5.notifyAll()     // Catch:{ all -> 0x0065 }
        L_0x0050:
            monitor-exit(r5)
            return
        L_0x0052:
            ith r0 = d     // Catch:{ all -> 0x0065 }
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0065 }
            r2 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0065 }
            r1[r2] = r6     // Catch:{ all -> 0x0065 }
            java.lang.String r6 = "Ignoring enqueuePendingAction (action id: %d): not persisted in DB"
            r0.a((java.lang.String) r6, (java.lang.Object[]) r1)     // Catch:{ all -> 0x0065 }
            monitor-exit(r5)
            return
        L_0x0065:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdv.a(long):void");
    }

    public final synchronized boolean b() {
        return !this.n.isEmpty();
    }

    public final synchronized boolean b(kkz kkz, DriveId driveId) {
        boolean z;
        List<kdw> a2 = a(this.n, kkz, driveId);
        if (!a2.isEmpty()) {
            for (kdw g2 : a2) {
                g2.g();
            }
            notifyAll();
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void a(AppIdentity appIdentity, kkz kkz, List list) {
        iva.a((Object) appIdentity);
        iva.a((Object) list);
        iva.b(!list.isEmpty());
        b(a(h(), appIdentity, kkz, list));
        a(a(this.p, appIdentity, kkz, list));
        notifyAll();
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(kdw kdw, int i2) {
        iva.a(!this.e.b());
        c(kdw, i2);
        b(kdw);
        d(kdw);
        kdw.a.u();
        kdw.a();
        this.i.a();
        notifyAll();
        if (this.n.isEmpty()) {
            ApiChimeraService.a(this.f);
        }
    }

    public final synchronized boolean a(kkz kkz, DriveId driveId) {
        boolean z;
        boolean z2;
        iva.a((Object) driveId);
        List a2 = a(h(), kkz, driveId);
        z = true;
        if (!a2.isEmpty()) {
            b(a2);
            z2 = true;
        } else {
            z2 = false;
        }
        List a3 = a(this.p, kkz, driveId);
        if (!a3.isEmpty()) {
            a(a3);
        } else {
            z = z2;
        }
        notifyAll();
        return z;
    }
}
