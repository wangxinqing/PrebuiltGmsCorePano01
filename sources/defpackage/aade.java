package defpackage;

import android.app.job.JobInfo;
import android.net.Uri;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.util.Log;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* renamed from: aade  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aade implements aabi {
    public final aabj a;
    public final aaez b;
    public final aabn c;
    public final ntv d;
    public volatile boolean e = false;
    private final aabr f = new aabr();
    private final aabo[] g;
    private final aadc h;
    private final qvg i;
    private final aadd j;
    private final aadt k;
    private long l = -1;
    private long m;

    public aade(aaez aaez, aabo[] aaboArr, ntv ntv, aabj aabj, aadc aadc, qvg qvg, aabn aabn, aadt aadt) {
        this.b = aaez;
        this.g = aaboArr;
        this.d = ntv;
        this.a = aabj;
        this.h = aadc;
        this.i = qvg;
        this.c = aabn;
        this.k = aadt;
        this.j = new aadd(this);
    }

    private final synchronized nxd a(Collection collection, List list) {
        nxd nxd;
        qye qye = new qye("nts:jobscheduler:sync");
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f.d(new qyk().a());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                int id = jobInfo.getId();
                if (id >= 1000 && id < Integer.MAX_VALUE) {
                    this.i.a(jobInfo.getId());
                }
            }
            Set set = anfv.a;
            if (axlx.b()) {
                set = this.k.a();
            }
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                aabq aabq = (aabq) it2.next();
                if (a(aabq, set)) {
                    b(aabq);
                }
            }
            if (axlx.b()) {
                this.k.a(this.f.a());
            }
            aucd o = nxd.f.o();
            long size = (long) list.size();
            if (o.c) {
                o.c();
                o.c = false;
            }
            nxd nxd2 = (nxd) o.b;
            nxd2.a |= 1;
            nxd2.b = size;
            long size2 = (long) collection.size();
            if (o.c) {
                o.c();
                o.c = false;
            }
            nxd nxd3 = (nxd) o.b;
            int i2 = nxd3.a | 2;
            nxd3.a = i2;
            nxd3.c = size2;
            nxd3.a = i2 | 4;
            nxd3.d = 1;
            aubn a2 = augi.a(SystemClock.elapsedRealtime() - elapsedRealtime);
            if (o.c) {
                o.c();
                o.c = false;
            }
            nxd nxd4 = (nxd) o.b;
            a2.getClass();
            nxd4.e = a2;
            nxd4.a |= 8;
            nxd = (nxd) o.i();
            qye.close();
        } catch (Throwable th) {
            apev.a(th, th);
        }
        return nxd;
        throw th;
    }

    private final synchronized void b(aabq aabq) {
        if (this.a.a(aabq, d(aabq))) {
            aabq a2 = this.f.a(aabq.s());
            if (a2 == null) {
                int i2 = aabq.i;
                if (i2 == -1 || !this.h.a(i2)) {
                    try {
                        aabq.i = this.h.a();
                    } catch (aadb e2) {
                        Log.e("NetworkScheduler", "Ran out of Job ID space, scheduling is incomplete", e2);
                        return;
                    }
                }
            } else {
                if (a2.l != 1) {
                    if (!aabq.n.h) {
                        return;
                    }
                }
                aabq.i = a2.i;
                aabq.a(true);
                a2.a(true);
                aadl aadl = aabg.a().b;
                if (aadl != null) {
                    synchronized (aadl.a) {
                        aadk aadk = (aadk) aadl.g.remove(a2);
                        if (aadk != null) {
                            aadk.c.b(1);
                        }
                    }
                }
            }
            this.a.a(aabq);
            int i3 = 2;
            aabq.l = 2;
            this.f.a(a2, aabq);
            if (aabq.p) {
                i3 = 4;
            }
            if (f(aabq)) {
                aabo[] aaboArr = this.g;
                int length = aaboArr.length;
                aaboArr[0].a(aabq, a2, i3);
            }
            this.b.a(aabq, a2);
        }
    }

    private final synchronized void c(aabq aabq) {
        aabo[] aaboArr = this.g;
        int length = aaboArr.length;
        aaboArr[0].a(aabq);
        this.h.b(aabq.i);
        this.b.a(aabq);
    }

    private final synchronized int d(aabq aabq) {
        return this.f.b(aabq.j().a()).size();
    }

    private final synchronized void e(aabq aabq) {
        this.f.c(aabq.s());
        aabo[] aaboArr = this.g;
        int length = aaboArr.length;
        aaboArr[0].a(aabq);
        this.b.a(aabq);
        this.h.b(aabq.i);
    }

    private final boolean f(aabq aabq) {
        if (axlx.b()) {
            return a(aabq, (Set) this.k.a());
        }
        return true;
    }

    public final void a(int i2) {
    }

    public final void a(qvz qvz, Uri uri, int i2) {
    }

    public final nsg b() {
        return this.j;
    }

    public final void b(nxn nxn) {
    }

    public final void c(nxn nxn) {
    }

    /* access modifiers changed from: package-private */
    public final synchronized aabq c(qyl qyl) {
        return this.f.a(qyl);
    }

    public final nxk c() {
        aucd o = nxk.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        nxk nxk = (nxk) o.b;
        nxk.b = 3;
        nxk.a |= 1;
        aubn a2 = augi.a(SystemClock.elapsedRealtime() - this.m);
        if (o.c) {
            o.c();
            o.c = false;
        }
        nxk nxk2 = (nxk) o.b;
        a2.getClass();
        nxk2.c = a2;
        nxk2.a |= 2;
        return (nxk) o.i();
    }

    public final synchronized void b(qyl qyl) {
        qye qye = new qye("nts:jobscheduler:cancelAll");
        try {
            List<aabq> d2 = this.f.d(qyl);
            for (aabq c2 : d2) {
                c(c2);
            }
            a(true);
            if (axlx.b() && !d2.isEmpty()) {
                this.k.a(this.f.a());
            }
            qye.close();
        } catch (Throwable th) {
            apev.a(th, th);
        }
        return;
        throw th;
    }

    private final synchronized void a(aabq aabq, aabq aabq2, int i2) {
        if (aabq2 != null) {
            this.f.a(aabq, aabq2);
            if (f(aabq2)) {
                aabo[] aaboArr = this.g;
                int length = aaboArr.length;
                aaboArr[0].a(aabq2, aabq, i2);
            }
            this.b.a(aabq2, aabq);
            return;
        }
        e(aabq);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0185, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void a(boolean r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0186 }
            if (r11 == 0) goto L_0x0028
            long r2 = r10.l     // Catch:{ all -> 0x0186 }
            long r2 = r0 - r2
            axlu r11 = defpackage.axlu.a     // Catch:{ all -> 0x0186 }
            axlv r11 = r11.a()     // Catch:{ all -> 0x0186 }
            long r4 = r11.h()     // Catch:{ all -> 0x0186 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            long r6 = r10.l     // Catch:{ all -> 0x0186 }
            r8 = -1
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x0022
            goto L_0x0028
        L_0x0022:
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x0028
            monitor-exit(r10)
            return
        L_0x0028:
            r10.l = r0     // Catch:{ all -> 0x0186 }
            aabr r11 = r10.f     // Catch:{ all -> 0x0186 }
            java.util.Collection r11 = r11.a()     // Catch:{ all -> 0x0186 }
            qvg r0 = r10.i     // Catch:{ all -> 0x0186 }
            java.util.List r0 = r0.a()     // Catch:{ all -> 0x0186 }
            boolean r1 = defpackage.axlx.b()     // Catch:{ all -> 0x0186 }
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0111
            aadt r1 = r10.k     // Catch:{ all -> 0x0186 }
            anax r1 = r1.a()     // Catch:{ all -> 0x0186 }
            ob r5 = new ob     // Catch:{ all -> 0x0186 }
            r5.<init>()     // Catch:{ all -> 0x0186 }
            java.util.Iterator r6 = r11.iterator()     // Catch:{ all -> 0x0186 }
        L_0x004e:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0186 }
            if (r7 == 0) goto L_0x0064
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0186 }
            aabq r7 = (defpackage.aabq) r7     // Catch:{ all -> 0x0186 }
            boolean r8 = a((defpackage.aabq) r7, (java.util.Set) r1)     // Catch:{ all -> 0x0186 }
            if (r8 != 0) goto L_0x004e
            r5.add(r7)     // Catch:{ all -> 0x0186 }
            goto L_0x004e
        L_0x0064:
            int r1 = r11.size()     // Catch:{ all -> 0x0186 }
            int r6 = r5.b     // Catch:{ all -> 0x0186 }
            int r1 = r1 - r6
            int r6 = r0.size()     // Catch:{ all -> 0x0186 }
            if (r1 == r6) goto L_0x0091
            ob r1 = new ob     // Catch:{ all -> 0x0186 }
            r1.<init>((java.util.Collection) r11)     // Catch:{ all -> 0x0186 }
            r1.removeAll(r5)     // Catch:{ all -> 0x0186 }
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ all -> 0x0186 }
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0186 }
            r7[r4] = r1     // Catch:{ all -> 0x0186 }
            r7[r3] = r5     // Catch:{ all -> 0x0186 }
            r7[r2] = r0     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = "NetworkScheduler"
            java.lang.String r2 = "Tasks count doesn't match jobs count. Tasks: %s. Tasks blocked by reachability: %s. Jobs: %s"
            java.lang.String r2 = java.lang.String.format(r6, r2, r7)     // Catch:{ all -> 0x0186 }
            android.util.Log.i(r1, r2)     // Catch:{ all -> 0x0186 }
            goto L_0x017a
        L_0x0091:
            java.util.Iterator r1 = r11.iterator()     // Catch:{ all -> 0x0186 }
        L_0x0095:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0186 }
            if (r2 == 0) goto L_0x0184
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0186 }
            aabq r2 = (defpackage.aabq) r2     // Catch:{ all -> 0x0186 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0186 }
        L_0x00a5:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0186 }
            if (r7 == 0) goto L_0x00b9
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0186 }
            android.app.job.JobInfo r7 = (android.app.job.JobInfo) r7     // Catch:{ all -> 0x0186 }
            boolean r7 = a((android.app.job.JobInfo) r7, (defpackage.aabq) r2)     // Catch:{ all -> 0x0186 }
            if (r7 == 0) goto L_0x00a5
            r6 = 1
            goto L_0x00ba
        L_0x00b9:
            r6 = 0
        L_0x00ba:
            boolean r7 = r5.contains(r2)     // Catch:{ all -> 0x0186 }
            if (r6 != 0) goto L_0x00e8
            if (r7 != 0) goto L_0x00e8
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0186 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0186 }
            int r2 = r2.length()     // Catch:{ all -> 0x0186 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0186 }
            int r2 = r2 + 48
            r3.<init>(r2)     // Catch:{ all -> 0x0186 }
            java.lang.String r2 = "Task was not present in JobScheduler. TaskInfo: "
            r3.append(r2)     // Catch:{ all -> 0x0186 }
            r3.append(r1)     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = "NetworkScheduler"
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0186 }
            android.util.Log.e(r1, r2)     // Catch:{ all -> 0x0186 }
            goto L_0x017a
        L_0x00e8:
            if (r6 == 0) goto L_0x0095
            if (r7 == 0) goto L_0x0095
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0186 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0186 }
            int r2 = r2.length()     // Catch:{ all -> 0x0186 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0186 }
            int r2 = r2 + 64
            r3.<init>(r2)     // Catch:{ all -> 0x0186 }
            java.lang.String r2 = "Unreachable task should be removes from JobScheduler. TaskInfo: "
            r3.append(r2)     // Catch:{ all -> 0x0186 }
            r3.append(r1)     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = "NetworkScheduler"
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0186 }
            android.util.Log.e(r1, r2)     // Catch:{ all -> 0x0186 }
            goto L_0x017a
        L_0x0111:
            int r1 = r11.size()     // Catch:{ all -> 0x0186 }
            int r5 = r0.size()     // Catch:{ all -> 0x0186 }
            if (r1 == r5) goto L_0x012f
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ all -> 0x0186 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0186 }
            r2[r4] = r11     // Catch:{ all -> 0x0186 }
            r2[r3] = r0     // Catch:{ all -> 0x0186 }
            java.lang.String r3 = "NetworkScheduler"
            java.lang.String r4 = "Tasks count doesn't match jobs count. tasks: %s jobs: %s"
            java.lang.String r1 = java.lang.String.format(r1, r4, r2)     // Catch:{ all -> 0x0186 }
            android.util.Log.e(r3, r1)     // Catch:{ all -> 0x0186 }
            goto L_0x017a
        L_0x012f:
            java.util.Iterator r1 = r11.iterator()     // Catch:{ all -> 0x0186 }
        L_0x0133:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0186 }
            if (r2 == 0) goto L_0x0184
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0186 }
            aabq r2 = (defpackage.aabq) r2     // Catch:{ all -> 0x0186 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0186 }
        L_0x0143:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0186 }
            if (r4 == 0) goto L_0x0156
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0186 }
            android.app.job.JobInfo r4 = (android.app.job.JobInfo) r4     // Catch:{ all -> 0x0186 }
            boolean r4 = a((android.app.job.JobInfo) r4, (defpackage.aabq) r2)     // Catch:{ all -> 0x0186 }
            if (r4 == 0) goto L_0x0143
            goto L_0x0133
        L_0x0156:
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0186 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0186 }
            int r2 = r2.length()     // Catch:{ all -> 0x0186 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0186 }
            int r2 = r2 + 48
            r3.<init>(r2)     // Catch:{ all -> 0x0186 }
            java.lang.String r2 = "Task was not present in JobScheduler. TaskInfo: "
            r3.append(r2)     // Catch:{ all -> 0x0186 }
            r3.append(r1)     // Catch:{ all -> 0x0186 }
            java.lang.String r1 = "NetworkScheduler"
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0186 }
            android.util.Log.e(r1, r2)     // Catch:{ all -> 0x0186 }
        L_0x017a:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0186 }
            r1.<init>(r11)     // Catch:{ all -> 0x0186 }
            r10.a((java.util.Collection) r1, (java.util.List) r0)     // Catch:{ all -> 0x0186 }
            monitor-exit(r10)
            return
        L_0x0184:
            monitor-exit(r10)
            return
        L_0x0186:
            r11 = move-exception
            monitor-exit(r10)
            goto L_0x018a
        L_0x0189:
            throw r11
        L_0x018a:
            goto L_0x0189
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aade.a(boolean):void");
    }

    private static boolean a(aabq aabq, Set set) {
        if (axlx.b()) {
            Set set2 = aabq.n.k;
            if (!set2.isEmpty()) {
                return Collections.disjoint(set2, set);
            }
        }
        return true;
    }

    private static boolean a(JobInfo jobInfo, aabq aabq) {
        PersistableBundle extras = jobInfo.getExtras();
        return jobInfo.getId() == aabq.i && Objects.equals(extras.getString("_nts.tag"), aabq.e()) && aabq.a.b.equals(extras.getString("_nts.pkg")) && aabq.g().equals(extras.getString("_nts.cls")) && ((int) aabq.a.e) == extras.getInt("_nts.usr", -1);
    }

    public final synchronized void a() {
        if (!this.e) {
            this.m = SystemClock.elapsedRealtime();
            qye qye = new qye("nts:jobscheduler:init");
            try {
                nxd a2 = a((Collection) this.b.c(), this.i.a());
                nwu e2 = this.b.e();
                List a3 = aadn.a((Iterable) this.f.a());
                aubn a4 = augi.a(SystemClock.elapsedRealtime() - this.m);
                aabn aabn = this.c;
                nxk c2 = c();
                aucd o = nxa.g.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                nxa nxa = (nxa) o.b;
                e2.getClass();
                nxa.f = e2;
                int i2 = nxa.a | 8;
                nxa.a = i2;
                a4.getClass();
                nxa.b = a4;
                int i3 = i2 | 1;
                nxa.a = i3;
                a2.getClass();
                nxa.d = a2;
                nxa.a = i3 | 4;
                o.G(a3);
                aabn.a(c2, (nxa) o.i());
                qye.close();
                this.e = true;
                return;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    public final synchronized void a(aabq aabq) {
        String valueOf = String.valueOf(aabq.e());
        qye qye = new qye(valueOf.length() == 0 ? new String("nts:jobscheduler:schedule:") : "nts:jobscheduler:schedule:".concat(valueOf));
        try {
            b(aabq);
            if (axlx.b()) {
                this.k.a(this.f.a());
            }
            qye.close();
        } catch (Throwable th) {
            apev.a(th, th);
        }
        return;
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(aabq aabq, int i2) {
        if (!aabq.p) {
            if (i2 == 1) {
                if (aabq.m()) {
                    a(aabq, aabj.c(aabq), 3);
                    this.c.a(aabq, i2);
                    a(true);
                }
            }
            if (aabq.n()) {
                a(aabq, aabj.b(aabq), 4);
            } else {
                e(aabq);
                if (axlx.b()) {
                    this.k.a(this.f.a());
                }
            }
            this.c.a(aabq, i2);
            a(true);
        }
    }

    public final synchronized void a(PrintWriter printWriter, String[] strArr) {
        printWriter.println();
        printWriter.println("Global GmsTaskScheduler stats:");
        this.k.a(printWriter);
        aabj.a(printWriter, strArr, this.f.a(), this.c);
    }

    public final void a(nxn nxn) {
        if (axlx.b() && nxn == nxn.REACHABILITY_CHANGED) {
            a(false);
        }
    }

    public final synchronized void a(qyl qyl) {
        qye qye = new qye("nts:jobscheduler:cancel");
        try {
            aabq c2 = this.f.c(qyl);
            if (c2 != null) {
                c(c2);
                a(true);
                if (axlx.b()) {
                    this.k.a(this.f.a());
                }
            }
            qye.close();
        } catch (Throwable th) {
            apev.a(th, th);
        }
        return;
        throw th;
    }
}
