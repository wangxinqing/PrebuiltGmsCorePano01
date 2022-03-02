package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: uru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uru {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final Map c = new nz();
    public final Map d = new nz();
    public final ScheduledExecutorService e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public urq g;
    private final uro h;
    private final Map i = new nz();

    public uru() {
        uro uro = new uro();
        ScheduledExecutorService a2 = tid.a();
        this.h = uro;
        this.e = a2;
    }

    public static String a(Collection collection) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            urq urq = (urq) it.next();
            if (z) {
                sb.append(", ");
            }
            sb.append(urq.d());
            z = true;
        }
        sb.append("]");
        return sb.toString();
    }

    private final void b(urq urq, urq urq2) {
        if (!this.d.containsKey(urq)) {
            this.d.put(urq, new ArrayList());
        }
        ((List) this.d.get(urq)).add(urq2);
    }

    private final void d(urq urq) {
        ((urs) this.c.remove(urq)).b.b();
    }

    private final void e(urq urq) {
        if (this.b.remove(urq) || this.d.remove(urq) != null) {
            urq.b(3);
        } else if (this.c.containsKey(urq)) {
            d(urq);
            urq.b(3);
        } else {
            ((anih) ((anih) ulh.a.c()).a("uru", "e", 701, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Can't stop %s because it was never registered successfully.", (Object) "[MMD]:", (Object) urq.d());
        }
    }

    private final void f(urq urq) {
        this.i.put(urq, new ArrayList());
    }

    public final synchronized void c(urq urq) {
        if (urq != null) {
            if (!this.b.remove(urq)) {
                if (this.d.remove(urq) == null) {
                    if (this.c.containsKey(urq)) {
                        d(urq);
                        urq.b(3);
                    } else {
                        ((anih) ((anih) ulh.a.c()).a("uru", "e", 701, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Can't stop %s because it was never registered successfully.", (Object) "[MMD]:", (Object) urq.d());
                    }
                    new Object[1][0] = urq.d();
                    a(urq, false);
                    jjg jjg = ulh.a;
                    return;
                }
            }
            urq.b(3);
            new Object[1][0] = urq.d();
            a(urq, false);
            jjg jjg2 = ulh.a;
            return;
        }
        ((anih) ((anih) ulh.a.c()).a("uru", "c", 670, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Null operation cannot be unregistered.", (Object) "[MMD]:");
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a);
        arrayList.addAll(this.b);
        arrayList.addAll(this.c.keySet());
        arrayList.addAll(this.d.keySet());
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ba, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r7.wait();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c4, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cb, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r0 = r6.i.values().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00da, code lost:
        if (r0.hasNext() != false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dc, code lost:
        ((java.util.List) r0.next()).remove(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ea, code lost:
        return defpackage.urt.FAILURE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ef, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r6.a.add(r7);
        f(r7);
        r0 = defpackage.ulh.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.urt b(defpackage.urq r7) {
        /*
            r6 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f
            boolean r0 = r0.get()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000c
            goto L_0x00fb
        L_0x000c:
            monitor-enter(r6)
            urq r0 = r6.g     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x017f
            java.util.List r0 = r6.b()     // Catch:{ all -> 0x0192 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0192 }
        L_0x0019:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0192 }
            if (r3 == 0) goto L_0x0044
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0192 }
            urq r3 = (defpackage.urq) r3     // Catch:{ all -> 0x0192 }
            uro r4 = r6.h     // Catch:{ all -> 0x0192 }
            android.util.SparseArray r4 = r4.a     // Catch:{ all -> 0x0192 }
            int r5 = r7.g     // Catch:{ all -> 0x0192 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0192 }
            urn r4 = (defpackage.urn) r4     // Catch:{ all -> 0x0192 }
            int[] r4 = r4.d     // Catch:{ all -> 0x0192 }
            int r5 = r3.g     // Catch:{ all -> 0x0192 }
            boolean r4 = defpackage.uro.a((int[]) r4, (int) r5)     // Catch:{ all -> 0x0192 }
            if (r4 == 0) goto L_0x0019
            jjg r7 = defpackage.ulh.a     // Catch:{ all -> 0x0192 }
            r3.d()     // Catch:{ all -> 0x0192 }
            urt r7 = defpackage.urt.FAILURE     // Catch:{ all -> 0x0192 }
            monitor-exit(r6)     // Catch:{ all -> 0x0192 }
            return r7
        L_0x0044:
            java.util.List r0 = r6.b()     // Catch:{ all -> 0x0192 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0192 }
        L_0x004c:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0192 }
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0192 }
            urq r3 = (defpackage.urq) r3     // Catch:{ all -> 0x0192 }
            uro r4 = r6.h     // Catch:{ all -> 0x0192 }
            android.util.SparseArray r4 = r4.a     // Catch:{ all -> 0x0192 }
            int r5 = r7.g     // Catch:{ all -> 0x0192 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0192 }
            urn r4 = (defpackage.urn) r4     // Catch:{ all -> 0x0192 }
            int[] r4 = r4.b     // Catch:{ all -> 0x0192 }
            int r5 = r3.g     // Catch:{ all -> 0x0192 }
            boolean r4 = defpackage.uro.a((int[]) r4, (int) r5)     // Catch:{ all -> 0x0192 }
            if (r4 == 0) goto L_0x004c
            r6.b(r7, r3)     // Catch:{ all -> 0x0192 }
            jjg r4 = defpackage.ulh.a     // Catch:{ all -> 0x0192 }
            r3.d()     // Catch:{ all -> 0x0192 }
            goto L_0x004c
        L_0x0077:
            java.util.Map r0 = r6.d     // Catch:{ all -> 0x0192 }
            boolean r0 = r0.containsKey(r7)     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x0178
            java.util.List r0 = r6.b()     // Catch:{ all -> 0x0192 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0192 }
        L_0x0087:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0192 }
            if (r3 == 0) goto L_0x00f0
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0192 }
            urq r3 = (defpackage.urq) r3     // Catch:{ all -> 0x0192 }
            uro r4 = r6.h     // Catch:{ all -> 0x0192 }
            android.util.SparseArray r4 = r4.a     // Catch:{ all -> 0x0192 }
            int r5 = r7.g     // Catch:{ all -> 0x0192 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0192 }
            urn r4 = (defpackage.urn) r4     // Catch:{ all -> 0x0192 }
            int[] r4 = r4.c     // Catch:{ all -> 0x0192 }
            int r5 = r3.g     // Catch:{ all -> 0x0192 }
            boolean r4 = defpackage.uro.a((int[]) r4, (int) r5)     // Catch:{ all -> 0x0192 }
            if (r4 == 0) goto L_0x0087
            java.util.Map r0 = r6.i     // Catch:{ all -> 0x0192 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0192 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0192 }
            r0.add(r7)     // Catch:{ all -> 0x0192 }
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0192 }
            r3.d()     // Catch:{ all -> 0x0192 }
            monitor-exit(r6)     // Catch:{ all -> 0x0192 }
            monitor-enter(r7)
            r7.wait()     // Catch:{ InterruptedException -> 0x00c3 }
            monitor-exit(r7)     // Catch:{ all -> 0x00c1 }
            goto L_0x0000
        L_0x00c1:
            r0 = move-exception
            goto L_0x00ee
        L_0x00c3:
            r0 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00c1 }
            r0.interrupt()     // Catch:{ all -> 0x00c1 }
            monitor-enter(r6)     // Catch:{ all -> 0x00c1 }
            java.util.Map r0 = r6.i     // Catch:{ all -> 0x00eb }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00eb }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00eb }
        L_0x00d6:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00eb }
            if (r1 == 0) goto L_0x00e6
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00eb }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x00eb }
            r1.remove(r7)     // Catch:{ all -> 0x00eb }
            goto L_0x00d6
        L_0x00e6:
            monitor-exit(r6)     // Catch:{ all -> 0x00eb }
            urt r0 = defpackage.urt.FAILURE     // Catch:{ all -> 0x00c1 }
            monitor-exit(r7)     // Catch:{ all -> 0x00c1 }
            return r0
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00eb }
            throw r0     // Catch:{ all -> 0x00c1 }
        L_0x00ee:
            monitor-exit(r7)     // Catch:{ all -> 0x00c1 }
            throw r0
        L_0x00f0:
            java.util.List r0 = r6.a     // Catch:{ all -> 0x0192 }
            r0.add(r7)     // Catch:{ all -> 0x0192 }
            r6.f(r7)     // Catch:{ all -> 0x0192 }
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0192 }
            monitor-exit(r6)     // Catch:{ all -> 0x0192 }
        L_0x00fb:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0108
            jjg r7 = defpackage.ulh.a
            urt r7 = defpackage.urt.FAILURE
            return r7
        L_0x0108:
            monitor-enter(r6)
            r0 = 0
            r6.g = r7     // Catch:{ all -> 0x0171 }
            java.util.Map r3 = r6.d     // Catch:{ all -> 0x0171 }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x0171 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0171 }
        L_0x0116:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0171 }
            if (r4 != 0) goto L_0x0167
            java.util.List r3 = r6.b     // Catch:{ all -> 0x0171 }
            java.util.List r3 = r6.a((java.util.Collection) r3, (defpackage.urq) r7)     // Catch:{ all -> 0x0171 }
            java.util.List r4 = r6.b     // Catch:{ all -> 0x0171 }
            r4.removeAll(r3)     // Catch:{ all -> 0x0171 }
            java.util.Map r3 = r6.c     // Catch:{ all -> 0x0171 }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x0171 }
            java.util.List r3 = r6.a((java.util.Collection) r3, (defpackage.urq) r7)     // Catch:{ all -> 0x0171 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0171 }
        L_0x0135:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0171 }
            if (r4 != 0) goto L_0x015d
            java.util.List r3 = r6.a     // Catch:{ all -> 0x0171 }
            r3.remove(r7)     // Catch:{ all -> 0x0171 }
            boolean r3 = r6.a((defpackage.urq) r7, (int) r2)     // Catch:{ all -> 0x0171 }
            if (r3 != 0) goto L_0x0157
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0171 }
            java.lang.String r3 = r7.d()     // Catch:{ all -> 0x0171 }
            r1[r2] = r3     // Catch:{ all -> 0x0171 }
            r6.a((defpackage.urq) r7, (boolean) r2)     // Catch:{ all -> 0x0171 }
            urt r7 = defpackage.urt.FAILURE     // Catch:{ all -> 0x0171 }
            r6.g = r0     // Catch:{ all -> 0x0175 }
            monitor-exit(r6)     // Catch:{ all -> 0x0175 }
            return r7
        L_0x0157:
            urt r7 = defpackage.urt.SUCCESS     // Catch:{ all -> 0x0171 }
            r6.g = r0     // Catch:{ all -> 0x0175 }
            monitor-exit(r6)     // Catch:{ all -> 0x0175 }
            return r7
        L_0x015d:
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0171 }
            urq r4 = (defpackage.urq) r4     // Catch:{ all -> 0x0171 }
            r6.d(r4)     // Catch:{ all -> 0x0171 }
            goto L_0x0135
        L_0x0167:
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0171 }
            urq r4 = (defpackage.urq) r4     // Catch:{ all -> 0x0171 }
            r6.a((defpackage.urq) r4, (defpackage.urq) r7)     // Catch:{ all -> 0x0171 }
            goto L_0x0116
        L_0x0171:
            r7 = move-exception
            r6.g = r0     // Catch:{ all -> 0x0175 }
            throw r7     // Catch:{ all -> 0x0175 }
        L_0x0175:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0175 }
            throw r7
        L_0x0178:
            r6.f(r7)     // Catch:{ all -> 0x0192 }
            urt r7 = defpackage.urt.DEFERRED     // Catch:{ all -> 0x0192 }
            monitor-exit(r6)     // Catch:{ all -> 0x0192 }
            return r7
        L_0x017f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0192 }
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0192 }
            r4[r2] = r7     // Catch:{ all -> 0x0192 }
            r4[r1] = r0     // Catch:{ all -> 0x0192 }
            java.lang.String r7 = "Error! MediumOperations cannot be registered in the start() method of another MediumOperation. Registering MediumOperation %s was attempted from within MediumOperation %s."
            java.lang.String r7 = java.lang.String.format(r7, r4)     // Catch:{ all -> 0x0192 }
            r3.<init>(r7)     // Catch:{ all -> 0x0192 }
            throw r3     // Catch:{ all -> 0x0192 }
        L_0x0192:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0192 }
            goto L_0x0196
        L_0x0195:
            throw r7
        L_0x0196:
            goto L_0x0195
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uru.b(urq):urt");
    }

    private final List a(Collection collection, urq urq) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            urq urq2 = (urq) it.next();
            if (a(urq2, urq)) {
                urq2.b(2);
                arrayList.add(urq2);
            }
        }
        return arrayList;
    }

    private final void a(urq urq, boolean z) {
        List<urq> list;
        ArrayList arrayList = new ArrayList();
        for (urq urq2 : this.d.keySet()) {
            if (aymi.a.a().Z()) {
                List list2 = (List) this.d.get(urq2);
                if (!z) {
                    list2.remove(urq);
                } else if (!this.h.a(urq2, urq)) {
                    list2.remove(urq);
                }
                if (list2.isEmpty()) {
                    arrayList.add(urq2);
                }
            } else if (((List) this.d.get(urq2)).remove(urq) && ((List) this.d.get(urq2)).isEmpty()) {
                arrayList.add(urq2);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            urq urq3 = (urq) arrayList.get(i2);
            this.d.remove(urq3);
            jjg jjg = ulh.a;
            urq3.d();
            a(urq3, 0);
        }
        if (this.i.containsKey(urq)) {
            list = (List) this.i.remove(urq);
        } else {
            list = new ArrayList<>();
        }
        urq.d();
        for (urq urq4 : list) {
            synchronized (urq4) {
                jjg jjg2 = ulh.a;
                urq4.d();
                urq4.notify();
            }
        }
    }

    private final boolean a(urq urq, int i2) {
        String str;
        if (this.f.get()) {
            ((anih) ((anih) ulh.a.c()).a("uru", "a", 528, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Operation %s failed to start on retry attempt %d because the manager has been shutdown.", (Object) "[MMD]:", (Object) urq.d(), (Object) Integer.valueOf(i2));
            return false;
        }
        String d2 = urq.d();
        int f2 = urq.f();
        int i3 = f2 - 1;
        if (f2 != 0) {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            jjg jjg = ulh.a;
                            urr urr = new urr(this, urq);
                            long ap = aymi.a.a().ap();
                            double pow = Math.pow(aymi.a.a().ao(), (double) i2);
                            long an = aymi.a.a().an();
                            double d3 = (double) ap;
                            Double.isNaN(d3);
                            this.c.put(urq, new urs(i2 + 1, tfu.b(urr, (long) Math.min(d3 * pow, (double) an), this.e)));
                            urq.d();
                            return true;
                        } else if (i3 != 4) {
                            Object[] objArr = new Object[4];
                            objArr[0] = "[MMD]:";
                            if (f2 != 1) {
                                str = f2 != 2 ? f2 != 3 ? f2 != 4 ? f2 != 5 ? "null" : "CHANGED_TYPE" : "NEEDS_RETRY" : "FAILURE" : "SUCCESS";
                            } else {
                                str = "UNKNOWN";
                            }
                            objArr[1] = str;
                            objArr[2] = urq.d();
                            objArr[3] = Integer.valueOf(i2);
                            throw new AssertionError(String.format("%s Unknown start state %s for operation %s on retry attempt %d", objArr));
                        } else {
                            jjg jjg2 = ulh.a;
                            urq.d();
                            Object[] objArr2 = {d2, urq.d()};
                            a(urq, true);
                            f(urq);
                        }
                    }
                }
                this.b.add(urq);
                jjg jjg3 = ulh.a;
                urq.d();
                return true;
            }
            jjg jjg4 = ulh.a;
            urq.d();
            return false;
        }
        throw null;
    }

    private final boolean a(urq urq, urq urq2) {
        if (!this.h.a(urq, urq2)) {
            return false;
        }
        b(urq, urq2);
        jjg jjg = ulh.a;
        urq.d();
        return true;
    }

    public final void a() {
        if (this.f.compareAndSet(false, true)) {
            synchronized (this) {
                for (urs urs : this.c.values()) {
                    urs.b.b();
                }
                tid.a(this.e, "MultiMediumDependencyManager.needsRetryExecutor");
                for (urq urq : b()) {
                    ((anih) ((anih) ulh.a.d()).a("uru", "a", 160, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s MediumOperation %s is unexpectedly registered and will be unregistered.", (Object) "[MMD]:", (Object) urq.d());
                    c(urq);
                }
            }
        }
    }

    public final synchronized void a(urq urq) {
        urs urs = (urs) this.c.remove(urq);
        jjg jjg = ulh.a;
        int i2 = urs.a;
        urq.d();
        a(urq, urs.a);
    }
}
